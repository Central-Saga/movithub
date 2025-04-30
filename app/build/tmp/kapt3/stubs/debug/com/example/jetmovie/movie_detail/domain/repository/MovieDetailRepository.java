package com.example.jetmovie.movie_detail.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/jetmovie/movie_detail/domain/repository/MovieDetailRepository;", "", "fetchMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/jetmovie/utils/Response;", "", "Lcom/example/jetmovie/movie/domain/models/Movie;", "fetchMovieDetail", "Lcom/example/jetmovie/movie_detail/domain/models/MovieDetail;", "movieId", "", "app_debug"})
public abstract interface MovieDetailRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.example.jetmovie.utils.Response<com.example.jetmovie.movie_detail.domain.models.MovieDetail>> fetchMovieDetail(int movieId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.example.jetmovie.utils.Response<java.util.List<com.example.jetmovie.movie.domain.models.Movie>>> fetchMovie();
}