package com.example.jetmovie.ui.detail.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\b\n\u0010\u000b\u001af\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017H\u0007\u001aJ\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017H\u0007\u001a\u001e\u0010\u001b\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\u001d\u001a\u00020\u0007H\u0003\u001a \u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0010H\u0003\u0082\u0002\u0007\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006!"}, d2 = {"ActionIconBtn", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "contentDescription", "", "bgColor", "Landroidx/compose/ui/graphics/Color;", "ActionIconBtn-g2O1Hgs", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;J)V", "DetailBodyContent", "movieDetail", "Lcom/example/jetmovie/movie_detail/domain/models/MovieDetail;", "movies", "", "Lcom/example/jetmovie/movie/domain/models/Movie;", "isMovieLoading", "", "fetchMovies", "Lkotlin/Function0;", "onMovieClick", "Lkotlin/Function1;", "", "onActorClick", "MoreLikeThis", "MovieInfoItem", "infoItem", "title", "Review", "reviews", "Lcom/example/jetmovie/movie_detail/domain/models/Review;", "app_debug"})
public final class DetailBodyContentKt {
    
    @androidx.compose.runtime.Composable()
    public static final void DetailBodyContent(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.example.jetmovie.movie_detail.domain.models.MovieDetail movieDetail, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetmovie.movie.domain.models.Movie> movies, boolean isMovieLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> fetchMovies, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onMovieClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onActorClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MoreLikeThis(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> fetchMovies, boolean isMovieLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetmovie.movie.domain.models.Movie> movies, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onMovieClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void MovieInfoItem(java.util.List<java.lang.String> infoItem, java.lang.String title) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void Review(androidx.compose.ui.Modifier modifier, java.util.List<com.example.jetmovie.movie_detail.domain.models.Review> reviews) {
    }
}