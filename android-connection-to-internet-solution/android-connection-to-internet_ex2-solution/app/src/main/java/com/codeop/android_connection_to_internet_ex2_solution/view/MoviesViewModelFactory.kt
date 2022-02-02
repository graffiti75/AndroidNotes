package com.codeop.android_connection_to_internet_ex2_solution.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codeop.android_connection_to_internet_ex2_solution.model.api.ApiService

class MoviesViewModelFactory(
    private val service: ApiService
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MoviesViewModel::class.java)) {
            return MoviesViewModel(service) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
