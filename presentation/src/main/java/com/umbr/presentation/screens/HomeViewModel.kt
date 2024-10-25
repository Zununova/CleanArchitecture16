package com.umbr.presentation.screens

import androidx.lifecycle.ViewModel
import com.umbr.domain.GetCharactersUseCase

class HomeViewModel(private val getCharactersUseCase: GetCharactersUseCase): ViewModel() {

    fun getCharacters() = getCharactersUseCase()
}