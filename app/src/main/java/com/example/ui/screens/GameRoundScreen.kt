package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.Backspace
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.data.model.Puzzle
import com.example.ui.components.AnswerSlotState
import com.example.ui.components.LetterTileState
import com.example.ui.components.MadaratAnswerSlot
import com.example.ui.components.MadaratAssistanceBar
import com.example.ui.components.MadaratCounter
import com.example.ui.components.MadaratGameCard
import com.example.ui.components.MadaratIconButton
import com.example.ui.components.MadaratLetterTile
import com.example.ui.components.MadaratLevelIndicator
import com.example.ui.components.MadaratPrimaryButton
import com.example.ui.components.MadaratProgressBar
import com.example.ui.components.MadaratSecondaryButton
import com.example.ui.components.MadaratStatusBadge
import com.example.ui.components.QuestionVisualCard
import com.example.ui.components.StatusBadgeType
import com.example.ui.game.PuzzleGameViewModel
import com.example.ui.game.PuzzleUiState
import com.example.ui.game.SubmissionFeedback
import com.example.ui.theme.AmberGoldLight
import com.example.ui.theme.AmberGoldPrimary
import com.example.ui.theme.CelestialNavyDark
import com.example.ui.theme.CelestialNavyMedium
import com.example.ui.theme.CelestialSurfaceElevated
import com.example.ui.theme.CosmicBorder
import com.example.ui.theme.CrimsonNovaError
import com.example.ui.theme.EmeraldSuccess
import com.example.ui.theme.EtherealCyan
import com.example.ui.theme.EtherealCyanLight
import com.example.ui.theme.GameCornerRadius
import com.example.ui.theme.GameSpacing
import com.example.ui.theme.GameTileMetrics
import com.example.ui.theme.GameTypography
import com.example.ui.theme.GoldGlowBorder
import com.example.ui.theme.HouseThemes
import com.example.ui.theme.PearlIvory
import com.example.ui.theme.StarlightSilver
import com.example.ui.theme.Typography

// ============================================================================
// GAME ROUND SCREEN — حلقة اللعب التفاعلية الكاملة
// ============================================================================

@Composable
fun GameRoundScreen(
    onBackClick: () -> Unit,
    onCompleteRound: () -> Unit = onBackClick,
    viewModel: PuzzleGameViewModel = viewModel(),
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.uiState.collectAsState()
    val houseTheme = HouseThemes.getThemeForCategory(uiState.categoryId)

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        houseTheme.backgroundGradient.first(),
                        CelestialNavyMedium,
                        Color(0xFF070B18)
                    )
                )
            )
            .testTag("game_round_screen")
    ) {
        // Subtle House Atmosphere Background Canvas
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(houseTheme.accentGlow.copy(alpha = 0.08f), Color.Transparent),
                    center = Offset(width * 0.5f, height * 0.35f),
                    radius = width * 0.7f
                )
            )
        }

        if (uiState.isSessionCompleted) {
            FinalResultsContent(
                uiState = uiState,
                onReplayClick = { viewModel.replaySession() },
                onHomeClick = onCompleteRound,
                modifier = Modifier
                    .fillMaxSize()
                    .statusBarsPadding()
                    .navigationBarsPadding()
                    .padding(horizontal = GameSpacing.screenPadding)
            )
        } else if (uiState.currentPuzzle == null) {
            EmptyPuzzleFallbackContent(
                onBackClick = onBackClick,
                modifier = Modifier
                    .fillMaxSize()
                    .statusBarsPadding()
                    .navigationBarsPadding()
                    .padding(horizontal = GameSpacing.screenPadding)
            )
        } else {
            ActivePuzzleContent(
                uiState = uiState,
                onBackClick = onBackClick,
                onSelectLetter = { viewModel.selectLetter(it) },
                onRemoveSlot = { viewModel.removeLetterAt(it) },
                onRemoveLastLetter = { viewModel.removeLastLetter() },
                onClear = { viewModel.clearAnswer() },
                onSubmit = { viewModel.submitAnswer() },
                onNextPuzzle = { viewModel.nextPuzzle() },
                onRevealLetter = { viewModel.revealLetter() },
                onRemoveWrongLetters = { viewModel.removeWrongLetters() },
                onShowHint = { viewModel.showHint() },
                modifier = Modifier
                    .fillMaxSize()
                    .statusBarsPadding()
                    .navigationBarsPadding()
                    .padding(horizontal = GameSpacing.screenPadding)
            )
        }
    }
}

