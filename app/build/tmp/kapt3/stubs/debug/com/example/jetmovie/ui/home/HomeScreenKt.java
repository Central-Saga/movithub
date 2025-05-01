package com.example.jetmovie.ui.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fH\u0007\u001a&\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0007\u001a&\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fH\u0007\u001a$\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fH\u0007\"\u0013\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0013\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\u00a8\u0006\u0019"}, d2 = {"defaultPadding", "Landroidx/compose/ui/unit/Dp;", "getDefaultPadding", "()F", "F", "itemSpacing", "getItemSpacing", "DiscoverMovieItem", "", "movie", "Lcom/example/jetmovie/movie/domain/models/Movie;", "onClick", "Lkotlin/Function1;", "", "GenreChip", "genre", "", "isSelected", "", "Lkotlin/Function0;", "HomeScreen", "homeViewModel", "Lcom/example/jetmovie/ui/home/HomeViewModel;", "onMovieClick", "TrendingMovieItem", "app_debug"})
public final class HomeScreenKt {
    private static final float defaultPadding = 0.0F;
    private static final float itemSpacing = 0.0F;
    
    public static final float getDefaultPadding() {
        return 0.0F;
    }
    
    public static final float getItemSpacing() {
        return 0.0F;
    }
    
    @androidx.compose.runtime.Composable()
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull()
    com.example.jetmovie.ui.home.HomeViewModel homeViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onMovieClick) {
    }
    
    /**
     * === GENRE CHIP ===
     */
    @androidx.compose.runtime.Composable()
    public static final void GenreChip(@org.jetbrains.annotations.NotNull()
    java.lang.String genre, boolean isSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    /**
     * === DISCOVER MOVIE CARD ===
     */
    @androidx.compose.runtime.Composable()
    public static final void DiscoverMovieItem(@org.jetbrains.annotations.NotNull()
    com.example.jetmovie.movie.domain.models.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClick) {
    }
    
    /**
     * === TRENDING MOVIE CARD ===
     */
    @androidx.compose.runtime.Composable()
    public static final void TrendingMovieItem(@org.jetbrains.annotations.NotNull()
    com.example.jetmovie.movie.domain.models.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClick) {
    }
}