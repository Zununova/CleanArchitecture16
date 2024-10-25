package com.umbr.data.remote

import com.umbr.data.remote.models.RickAndMortyResponse
import retrofit2.http.GET

interface CharactersApiService {

    @GET("character")
    suspend fun getCharacters() : RickAndMortyResponse
}