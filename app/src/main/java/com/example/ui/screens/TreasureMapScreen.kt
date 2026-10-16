package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.LockOpen
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
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
import com.example.ui.components.MadaratProgressBar
import com.example.ui.components.MadaratSecondaryButton
import com.example.ui.components.MadaratStatusBadge
import com.example.ui.components.StatusBadgeType
import com.example.ui.theme.AmberGoldDark
import com.example.ui.theme.AmberGoldLight
import com.example.ui.theme.AmberGoldPrimary
import com.example.ui.theme.CelestialNavyDark
import com.example.ui.theme.CelestialNavyMedium
import com.example.ui.theme.CelestialSurface
import com.example.ui.theme.CelestialSurfaceElevated
import com.example.ui.theme.CosmicBorder
import com.example.ui.theme.DimmedStarlight
import com.example.ui.theme.EmeraldSuccess
import com.example.ui.theme.EtherealCyan
import com.example.ui.theme.EtherealCyanLight
import com.example.ui.theme.GameCornerRadius
import com.example.ui.theme.GameElevation
import com.example.ui.theme.GameSpacing
import com.example.ui.theme.GoldGlowBorder
import com.example.ui.theme.HouseThemes
import com.example.ui.theme.LightBackground
import com.example.ui.theme.LightSurface
import com.example.ui.theme.LightSurfaceElevated
import com.example.ui.theme.LightTextPrimary
import com.example.ui.theme.LightTextSecondary
import com.example.ui.theme.LocalThemeIsDark
import com.example.ui.theme.PearlIvory
import com.example.ui.theme.StarlightSilver
import com.example.ui.theme.Typography

// ============================================================================
// PHASE 2 — TREASURE MAP SCREEN (خريطة المغامرة والكنوز)
// ============================================================================

enum class HouseMapStatus {
    COMPLETED,   // مكتمل بالكامل (100% أو كافة الألغاز)
    IN_PROGRESS, // مفتوح وبدأ اللاعب حله
    UNLOCKED     // مفتوح ومتاح للاستكشاف
}

