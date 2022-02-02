package com.codeop.android_connection_to_internet_ex1.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codeop.android_connection_to_internet_ex1.model.Movie
import com.codeop.android_connection_to_internet_ex1.model.api.ApiService

class MoviesViewModel(
    private val service: ApiService
) : ViewModel() {

    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>>
        get() = _movies

    fun fetchMovies() {
        // TODO
    }
}
