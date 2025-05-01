package com.example.movithub.ui.detail.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001af\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001aJ\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a(\u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u001a \u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0003\u001a\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0003\u00a8\u0006\u001a"}, d2 = {"DetailBodyContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "movieDetail", "Lcom/example/movithub/movie_detail/domain/models/MovieDetail;", "movies", "", "Lcom/example/movithub/movie/domain/models/Movie;", "isMovieLoading", "", "fetchMovies", "Lkotlin/Function0;", "onMovieClick", "Lkotlin/Function1;", "", "onActorClick", "MoreLikeThis", "MovieInfoItem", "infoItem", "", "title", "Review", "reviews", "Lcom/example/movithub/movie_detail/domain/models/Review;", "SectionTitle", "app_debug"})
public final class DetailBodyContentKt {
    
    @androidx.compose.runtime.Composable()
    public static final void DetailBodyContent(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.example.movithub.movie_detail.domain.models.MovieDetail movieDetail, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movithub.movie.domain.models.Movie> movies, boolean isMovieLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> fetchMovies, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onMovieClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onActorClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SectionTitle(java.lang.String title) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void MovieInfoItem(java.util.List<java.lang.String> infoItem, java.lang.String title, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void Review(androidx.compose.ui.Modifier modifier, java.util.List<com.example.movithub.movie_detail.domain.models.Review> reviews) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MoreLikeThis(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> fetchMovies, boolean isMovieLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movithub.movie.domain.models.Movie> movies, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onMovieClick) {
    }
}