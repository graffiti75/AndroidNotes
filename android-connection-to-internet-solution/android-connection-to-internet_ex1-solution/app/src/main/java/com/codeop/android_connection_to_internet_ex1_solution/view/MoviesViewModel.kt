package com.codeop.android_connection_to_internet_ex1_solution.view

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codeop.android_connection_to_internet_ex1_solution.AppConfiguration.TAG
import com.codeop.android_connection_to_internet_ex1_solution.model.Movie
import com.codeop.android_connection_to_internet_ex1_solution.model.api.ApiService
import com.codeop.android_connection_to_internet_ex1_solution.model.api.TmdbResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesViewModel(
    private val service: ApiService
) : ViewModel() {

    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>>
        get() = _movies

    fun fetchMovies() {
        try {
            service.getMoviesFromCurrentYear().enqueue(object : Callback<TmdbResponse> {
                override fun onFailure(call: Call<TmdbResponse>?, t: Throwable) {
                    Log.i(TAG, "login() -> On error: $t")
                }

                override fun onResponse(call: Call<TmdbResponse>?, response: Response<TmdbResponse>) {
                    Log.d(TAG, "got a response $response")
                    if (response.isSuccessful) {
                        _movies.value = response.body()?.results
                    } else {
                        Log.i(TAG, "login() -> On error!")
                    }
                }
            })
        } catch(e: Exception) {
            Log.e(TAG, "Network request failed", e)
        }
    }
}
