package com.example.jetmovie.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J>\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u000bH\u0007J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/jetmovie/di/MovieDetailModule;", "", "()V", "json", "Lkotlinx/serialization/json/Json;", "provideMovieDetailApiService", "Lcom/example/jetmovie/movie_detail/data/remote/api/MovieDetailApiService;", "provideMovieDetailRepository", "Lcom/example/jetmovie/movie_detail/domain/repository/MovieDetailRepository;", "movieDetailApiService", "mapper", "Lcom/example/jetmovie/common/data/ApiMapper;", "Lcom/example/jetmovie/movie_detail/domain/models/MovieDetail;", "Lcom/example/jetmovie/movie_detail/data/remote/models/MovieDetailDto;", "movieMapper", "", "Lcom/example/jetmovie/movie/domain/models/Movie;", "Lcom/example/jetmovie/movie/data/remote/models/MovieDto;", "provideMovieMapper", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class MovieDetailModule {
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.serialization.json.Json json = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.jetmovie.di.MovieDetailModule INSTANCE = null;
    
    private MovieDetailModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetmovie.movie_detail.domain.repository.MovieDetailRepository provideMovieDetailRepository(@org.jetbrains.annotations.NotNull()
    com.example.jetmovie.movie_detail.data.remote.api.MovieDetailApiService movieDetailApiService, @org.jetbrains.annotations.NotNull()
    com.example.jetmovie.common.data.ApiMapper<com.example.jetmovie.movie_detail.domain.models.MovieDetail, com.example.jetmovie.movie_detail.data.remote.models.MovieDetailDto> mapper, @org.jetbrains.annotations.NotNull()
    com.example.jetmovie.common.data.ApiMapper<java.util.List<com.example.jetmovie.movie.domain.models.Movie>, com.example.jetmovie.movie.data.remote.models.MovieDto> movieMapper) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetmovie.common.data.ApiMapper<com.example.jetmovie.movie_detail.domain.models.MovieDetail, com.example.jetmovie.movie_detail.data.remote.models.MovieDetailDto> provideMovieMapper() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetmovie.movie_detail.data.remote.api.MovieDetailApiService provideMovieDetailApiService() {
        return null;
    }
}