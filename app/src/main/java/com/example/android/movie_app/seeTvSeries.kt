package com.example.android.movie_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android.movie_app.databinding.ActivityMainBinding
import com.example.android.movie_app.databinding.ActivitySeeTvSeriesBinding

private lateinit var binding: ActivitySeeTvSeriesBinding
class seeTvSeries : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(R.layout.activity_see_tv_series)
    }
}