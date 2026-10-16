package com.example.ui.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.local.entity.PlayerProgressEntity
import com.example.data.model.GameDifficulty
import com.example.data.model.PuzzleCategory
import com.example.data.repository.PuzzleRepository
import com.example.ui.components.MadaratCounter
import com.example.ui.components.MadaratGameCard
import com.example.ui.components.MadaratIconButton
import com.example.ui.components.MadaratPrimaryButton
import com.example.ui.components.MadaratSecondaryButton
import com.example.ui.components.MadaratStatusBadge
import com.example.ui.components.StatusBadgeType
import com.example.ui.theme.AmberGoldLight
import com.example.ui.theme.AmberGoldPrimary
import com.example.ui.theme.CelestialNavyDark
import com.example.ui.theme.CelestialNavyMedium
import com.example.ui.theme.CelestialSurfaceElevated
import com.example.ui.theme.CosmicBorder
import com.example.ui.theme.DimmedStarlight
import com.example.ui.theme.EtherealCyan
import com.example.ui.theme.EtherealCyanLight
import com.example.ui.theme.GameCornerRadius
import com.example.ui.theme.GameElevation
import com.example.ui.theme.GameSpacing
import com.example.ui.theme.GameTypography
import com.example.ui.theme.GoldGlowBorder
import com.example.ui.theme.HouseThemes
import com.example.ui.theme.PearlIvory
import com.example.ui.theme.StarlightSilver
import com.example.ui.theme.Typography

// ============================================================================
// GAMEPLAY SETUP SCREEN — إعداد واختيار مسار الرحلة المعرفية
// ============================================================================

