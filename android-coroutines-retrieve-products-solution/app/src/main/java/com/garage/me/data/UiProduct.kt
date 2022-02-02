package com.garage.me.data

sealed class UiProducts {
    data class Data(val data: List<UiProduct>) : UiProducts()
    object Void : UiProducts()
}

data class UiProduct(
    val id: String,
    val description: String
)