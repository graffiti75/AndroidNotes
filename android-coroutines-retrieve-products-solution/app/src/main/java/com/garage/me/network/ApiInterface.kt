package com.garage.me.network

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    // Fetch products from the following api
    @GET("api/v1/products/popular/")
    suspend fun getProductsWithSuspendFunction(): ApiResponse

    // Fetch products from the following api
    @GET("api/v1/products/popular/")
    fun getProductsWithCallback(): Call<ApiResponse>
}