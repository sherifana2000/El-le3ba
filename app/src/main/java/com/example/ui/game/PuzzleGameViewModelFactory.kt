package com.example.ui.game

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.data.repository.PlayerProgressRepository

/**
 * Factory for creating [PuzzleGameViewModel] with [PlayerProgressRepository].
 */
class PuzzleGameViewModelFactory(
    private val progressRepository: PlayerProgressRepository? = null
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PuzzleGameViewModel::class.java)) {
            return PuzzleGameViewModel(progressRepository = progressRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
    }
}
