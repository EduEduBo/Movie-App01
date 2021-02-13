package com.example.android.movie_app

import android.util.Log
import com.example.android.movie_app.MoviesData.getNowMovies
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MoviesData {
    private val movieDbApi: API
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        movieDbApi = retrofit.create(API::class.java)
    }
    fun getNowMovies (page: Int=1, language: String="en-US"){
        movieDbApi.getNowMovies( page = page, language = language)
            .enqueue(object : Callback<GetResponseMoviesAPI> {
                override fun onResponse(
                    call: Call<GetResponseMoviesAPI>,
                    response: Response<GetResponseMoviesAPI>
                ) {
                    if (response.isSuccessful){
                        val responseBody = response.body()
                    }
                    else {
                        Log.d("Error in response from API")
                    }
                }

            })


    }
    fun getPopularMovies (page: Int=1, language: String="en-US"){
        movieDbApi.getNowMovies( page = page, language = language)
            .enqueue(object : Callback<GetResponseMoviesAPI> {
                override fun onResponse(
                    call: Call<GetResponseMoviesAPI>,
                    response: Response<GetResponseMoviesAPI>
                ) {
                    if (response.isSuccessful){
                        val responseBody = response.body()
                    }
                    else {
                        Log.d("Error in response from API")
                    }
                }

            })


    }

}