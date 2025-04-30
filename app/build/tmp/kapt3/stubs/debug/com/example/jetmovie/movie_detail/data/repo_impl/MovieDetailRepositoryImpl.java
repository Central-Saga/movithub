package com.example.jetmovie.movie_detail.data.repo_impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000f0\u000eH\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/jetmovie/movie_detail/data/repo_impl/MovieDetailRepositoryImpl;", "Lcom/example/jetmovie/movie_detail/domain/repository/MovieDetailRepository;", "movieDetailApiService", "Lcom/example/jetmovie/movie_detail/data/remote/api/MovieDetailApiService;", "apiDetailMapper", "Lcom/example/jetmovie/common/data/ApiMapper;", "Lcom/example/jetmovie/movie_detail/domain/models/MovieDetail;", "Lcom/example/jetmovie/movie_detail/data/remote/models/MovieDetailDto;", "apiMovieMapper", "", "Lcom/example/jetmovie/movie/domain/models/Movie;", "Lcom/example/jetmovie/movie/data/remote/models/MovieDto;", "(Lcom/example/jetmovie/movie_detail/data/remote/api/MovieDetailApiService;Lcom/example/jetmovie/common/data/ApiMapper;Lcom/example/jetmovie/common/data/ApiMapper;)V", "fetchMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/jetmovie/utils/Response;", "fetchMovieDetail", "movieId", "", "app_debug"})
public final class MovieDetailRepositoryImpl implements com.example.jetmovie.movie_detail.domain.repository.MovieDetailRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.jetmovie.movie_detail.data.remote.api.MovieDetailApiService movieDetailApiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.jetmovie.common.data.ApiMapper<com.example.jetmovie.movie_detail.domain.models.MovieDetail, com.example.jetmovie.movie_detail.data.remote.models.MovieDetailDto> apiDetailMapper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.jetmovie.common.data.ApiMapper<java.util.List<com.example.jetmovie.movie.domain.models.Movie>, com.example.jetmovie.movie.data.remote.models.MovieDto> apiMovieMapper = null;
    
    public MovieDetailRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.jetmovie.movie_detail.data.remote.api.MovieDetailApiService movieDetailApiService, @org.jetbrains.annotations.NotNull()
    com.example.jetmovie.common.data.ApiMapper<com.example.jetmovie.movie_detail.domain.models.MovieDetail, com.example.jetmovie.movie_detail.data.remote.models.MovieDetailDto> apiDetailMapper, @org.jetbrains.annotations.NotNull()
    com.example.jetmovie.common.data.ApiMapper<java.util.List<com.example.jetmovie.movie.domain.models.Movie>, com.example.jetmovie.movie.data.remote.models.MovieDto> apiMovieMapper) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.example.jetmovie.utils.Response<com.example.jetmovie.movie_detail.domain.models.MovieDetail>> fetchMovieDetail(int movieId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.example.jetmovie.utils.Response<java.util.List<com.example.jetmovie.movie.domain.models.Movie>>> fetchMovie() {
        return null;
    }
}