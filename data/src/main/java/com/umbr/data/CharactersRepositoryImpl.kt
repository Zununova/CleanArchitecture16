package com.umbr.data

import com.umbr.data.remote.CharactersApiService
import com.umbr.data.remote.models.toEntity
import com.umbr.domain.CharactersRepository
import com.umbr.domain.entities.CharactersEntities
import kotlinx.coroutines.flow.flow

class CharactersRepositoryImpl(private val charactersApiService: CharactersApiService) :
    CharactersRepository {

    override fun getCharacters() = flow {
        emit(charactersApiService.getCharacters().results.map { character ->
            character.toEntity()
        })
    }
}