@Composable
fun GameplaySetupScreen(
    onStartRoundClick: (categoryId: String, difficulty: GameDifficulty) -> Unit,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    initialCategoryId: String = "astronomy",
    progressMap: Map<String, PlayerProgressEntity> = emptyMap()
) {
    var selectedCategoryId by remember { mutableStateOf(initialCategoryId) }
    var selectedDifficulty by remember { mutableStateOf(GameDifficulty.EXPLORATION) }

    val categories = remember { PuzzleRepository.getCategories() }
    val currentCategory = categories.firstOrNull { it.id == selectedCategoryId } ?: categories.first()
    val currentProgress = progressMap[selectedCategoryId]
    val houseTheme = HouseThemes.getThemeForCategory(selectedCategoryId)

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
            .testTag("gameplay_setup_screen")
    ) {
        // Subtle Atmospheric Constellation Background
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(houseTheme.accentGlow.copy(alpha = 0.10f), Color.Transparent),
                    center = Offset(width * 0.85f, height * 0.15f),
                    radius = width * 0.6f
                )
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
                .padding(horizontal = GameSpacing.screenPadding)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(GameSpacing.md)
        ) {
            // ----------------------------------------------------------------
            // 1. TOP BAR NAVIGATION
            // ----------------------------------------------------------------
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = GameSpacing.sm),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                MadaratIconButton(
                    icon = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "الرجوع للرئيسية",
                    onClick = onBackClick,
                    modifier = Modifier.size(44.dp),
                    testTag = "setup_back_button"
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs)
                ) {
                    val totalChallenges = progressMap.values.sumOf { it.completedChallengesCount }
                    val totalScore = progressMap.values.sumOf { it.highestScore }
                    MadaratCounter(
                        count = totalChallenges,
                        isCoin = false,
                        testTag = "setup_stars_counter"
                    )
                    MadaratCounter(
                        count = totalScore,
                        isCoin = true,
                        testTag = "setup_coins_counter"
                    )
                }
            }

            // ----------------------------------------------------------------
            // 2. SCREEN TITLE & DESCRIPTION
            // ----------------------------------------------------------------
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = GameSpacing.xs)
            ) {
                MadaratStatusBadge(
                    text = "لغز وكنز • 12 بيتاً معرفياً",
                    type = StatusBadgeType.Info,
                    modifier = Modifier.padding(bottom = GameSpacing.xs)
                )

                Text(
                    text = "تهيئة المدار المعرفي",
                    style = Typography.headlineLarge,
                    color = PearlIvory
                )

                Spacer(modifier = Modifier.height(GameSpacing.xs))

                Text(
                    text = "اختر وجهة رحلتك ومستوى التحدي لتكوين الكلمات وحل ألغاز المعرفة",
                    style = Typography.bodyMedium.copy(lineHeight = 22.sp),
                    color = Color(0xFFCBD5E1),
                    modifier = Modifier.padding(horizontal = GameSpacing.sm)
                )
            }

            // ----------------------------------------------------------------
            // 3. CATEGORY SELECTION LIST (12 HOUSES)
            // ----------------------------------------------------------------
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(GameSpacing.sm)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "اختر بيت المعرفة:",
                        style = Typography.titleMedium,
                        color = PearlIvory
                    )
                    Text(
                        text = "${categories.size} بيوت معرفية",
                        style = Typography.labelSmall,
                        color = EtherealCyanLight
                    )
                }

                categories.forEach { category ->
                    CategorySelectionCard(
                        category = category,
                        progress = progressMap[category.id],
                        isSelected = category.id == selectedCategoryId,
                        onClick = { selectedCategoryId = category.id }
                    )
                }
            }

            // ----------------------------------------------------------------
            // 4. SELECTED HOUSE SHOWCASE & CONFIGURATION CARD
            // ----------------------------------------------------------------
            MadaratGameCard(
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = CelestialSurfaceElevated,
                borderColor = GoldGlowBorder,
                testTag = "setup_house_card"
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    // House Title Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(GameSpacing.md)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(54.dp)
                                    .clip(GameCornerRadius.shapeLg)
                                    .background(houseTheme.primaryColor.copy(alpha = 0.25f))
                                    .border(1.5.dp, houseTheme.primaryColor.copy(alpha = 0.6f), GameCornerRadius.shapeLg),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = currentCategory.iconEmoji,
                                    fontSize = 28.sp
                                )
                            }

                            Column {
                                Text(
                                    text = "بيت ${currentCategory.arabicName}",
                                    style = Typography.titleLarge,
                                    color = PearlIvory
                                )
                                Text(
                                    text = currentCategory.shortDescription,
                                    style = Typography.bodySmall,
                                    color = StarlightSilver
                                )
                            }
                        }

                        MadaratStatusBadge(
                            text = "${currentCategory.challenges.size} تحديات",
                            type = StatusBadgeType.Success
                        )
                    }

                    Spacer(modifier = Modifier.height(GameSpacing.lg))

                    // Mission Details Grid
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
                            Text(text = "التحديات", style = Typography.labelSmall, color = StarlightSilver)
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(text = "${currentCategory.challenges.size} متكاملة", style = GameTypography.GameNumberMedium, color = EtherealCyanLight)
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "الأسئلة", style = Typography.labelSmall, color = StarlightSilver)
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(text = "${currentCategory.puzzles.size} سؤالاً", style = GameTypography.GameNumberMedium, color = AmberGoldLight)
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "الصعوبة", style = Typography.labelSmall, color = StarlightSilver)
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(text = selectedDifficulty.titleArabic, style = GameTypography.GameNumberMedium, color = PearlIvory)
                        }
                    }

                    // Persistent Player Progress for this House
                    if (currentProgress != null && (currentProgress.highestScore > 0 || currentProgress.totalAttempts > 0)) {
                        Spacer(modifier = Modifier.height(GameSpacing.sm))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(GameCornerRadius.shapeMd)
                                .background(CelestialNavyDark.copy(alpha = 0.45f))
                                .border(1.dp, CosmicBorder.copy(alpha = 0.5f), GameCornerRadius.shapeMd)
                                .padding(horizontal = GameSpacing.md, vertical = GameSpacing.sm),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(text = "أعلى نتيجة", style = Typography.labelSmall, color = StarlightSilver)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = "${currentProgress.highestScore} 🪙",
                                    style = GameTypography.GameNumberMedium,
                                    color = AmberGoldLight
                                )
                            }
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(text = "التحديات المكتملة", style = Typography.labelSmall, color = StarlightSilver)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = "${currentProgress.completedChallengesCount} 🏆",
                                    style = GameTypography.GameNumberMedium,
                                    color = EtherealCyanLight
                                )
                            }
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(text = "صحة الإجابات", style = Typography.labelSmall, color = StarlightSilver)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = "${currentProgress.totalCorrectAnswers} صحيحة",
                                    style = GameTypography.GameNumberMedium,
                                    color = PearlIvory
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(GameSpacing.lg))

                    // Difficulty Selection Tiers
                    Text(
                        text = "اختر مستوى الصعوبة:",
                        style = Typography.labelMedium,
                        color = PearlIvory,
                        modifier = Modifier.padding(bottom = GameSpacing.xs)
                    )

                    GameDifficulty.values().forEach { difficulty ->
                        SetupModeOption(
                            title = "${difficulty.badgeEmoji} ${difficulty.titleArabic}",
                            subtitle = "${difficulty.descriptionArabic} • (${difficulty.distractorCount} مشتتات)",
                            isSelected = selectedDifficulty == difficulty,
                            onClick = { selectedDifficulty = difficulty },
                            testTag = "setup_difficulty_${difficulty.name.lowercase()}"
                        )
                        Spacer(modifier = Modifier.height(GameSpacing.xs))
                    }
                }
            }

            // ----------------------------------------------------------------
            // 5. ACTIONS
            // ----------------------------------------------------------------
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = GameSpacing.md),
                verticalArrangement = Arrangement.spacedBy(GameSpacing.sm)
            ) {
                MadaratPrimaryButton(
                    text = "انطلق إلى التحدي الأول (3 أسئلة)",
                    icon = Icons.Default.PlayArrow,
                    onClick = { onStartRoundClick(selectedCategoryId, selectedDifficulty) },
                    modifier = Modifier.fillMaxWidth(),
                    testTag = "setup_start_round_button"
                )

                MadaratSecondaryButton(
                    text = "العودة للرئيسية",
                    onClick = onBackClick,
                    modifier = Modifier.fillMaxWidth(),
                    testTag = "setup_return_home_button"
                )
            }
        }
    }
}

