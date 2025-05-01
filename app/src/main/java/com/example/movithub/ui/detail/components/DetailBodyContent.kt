package com.example.movithub.ui.detail.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.movithub.movie.domain.models.Movie
import com.example.movithub.movie_detail.domain.models.MovieDetail
import com.example.movithub.ui.home.components.MovieCard
import com.example.movithub.ui.theme.defaultPadding
import com.example.movithub.ui.theme.itemSpacing
import com.example.movithub.ui.theme.surfaceContainerDark
import com.example.movithub.utils.K

@Composable
fun DetailBodyContent(
    modifier: Modifier = Modifier,
    movieDetail: MovieDetail,
    movies: List<Movie>,
    isMovieLoading: Boolean,
    fetchMovies: () -> Unit,
    onMovieClick: (Int) -> Unit,
    onActorClick: (Int) -> Unit,
) {
    LazyColumn(
        modifier = modifier.padding(bottom = 16.dp),
        verticalArrangement = Arrangement.spacedBy(itemSpacing)
    ) {
        item {
            Card(
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = surfaceContainerDark
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = defaultPadding, // padding atas
                        start = defaultPadding,
                        end = defaultPadding )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(defaultPadding)
                ) {
                    // Genre & runtime
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row {
                            movieDetail.genreIds.forEachIndexed { index, genreText ->
                                Text(
                                    text = genreText,
                                    modifier = Modifier.padding(end = 6.dp),
                                    style = MaterialTheme.typography.bodySmall
                                )
                                if (index != movieDetail.genreIds.lastIndex) {
                                    Text(text = " • ")
                                }
                            }
                        }
                        Text(
                            text = movieDetail.runTime,
                            style = MaterialTheme.typography.bodySmall
                        )
                    }

                    Spacer(modifier = Modifier.height(itemSpacing))

                    // Judul
                    Text(
                        text = movieDetail.title,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(itemSpacing))

                    // Rating & Release Date baru
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "Rating",
                                tint = Color.Yellow,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = String.format("%.1f", movieDetail.voteAverage),
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.CalendarToday,
                                contentDescription = "Release Date",
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = movieDetail.releaseDate ?: "-",
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(itemSpacing))

                    // Overview
                    SectionTitle(title = "Overview")
                    Text(
                        text = movieDetail.overview,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(horizontal = defaultPadding)
                    )
                }
            }
        }

        // Cast & Crew
        if (movieDetail.cast.isNotEmpty()) {
            item {
                SectionTitle(title = "Cast & Crew")
                LazyRow(
                    contentPadding = PaddingValues(horizontal = defaultPadding),
                    horizontalArrangement = Arrangement.spacedBy(itemSpacing)
                ) {
                    items(movieDetail.cast) {
                        ActorItem(
                            cast = it,
                            modifier = Modifier
                                .width(100.dp)
                                .clickable { onActorClick(it.id) }
                        )
                    }
                }
            }
        }

        // Movie Info
        item {
            Spacer(modifier = Modifier.height(itemSpacing))
            MovieInfoItem(
                infoItem = movieDetail.language,
                title = "Spoken Language:",
                modifier = Modifier.padding(horizontal = defaultPadding)
            )
            Spacer(modifier = Modifier.height(itemSpacing))
            MovieInfoItem(
                infoItem = movieDetail.productionCountry,
                title = "Production Countries:",
                modifier = Modifier.padding(horizontal = defaultPadding)
            )
        }

        // Reviews
        if (movieDetail.reviews.isNotEmpty()) {
            item {
                SectionTitle(title = "Reviews")
                Review(
                    reviews = movieDetail.reviews
                )
            }
        }

        // More Like This
        item {
            MoreLikeThis(
                fetchMovies = fetchMovies,
                isMovieLoading = isMovieLoading,
                movies = movies,
                onMovieClick = onMovieClick
            )
        }
    }
}

@Composable
private fun SectionTitle(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleLarge,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(horizontal = defaultPadding, vertical = 8.dp)
    )
}

@Composable
private fun MovieInfoItem(
    infoItem: List<String>,
    title: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.width(6.dp))
        infoItem.forEachIndexed { index, item ->
            Text(
                text = item,
                style = MaterialTheme.typography.bodySmall,
                fontWeight = FontWeight.Bold
            )
            if (index != infoItem.lastIndex) {
                Text(text = " • ")
            }
        }
    }
}

@Composable
private fun Review(
    modifier: Modifier = Modifier,
    reviews: List<com.example.movithub.movie_detail.domain.models.Review>
) {
    val (viewMore, setViewMore) = rememberSaveable { mutableStateOf(false) }
    val displayedReviews = if (viewMore) reviews else reviews.take(3)
    val btnText = if (viewMore) "Collapse" else "More..."

    Column(modifier = Modifier.padding(horizontal = defaultPadding)) {
        displayedReviews.forEach { review ->
            ReviewItem(review = review)
            Spacer(modifier = Modifier.height(itemSpacing))
        }
        TextButton(onClick = { setViewMore(!viewMore) }) {
            Text(text = btnText)
        }
    }
}

@Composable
fun MoreLikeThis(
    modifier: Modifier = Modifier,
    fetchMovies: () -> Unit,
    isMovieLoading: Boolean,
    movies: List<Movie>,
    onMovieClick: (Int) -> Unit
) {
    LaunchedEffect(Unit) {
        fetchMovies()
    }
    Column(modifier) {
        SectionTitle(title = "More like this")
        LazyRow(
            contentPadding = PaddingValues(horizontal = defaultPadding),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing)
        ) {
            if (isMovieLoading) {
                items(3) {
                    Card(
                        modifier = Modifier
                            .width(140.dp)
                            .height(220.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Box(Modifier.fillMaxSize()) {
                            CircularProgressIndicator(Modifier.align(Alignment.Center))
                        }
                    }
                }
            } else {
                items(movies) { movie ->
                    var bookmarked by rememberSaveable { mutableStateOf(false) }

                    MovieCard(
                        modifier = Modifier
                            .width(140.dp)
                            .clickable { onMovieClick(movie.id) }
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(220.dp)
                        ) {
                            AsyncImage(
                                model = "${K.BASE_IMAGE_URL}${movie.posterPath}",
                                contentDescription = movie.title,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.matchParentSize()
                            )

                            // Rating kiri atas
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .padding(4.dp)
                                    .background(
                                        Color.Black.copy(alpha = 0.6f),
                                        RoundedCornerShape(4.dp)
                                    )
                                    .padding(horizontal = 6.dp, vertical = 2.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "Rating",
                                    tint = Color.Yellow,
                                    modifier = Modifier.size(12.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = String.format("%.1f", movie.voteAverage),
                                    style = MaterialTheme.typography.bodySmall
                                )
                            }

                            // Favorite kanan atas
                            IconButton(
                                onClick = { bookmarked = !bookmarked },
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(4.dp)
                                    .background(Color.Black.copy(alpha = 0.5f), CircleShape)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Bookmark,
                                    contentDescription = "Favorite",
                                    tint = if (bookmarked) Color(0xFF1DB954) else Color.White
                                )
                            }

                            // Judul & tanggal di bawah poster
                            Column(
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .fillMaxWidth()
                                    .background(
                                        Brush.verticalGradient(
                                            colors = listOf(
                                                Color.Transparent,
                                                Color.Black.copy(alpha = 0.7f)
                                            )
                                        )
                                    )
                                    .padding(8.dp)
                            ) {
                                Text(
                                    text = movie.title,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Color.White,
                                    maxLines = 1
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

