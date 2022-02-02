package com.garage.me.home

import com.garage.me.data.Product
import com.garage.me.data.UiProduct
import com.garage.me.data.UiProducts
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val repository: GetProductsRepository
) {
    //TODO Call the getProductsWithCallback in the repository class and pass the result to the convert function
    suspend fun getProducts(): Flow<UiProducts> {
        return flow {
            emit(
                convert(
                    repository
                        .getProductsWithSuspendFunction()
                )
            )
        }
    }

    //TODO Call the getProductsWithCallback in the repository class and pass the result to the convert function
    fun getProductsWithCallback(): UiProducts {
        return convert(repository.getProductsWithCallback())
    }

    private fun convert(products: List<Product>) =
        if (products.isEmpty()) {
            UiProducts.Void
        } else {
            UiProducts.Data(products.map {
                UiProduct(
                    id = it.id,
                    description = it.description
                )
            })
        }
}