@Composable
private fun CategorySelectionCard(
    category: PuzzleCategory,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    progress: PlayerProgressEntity? = null
) {
    val theme = HouseThemes.getThemeForCategory(category.id)

    Surface(
        onClick = onClick,
        shape = GameCornerRadius.shapeMd,
        color = if (isSelected) CelestialSurfaceElevated else CelestialNavyDark.copy(alpha = 0.55f),
        border = androidx.compose.foundation.BorderStroke(
            width = if (isSelected) 1.5.dp else 1.dp,
            color = if (isSelected) AmberGoldPrimary else CosmicBorder
        ),
        shadowElevation = if (isSelected) GameElevation.low else GameElevation.flat,
        modifier = modifier
            .fillMaxWidth()
            .testTag("category_card_${category.id}")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(GameSpacing.md),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(GameSpacing.md),
                modifier = Modifier.weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(CircleShape)
                        .background(
                            if (isSelected) theme.primaryColor.copy(alpha = 0.3f)
                            else theme.primaryColor.copy(alpha = 0.15f)
                        )
                        .border(
                            1.dp,
                            if (isSelected) AmberGoldPrimary else theme.primaryColor.copy(alpha = 0.35f),
                            CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = category.iconEmoji,
                        fontSize = 24.sp
                    )
                }

                Column {
                    Text(
                        text = "بيت ${category.arabicName}",
                        style = Typography.titleSmall,
                        color = if (isSelected) AmberGoldLight else PearlIvory
                    )
                    Text(
                        text = "${category.challenges.size} تحديات • ${category.puzzles.size} سؤالاً",
                        style = Typography.bodySmall,
                        color = StarlightSilver
                    )
                }
            }

            if (isSelected) {
                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "تم الاختيار",
                    tint = AmberGoldPrimary,
                    modifier = Modifier.size(24.dp)
                )
            } else if (progress != null && progress.completedChallengesCount > 0) {
                MadaratStatusBadge(
                    text = "${progress.completedChallengesCount} 🏆",
                    type = StatusBadgeType.Success
                )
            }
        }
    }
}

@Composable
private fun SetupModeOption(
    title: String,
    subtitle: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    testTag: String
) {
    Surface(
        onClick = onClick,
        shape = GameCornerRadius.shapeMd,
        color = if (isSelected) CelestialNavyMedium else CelestialNavyDark.copy(alpha = 0.5f),
        border = androidx.compose.foundation.BorderStroke(
            width = if (isSelected) 1.5.dp else 1.dp,
            color = if (isSelected) AmberGoldPrimary else CosmicBorder
        ),
        modifier = Modifier
            .fillMaxWidth()
            .testTag(testTag)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = GameSpacing.md, vertical = GameSpacing.sm),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = Typography.titleSmall,
                    color = if (isSelected) AmberGoldLight else PearlIvory
                )
                Text(
                    text = subtitle,
                    style = Typography.bodySmall,
                    color = StarlightSilver
                )
            }

            Box(
                modifier = Modifier
                    .size(20.dp)
                    .clip(CircleShape)
                    .border(
                        width = 2.dp,
                        color = if (isSelected) AmberGoldPrimary else DimmedStarlight,
                        shape = CircleShape
                    )
                    .background(if (isSelected) AmberGoldPrimary else Color.Transparent)
            )
        }
    }
}
