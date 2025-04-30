package com.example.jetmovie.ui.home.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007\u001a\b\u0010\n\u001a\u00020\u0001H\u0003\u001a=\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000fH\u0007\u00a8\u0006\u0014"}, d2 = {"MovieDetail", "", "modifier", "Landroidx/compose/ui/Modifier;", "rating", "", "title", "", "genre", "", "PrevMovieDetail", "TopContent", "movie", "Lcom/example/jetmovie/movie/domain/models/Movie;", "onMovieClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "id", "app_debug"})
public final class TopContentKt {
    
    @androidx.compose.runtime.Composable()
    public static final void TopContent(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.example.jetmovie.movie.domain.models.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onMovieClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MovieDetail(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, double rating, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> genre) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    @androidx.compose.runtime.Composable()
    private static final void PrevMovieDetail() {
    }
}