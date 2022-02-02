package com.codeop.android_connection_to_internet_ex2_solution.model.api

import com.codeop.android_connection_to_internet_ex2_solution.model.Movie

class TmdbResponse {
    var page: Int = 0
    var total_results: Int = 0
    var total_pages: Int = 0
    var results: List<Movie>? = null
}