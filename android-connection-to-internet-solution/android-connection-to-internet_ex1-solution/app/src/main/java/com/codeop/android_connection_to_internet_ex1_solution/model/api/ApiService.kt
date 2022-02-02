package com.codeop.android_connection_to_internet_ex1_solution.model.api

import com.codeop.android_connection_to_internet_ex1_solution.AppConfiguration
import com.codeop.android_connection_to_internet_ex1_solution.AppConfiguration.CURRENT_YEAR
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    /**
     * Get movies.
     *
     * http://api.themoviedb.org/3/discover/movie?sort_by=vote_average.desc
     * &apiKey=efd2cf12c8d269e09a01ae841dc84023&page=1&per_page=20
     */
    @GET("/3/discover/movie")
    fun getMoviesFromCurrentYear(
        @Query("primary_release_year") year: Int = CURRENT_YEAR,
        @Query("sort_by") sortBy: String = "vote_average.desc",
        @Query("api_key") apiKey: String = AppConfiguration.API_KEY,
        //@Query("per_page") itemsPerPage: Int = AppConfiguration.NETWORK_PAGE_SIZE,
        @Query("page") page: Int = 1
    ): Call<TmdbResponse>
}