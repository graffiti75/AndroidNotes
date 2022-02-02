package com.codeop.android_connection_to_internet_ex2_solution.model

import androidx.annotation.NonNull

data class Movie(
    @NonNull
    var uid: Long = 0,
    var vote_count: Int? = null,
    var vote_average: Float? = null,
    var title: String? = null,
    var popularity: Float? = null,
    var poster_path: String? = null,
    var original_language: String? = "en",
    var original_title: String? = null,
    var backdrop_path: String? = null,
    var overview: String? = null,
    var release_date: String? = null,
    var favorite: Boolean = false
)