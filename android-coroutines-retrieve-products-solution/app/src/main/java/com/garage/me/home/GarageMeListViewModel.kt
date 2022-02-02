package com.garage.me.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.garage.me.data.UiProducts
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.concurrent.thread

class GarageMeListViewModel @Inject constructor(
    private val useCase: GetProductsUseCase
) : ViewModel() {

    private val uiModel = MutableLiveData<UiProducts>()

    fun getUiModel(): LiveData<UiProducts> = uiModel

    fun fetchProductsWithSuspendFunction() {
        viewModelScope.launch(Dispatchers.IO) {
            useCase.getProducts().collect {
                withContext(Dispatchers.Main) {
                    uiModel.value = it
                }
            }
        }
    }

    fun fetchProductsWithCallback() {
        //TODO How do you make sure the code is not run on the main thread? Can you find a way to not block the UI?
        uiModel.postValue(useCase.getProductsWithCallback())
    }
}