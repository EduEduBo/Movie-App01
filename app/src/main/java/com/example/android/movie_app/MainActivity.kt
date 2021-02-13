package com.example.android.movie_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.android.movie_app.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(R.layout.activity_main)
        val nowButton: Button= binding.nowPlaying3
        nowButton.setOnClickListener {
            val nowMovieActivity = Intent (this, seeNowMovies::class.java)
            startActivity(nowMovieActivity)
        }
        val popularButton: Button= binding.popularMovies
        popularButton.setOnClickListener {
            val popularMovieActivity = Intent (this, seePopularMovies::class.java)
            startActivity(popularMovieActivity)
        }
        val incomingButton: Button= binding.incomingMovies
        incomingButton.setOnClickListener {
            val incomingMovieActivity = Intent (this, seeIncomingMovies::class.java)
            startActivity(incomingMovieActivity)
        }
        val tvButton: Button= binding.tvSeries
        tvButton.setOnClickListener {
            val tvActivity = Intent (this, seeTvSeries::class.java)
            startActivity(tvActivity)
        }

    }
}