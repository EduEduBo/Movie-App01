package com.example.android.movie_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android.movie_app.databinding.ActivityMainBinding
import com.example.android.movie_app.databinding.ActivitySeeIncomingMoviesBinding

private lateinit var binding: ActivitySeeIncomingMoviesBinding
class seeIncomingMovies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(R.layout.activity_see_incoming_movies)
    }
}