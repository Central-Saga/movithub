package com.example.movithub.movie_detail.data.remote.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ,\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/movithub/movie_detail/data/remote/api/MovieDetailApiService;", "", "fetchMovie", "Lcom/example/movithub/movie/data/remote/models/MovieDto;", "apiKey", "", "includeAdult", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMovieDetail", "Lcom/example/movithub/movie_detail/data/remote/models/MovieDetailDto;", "movieId", "", "appendToResponse", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MovieDetailApiService {
    
    @retrofit2.http.GET(value = "movie/{movie_id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchMovieDetail(@retrofit2.http.Path(value = "movie_id")
    int movieId, @retrofit2.http.Query(value = "api_key")
    @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @retrofit2.http.Query(value = "append_to_response")
    @org.jetbrains.annotations.NotNull()
    java.lang.String appendToResponse, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movithub.movie_detail.data.remote.models.MovieDetailDto> $completion);
    
    @retrofit2.http.GET(value = "discover/movie")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchMovie(@retrofit2.http.Query(value = "api_key")
    @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @retrofit2.http.Query(value = "include_adult")
    boolean includeAdult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movithub.movie.data.remote.models.MovieDto> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}