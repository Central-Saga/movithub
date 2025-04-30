package com.example.jetmovie.movie.data.repository_impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f0\u000bH\u0016J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f0\u000bH\u0016R \u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/jetmovie/movie/data/repository_impl/MovieRepositoryImpl;", "Lcom/example/jetmovie/movie/domain/repository/MovieRepository;", "movieApiService", "Lcom/example/jetmovie/movie/data/remote/api/MovieApiService;", "apiMapper", "Lcom/example/jetmovie/common/data/ApiMapper;", "", "Lcom/example/jetmovie/movie/domain/models/Movie;", "Lcom/example/jetmovie/movie/data/remote/models/MovieDto;", "(Lcom/example/jetmovie/movie/data/remote/api/MovieApiService;Lcom/example/jetmovie/common/data/ApiMapper;)V", "fetchDiscoverMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/jetmovie/utils/Response;", "fetchTrendingMovie", "app_debug"})
public final class MovieRepositoryImpl implements com.example.jetmovie.movie.domain.repository.MovieRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.jetmovie.movie.data.remote.api.MovieApiService movieApiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.jetmovie.common.data.ApiMapper<java.util.List<com.example.jetmovie.movie.domain.models.Movie>, com.example.jetmovie.movie.data.remote.models.MovieDto> apiMapper = null;
    
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.jetmovie.movie.data.remote.api.MovieApiService movieApiService, @org.jetbrains.annotations.NotNull()
    com.example.jetmovie.common.data.ApiMapper<java.util.List<com.example.jetmovie.movie.domain.models.Movie>, com.example.jetmovie.movie.data.remote.models.MovieDto> apiMapper) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.example.jetmovie.utils.Response<java.util.List<com.example.jetmovie.movie.domain.models.Movie>>> fetchDiscoverMovie() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.example.jetmovie.utils.Response<java.util.List<com.example.jetmovie.movie.domain.models.Movie>>> fetchTrendingMovie() {
        return null;
    }
}