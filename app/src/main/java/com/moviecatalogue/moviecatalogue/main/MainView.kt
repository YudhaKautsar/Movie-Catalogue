package com.moviecatalogue.moviecatalogue.main

import com.moviecatalogue.moviecatalogue.model.Movie

interface MainView{
    fun showMovieList(data: List<Movie>)
}