@Composable
private fun EmptyPuzzleFallbackContent(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MadaratStatusBadge(
            text = "تنبيه مداري",
            type = StatusBadgeType.Warning
        )
        Spacer(modifier = Modifier.height(GameSpacing.md))
        Text(
            text = "لا توجد محطات متاحة حالياً لهذا المدار",
            style = Typography.titleLarge,
            color = PearlIvory,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(GameSpacing.sm))
        Text(
            text = "يرجى العودة واختيار بيت معرفي آخر لاستكشاف أسرار الكلمات.",
            style = Typography.bodyMedium,
            color = Color(0xFFCBD5E1),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(GameSpacing.xl))
        MadaratPrimaryButton(
            text = "العودة لاختيار البيت",
            icon = Icons.AutoMirrored.Filled.ArrowBack,
            onClick = onBackClick,
            modifier = Modifier.fillMaxWidth(),
            testTag = "empty_puzzle_back_button"
        )
    }
}

// ============================================================================
// ACTIVE PUZZLE VIEW
// ============================================================================

@Composable
private fun ActivePuzzleContent(
    uiState: PuzzleUiState,
    onBackClick: () -> Unit,
    onSelectLetter: (Int) -> Unit,
    onRemoveSlot: (Int) -> Unit,
    onRemoveLastLetter: () -> Unit,
    onClear: () -> Unit,
    onSubmit: () -> Unit,
    onNextPuzzle: () -> Unit,
    onRevealLetter: () -> Unit,
    onRemoveWrongLetters: () -> Unit,
    onShowHint: () -> Unit,
    modifier: Modifier = Modifier
) {
    val puzzle = uiState.currentPuzzle ?: return
    val wordLength = puzzle.correctAnswer.length

    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // --------------------------------------------------------------------
        // 1. TOP HEADER & STATUS
        // --------------------------------------------------------------------
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = GameSpacing.sm, bottom = GameSpacing.xs),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            MadaratIconButton(
                icon = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "الرجوع",
                onClick = onBackClick,
                modifier = Modifier.size(42.dp),
                testTag = "round_back_button"
            )

            MadaratLevelIndicator(
                houseName = puzzle.category,
                puzzleIndex = uiState.currentPuzzleNumber,
                testTag = "round_level_indicator"
            )

            MadaratCounter(
                count = uiState.score,
                isCoin = true,
                testTag = "round_score_counter"
            )
        }

        // Progress Track
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = GameSpacing.xs)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "السؤال ${uiState.currentQuestionInChallengeNumber} من ${uiState.totalQuestionsInCurrentChallenge} • التحدي ${uiState.currentPuzzleNumber} من ${uiState.totalPuzzlesCount}",
                    style = Typography.labelSmall,
                    color = StarlightSilver,
                    modifier = Modifier.testTag("progress_text")
                )
                Text(
                    text = "${(uiState.progressFraction * 100).toInt()}%",
                    style = GameTypography.GameNumberMedium,
                    color = EtherealCyanLight
                )
            }
            Spacer(modifier = Modifier.height(GameSpacing.xs))
            MadaratProgressBar(
                progress = uiState.progressFraction,
                indicatorColor = EtherealCyan
            )
        }

        Spacer(modifier = Modifier.height(GameSpacing.xs))

        // --------------------------------------------------------------------
        // 2. QUESTION VISUAL ILLUSTRATION CARD
        // --------------------------------------------------------------------
        QuestionVisualCard(
            puzzle = puzzle,
            isSolved = uiState.submissionFeedback == SubmissionFeedback.Correct,
            modifier = Modifier.padding(vertical = GameSpacing.xs)
        )

        // Visible hint banner upon activating the Show Hint assistance
        AnimatedVisibility(
            visible = uiState.isHintVisible && !puzzle.hint.isNullOrBlank(),
            enter = fadeIn() + expandVertically(),
            exit = fadeOut() + shrinkVertically()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = GameSpacing.xs)
                    .clip(GameCornerRadius.shapeMd)
                    .background(CelestialNavyDark.copy(alpha = 0.85f))
                    .border(1.dp, EtherealCyan.copy(alpha = 0.5f), GameCornerRadius.shapeMd)
                    .padding(horizontal = GameSpacing.md, vertical = GameSpacing.sm)
                    .testTag("hint_text_container"),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(GameSpacing.sm)
            ) {
                Icon(
                    imageVector = Icons.Default.Lightbulb,
                    contentDescription = null,
                    tint = AmberGoldLight,
                    modifier = Modifier.size(18.dp)
                )
                Text(
                    text = puzzle.hint ?: "",
                    style = Typography.bodySmall,
                    color = PearlIvory,
                    modifier = Modifier.weight(1f)
                )
            }
        }

        Spacer(modifier = Modifier.height(GameSpacing.xs))

        // --------------------------------------------------------------------
        // 2B. ASSISTANCE CONTROLS BAR (Hints)
        // --------------------------------------------------------------------
        MadaratAssistanceBar(
            canReveal = uiState.canRevealLetter,
            isRevealUsed = uiState.revealLetterUsed,
            onRevealLetter = onRevealLetter,
            canRemoveWrong = uiState.canRemoveWrongLetters,
            isRemoveWrongUsed = uiState.removeWrongLettersUsed,
            onRemoveWrongLetters = onRemoveWrongLetters,
            canShowHint = uiState.canShowHint,
            isHintUsed = uiState.hintUsed,
            onShowHint = onShowHint,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = GameSpacing.xs)
        )

        Spacer(modifier = Modifier.height(GameSpacing.xs))

        // --------------------------------------------------------------------
        // 3. ANSWER SLOTS ROW
        // --------------------------------------------------------------------
        Row(
            horizontalArrangement = Arrangement.spacedBy(GameTileMetrics.answerSlotSpacing),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(vertical = GameSpacing.xs)
                .testTag("answer_slots_row")
        ) {
            for (i in 0 until wordLength) {
                val slot = uiState.getSlotDisplayState(i)

                MadaratAnswerSlot(
                    letter = slot.letter,
                    state = slot.state,
                    onClick = {
                        if (!slot.isRevealed && slot.letter != null && uiState.submissionFeedback != SubmissionFeedback.Correct) {
                            onRemoveSlot(i)
                        }
                    },
                    size = 52.dp,
                    testTag = "answer_slot_$i"
                )
            }
        }

        // Feedback Banner
        AnimatedVisibility(
            visible = uiState.submissionFeedback != SubmissionFeedback.Idle,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            when (uiState.submissionFeedback) {
                SubmissionFeedback.Correct -> {
                    MadaratStatusBadge(
                        text = "✨ إجابة صحيحة! أحسنت صنعاً (+${uiState.lastEarnedReward} نقطة)",
                        type = StatusBadgeType.Success,
                        modifier = Modifier
                            .padding(vertical = GameSpacing.xs)
                            .testTag("feedback_correct")
                    )
                }
                SubmissionFeedback.Incorrect -> {
                    MadaratStatusBadge(
                        text = "❌ إجابة غير صحيحة، حاول مجدداً وأعد ترتيب الحروف",
                        type = StatusBadgeType.Error,
                        modifier = Modifier
                            .padding(vertical = GameSpacing.xs)
                            .testTag("feedback_incorrect")
                    )
                }
                SubmissionFeedback.Idle -> Unit
            }
        }

        Spacer(modifier = Modifier.height(GameSpacing.xs))

        // --------------------------------------------------------------------
        // 4. LETTER TILES POOL (Scrambled Available Letters)
        // --------------------------------------------------------------------
        val lettersList = puzzle.availableLetters
        val rowSize = if (lettersList.size > 8) 5 else 4
        val chunkedRows = lettersList.indices.chunked(rowSize)

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(GameTileMetrics.tileSpacing),
            modifier = Modifier.padding(vertical = GameSpacing.xs)
        ) {
            chunkedRows.forEach { rowIndices ->
                Row(horizontalArrangement = Arrangement.spacedBy(GameTileMetrics.tileSpacing)) {
                    rowIndices.forEach { i ->
                        LetterTileItem(
                            index = i,
                            letter = puzzle.availableLetters[i],
                            isSelected = i in uiState.selectedTileIndices,
                            isEliminated = i in uiState.eliminatedTileIndices,
                            submissionFeedback = uiState.submissionFeedback,
                            onSelect = { onSelectLetter(i) }
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(GameSpacing.sm))

        // --------------------------------------------------------------------
        // 5. ACTION CONTROLS
        // --------------------------------------------------------------------
        if (uiState.submissionFeedback == SubmissionFeedback.Correct) {
            val isLastPuzzle = uiState.currentPuzzleNumber == uiState.totalPuzzlesCount
            val nextLabel = if (isLastPuzzle) {
                "عرض نتيجة التحدي المداري"
            } else {
                "السؤال التالي (${uiState.currentQuestionInChallengeNumber + 1} من ${uiState.totalQuestionsInCurrentChallenge})"
            }

            MadaratPrimaryButton(
                text = nextLabel,
                icon = Icons.AutoMirrored.Filled.ArrowForward,
                onClick = onNextPuzzle,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = GameSpacing.md),
                testTag = "round_next_button"
            )
        } else {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = GameSpacing.md),
                verticalArrangement = Arrangement.spacedBy(GameSpacing.xs)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(GameSpacing.sm)
                ) {
                    MadaratSecondaryButton(
                        text = "مسح الكل",
                        icon = Icons.Default.Clear,
                        onClick = onClear,
                        modifier = Modifier.weight(1f),
                        testTag = "round_clear_button"
                    )

                    MadaratSecondaryButton(
                        text = "حذف حرف",
                        icon = Icons.AutoMirrored.Filled.Backspace,
                        onClick = onRemoveLastLetter,
                        modifier = Modifier.weight(1f),
                        testTag = "round_backspace_button"
                    )
                }

                MadaratPrimaryButton(
                    text = "تحقق من الإجابة",
                    icon = Icons.Default.Check,
                    onClick = onSubmit,
                    enabled = uiState.isAnswerComplete,
                    modifier = Modifier.fillMaxWidth(),
                    testTag = "round_submit_button"
                )
            }
        }
    }
}

