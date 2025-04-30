package com.example.jetmovie.movie.data.remote.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/example/jetmovie/movie/data/remote/api/MovieApiService;", "", "fetchDiscoverMovie", "Lcom/example/jetmovie/movie/data/remote/models/MovieDto;", "apiKey", "", "includeAdult", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTrendingMovie", "app_debug"})
public abstract interface MovieApiService {
    
    @retrofit2.http.GET(value = "discover/movie")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchDiscoverMovie(@retrofit2.http.Query(value = "api_key")
    @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @retrofit2.http.Query(value = "include_adult")
    boolean includeAdult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jetmovie.movie.data.remote.models.MovieDto> $completion);
    
    @retrofit2.http.GET(value = "trending/movie/week")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchTrendingMovie(@retrofit2.http.Query(value = "api_key")
    @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @retrofit2.http.Query(value = "include_adult")
    boolean includeAdult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jetmovie.movie.data.remote.models.MovieDto> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}