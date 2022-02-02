package com.garage.me.home

import android.util.Log
import com.garage.me.data.Product
import com.garage.me.network.ApiInterface
import com.garage.me.network.ApiResponse
import retrofit2.*
import java.util.concurrent.CountDownLatch
import javax.inject.Inject

class GetProductsRepository @Inject constructor(
    private val api: ApiInterface,
    private val mapper: ProductMapper
) {
    //TODO Call the getProductsWithSuspendFunction in the ApiInterface class and use a callback function here
    //Once you have Response<ApiResponse> use the mapper class to convert and ApiResponse to List<Product>
    suspend fun getProductsWithSuspendFunction(): List<Product> {
        return try {
            mapper.map(api.getProductsWithSuspendFunction())
        } catch (ex: Exception) {
            emptyList()
        }
    }

    //TODO Call the getProductsWithCallback in the ApiInterface class and use a callback function here
    //Once you have Response<ApiResponse> use the mapper class to convert and ApiResponse to List<Product>
    //Can you find a way to wait until the response is ready to return your result?
    fun getProductsWithCallback(): List<Product> {
        val countDownLatch = CountDownLatch(1)
        var products: List<Product> = mutableListOf()
        api.getProductsWithCallback().enqueue(object : Callback<ApiResponse> {
            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                products = mapper.map(response.body())
                countDownLatch.countDown()
            }

            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                Log.e("GetProductsRepository", "No products available, API failed")
                countDownLatch.countDown()
            }
        })
        countDownLatch.await()
        return products
    }
}

