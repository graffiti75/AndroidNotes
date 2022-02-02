package com.garage.me.home

import com.garage.me.data.Product
import com.garage.me.exception.ApiMappingException
import com.garage.me.network.ApiProduct
import com.garage.me.network.ApiResponse
import javax.inject.Inject

class ProductMapper @Inject constructor() {

    fun map(apiProducts: ApiResponse?): List<Product> {
        if (apiProducts == null) return emptyList()
        val products = mutableListOf<Product>()
        apiProducts.products.forEach {
            products.add(
                Product(
                    id = (it.id
                        ?: throw ApiMappingException("ID of the product cannot be null")).toString(),
                    description = it.description ?: ""
                )
            )
        }
        return products
    }
}