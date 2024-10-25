package com.umbr.cleanarchitecture.di.modules

import com.umbr.data.CharactersRepositoryImpl
import com.umbr.data.remote.CharactersApiService
import com.umbr.data.remote.RickAndMortyRetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    fun provideApiServer(): CharactersApiService =
        RickAndMortyRetrofitClient.charactersApiService

    @Provides
    fun provideCharactersRepositoryImpl(charactersApiService: CharactersApiService): CharactersRepositoryImpl {
        return CharactersRepositoryImpl(charactersApiService)
    }
}