package com.example.movithub.ui.detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\nH\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/example/movithub/ui/detail/DetailState;", "", "movieDetail", "Lcom/example/movithub/movie_detail/domain/models/MovieDetail;", "movies", "", "Lcom/example/movithub/movie/domain/models/Movie;", "isLoading", "", "error", "", "isMovieLoading", "(Lcom/example/movithub/movie_detail/domain/models/MovieDetail;Ljava/util/List;ZLjava/lang/String;Z)V", "getError", "()Ljava/lang/String;", "()Z", "getMovieDetail", "()Lcom/example/movithub/movie_detail/domain/models/MovieDetail;", "getMovies", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class DetailState {
    @org.jetbrains.annotations.Nullable()
    private final com.example.movithub.movie_detail.domain.models.MovieDetail movieDetail = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.movithub.movie.domain.models.Movie> movies = null;
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    private final boolean isMovieLoading = false;
    
    public DetailState(@org.jetbrains.annotations.Nullable()
    com.example.movithub.movie_detail.domain.models.MovieDetail movieDetail, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movithub.movie.domain.models.Movie> movies, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean isMovieLoading) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.movithub.movie_detail.domain.models.MovieDetail getMovieDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.movithub.movie.domain.models.Movie> getMovies() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public final boolean isMovieLoading() {
        return false;
    }
    
    public DetailState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.movithub.movie_detail.domain.models.MovieDetail component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.movithub.movie.domain.models.Movie> component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movithub.ui.detail.DetailState copy(@org.jetbrains.annotations.Nullable()
    com.example.movithub.movie_detail.domain.models.MovieDetail movieDetail, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movithub.movie.domain.models.Movie> movies, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean isMovieLoading) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}