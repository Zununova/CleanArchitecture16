package com.umbr.presentation.screens

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.umbr.domain.entities.CharactersEntities

@Composable
fun HomeScreen(modifier: Modifier = Modifier, homeViewModel: HomeViewModel) {
    val charactersListState = homeViewModel.getCharacters().collectAsState(listOf())

    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(charactersListState.value) {
            CharacterItem(charactersEntities = it)
        }
    }
}

@Composable
fun CharacterItem(modifier: Modifier = Modifier, charactersEntities: CharactersEntities) {
    Card(modifier) {
        AsyncImage(
            modifier = Modifier.size(150.dp),
            model = charactersEntities.image,
            contentDescription = "character image",
            contentScale = ContentScale.Crop
        )
        Text(charactersEntities.name, fontSize = 20.sp)
    }
}