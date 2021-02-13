package com.example.android.movie_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android.movie_app.databinding.ActivitySeeNowMoviesBinding

private lateinit var binding: ActivitySeeNowMoviesBinding

class seeNowMovies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(R.layout.activity_see_now_movies)
        MoviesData.getNowMovies()
    }
}