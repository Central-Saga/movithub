package com.example.jetmovie.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\bH\u0007J*\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/jetmovie/di/MovieModule;", "", "()V", "json", "Lkotlinx/serialization/json/Json;", "provideMovieApiService", "Lcom/example/jetmovie/movie/data/remote/api/MovieApiService;", "provideMovieMapper", "Lcom/example/jetmovie/common/data/ApiMapper;", "", "Lcom/example/jetmovie/movie/domain/models/Movie;", "Lcom/example/jetmovie/movie/data/remote/models/MovieDto;", "provideMovieRepository", "Lcom/example/jetmovie/movie/domain/repository/MovieRepository;", "movieApiService", "mapper", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class MovieModule {
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.serialization.json.Json json = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.jetmovie.di.MovieModule INSTANCE = null;
    
    private MovieModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetmovie.movie.domain.repository.MovieRepository provideMovieRepository(@org.jetbrains.annotations.NotNull()
    com.example.jetmovie.movie.data.remote.api.MovieApiService movieApiService, @org.jetbrains.annotations.NotNull()
    com.example.jetmovie.common.data.ApiMapper<java.util.List<com.example.jetmovie.movie.domain.models.Movie>, com.example.jetmovie.movie.data.remote.models.MovieDto> mapper) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetmovie.common.data.ApiMapper<java.util.List<com.example.jetmovie.movie.domain.models.Movie>, com.example.jetmovie.movie.data.remote.models.MovieDto> provideMovieMapper() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetmovie.movie.data.remote.api.MovieApiService provideMovieApiService() {
        return null;
    }
}