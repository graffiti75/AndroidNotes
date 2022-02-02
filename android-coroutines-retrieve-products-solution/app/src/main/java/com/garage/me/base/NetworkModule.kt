package com.garage.me.base

import com.garage.me.network.ApiInterface
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideApiInterface(
        @Named(API_GARAGE_ENDPOINT) baseUrl: HttpUrl,
        gsonConverterFactory: GsonConverterFactory,
        okHttpClient: OkHttpClient
    ): ApiInterface {
        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(gsonConverterFactory)
                .build()
                .create(ApiInterface::class.java)
    }

    @Provides
    @Named(API_GARAGE_ENDPOINT)
    fun provideGarageEndpoint(): HttpUrl {
        return HttpUrl.Builder()
                .scheme("https")
                .host("api.garage.me")
                .build()
    }

    @Provides
    @Singleton
    fun provideGsonConverterFactory(): GsonConverterFactory = GsonConverterFactory.create(GsonBuilder().create())

    @Provides
    @Singleton
    fun provideApiClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .build()
    }
}

const val API_GARAGE_ENDPOINT = "garage me endpoint"