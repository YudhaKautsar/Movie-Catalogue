package com.moviecatalogue.moviecatalogue.network

import com.moviecatalogue.moviecatalogue.BuildConfig.API_KEY
import com.moviecatalogue.moviecatalogue.BuildConfig.BASE_URL

object TMDBApi {
    fun getMovie(): String{
        return BASE_URL + API_KEY
    }
}