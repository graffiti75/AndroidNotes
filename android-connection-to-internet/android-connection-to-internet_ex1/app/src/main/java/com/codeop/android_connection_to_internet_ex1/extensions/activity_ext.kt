package com.codeop.android_connection_to_internet_ex1.extensions

import android.content.Context
import android.widget.Toast
import com.codeop.android_connection_to_internet_ex1.model.api.ApiService
import retrofit2.Retrofit

//--------------------------------------------------
// Overall Methods
//--------------------------------------------------

fun Context.showToast(message: Int) {
    Toast.makeText(this, this.getString(message), Toast.LENGTH_LONG).show()
}

@Suppress("DEPRECATION")
fun Context.networkOn(): Boolean {
    // TODO
}

//--------------------------------------------------
// Retrofit Methods
//--------------------------------------------------

fun Context.initApiService(): ApiService {
    // TODO
}

fun Context.initRetrofit(): Retrofit {
    // TODO
}