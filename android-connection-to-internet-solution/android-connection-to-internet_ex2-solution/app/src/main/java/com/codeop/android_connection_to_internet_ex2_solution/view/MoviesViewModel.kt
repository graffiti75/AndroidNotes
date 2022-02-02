package com.codeop.android_connection_to_internet_ex2_solution.view

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codeop.android_connection_to_internet_ex2_solution.AppConfiguration.TAG
import com.codeop.android_connection_to_internet_ex2_solution.model.api.ApiService
import com.codeop.android_connection_to_internet_ex2_solution.model.api.TmdbResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MoviesViewModel(
    private val service: ApiService
) : ViewModel() {

    private val _movies = MutableLiveData<TmdbResponse>()
    val movies: LiveData<TmdbResponse>
        get() = _movies

    fun fetchMovies() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = service.getMoviesFromCurrentYear()
                if (response.isSuccessful) {
                    withContext(Dispatchers.Main) {
                        _movies.value = response.body()
                    }
                }
            } catch(e: Exception) {
                Log.e(TAG, "Network request failed", e)
            }
        }
    }
}
