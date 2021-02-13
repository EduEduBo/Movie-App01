package com.example.android.movie_app

import com.google.gson.annotations.SerializedName

class Movies {
    @SerializedName ("id") val id = Long,
    @SerializedName ("original_title") val originalTitle: String,
    @SerializedName ("poster_path") val posterPath: String,
    @SerializedName ("overview") val movieOverview: String,
    @SerializedName ("vote_average") val movieRating: Float,
    @SerializedName ("genres.0.name") val movieGenre: String
}