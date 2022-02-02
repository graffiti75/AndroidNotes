package com.codeop.android_connection_to_internet_ex2_solution.view

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.codeop.android_connection_to_internet_ex2_solution.AppConfiguration
import com.codeop.android_connection_to_internet_ex2_solution.R
import com.codeop.android_connection_to_internet_ex2_solution.model.Movie

@BindingAdapter("datetimeFormatted")
fun TextView.datetimeFormatted(item: Movie) {
    text = "${item.title}\nRating: ${item.vote_average}"
}

@BindingAdapter("movieImage")
fun ImageView.setMovieImage(item: Movie?) {
    item?.let {
        val url = AppConfiguration.IMAGE_BASE_URL + item.poster_path
        Glide.with(this)
            .load(url)
            .placeholder(R.drawable.placeholder_vertical)
            .override(800, 450)
            .into(this)
    }
}
