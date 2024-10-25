package com.umbr.cleanarchitecture.di.modules

import com.umbr.data.CharactersRepositoryImpl
import com.umbr.data.remote.CharactersApiService
import com.umbr.domain.CharactersRepository
import com.umbr.domain.GetCharactersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    fun provideGetCharactersUseCase(charactersRepository: CharactersRepository): GetCharactersUseCase {
        return GetCharactersUseCase(charactersRepository)
    }

    @Provides
    fun provideCharacterRepository(
        charactersRepositoryImpl: CharactersRepositoryImpl,
    ): CharactersRepository {
        return charactersRepositoryImpl
    }
}