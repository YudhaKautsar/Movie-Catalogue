package com.moviecatalogue.moviecatalogue.main

import com.google.gson.Gson
import com.moviecatalogue.moviecatalogue.model.MovieResponse
import com.moviecatalogue.moviecatalogue.network.ApiRepository
import com.moviecatalogue.moviecatalogue.network.TMDBApi
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainPresenter(private val view: MainView, private val apiRepository: ApiRepository, private  val  gson: Gson){
    fun getMovieList(){
        doAsync {
            val data = gson.fromJson(apiRepository.doRequest(TMDBApi.getMovie()),
                    MovieResponse::class.java)
            uiThread {
                view.showMovieList(data.results)
            }
        }
    }
}