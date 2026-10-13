package com.example.ui.game

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.local.entity.PlayerProgressEntity
import com.example.data.model.Puzzle
import com.example.data.repository.PlayerProgressRepository
import com.example.data.repository.PuzzleRepository
import com.example.domain.ArabicTextNormalizer
import com.example.ui.components.AnswerSlotState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

enum class SubmissionFeedback {
    Idle,
    Correct,
    Incorrect
}

object HintConstants {
    const val REVEAL_LETTER_COST = 3
    const val REMOVE_WRONG_LETTERS_COST = 2
    const val SHOW_HINT_COST = 1
    const val WRONG_LETTERS_TO_REMOVE_COUNT = 2
}

data class SlotDisplayState(
    val index: Int,
    val letter: String?,
    val state: AnswerSlotState,
    val isRevealed: Boolean
)

data class PuzzleUiState(
    val categoryId: String = "cars",
    val categoryName: String = "بيت السيارات والمواصلات",
    val puzzles: List<Puzzle> = PuzzleRepository.getPuzzlesForCategory("cars").take(10),
    val currentPuzzleIndex: Int = 0,
    val userSelectedTileIndices: List<Int> = emptyList(),
    val revealedPositions: Map<Int, Int> = emptyMap(), // slotIndex (0..wordLen-1) -> tileIndex in availableLetters
    val eliminatedTileIndices: Set<Int> = emptySet(),
    val revealLetterUsed: Boolean = false,
    val removeWrongLettersUsed: Boolean = false,
    val hintUsed: Boolean = false,
    val isHintVisible: Boolean = false,
    val currentReward: Int = 15,
    val lastEarnedReward: Int = 0,
    val submissionFeedback: SubmissionFeedback = SubmissionFeedback.Idle,
    val score: Int = 0,
    val correctCount: Int = 0,
    val isSessionCompleted: Boolean = false
) {
    val currentPuzzle: Puzzle?
        get() = puzzles.getOrNull(currentPuzzleIndex)

    val selectedTileIndices: List<Int>
        get() = userSelectedTileIndices + revealedPositions.values

    val currentAnswer: String
        get() {
            val puzzle = currentPuzzle ?: return ""
            val wordLen = puzzle.correctAnswer.length
            val unrevealedPositions = (0 until wordLen).filter { it !in revealedPositions.keys }
            val letters = mutableListOf<String>()
            var uIdx = 0
            for (i in 0 until wordLen) {
                val revTile = revealedPositions[i]
                if (revTile != null) {
                    puzzle.availableLetters.getOrNull(revTile)?.let { letters.add(it) }
                } else if (uIdx < userSelectedTileIndices.size) {
                    val tile = userSelectedTileIndices[uIdx++]
                    puzzle.availableLetters.getOrNull(tile)?.let { letters.add(it) }
                }
            }
            return letters.joinToString("")
        }

    val isAnswerComplete: Boolean
        get() {
            val wordLen = currentPuzzle?.correctAnswer?.length ?: return false
            return (revealedPositions.size + userSelectedTileIndices.size) == wordLen
        }

    val canRevealLetter: Boolean
        get() {
            if (isSessionCompleted || submissionFeedback == SubmissionFeedback.Correct || revealLetterUsed) {
                return false
            }
            val puzzle = currentPuzzle ?: return false
            val wordLen = puzzle.correctAnswer.length
            val unrevealedPositions = (0 until wordLen).filter { it !in revealedPositions.keys }

            return unrevealedPositions.any { slotIdx ->
                val uIdx = unrevealedPositions.indexOf(slotIdx)
                val currentTile = userSelectedTileIndices.getOrNull(uIdx)
                val currentLetter = currentTile?.let { puzzle.availableLetters.getOrNull(it) }
                currentLetter == null || !ArabicTextNormalizer.isMatch(currentLetter, puzzle.correctAnswer[slotIdx].toString())
            }
        }

    val canRemoveWrongLetters: Boolean
        get() {
            if (isSessionCompleted || submissionFeedback == SubmissionFeedback.Correct || removeWrongLettersUsed) {
                return false
            }
            val puzzle = currentPuzzle ?: return false
            return getRemovableDistractorIndices(puzzle, userSelectedTileIndices, revealedPositions, eliminatedTileIndices).isNotEmpty()
        }

    val canShowHint: Boolean
        get() {
            if (isSessionCompleted || submissionFeedback == SubmissionFeedback.Correct || hintUsed) {
                return false
            }
            return !currentPuzzle?.hint.isNullOrBlank()
        }

    val progressFraction: Float
        get() {
            if (puzzles.isEmpty()) return 0f
            val completed = if (isSessionCompleted) puzzles.size else currentPuzzleIndex
            return (completed.toFloat() / puzzles.size.toFloat()).coerceIn(0f, 1f)
        }

    val currentPuzzleNumber: Int
        get() = (currentPuzzleIndex + 1).coerceAtMost(puzzles.size)

    val totalPuzzlesCount: Int
        get() = puzzles.size

    val completionPercentage: Int
        get() = if (puzzles.isEmpty()) 0 else ((correctCount.toFloat() / puzzles.size) * 100).toInt()

    fun getSlotDisplayState(index: Int): SlotDisplayState {
        val puzzle = currentPuzzle ?: return SlotDisplayState(index, null, AnswerSlotState.Empty, false)
        val wordLen = puzzle.correctAnswer.length
        val unrevealedPositions = (0 until wordLen).filter { it !in revealedPositions.keys }
        val unrevealedIndex = unrevealedPositions.indexOf(index)

        val revTile = revealedPositions[index]
        if (revTile != null) {
            val letter = puzzle.availableLetters.getOrNull(revTile)
            return SlotDisplayState(
                index = index,
                letter = letter,
                state = if (submissionFeedback == SubmissionFeedback.Correct) AnswerSlotState.Correct else AnswerSlotState.Revealed,
                isRevealed = true
            )
        }

        val tile = if (unrevealedIndex in userSelectedTileIndices.indices) userSelectedTileIndices[unrevealedIndex] else null
        val letter = tile?.let { puzzle.availableLetters.getOrNull(it) }

        val nextEmptyUIdx = userSelectedTileIndices.size
        val isNextActive = (unrevealedIndex == nextEmptyUIdx) && (letter == null)

        val state = when (submissionFeedback) {
            SubmissionFeedback.Correct -> AnswerSlotState.Correct
            SubmissionFeedback.Incorrect -> if (letter != null) AnswerSlotState.Incorrect else AnswerSlotState.Empty
            SubmissionFeedback.Idle -> when {
                letter != null -> AnswerSlotState.Filled
                isNextActive -> AnswerSlotState.Active
                else -> AnswerSlotState.Empty
            }
        }

        return SlotDisplayState(
            index = index,
            letter = letter,
            state = state,
            isRevealed = false
        )
    }
}

