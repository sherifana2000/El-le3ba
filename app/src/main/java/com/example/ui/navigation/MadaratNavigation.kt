package com.example.ui.navigation

/**
 * Destinations for Madarat Al-Maarefa navigation flow.
 */
sealed class MadaratScreen {
    object Home : MadaratScreen()
    object GameplaySetup : MadaratScreen()
    object GameRound : MadaratScreen()
}
