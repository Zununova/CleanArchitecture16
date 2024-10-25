package com.umbr.domain

class GetCharactersUseCase(private val charactersRepository: CharactersRepository) {
    operator fun invoke() = charactersRepository.getCharacters()
}