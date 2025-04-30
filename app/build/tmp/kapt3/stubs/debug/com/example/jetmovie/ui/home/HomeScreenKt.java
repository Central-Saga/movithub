package com.example.jetmovie.ui.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0003\u001a.\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003\u001a?\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007\u001a.\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012H\u0003\u001a\"\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003\u001a\u001a\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003\u001a\u0014\u0010#\u001a\u00020\u0015*\u00020\u00152\b\b\u0002\u0010$\u001a\u00020\b\"\u0013\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0013\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\u00a8\u0006%"}, d2 = {"defaultPadding", "Landroidx/compose/ui/unit/Dp;", "getDefaultPadding", "()F", "F", "itemSpacing", "getItemSpacing", "pagerItemAspectRatio", "", "getPagerItemAspectRatio", "ErrorState", "", "error", "", "HeroMovieItem", "movie", "Lcom/example/jetmovie/movie/domain/models/Movie;", "onMovieClick", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "HomeScreen", "homeViewModel", "Lcom/example/jetmovie/ui/home/HomeViewModel;", "Lkotlin/ParameterName;", "name", "id", "MovieCard", "PageIndicator", "pageCount", "currentPage", "RatingBadge", "rating", "", "scaleOnPress", "scaleFactor", "app_debug"})
public final class HomeScreenKt {
    private static final float defaultPadding = 0.0F;
    private static final float itemSpacing = 0.0F;
    private static final float pagerItemAspectRatio = 1.78F;
    
    public static final float getDefaultPadding() {
        return 0.0F;
    }
    
    public static final float getItemSpacing() {
        return 0.0F;
    }
    
    public static final float getPagerItemAspectRatio() {
        return 0.0F;
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable()
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.example.jetmovie.ui.home.HomeViewModel homeViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onMovieClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void HeroMovieItem(com.example.jetmovie.movie.domain.models.Movie movie, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onMovieClick, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void MovieCard(com.example.jetmovie.movie.domain.models.Movie movie, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onMovieClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void RatingBadge(double rating, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void PageIndicator(int pageCount, int currentPage, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ErrorState(java.lang.String error) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.ui.Modifier scaleOnPress(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier $this$scaleOnPress, float scaleFactor) {
        return null;
    }
}