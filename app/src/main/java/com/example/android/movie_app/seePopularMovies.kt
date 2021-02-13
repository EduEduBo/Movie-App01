package com.example.android.movie_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android.movie_app.databinding.ActivitySeeNowMoviesBinding
import com.example.android.movie_app.databinding.ActivitySeePopularMoviesBinding

private lateinit var binding: ActivitySeePopularMoviesBinding

class seePopularMovies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(R.layout.activity_see_popular_movies)
    }
}