@Composable
fun TreasureMapScreen(
    progressMap: Map<String, PlayerProgressEntity>,
    onStartRoundClick: (categoryId: String, difficulty: GameDifficulty) -> Unit,
    onConfigureHouseClick: (categoryId: String) -> Unit,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val isDark = LocalThemeIsDark.current
    val categories = remember { PuzzleRepository.getCategories() }
    var selectedCategory by remember { mutableStateOf<PuzzleCategory?>(null) }
    var selectedDifficulty by remember { mutableStateOf(GameDifficulty.EXPLORATION) }

    // Aggregate Genuine Statistics (NO fake coins or dummy player names)
    val totalStars = progressMap.values.sumOf { it.completedChallengesCount }
    val totalScore = progressMap.values.sumOf { it.highestScore }
    val completedHousesCount = categories.count { cat ->
        val p = progressMap[cat.id]
        val total = cat.challenges.size
        val done = (p?.completedChallengesCount ?: 0).coerceAtMost(total)
        total > 0 && done >= total
    }

    // Dynamic compass pulse animation for the map
    val infiniteTransition = rememberInfiniteTransition(label = "map_compass_pulse")
    val compassGlow by infiniteTransition.animateFloat(
        initialValue = 0.7f,
        targetValue = 1.05f,
        animationSpec = infiniteRepeatable(
            animation = tween(2800, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "compass_pulse"
    )

    // Palette adaptations for Dark vs Light mode
    val bgColors = if (isDark) {
        listOf(CelestialNavyDark, CelestialNavyMedium, Color(0xFF070B18))
    } else {
        listOf(LightBackground, Color(0xFFE2E8F0), Color(0xFFF1F5F9))
    }
    val textColorPrimary = if (isDark) PearlIvory else LightTextPrimary
    val textColorSecondary = if (isDark) StarlightSilver else LightTextSecondary
    val cardBg = if (isDark) CelestialSurfaceElevated else LightSurface
    val cardBorder = if (isDark) CosmicBorder else Color(0x33F59E0B)

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(brush = Brush.verticalGradient(colors = bgColors))
            .testTag("treasure_map_screen")
    ) {
        // Atmospheric Compass & Ancient Grid Background Canvas
        Canvas(modifier = Modifier.fillMaxSize()) {
            val w = size.width
            val h = size.height

            // Ancient Nautical/Treasure Map grid lines
            val gridColor = if (isDark) CosmicBorder.copy(alpha = 0.08f) else Color(0x15B45309)
            val step = 80.dp.toPx()
            var x = 0f
            while (x < w) {
                drawLine(color = gridColor, start = Offset(x, 0f), end = Offset(x, h), strokeWidth = 1f)
                x += step
            }
            var y = 0f
            while (y < h) {
                drawLine(color = gridColor, start = Offset(0f, y), end = Offset(w, y), strokeWidth = 1f)
                y += step
            }

            // Faint Antique Compass Rose Rings in background
            val compassColor = if (isDark) AmberGoldPrimary.copy(alpha = 0.06f) else Color(0x18B45309)
            drawCircle(color = compassColor, radius = w * 0.45f, center = Offset(w * 0.85f, h * 0.25f))
            drawCircle(color = compassColor, radius = w * 0.28f, center = Offset(w * 0.85f, h * 0.25f))
        }

        // Scrollable Adventure Route
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
        ) {
            // ----------------------------------------------------------------
            // 1. TOP HEADER & NAVIGATION BAR
            // ----------------------------------------------------------------
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GameSpacing.md, vertical = GameSpacing.sm),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                MadaratIconButton(
                    icon = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "الرجوع للرئيسية",
                    onClick = onBackClick,
                    modifier = Modifier.size(44.dp),
                    testTag = "map_back_button"
                )

                // Genuine Player Progress Counters (Stars & Points)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs)
                ) {
                    MadaratCounter(
                        count = totalStars,
                        isCoin = false,
                        testTag = "map_stars_counter"
                    )
                    MadaratCounter(
                        count = totalScore,
                        isCoin = true,
                        testTag = "map_score_counter"
                    )
                }
            }

            // Map Title & Overview Card
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GameSpacing.lg, vertical = GameSpacing.xs),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs)
                ) {
                    Icon(
                        imageVector = Icons.Default.Explore,
                        contentDescription = null,
                        tint = AmberGoldPrimary,
                        modifier = Modifier
                            .size(24.dp)
                            .scale(compassGlow)
                    )
                    Text(
                        text = "خريطة المغامرة والكنوز",
                        style = Typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
                        color = textColorPrimary
                    )
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "رحلة عبر ١٢ بيتاً معرفياً • $completedHousesCount من ١٢ بيتاً مكتمل",
                    style = Typography.bodySmall,
                    color = textColorSecondary
                )

                Spacer(modifier = Modifier.height(GameSpacing.xs))

                // Overall Discovery Progress Bar
                val overallProgress = if (categories.isEmpty()) 0f else completedHousesCount.toFloat() / categories.size.toFloat()
                MadaratProgressBar(
                    progress = overallProgress,
                    modifier = Modifier.fillMaxWidth(0.85f),
                    indicatorColor = AmberGoldPrimary,
                    trackColor = if (isDark) CelestialNavyMedium else Color(0xFFCBD5E1)
                )
            }

            Spacer(modifier = Modifier.height(GameSpacing.sm))

            // ----------------------------------------------------------------
            // 2. WINDING TRAIL (12 KNOWLEDGE HOUSES)
            // ----------------------------------------------------------------
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = GameSpacing.md, vertical = GameSpacing.sm)
            ) {
                // Winding Trail Connector Canvas
                Canvas(
                    modifier = Modifier
                        .matchParentSize()
                ) {
                    val nodeHeight = 110.dp.toPx()
                    val pathColor = if (isDark) AmberGoldLight.copy(alpha = 0.35f) else Color(0x66B45309)
                    val dashEffect = PathEffect.dashPathEffect(floatArrayOf(12f, 10f), 0f)

                    for (i in 0 until categories.size - 1) {
                        val startY = i * nodeHeight + 45.dp.toPx()
                        val endY = (i + 1) * nodeHeight + 45.dp.toPx()

                        // Alternating horizontal alignment for the winding S-curve
                        val startX = when (i % 3) {
                            0 -> size.width * 0.28f
                            1 -> size.width * 0.72f
                            else -> size.width * 0.50f
                        }
                        val endX = when ((i + 1) % 3) {
                            0 -> size.width * 0.28f
                            1 -> size.width * 0.72f
                            else -> size.width * 0.50f
                        }

                        // Draw curved dashed trail segment
                        val midY = (startY + endY) / 2f
                        val path = androidx.compose.ui.graphics.Path().apply {
                            moveTo(startX, startY)
                            cubicTo(
                                startX, midY,
                                endX, midY,
                                endX, endY
                            )
                        }
                        drawPath(
                            path = path,
                            color = pathColor,
                            style = androidx.compose.ui.graphics.drawscope.Stroke(
                                width = 3.dp.toPx(),
                                pathEffect = dashEffect
                            )
                        )
                    }
                }

                // 12 Knowledge House Stations
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(22.dp)
                ) {
                    categories.forEachIndexed { index, category ->
                        val progress = progressMap[category.id]
                        val totalChallenges = category.challenges.size
                        val completedChallenges = (progress?.completedChallengesCount ?: 0).coerceAtMost(totalChallenges)
                        val housePercentage = if (totalChallenges > 0) ((completedChallenges.toFloat() / totalChallenges.toFloat()) * 100).toInt() else 0
                        val isCompleted = totalChallenges > 0 && completedChallenges >= totalChallenges
                        val isInProgress = !isCompleted && (completedChallenges > 0 || (progress != null && (progress.highestScore > 0 || progress.totalCorrectAnswers > 0)))
                        val status = when {
                            isCompleted -> HouseMapStatus.COMPLETED
                            isInProgress -> HouseMapStatus.IN_PROGRESS
                            else -> HouseMapStatus.UNLOCKED
                        }

                        val alignment = when (index % 3) {
                            0 -> Alignment.Start
                            1 -> Alignment.End
                            else -> Alignment.CenterHorizontally
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(
                                    start = if (index % 3 == 0) 12.dp else 0.dp,
                                    end = if (index % 3 == 1) 12.dp else 0.dp
                                ),
                            contentAlignment = when (index % 3) {
                                0 -> Alignment.CenterStart
                                1 -> Alignment.CenterEnd
                                else -> Alignment.Center
                            }
                        ) {
                            TreasureMapNode(
                                stationNumber = index + 1,
                                category = category,
                                progress = progress,
                                completedChallenges = completedChallenges,
                                totalChallenges = totalChallenges,
                                percentage = housePercentage,
                                status = status,
                                isDark = isDark,
                                isSelected = selectedCategory?.id == category.id,
                                onClick = { selectedCategory = category }
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(100.dp))
                }
            }
        }

        // ----------------------------------------------------------------
        // 3. INTERACTIVE HOUSE DETAIL SHEET / MODAL
        // ----------------------------------------------------------------
        AnimatedVisibility(
            visible = selectedCategory != null,
            enter = slideInVertically(initialOffsetY = { it }) + fadeIn(),
            exit = slideOutVertically(targetOffsetY = { it }) + fadeOut(),
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            selectedCategory?.let { category ->
                val progress = progressMap[category.id]
                val totalChallenges = category.challenges.size
                val completedChallenges = (progress?.completedChallengesCount ?: 0).coerceAtMost(totalChallenges)
                val housePercentage = if (totalChallenges > 0) ((completedChallenges.toFloat() / totalChallenges.toFloat()) * 100).toInt() else 0
                val isCompleted = totalChallenges > 0 && completedChallenges >= totalChallenges
                val isInProgress = !isCompleted && (completedChallenges > 0 || (progress != null && (progress.highestScore > 0 || progress.totalCorrectAnswers > 0)))
                val houseTheme = HouseThemes.getThemeForCategory(category.id)

                Surface(
                    shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
                    color = cardBg,
                    border = androidx.compose.foundation.BorderStroke(1.5.dp, cardBorder),
                    shadowElevation = GameElevation.high,
                    modifier = Modifier
                        .fillMaxWidth()
                        .navigationBarsPadding()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(GameSpacing.lg)
                    ) {
                        // Header with close button
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(GameSpacing.sm)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                        .background(houseTheme.primaryColor.copy(alpha = 0.25f))
                                        .border(1.5.dp, houseTheme.primaryColor, CircleShape),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(text = category.iconEmoji, fontSize = 24.sp)
                                }

                                Column {
                                    Text(
                                        text = "بيت ${category.arabicName}",
                                        style = Typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                                        color = textColorPrimary
                                    )
                                    Text(
                                        text = if (isCompleted) "بيت مكتمل بالكامل 🏆" else if (isInProgress) "قيد المغامرة ($completedChallenges من $totalChallenges تحديات) ⚡" else "متاح للاستكشاف ✨",
                                        style = Typography.labelSmall,
                                        color = if (isCompleted) AmberGoldLight else if (isInProgress) EtherealCyanLight else EmeraldSuccess
                                    )
                                }
                            }

                            MadaratIconButton(
                                icon = Icons.Default.Close,
                                contentDescription = "إغلاق",
                                onClick = { selectedCategory = null },
                                modifier = Modifier.size(36.dp)
                            )
                        }

                        Spacer(modifier = Modifier.height(GameSpacing.sm))

                        Text(
                            text = category.shortDescription,
                            style = Typography.bodyMedium.copy(lineHeight = 22.sp),
                            color = textColorSecondary
                        )

                        Spacer(modifier = Modifier.height(GameSpacing.md))

                        // Progress and Stats Row
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(GameCornerRadius.shapeMd)
                                .background(if (isDark) CelestialNavyDark.copy(alpha = 0.6f) else Color(0xFFF1F5F9))
                                .padding(GameSpacing.md),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "${progress?.highestScore ?: 0}",
                                    style = Typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                                    color = AmberGoldLight
                                )
                                Text(
                                    text = "أفضل نتيجة",
                                    style = Typography.labelSmall,
                                    color = textColorSecondary
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .width(1.dp)
                                    .height(30.dp)
                                    .background(cardBorder)
                            )

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "$housePercentage%",
                                    style = Typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                                    color = EtherealCyanLight
                                )
                                Text(
                                    text = "نسبة الإنجاز",
                                    style = Typography.labelSmall,
                                    color = textColorSecondary
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .width(1.dp)
                                    .height(30.dp)
                                    .background(cardBorder)
                            )

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "$completedChallenges من $totalChallenges",
                                    style = Typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                                    color = EmeraldSuccess
                                )
                                Text(
                                    text = "التحديات المنجزة",
                                    style = Typography.labelSmall,
                                    color = textColorSecondary
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(GameSpacing.md))

                        // Difficulty Level Quick Selection
                        Text(
                            text = "مستوى التحدي:",
                            style = Typography.labelMedium.copy(fontWeight = FontWeight.Bold),
                            color = textColorPrimary
                        )

                        Spacer(modifier = Modifier.height(GameSpacing.xs))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs)
                        ) {
                            GameDifficulty.values().forEach { diff ->
                                val isDiffSelected = selectedDifficulty == diff
                                val diffTitle = diff.titleArabic

                                Surface(
                                    onClick = { selectedDifficulty = diff },
                                    shape = GameCornerRadius.shapeSm,
                                    color = if (isDiffSelected) AmberGoldPrimary else (if (isDark) CelestialNavyDark else Color(0xFFF1F5F9)),
                                    border = androidx.compose.foundation.BorderStroke(
                                        1.dp,
                                        if (isDiffSelected) AmberGoldLight else cardBorder
                                    ),
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Text(
                                        text = diffTitle,
                                        style = Typography.labelSmall.copy(fontWeight = FontWeight.Bold),
                                        color = if (isDiffSelected) CelestialNavyDark else textColorPrimary,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier.padding(vertical = 8.dp)
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(GameSpacing.lg))

                        // Action Buttons
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(GameSpacing.sm)
                        ) {
                            MadaratSecondaryButton(
                                text = "تهيئة البيت",
                                onClick = {
                                    onConfigureHouseClick(category.id)
                                    selectedCategory = null
                                },
                                modifier = Modifier.weight(1f)
                            )

                            MadaratPrimaryButton(
                                text = "ابدأ المغامرة",
                                icon = Icons.Default.PlayArrow,
                                onClick = {
                                    onStartRoundClick(category.id, selectedDifficulty)
                                    selectedCategory = null
                                },
                                modifier = Modifier.weight(1.3f),
                                testTag = "map_detail_start_button"
                            )
                        }
                    }
                }
            }
        }
    }
}

