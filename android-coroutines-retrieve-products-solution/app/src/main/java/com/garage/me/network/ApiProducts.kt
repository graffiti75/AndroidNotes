package com.garage.me.network

import com.google.gson.annotations.SerializedName

class ApiProduct(
    val id: Long?,
    val description: String?
)

class ApiResponse(
    @SerializedName("objects")
    val products: List<ApiProduct>
)