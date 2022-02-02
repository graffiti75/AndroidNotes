package com.codeop.android_connection_to_internet_ex2_solution.view

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import com.codeop.android_connection_to_internet_ex2_solution.R
import com.codeop.android_connection_to_internet_ex2_solution.databinding.ActivityMoviesBinding
import com.codeop.android_connection_to_internet_ex2_solution.extensions.initApiService
import com.codeop.android_connection_to_internet_ex2_solution.extensions.networkOn
import com.codeop.android_connection_to_internet_ex2_solution.extensions.showToast
import com.codeop.android_connection_to_internet_ex2_solution.model.api.ApiService

class MoviesActivity : AppCompatActivity() {

    private lateinit var service: ApiService
    private lateinit var viewModelFactory: MoviesViewModelFactory
    private lateinit var viewModel: MoviesViewModel

    private lateinit var binding: ActivityMoviesBinding
    private lateinit var adapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_movies)

        setViewModel()
        subscribeToObservers()
        setAdapter()
    }

    private fun setViewModel() {
        service = initApiService()
        viewModelFactory = MoviesViewModelFactory(service)
        viewModel = ViewModelProvider(this, viewModelFactory)[MoviesViewModel::class.java]
        binding.viewModel = viewModel
    }

    private fun setAdapter() {
        adapter = MoviesAdapter()
        binding.recyclerView.adapter = adapter
        val decoration = DividerItemDecoration(this, LinearLayout.VERTICAL)
        binding.recyclerView.addItemDecoration(decoration)
    }

    private fun subscribeToObservers() {
        if (!networkOn()) {
            showToast(R.string.no_internet)
        } else {
            viewModel.fetchMovies()
        }

        viewModel.movies.observe(this, Observer {
            val movies = it.results
            if (movies != null) {
                if (movies.isNotEmpty()) {
                    adapter.submitList(movies)
                }
            }
        })
    }
}