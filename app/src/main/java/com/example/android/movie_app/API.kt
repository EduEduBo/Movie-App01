package com.example.android.movie_app

import android.telecom.Call
import android.view.textclassifier.TextLanguage
import org.intellij.lang.annotations.Language
import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET("movie/now_playing")
    fun getNowMovies(
        @Query("api_key") apiKey: String = "1739753255efa07f9503e660981fe9c4",
        @Query("language") language: String = "en-US",
        @Query("page") page: Int
    ) : Call<GetResponseMoviesAPI>
}