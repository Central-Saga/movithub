package com.example.movithub.movie.domain.repository

import com.example.movithub.movie.domain.models.Movie
import com.example.movithub.utils.Response
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    fun fetchDiscoverMovie(): Flow<Response<List<Movie>>>
    fun fetchTrendingMovie(): Flow<Response<List<Movie>>>
}