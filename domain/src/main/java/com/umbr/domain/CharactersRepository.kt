package com.umbr.domain

import com.umbr.domain.entities.CharactersEntities
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

    fun getCharacters() : Flow<List<CharactersEntities>>
}