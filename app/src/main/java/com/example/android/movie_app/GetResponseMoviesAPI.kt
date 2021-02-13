package com.example.android.movie_app

import com.google.gson.annotations.SerializedName

class GetResponseMoviesAPI {
    @SerializedName("page") val page:Int,
    @SerializedName ("results") val movies:List<Movies>,
    @SerializedName ("total_pages") val pages:Int
}