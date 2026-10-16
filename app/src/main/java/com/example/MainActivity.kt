package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.data.repository.PlayerProgressRepository
import com.example.ui.game.PuzzleGameViewModel
import com.example.ui.game.PuzzleGameViewModelFactory
import com.example.ui.navigation.MadaratScreen
import com.example.ui.screens.GameRoundScreen
import com.example.ui.screens.GameplaySetupScreen
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.TreasureMapScreen
import androidx.compose.runtime.rememberCoroutineScope
import com.example.ui.components.MadaratSettingsDialog
import com.example.ui.theme.MadaratTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
        var isDarkTheme by remember { mutableStateOf(true) }
        MadaratTheme(darkTheme = isDarkTheme) {
        val context = LocalContext.current
        val coroutineScope = rememberCoroutineScope()
        val progressRepository = remember { PlayerProgressRepository.getInstance(context) }
        val gameViewModel: PuzzleGameViewModel = viewModel(
          factory = remember { PuzzleGameViewModelFactory(progressRepository) }
        )
        val allProgress by gameViewModel.allProgress.collectAsStateWithLifecycle()
        var currentScreen by remember { mutableStateOf<MadaratScreen>(MadaratScreen.Home) }
        var previousScreen by remember { mutableStateOf<MadaratScreen>(MadaratScreen.Home) }
        var setupInitialCategory by remember { mutableStateOf("astronomy") }
        var showSettingsDialog by remember { mutableStateOf(false) }

        // Physical and gesture back handling with partial progress persistence
        BackHandler(enabled = currentScreen != MadaratScreen.Home) {
          currentScreen = when (currentScreen) {
            MadaratScreen.GameRound -> {
              gameViewModel.savePartialProgress()
              previousScreen
            }
            MadaratScreen.GameplaySetup -> MadaratScreen.TreasureMap
            MadaratScreen.TreasureMap -> MadaratScreen.Home
            MadaratScreen.Home -> MadaratScreen.Home
          }
        }

        if (showSettingsDialog) {
          MadaratSettingsDialog(
            isDarkTheme = isDarkTheme,
            onToggleTheme = { isDarkTheme = it },
            onDismissRequest = { showSettingsDialog = false },
            onResetProgress = {
              coroutineScope.launch {
                progressRepository.clearAll()
              }
            }
          )
        }

        Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
          AnimatedContent(
            targetState = currentScreen,
            transitionSpec = { fadeIn() togetherWith fadeOut() },
            label = "screen_transition"
          ) { screen ->
            when (screen) {
              MadaratScreen.Home -> {
                HomeScreen(
                  onPlayClick = {
                    setupInitialCategory = "astronomy"
                    currentScreen = MadaratScreen.GameplaySetup
                  },
                  onExploreWorldsClick = { currentScreen = MadaratScreen.TreasureMap },
                  onSettingsClick = { showSettingsDialog = true }
                )
              }
              MadaratScreen.TreasureMap -> {
                TreasureMapScreen(
                  progressMap = allProgress,
                  onStartRoundClick = { categoryId, difficulty ->
                    gameViewModel.startSession(categoryId, difficulty)
                    previousScreen = MadaratScreen.TreasureMap
                    currentScreen = MadaratScreen.GameRound
                  },
                  onConfigureHouseClick = { categoryId ->
                    setupInitialCategory = categoryId
                    currentScreen = MadaratScreen.GameplaySetup
                  },
                  onBackClick = { currentScreen = MadaratScreen.Home }
                )
              }
              MadaratScreen.GameplaySetup -> {
                GameplaySetupScreen(
                  progressMap = allProgress,
                  initialCategoryId = setupInitialCategory,
                  onStartRoundClick = { categoryId, difficulty ->
                    gameViewModel.startSession(categoryId, difficulty)
                    previousScreen = MadaratScreen.GameplaySetup
                    currentScreen = MadaratScreen.GameRound
                  },
                  onBackClick = { currentScreen = MadaratScreen.TreasureMap }
                )
              }
              MadaratScreen.GameRound -> {
                GameRoundScreen(
                  viewModel = gameViewModel,
                  onBackClick = {
                    gameViewModel.savePartialProgress()
                    currentScreen = previousScreen
                  },
                  onCompleteRound = {
                    gameViewModel.replaySession()
                    currentScreen = previousScreen
                  }
                )
              }
            }
          }
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  androidx.compose.material3.Text(text = "Hello $name!", modifier = modifier)
}
