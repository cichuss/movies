package com.example.movies.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.movies.MovieItem
import com.example.movies.getSampleMovies

@Composable
fun MainScreen(navController: NavController) {
    Column {
        LazyColumn {
            items(getSampleMovies()) { movie ->
                MovieItem(movie = movie, onClick = {
                    navController.navigate("descriptionScreen/${movie.id}")
                })
            }
        }
    }
}

