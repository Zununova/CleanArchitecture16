package com.umbr.cleanarchitecture.di.modules

import com.umbr.domain.GetCharactersUseCase
import com.umbr.presentation.HomeViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object PresentationModule {

    @Provides
    fun provideHomeViewModelFactory(getCharactersUseCase: GetCharactersUseCase): HomeViewModelFactory {
        return HomeViewModelFactory(getCharactersUseCase)
    }
}