@Composable
private fun LetterTileItem(
    index: Int,
    letter: String,
    isSelected: Boolean,
    isEliminated: Boolean,
    submissionFeedback: SubmissionFeedback,
    onSelect: () -> Unit
) {
    val tileState = when {
        isEliminated -> LetterTileState.Disabled
        isSelected -> LetterTileState.Placed
        submissionFeedback == SubmissionFeedback.Correct -> LetterTileState.Disabled
        else -> LetterTileState.Available
    }

    MadaratLetterTile(
        letter = letter,
        state = tileState,
        onClick = onSelect,
        size = 50.dp,
        testTag = "letter_tile_$index"
    )
}

// ============================================================================
// FINAL RESULTS VIEW — شاشة نتيجة التحدي المداري
// ============================================================================

@Composable
private fun FinalResultsContent(
    uiState: PuzzleUiState,
    onReplayClick: () -> Unit,
    onHomeClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = GameSpacing.lg)
        ) {
            Box(
                modifier = Modifier
                    .size(76.dp)
                    .clip(CircleShape)
                    .background(
                        Brush.radialGradient(
                            listOf(AmberGoldPrimary.copy(alpha = 0.35f), CelestialSurfaceElevated)
                        )
                    )
                    .border(2.dp, AmberGoldPrimary, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.AutoAwesome,
                    contentDescription = "شارة الإنجاز المداري",
                    tint = AmberGoldLight,
                    modifier = Modifier.size(38.dp)
                )
            }

            Spacer(modifier = Modifier.height(GameSpacing.sm))

            MadaratStatusBadge(
                text = "اكتمل التحدي بنجاح تام",
                type = StatusBadgeType.Success,
                modifier = Modifier.padding(bottom = GameSpacing.xs)
            )

            val houseName = if (uiState.categoryName.startsWith("بيت ")) {
                uiState.categoryName
            } else {
                "بيت ${uiState.categoryName}"
            }

            Text(
                text = "اكتملت رحلة $houseName",
                style = Typography.displaySmall,
                color = PearlIvory,
                textAlign = TextAlign.Center,
                modifier = Modifier.testTag("results_completion_title")
            )

            Spacer(modifier = Modifier.height(GameSpacing.xs))

            Text(
                text = "أحسنت يا بطل المعرفة! لقد حللت ألغاز التحدي واستنبطت الكلمات بنجاح.",
                style = Typography.bodyMedium.copy(lineHeight = 24.sp),
                color = Color(0xFFCBD5E1),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = GameSpacing.md)
            )
        }

        Spacer(modifier = Modifier.height(GameSpacing.lg))

        // Center Stats Card
        MadaratGameCard(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = CelestialSurfaceElevated,
            borderColor = GoldGlowBorder,
            testTag = "results_stats_card"
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "مجموع النقاط المكتسبة",
                    style = Typography.labelMedium,
                    color = StarlightSilver
                )
                Spacer(modifier = Modifier.height(GameSpacing.xs))
                Text(
                    text = "${uiState.score} نقطة",
                    style = GameTypography.GameNumberLarge.copy(fontSize = 38.sp),
                    color = AmberGoldLight,
                    modifier = Modifier.testTag("results_total_score")
                )

                Spacer(modifier = Modifier.height(GameSpacing.lg))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(GameCornerRadius.shapeMd)
                        .background(CelestialNavyDark.copy(alpha = 0.7f))
                        .border(1.dp, CosmicBorder, GameCornerRadius.shapeMd)
                        .padding(GameSpacing.md),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "الأسئلة", style = Typography.labelSmall, color = StarlightSilver)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "${uiState.totalPuzzlesCount} من ${uiState.totalPuzzlesCount}",
                            style = GameTypography.GameNumberMedium,
                            color = PearlIvory
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "الإجابات الصحيحة", style = Typography.labelSmall, color = StarlightSilver)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "${uiState.correctCount}",
                            style = GameTypography.GameNumberMedium,
                            color = EmeraldSuccess
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "نسبة الإنجاز", style = Typography.labelSmall, color = StarlightSilver)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "${uiState.completionPercentage}%",
                            style = GameTypography.GameNumberMedium,
                            color = EtherealCyanLight
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(GameSpacing.xl))

        // Action Buttons
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = GameSpacing.lg),
            verticalArrangement = Arrangement.spacedBy(GameSpacing.sm)
        ) {
            MadaratPrimaryButton(
                text = "إعادة التحدي",
                icon = Icons.Default.Replay,
                onClick = onReplayClick,
                modifier = Modifier.fillMaxWidth(),
                testTag = "results_replay_button"
            )

            MadaratSecondaryButton(
                text = "العودة إلى الشاشة الرئيسية",
                icon = Icons.Default.Home,
                onClick = onHomeClick,
                modifier = Modifier.fillMaxWidth(),
                testTag = "results_home_button"
            )
        }
    }
}