fun getRemovableDistractorIndices(
    puzzle: Puzzle,
    userSelectedTileIndices: List<Int>,
    revealedPositions: Map<Int, Int>,
    eliminatedTileIndices: Set<Int>
): List<Int> {
    val placedTileIndices = (userSelectedTileIndices + revealedPositions.values).toSet()
    val answerLetterCounts = puzzle.correctAnswer.groupingBy { it.toString() }.eachCount()

    val availableCounts = puzzle.availableLetters.indices
        .filter { it !in eliminatedTileIndices }
        .groupingBy { puzzle.availableLetters[it] }
        .eachCount()

    val removable = mutableListOf<Int>()
    val tempEliminated = eliminatedTileIndices.toMutableSet()
    val currentCounts = availableCounts.toMutableMap()

    for (i in puzzle.availableLetters.indices) {
        if (i in placedTileIndices || i in tempEliminated) continue
        val char = puzzle.availableLetters[i]
        val required = answerLetterCounts[char] ?: 0
        val count = currentCounts[char] ?: 0
        if (count > required) {
            removable.add(i)
            currentCounts[char] = count - 1
            tempEliminated.add(i)
        }
    }
    return removable
}

class PuzzleGameViewModel(
    puzzles: List<Puzzle> = PuzzleRepository.getPuzzlesForCategory("cars").take(10),
    categoryId: String = "cars",
    private val progressRepository: PlayerProgressRepository? = null
) : ViewModel() {

    val allProgress: StateFlow<Map<String, PlayerProgressEntity>> = (progressRepository?.getAllProgress() ?: emptyFlow())
        .map { list -> list.associateBy { it.categoryId } }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyMap()
        )

    private val _uiState = MutableStateFlow(
        run {
            val category = PuzzleRepository.getCategoryById(categoryId)
            val initialPuzzles = puzzles
            val first = initialPuzzles.firstOrNull()
            PuzzleUiState(
                categoryId = categoryId,
                categoryName = category?.arabicName
                    ?: first?.category
                    ?: "بيت السيارات والمواصلات",
                puzzles = initialPuzzles,
                currentReward = first?.rewardPoints ?: 15
            )
        }
    )
    val uiState: StateFlow<PuzzleUiState> = _uiState.asStateFlow()

    /**
     * Starts a brand new game round for the specified category, loading exactly 10 puzzles.
     */
    fun startSession(categoryId: String) {
        val category = PuzzleRepository.getCategoryById(categoryId)
        val selectedPuzzles = PuzzleRepository.getPuzzlesForCategory(categoryId).take(10)
        val firstPuzzle = selectedPuzzles.firstOrNull()
        _uiState.value = PuzzleUiState(
            categoryId = categoryId,
            categoryName = category?.arabicName ?: "بيت السيارات والمواصلات",
            puzzles = selectedPuzzles,
            currentPuzzleIndex = 0,
            userSelectedTileIndices = emptyList(),
            revealedPositions = emptyMap(),
            eliminatedTileIndices = emptySet(),
            revealLetterUsed = false,
            removeWrongLettersUsed = false,
            hintUsed = false,
            isHintVisible = false,
            currentReward = firstPuzzle?.rewardPoints ?: 15,
            lastEarnedReward = 0,
            submissionFeedback = SubmissionFeedback.Idle,
            score = 0,
            correctCount = 0,
            isSessionCompleted = false
        )
    }

    fun selectLetter(tileIndex: Int) {
        _uiState.update { state ->
            if (state.isSessionCompleted || state.submissionFeedback == SubmissionFeedback.Correct) {
                return@update state
            }
            if (tileIndex in state.eliminatedTileIndices) {
                return@update state
            }
            if (tileIndex in state.selectedTileIndices) {
                return@update state
            }
            val puzzle = state.currentPuzzle ?: return@update state
            val wordLen = puzzle.correctAnswer.length
            val maxUserAllowed = wordLen - state.revealedPositions.size
            if (state.userSelectedTileIndices.size >= maxUserAllowed) {
                return@update state
            }

            state.copy(
                userSelectedTileIndices = state.userSelectedTileIndices + tileIndex,
                submissionFeedback = if (state.submissionFeedback == SubmissionFeedback.Incorrect) {
                    SubmissionFeedback.Idle
                } else {
                    state.submissionFeedback
                }
            )
        }
    }

    fun removeLastLetter() {
        _uiState.update { state ->
            if (state.userSelectedTileIndices.isEmpty() || state.submissionFeedback == SubmissionFeedback.Correct) {
                return@update state
            }
            state.copy(
                userSelectedTileIndices = state.userSelectedTileIndices.dropLast(1),
                submissionFeedback = SubmissionFeedback.Idle
            )
        }
    }

    fun removeLetterAt(slotIndex: Int) {
        _uiState.update { state ->
            if (state.submissionFeedback == SubmissionFeedback.Correct) {
                return@update state
            }
            // If slot is locked/revealed, it cannot be removed!
            if (slotIndex in state.revealedPositions.keys) {
                return@update state
            }
            val puzzle = state.currentPuzzle ?: return@update state
            val wordLen = puzzle.correctAnswer.length
            val unrevealedPositions = (0 until wordLen).filter { it !in state.revealedPositions.keys }
            val uIdx = unrevealedPositions.indexOf(slotIndex)
            if (uIdx !in state.userSelectedTileIndices.indices) {
                return@update state
            }
            val updated = state.userSelectedTileIndices.toMutableList()
            updated.removeAt(uIdx)
            state.copy(
                userSelectedTileIndices = updated,
                submissionFeedback = SubmissionFeedback.Idle
            )
        }
    }

    fun clearAnswer() {
        _uiState.update { state ->
            if (state.submissionFeedback == SubmissionFeedback.Correct) {
                return@update state
            }
            state.copy(
                userSelectedTileIndices = emptyList(),
                submissionFeedback = SubmissionFeedback.Idle
            )
        }
    }

    /**
     * Assistance Action A: Reveal Letter
     * Reveals one correct answer letter in its correct position.
     * Deducts REVEAL_LETTER_COST from currentReward.
     */
    fun revealLetter() {
        _uiState.update { state ->
            if (!state.canRevealLetter) return@update state
            val puzzle = state.currentPuzzle ?: return@update state
            val wordLen = puzzle.correctAnswer.length
            val unrevealedPositions = (0 until wordLen).filter { it !in state.revealedPositions.keys }

            // Find first unrevealed position that is not already correctly filled
            val targetSlot = unrevealedPositions.firstOrNull { slotIdx ->
                val uIdx = unrevealedPositions.indexOf(slotIdx)
                val currentTile = state.userSelectedTileIndices.getOrNull(uIdx)
                val currentLetter = currentTile?.let { puzzle.availableLetters.getOrNull(it) }
                currentLetter == null || !ArabicTextNormalizer.isMatch(currentLetter, puzzle.correctAnswer[slotIdx].toString())
            } ?: return@update state

            val targetChar = puzzle.correctAnswer[targetSlot].toString()
            val placedTiles = (state.userSelectedTileIndices + state.revealedPositions.values).toSet()

            // Try to find an unplaced, non-eliminated tile matching targetChar
            var chosenTile = puzzle.availableLetters.indices.firstOrNull { idx ->
                ArabicTextNormalizer.isMatch(puzzle.availableLetters[idx], targetChar) &&
                        idx !in placedTiles &&
                        idx !in state.eliminatedTileIndices
            }

            val updatedUserIndices = state.userSelectedTileIndices.toMutableList()

            // If the user had already placed a tile at targetSlot position, remove it from user indices
            val uIdx = unrevealedPositions.indexOf(targetSlot)
            if (uIdx in updatedUserIndices.indices) {
                updatedUserIndices.removeAt(uIdx)
            }

            // If still no unplaced tile found, take from user-selected tiles
            if (chosenTile == null) {
                val placedInUser = updatedUserIndices.firstOrNull { idx ->
                    ArabicTextNormalizer.isMatch(puzzle.availableLetters[idx], targetChar)
                }
                if (placedInUser != null) {
                    chosenTile = placedInUser
                    updatedUserIndices.remove(placedInUser)
                }
            }

            if (chosenTile == null) return@update state

            val newRevealed = state.revealedPositions + (targetSlot to chosenTile)
            val newReward = (state.currentReward - HintConstants.REVEAL_LETTER_COST).coerceAtLeast(0)

            state.copy(
                userSelectedTileIndices = updatedUserIndices,
                revealedPositions = newRevealed,
                revealLetterUsed = true,
                currentReward = newReward,
                submissionFeedback = if (state.submissionFeedback == SubmissionFeedback.Incorrect) SubmissionFeedback.Idle else state.submissionFeedback
            )
        }
    }

    /**
     * Assistance Action B: Remove Wrong Letters
     * Eliminates up to 2 distractor tiles from the available letter pool.
     * Deducts REMOVE_WRONG_LETTERS_COST from currentReward.
     */
    fun removeWrongLetters() {
        _uiState.update { state ->
            if (!state.canRemoveWrongLetters) return@update state
            val puzzle = state.currentPuzzle ?: return@update state
            val removable = getRemovableDistractorIndices(
                puzzle = puzzle,
                userSelectedTileIndices = state.userSelectedTileIndices,
                revealedPositions = state.revealedPositions,
                eliminatedTileIndices = state.eliminatedTileIndices
            )
            if (removable.isEmpty()) return@update state

            val toRemove = removable.take(HintConstants.WRONG_LETTERS_TO_REMOVE_COUNT).toSet()
            val newReward = (state.currentReward - HintConstants.REMOVE_WRONG_LETTERS_COST).coerceAtLeast(0)

            state.copy(
                eliminatedTileIndices = state.eliminatedTileIndices + toRemove,
                removeWrongLettersUsed = true,
                currentReward = newReward
            )
        }
    }

    /**
     * Assistance Action C: Show Hint
     * Displays the puzzle hint text.
     * Deducts SHOW_HINT_COST from currentReward.
     */
    fun showHint() {
        _uiState.update { state ->
            if (!state.canShowHint) return@update state
            val newReward = (state.currentReward - HintConstants.SHOW_HINT_COST).coerceAtLeast(0)
            state.copy(
                hintUsed = true,
                isHintVisible = true,
                currentReward = newReward
            )
        }
    }

    fun submitAnswer() {
        _uiState.update { state ->
            if (state.isSessionCompleted || state.submissionFeedback == SubmissionFeedback.Correct) {
                return@update state
            }
            val puzzle = state.currentPuzzle ?: return@update state
            val answer = state.currentAnswer

            if (answer.isEmpty() || !state.isAnswerComplete) {
                return@update state.copy(submissionFeedback = SubmissionFeedback.Incorrect)
            }

            val isCorrect = ArabicTextNormalizer.isMatch(answer, puzzle.correctAnswer)
            if (isCorrect) {
                state.copy(
                    submissionFeedback = SubmissionFeedback.Correct,
                    score = state.score + state.currentReward,
                    lastEarnedReward = state.currentReward,
                    correctCount = state.correctCount + 1
                )
            } else {
                state.copy(submissionFeedback = SubmissionFeedback.Incorrect)
            }
        }
    }

    fun nextPuzzle() {
        _uiState.update { state ->
            if (state.currentPuzzleIndex < state.puzzles.size - 1) {
                val nextIndex = state.currentPuzzleIndex + 1
                val nextPuzzle = state.puzzles[nextIndex]
                state.copy(
                    currentPuzzleIndex = nextIndex,
                    userSelectedTileIndices = emptyList(),
                    revealedPositions = emptyMap(),
                    eliminatedTileIndices = emptySet(),
                    revealLetterUsed = false,
                    removeWrongLettersUsed = false,
                    hintUsed = false,
                    isHintVisible = false,
                    currentReward = nextPuzzle.rewardPoints,
                    submissionFeedback = SubmissionFeedback.Idle
                )
            } else {
                val completedState = state.copy(
                    isSessionCompleted = true,
                    submissionFeedback = SubmissionFeedback.Idle
                )
                saveSessionProgressInternal(completedState)
                completedState
            }
        }
    }

    private fun saveSessionProgressInternal(state: PuzzleUiState) {
        val repo = progressRepository ?: return
        viewModelScope.launch {
            repo.saveSessionProgress(
                categoryId = state.categoryId,
                score = state.score,
                completedPuzzlesCount = state.correctCount,
                completionPercentage = state.completionPercentage
            )
        }
    }

    /**
     * Saves partial session progress when the player exits before completing all 10 puzzles.
     * Safely preserves categoryId, score, and completed puzzle count.
     */
    fun savePartialProgress() {
        val state = _uiState.value
        if (state.score > 0 || state.correctCount > 0) {
            val repo = progressRepository ?: return
            viewModelScope.launch {
                repo.saveSessionProgress(
                    categoryId = state.categoryId,
                    score = state.score,
                    completedPuzzlesCount = state.correctCount,
                    completionPercentage = state.completionPercentage
                )
            }
        }
    }

    /**
     * Explicitly forces persisting the current progress (e.g. for testing).
     */
    suspend fun saveProgressNow() {
        val state = _uiState.value
        progressRepository?.saveSessionProgress(
            categoryId = state.categoryId,
            score = state.score,
            completedPuzzlesCount = state.correctCount,
            completionPercentage = state.completionPercentage
        )
    }

    /**
     * Resets the current session to puzzle 1 for the SAME active category.
     */
    fun replaySession() {
        _uiState.update { state ->
            val firstPuzzle = state.puzzles.firstOrNull()
            state.copy(
                currentPuzzleIndex = 0,
                userSelectedTileIndices = emptyList(),
                revealedPositions = emptyMap(),
                eliminatedTileIndices = emptySet(),
                revealLetterUsed = false,
                removeWrongLettersUsed = false,
                hintUsed = false,
                isHintVisible = false,
                currentReward = firstPuzzle?.rewardPoints ?: 15,
                lastEarnedReward = 0,
                submissionFeedback = SubmissionFeedback.Idle,
                score = 0,
                correctCount = 0,
                isSessionCompleted = false
            )
        }
    }
}