// ============================================================================
// TREASURE MAP NODE COMPONENT
// ============================================================================

@Composable
fun TreasureMapNode(
    stationNumber: Int,
    category: PuzzleCategory,
    progress: PlayerProgressEntity?,
    completedChallenges: Int,
    totalChallenges: Int,
    percentage: Int,
    status: HouseMapStatus,
    isDark: Boolean,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val houseTheme = HouseThemes.getThemeForCategory(category.id)

    val nodeBorderColor = when (status) {
        HouseMapStatus.COMPLETED -> AmberGoldPrimary
        HouseMapStatus.IN_PROGRESS -> EtherealCyan
        HouseMapStatus.UNLOCKED -> houseTheme.primaryColor
    }

    val glowAlpha = if (isSelected) 0.5f else 0.2f

    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(18.dp),
        color = if (isDark) CelestialSurfaceElevated else LightSurfaceElevated,
        border = androidx.compose.foundation.BorderStroke(
            width = if (isSelected) 2.2.dp else 1.2.dp,
            color = if (isSelected) AmberGoldLight else nodeBorderColor.copy(alpha = 0.7f)
        ),
        shadowElevation = if (isSelected) GameElevation.high else GameElevation.medium,
        modifier = modifier
            .width(230.dp)
            .testTag("map_node_${category.id}")
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(GameSpacing.md)
        ) {
            // Station Tag & Icon Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Station badge
                Text(
                    text = "المحطة $stationNumber",
                    style = Typography.labelSmall.copy(fontWeight = FontWeight.Bold),
                    color = if (status == HouseMapStatus.COMPLETED) AmberGoldLight else EtherealCyanLight
                )

                // Status Icon Badge
                when (status) {
                    HouseMapStatus.COMPLETED -> {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.EmojiEvents,
                                contentDescription = "مكتمل",
                                tint = AmberGoldLight,
                                modifier = Modifier.size(16.dp)
                            )
                            Text(
                                text = "مكتمل",
                                style = Typography.labelSmall.copy(fontSize = 10.sp),
                                color = AmberGoldLight
                            )
                        }
                    }
                    HouseMapStatus.IN_PROGRESS -> {
                        Text(
                            text = "$percentage%",
                            style = Typography.labelSmall.copy(fontSize = 11.sp, fontWeight = FontWeight.Bold),
                            color = EtherealCyanLight
                        )
                    }
                    HouseMapStatus.UNLOCKED -> {
                        Icon(
                            imageVector = Icons.Default.LockOpen,
                            contentDescription = "متاح",
                            tint = houseTheme.primaryColor,
                            modifier = Modifier.size(14.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(GameSpacing.xs))

            // Main House Name & Emoji
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(GameSpacing.sm)
            ) {
                Box(
                    modifier = Modifier
                        .size(42.dp)
                        .clip(CircleShape)
                        .background(houseTheme.primaryColor.copy(alpha = glowAlpha))
                        .border(1.2.dp, nodeBorderColor, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = category.iconEmoji,
                        fontSize = 22.sp
                    )
                }

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "بيت ${category.arabicName}",
                        style = Typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                        color = if (isDark) PearlIvory else LightTextPrimary,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "$completedChallenges من $totalChallenges تحديات • ${progress?.highestScore ?: 0} نقطة",
                        style = Typography.labelSmall,
                        color = if (isDark) StarlightSilver else LightTextSecondary,
                        maxLines = 1
                    )
                }
            }

            // Progress bar if in progress or completed
            if (percentage > 0) {
                Spacer(modifier = Modifier.height(GameSpacing.xs))
                MadaratProgressBar(
                    progress = (percentage.toFloat() / 100f).coerceIn(0f, 1f),
                    modifier = Modifier.fillMaxWidth(),
                    indicatorColor = if (status == HouseMapStatus.COMPLETED) AmberGoldPrimary else EtherealCyan,
                    trackColor = if (isDark) CelestialNavyDark else Color(0xFFE2E8F0)
                )
            }
        }
    }
}
