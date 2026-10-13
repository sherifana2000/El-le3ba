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
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.local.entity.PlayerProgressEntity
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
import com.example.ui.theme.CelestialSurface
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
import com.example.ui.theme.PearlIvory
import com.example.ui.theme.StarlightSilver
import com.example.ui.theme.Typography

// ============================================================================
// GAMEPLAY SETUP SCREEN — إعداد واختيار مسار الرحلة المعرفية
// ============================================================================

@Composable
fun GameplaySetupScreen(
    onStartRoundClick: (categoryId: String) -> Unit,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    initialCategoryId: String = "cars",
    progressMap: Map<String, PlayerProgressEntity> = emptyMap()
) {
    var selectedCategoryId by remember { mutableStateOf(initialCategoryId) }
    var selectedModeIndex by remember { mutableStateOf(0) }

    val categories = remember { PuzzleRepository.getCategories() }
    val currentCategory = categories.firstOrNull { it.id == selectedCategoryId } ?: categories.first()
    val currentProgress = progressMap[selectedCategoryId]

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        CelestialNavyDark,
                        CelestialNavyMedium,
                        Color(0xFF090E20)
                    )
                )
            )
            .testTag("gameplay_setup_screen")
    ) {
        // Subtle Atmospheric Constellation Background
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            // Soft cyan & gold celestial dust
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(EtherealCyan.copy(alpha = 0.08f), Color.Transparent),
                    center = Offset(width * 0.85f, height * 0.15f),
                    radius = width * 0.6f
                )
            )
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(AmberGoldPrimary.copy(alpha = 0.06f), Color.Transparent),
                    center = Offset(width * 0.15f, height * 0.6f),
                    radius = width * 0.5f
                )
            )

            // Faint orbit curves
            drawCircle(
                color = CosmicBorder.copy(alpha = 0.15f),
                radius = width * 0.45f,
                center = Offset(width * 0.5f, height * 0.35f),
                style = Stroke(width = 1f)
            )
        }

        // Scrollable Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
                .padding(horizontal = GameSpacing.screenPadding)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(GameSpacing.md)
        ) {
            // ----------------------------------------------------------------
            // 1. TOP HEADER & CURRENCY AREA
            // ----------------------------------------------------------------
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = GameSpacing.sm),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Back Button (AutoMirrored handles RTL smoothly)
                MadaratIconButton(
                    icon = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "الرجوع للرئيسية",
                    onClick = onBackClick,
                    modifier = Modifier.size(44.dp),
                    testTag = "setup_back_button"
                )

                // Currency Pill Counters
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs)
                ) {
                    MadaratCounter(
                        count = 42,
                        isCoin = false,
                        testTag = "setup_stars_counter"
                    )
                    MadaratCounter(
                        count = 350,
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
                    text = "المحطة الأولى",
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
                    text = "اختر وجهة رحلتك وانطلق في فك شفرات الحروف واكتشاف أسرار الكلمات",
                    style = Typography.bodyMedium.copy(lineHeight = 22.sp),
                    color = Color(0xFFCBD5E1),
                    modifier = Modifier.padding(horizontal = GameSpacing.sm)
                )
            }

            // ----------------------------------------------------------------
            // 3. CATEGORY SELECTION LIST (HOUSES)
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
                        text = "اختر بيت المعرفة للاستكشاف:",
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
                            // House Avatar
                            Box(
                                modifier = Modifier
                                    .size(54.dp)
                                    .clip(GameCornerRadius.shapeLg)
                                    .background(AmberGoldPrimary.copy(alpha = 0.2f))
                                    .border(1.5.dp, AmberGoldPrimary.copy(alpha = 0.5f), GameCornerRadius.shapeLg),
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
                            text = "متاح",
                            type = StatusBadgeType.Success
                        )
                    }

                    Spacer(modifier = Modifier.height(GameSpacing.lg))

                    // Mission Details Grid / Indicators
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
                            Text(text = "الألغاز", style = Typography.labelSmall, color = StarlightSilver)
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(text = "${currentCategory.puzzles.size} محطات", style = GameTypography.GameNumberMedium, color = EtherealCyanLight)
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "المستوى", style = Typography.labelSmall, color = StarlightSilver)
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(text = "مستكشف", style = GameTypography.GameNumberMedium, color = AmberGoldLight)
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "المكافأة", style = Typography.labelSmall, color = StarlightSilver)
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(text = "50 🪙 • 3 ⭐", style = GameTypography.GameNumberMedium, color = PearlIvory)
                        }
                    }

                    // Persistent Player Progress for this House (if recorded)
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
                                Text(text = "أفضل إنجاز", style = Typography.labelSmall, color = StarlightSilver)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = "${currentProgress.bestCompletionPercentage}%",
                                    style = GameTypography.GameNumberMedium,
                                    color = EtherealCyanLight
                                )
                            }
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(text = "الجولات المكتملة", style = Typography.labelSmall, color = StarlightSilver)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = "${currentProgress.completedSessions}",
                                    style = GameTypography.GameNumberMedium,
                                    color = PearlIvory
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(GameSpacing.lg))

                    // Mode Selection Options
                    Text(
                        text = "اختر نمط الجولة:",
                        style = Typography.labelMedium,
                        color = PearlIvory,
                        modifier = Modifier.padding(bottom = GameSpacing.xs)
                    )

                    // Option 1: Classic Exploration Mode
                    SetupModeOption(
                        title = "النمط الكلاسيكي",
                        subtitle = "استكشاف هادئ بدون ضغط زمني للمتعة الذهنية",
                        isSelected = selectedModeIndex == 0,
                        onClick = { selectedModeIndex = 0 },
                        testTag = "setup_mode_classic"
                    )

                    Spacer(modifier = Modifier.height(GameSpacing.sm))

                    // Option 2: Star Speed Challenge
                    SetupModeOption(
                        title = "تحدي النجوم المدارية",
                        subtitle = "حل الألغاز بسرعة لمضاعفة مكافآت النجوم والعملات",
                        isSelected = selectedModeIndex == 1,
                        onClick = { selectedModeIndex = 1 },
                        testTag = "setup_mode_speed"
                    )
                }
            }

            // ----------------------------------------------------------------
            // 5. ACTIONS (Primary Start & Secondary Home)
            // ----------------------------------------------------------------
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = GameSpacing.md),
                verticalArrangement = Arrangement.spacedBy(GameSpacing.sm)
            ) {
                MadaratPrimaryButton(
                    text = "انطلق إلى اللغز الأول",
                    icon = Icons.Default.PlayArrow,
                    onClick = { onStartRoundClick(selectedCategoryId) },
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
            modifier = Modifier.padding(GameSpacing.md),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(GameSpacing.md)
            ) {
                // Category Icon Avatar
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(GameCornerRadius.shapeMd)
                        .background(
                            if (isSelected) AmberGoldPrimary.copy(alpha = 0.22f)
                            else CelestialSurface.copy(alpha = 0.5f)
                        )
                        .border(
                            1.dp,
                            if (isSelected) AmberGoldPrimary.copy(alpha = 0.6f) else CosmicBorder,
                            GameCornerRadius.shapeMd
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = category.iconEmoji,
                        fontSize = 24.sp
                    )
                }

                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs)
                    ) {
                        Text(
                            text = category.arabicName,
                            style = Typography.titleMedium,
                            color = if (isSelected) AmberGoldLight else PearlIvory
                        )
                        if (isSelected) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = "تم الاختيار",
                                tint = AmberGoldLight,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = category.shortDescription,
                        style = Typography.bodySmall,
                        color = StarlightSilver,
                        maxLines = 1
                    )
                    if (progress != null && progress.highestScore > 0) {
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "أعلى نتيجة: ${progress.highestScore} نقطة",
                            style = Typography.labelSmall,
                            color = AmberGoldLight
                        )
                    }
                }
            }

            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                MadaratStatusBadge(
                    text = "${category.puzzles.size} ألغاز",
                    type = if (isSelected) StatusBadgeType.Warning else StatusBadgeType.Info
                )
                if (progress != null && (progress.bestCompletionPercentage >= 100 || progress.completedPuzzlesCount >= category.puzzles.size)) {
                    MadaratStatusBadge(
                        text = "مكتمل ⭐",
                        type = StatusBadgeType.Success
                    )
                }
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
    modifier: Modifier = Modifier,
    testTag: String = "mode_option"
) {
    Surface(
        onClick = onClick,
        shape = GameCornerRadius.shapeMd,
        color = if (isSelected) CelestialSurface.copy(alpha = 0.9f) else CelestialNavyDark.copy(alpha = 0.5f),
        border = androidx.compose.foundation.BorderStroke(
            1.2.dp,
            if (isSelected) AmberGoldPrimary else CosmicBorder
        ),
        shadowElevation = if (isSelected) GameElevation.low else GameElevation.flat,
        modifier = modifier
            .testTag(testTag)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(GameSpacing.md),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = Typography.titleMedium,
                    color = if (isSelected) AmberGoldLight else PearlIvory
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = subtitle,
                    style = Typography.bodySmall,
                    color = StarlightSilver
                )
            }

            Box(
                modifier = Modifier
                    .size(22.dp)
                    .clip(CircleShape)
                    .background(if (isSelected) AmberGoldPrimary else Color.Transparent)
                    .border(
                        1.5.dp,
                        if (isSelected) AmberGoldLight else DimmedStarlight,
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                if (isSelected) {
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .clip(CircleShape)
                            .background(CelestialNavyDark)
                    )
                }
            }
        }
    }
}
