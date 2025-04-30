package com.example.jetmovie.ui.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\tH\u00c6\u0003J?\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/jetmovie/ui/home/HomeState;", "", "discoverMovies", "", "Lcom/example/jetmovie/movie/domain/models/Movie;", "trendingMovies", "error", "", "isLoading", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "getDiscoverMovies", "()Ljava/util/List;", "getError", "()Ljava/lang/String;", "()Z", "getTrendingMovies", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class HomeState {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.jetmovie.movie.domain.models.Movie> discoverMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.jetmovie.movie.domain.models.Movie> trendingMovies = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    private final boolean isLoading = false;
    
    public HomeState(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetmovie.movie.domain.models.Movie> discoverMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetmovie.movie.domain.models.Movie> trendingMovies, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean isLoading) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.jetmovie.movie.domain.models.Movie> getDiscoverMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.jetmovie.movie.domain.models.Movie> getTrendingMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public HomeState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.jetmovie.movie.domain.models.Movie> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.jetmovie.movie.domain.models.Movie> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetmovie.ui.home.HomeState copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetmovie.movie.domain.models.Movie> discoverMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetmovie.movie.domain.models.Movie> trendingMovies, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean isLoading) {
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