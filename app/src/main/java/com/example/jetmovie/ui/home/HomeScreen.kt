package com.example.jetmovie.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import com.example.jetmovie.movie.domain.models.Movie
import com.example.jetmovie.ui.components.LoadingView
import com.example.jetmovie.utils.K
import kotlinx.coroutines.delay
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState

val defaultPadding = 16.dp
val itemSpacing = 8.dp

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = hiltViewModel(),
    onMovieClick: (Int) -> Unit
) {
    val state by homeViewModel.homeState.collectAsStateWithLifecycle()

    val carouselMovies = state.discoverMovies
    val pagerState = rememberPagerState(pageCount = { carouselMovies.size })

    // Auto Scroll
    LaunchedEffect(pagerState.currentPage) {
        delay(4000)
        val nextPage = if (pagerState.currentPage < carouselMovies.size - 1) {
            pagerState.currentPage + 1
        } else 0
        pagerState.scrollToPage(nextPage)
    }

    // Genre filter state
    var selectedGenre by remember { mutableStateOf<String?>(null) }

    // Filtering discover & trending movies
    val discoverMovies = state.discoverMovies.filter {
        selectedGenre == null || it.genreIds.contains(selectedGenre)
    }

    val trendingMovies = state.trendingMovies.filter {
        selectedGenre == null || it.genreIds.contains(selectedGenre)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xFF1DB954),
                        Color(0xFF0D3B66),
                        Color.Black
                    )
                )
            )
    ) {
        if (state.isLoading) {
            LoadingView(isLoading = true)
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(itemSpacing),
                modifier = Modifier.fillMaxSize()
            ) {

                /** === Carousel === */
                item {
                    if (carouselMovies.isNotEmpty()) {
                        HorizontalPager(
                            state = pagerState,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(500.dp)
                        ) { page ->
                            val movie = carouselMovies[page]
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clickable { onMovieClick(movie.id) }
                            ) {
                                AsyncImage(
                                    model = "${K.BASE_IMAGE_URL}${movie.posterPath}",
                                    contentDescription = movie.title,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxSize()
                                )
                                Box(
                                    Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                listOf(Color.Transparent, Color.Black.copy(alpha = 0.5f))
                                            )
                                        )
                                )
                                Column(
                                    modifier = Modifier
                                        .align(Alignment.BottomStart)
                                        .padding(12.dp)
                                ) {
                                    Text(
                                        text = movie.title,
                                        style = MaterialTheme.typography.titleLarge,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "⭐ ${movie.voteAverage}",
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = Color.White
                                    )
                                    Spacer(modifier = Modifier.height(4.dp))
                                    LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                        items(movie.genreIds) { genre ->
                                            GenreChip(
                                                genre = genre,
                                                isSelected = selectedGenre == genre,
                                                onClick = {
                                                    selectedGenre = if (selectedGenre == genre) null else genre
                                                }
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                /** === Discover Movies === */
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = defaultPadding, vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Discover Movies",
                            style = MaterialTheme.typography.titleLarge,
                            color = Color.White
                        )
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos,
                            contentDescription = "More",
                            tint = Color.White
                        )
                    }
                }

                item {
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = defaultPadding),
                        horizontalArrangement = Arrangement.spacedBy(itemSpacing)
                    ) {
                        items(discoverMovies) { movie ->
                            DiscoverMovieItem(movie, onMovieClick)
                        }
                    }
                }

                /** === Trending Now === */
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = defaultPadding, vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Trending Now",
                            style = MaterialTheme.typography.titleLarge,
                            color = Color.White
                        )
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos,
                            contentDescription = "More",
                            tint = Color.White
                        )
                    }
                }

                item {
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = defaultPadding),
                        horizontalArrangement = Arrangement.spacedBy(itemSpacing)
                    ) {
                        items(trendingMovies) { movie ->
                            TrendingMovieItem(movie, onMovieClick)
                        }
                    }
                }
            }
        }
    }
}

/** === GENRE CHIP === */
@Composable
fun GenreChip(genre: String, isSelected: Boolean, onClick: () -> Unit) {
    Surface(
        color = if (isSelected) Color(0xFF1DB954) else Color.White.copy(alpha = 0.1f),
        shape = RoundedCornerShape(20.dp),
        tonalElevation = 2.dp,
        modifier = Modifier.clickable { onClick() }
    ) {
        Text(
            text = genre,
            color = Color.White,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

/** === DISCOVER MOVIE CARD === */
@Composable
fun DiscoverMovieItem(movie: Movie, onClick: (Int) -> Unit) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .width(150.dp)
            .height(270.dp)
            .clickable { onClick(movie.id) }
    ) {
        Box {
            AsyncImage(
                model = "${K.BASE_IMAGE_URL}${movie.posterPath}",
                contentDescription = movie.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Box(
                Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            listOf(Color.Transparent, Color.Black.copy(alpha = 0.3f))
                        )
                    )
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(8.dp)
            ) {
                Text(
                    text = movie.title,
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )
                Text(
                    text = "⭐ ${movie.voteAverage}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White
                )
            }
        }
    }
}

/** === TRENDING MOVIE CARD === */
@Composable
fun TrendingMovieItem(movie: Movie, onClick: (Int) -> Unit) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .width(150.dp)
            .height(270.dp)
            .clickable { onClick(movie.id) }
    ) {
        Box {
            AsyncImage(
                model = "${K.BASE_IMAGE_URL}${movie.posterPath}",
                contentDescription = movie.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Box(
                Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            listOf(Color.Transparent, Color.Black.copy(alpha = 0.3f))
                        )
                    )
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(8.dp)
            ) {
                Text(
                    text = movie.title,
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )
                Text(
                    text = "⭐ ${movie.voteAverage}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White
                )
            }
        }
    }
}
