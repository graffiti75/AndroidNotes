package com.codeop.android_connection_to_internet_ex2_solution.extensions

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import android.widget.Toast
import com.codeop.android_connection_to_internet_ex2_solution.AppConfiguration
import com.codeop.android_connection_to_internet_ex2_solution.BuildConfig
import com.codeop.android_connection_to_internet_ex2_solution.model.api.ApiService
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit

//--------------------------------------------------
// Overall Methods
//--------------------------------------------------

fun Context.showToast(message: Int) {
    Toast.makeText(this, this.getString(message), Toast.LENGTH_LONG).show()
}

@Suppress("DEPRECATION")
fun Context.networkOn(): Boolean {
    var result = false
    val cm = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        cm?.run {
            cm.getNetworkCapabilities(cm.activeNetwork)?.run {
                result = when {
                    hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                    else -> false
                }
            }
        }
    } else {
        cm?.run {
            cm.activeNetworkInfo?.run {
                if (type == ConnectivityManager.TYPE_WIFI) {
                    result = true
                } else if (type == ConnectivityManager.TYPE_MOBILE) {
                    result = true
                }
            }
        }
    }
    return result
}

//--------------------------------------------------
// Retrofit Methods
//--------------------------------------------------

fun Context.initApiService(): ApiService {
    return initRetrofit().create(ApiService::class.java)
}

fun Context.initRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl(AppConfiguration.BASE_URL)
        .addConverterFactory(initConverterFactory())
        .client(initOkHttpClient())
        .build()
}

fun initConverterFactory(): MoshiConverterFactory {
    return MoshiConverterFactory.create()
}

private fun Context.initOkHttpClient(): OkHttpClient {
    val logging = HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
        override fun log(message: String) {
            Log.d(AppConfiguration.TAG, message)
        }
    })

    logging.level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE

    return OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .addInterceptor(logging)
        .addNetworkInterceptor(provideCacheInterceptor())
        .cache(provideCache())
        .build()
}

fun Context.provideCache(): Cache? {
    var cache: Cache? = null
    try {
        cache = Cache(File(cacheDir, "http-cache"), (10 * 1024 * 1024).toLong()) // 10 MB
    } catch (e: Exception) {
        Log.e(AppConfiguration.TAG,"Could not create Cache!", e)
    }
    return cache
}

fun provideCacheInterceptor(): Interceptor {
    return object : Interceptor {
        @Throws(IOException::class)
        override fun intercept(chain: Interceptor.Chain): Response {
            val response = chain.proceed(chain.request())

            // re-write response header to force use of cache
            val cacheControl = CacheControl.Builder()
                .maxAge(10, TimeUnit.SECONDS)
                .build()

            return response.newBuilder()
                .header("Cache-Control", cacheControl.toString())
                .build()
        }
    }
}