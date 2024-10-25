package com.umbr.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.umbr.domain.GetCharactersUseCase
import com.umbr.presentation.screens.HomeViewModel

class HomeViewModelFactory(private val getCharactersUseCase: GetCharactersUseCase) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HomeViewModel(getCharactersUseCase) as T
    }
}