package com.example.movithub.movie_detail.domain.repository

import com.example.movithub.movie.domain.models.Movie
import com.example.movithub.movie_detail.domain.models.MovieDetail
import com.example.movithub.utils.Response
import kotlinx.coroutines.flow.Flow

interface MovieDetailRepository {
    fun fetchMovieDetail(movieId: Int):Flow<Response<MovieDetail>>
    fun fetchMovie():Flow<Response<List<Movie>>>
}