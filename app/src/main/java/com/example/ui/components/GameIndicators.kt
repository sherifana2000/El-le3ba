package com.example.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.ui.theme.AmberGoldDark
import com.example.ui.theme.AmberGoldLight
import com.example.ui.theme.AmberGoldPrimary
import com.example.ui.theme.CelestialNavyDark
import com.example.ui.theme.CelestialNavyMedium
import com.example.ui.theme.CelestialSurface
import com.example.ui.theme.CelestialSurfaceElevated
import com.example.ui.theme.CosmicBorder
import com.example.ui.theme.CrimsonNovaError
import com.example.ui.theme.DimmedStarlight
import com.example.ui.theme.DisabledElement
import com.example.ui.theme.EmeraldSuccess
import com.example.ui.theme.EtherealCyan
import com.example.ui.theme.EtherealCyanLight
import com.example.ui.theme.GameCornerRadius
import com.example.ui.theme.GameSpacing
import com.example.ui.theme.GameTypography
import com.example.ui.theme.PearlIvory
import com.example.ui.theme.StarlightSilver
import com.example.ui.theme.SupernovaReward
import com.example.ui.theme.Typography

// ============================================================================
// 9. REWARD BADGE (Achievement / Milestone Star Badge)
// ============================================================================

@Composable
fun MadaratRewardBadge(
    title: String,
    value: String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    isUnlocked: Boolean = true,
    testTag: String = "reward_badge"
) {
    Box(
        modifier = modifier
            .testTag(testTag)
            .clip(GameCornerRadius.shapeCard)
            .background(if (isUnlocked) CelestialSurfaceElevated else CelestialNavyMedium)
            .border(
                1.dp,
                if (isUnlocked) CosmicBorder else DisabledElement,
                GameCornerRadius.shapeCard
            )
            .padding(horizontal = GameSpacing.md, vertical = GameSpacing.sm)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(GameSpacing.sm)
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(
                        if (isUnlocked) AmberGoldPrimary.copy(alpha = 0.2f)
                        else DisabledElement.copy(alpha = 0.4f)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = if (isUnlocked) SupernovaReward else DimmedStarlight,
                    modifier = Modifier.size(20.dp)
                )
            }

            Column {
                Text(
                    text = title,
                    style = Typography.labelMedium,
                    color = if (isUnlocked) PearlIvory else DimmedStarlight
                )
                Text(
                    text = value,
                    style = GameTypography.GameNumberMedium,
                    color = if (isUnlocked) AmberGoldLight else StarlightSilver
                )
            }
        }
    }
}

// ============================================================================
// 10. COIN / STAR COUNTER (Top Bar Currency Pill)
// ============================================================================

@Composable
fun MadaratCounter(
    count: Int,
    isCoin: Boolean = true,
    modifier: Modifier = Modifier,
    iconTint: Color = if (isCoin) AmberGoldPrimary else SupernovaReward,
    testTag: String = "counter_pill"
) {
    Row(
        modifier = modifier
            .testTag(testTag)
            .clip(GameCornerRadius.shapePill)
            .background(CelestialNavyDark.copy(alpha = 0.85f))
            .border(1.dp, CosmicBorder, GameCornerRadius.shapePill)
            .padding(horizontal = GameSpacing.md, vertical = GameSpacing.xs),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs)
    ) {
        // Glowing Icon Pill
        Box(
            modifier = Modifier
                .size(20.dp)
                .clip(CircleShape)
                .background(iconTint.copy(alpha = 0.25f)),
            contentAlignment = Alignment.Center
        ) {
            if (isCoin) {
                Text(
                    text = "🪙",
                    style = Typography.labelSmall
                )
            } else {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "النجوم",
                    tint = iconTint,
                    modifier = Modifier.size(13.dp)
                )
            }
        }

        Text(
            text = count.toString(),
            style = GameTypography.GameNumberMedium,
            color = PearlIvory
        )
    }
}

// ============================================================================
// 11. LEVEL INDICATOR (House & Puzzle index tag)
// ============================================================================

@Composable
fun MadaratLevelIndicator(
    houseName: String,
    puzzleIndex: Int,
    modifier: Modifier = Modifier,
    testTag: String = "level_indicator"
) {
    Row(
        modifier = modifier
            .testTag(testTag)
            .clip(GameCornerRadius.shapePill)
            .background(CelestialSurfaceElevated)
            .border(1.dp, CosmicBorder, GameCornerRadius.shapePill)
            .padding(horizontal = GameSpacing.md, vertical = GameSpacing.xs),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs)
    ) {
        Text(
            text = houseName,
            style = Typography.labelMedium,
            color = EtherealCyanLight
        )
        Text(
            text = "•",
            style = Typography.labelMedium,
            color = StarlightSilver
        )
        Text(
            text = "اللغز $puzzleIndex",
            style = Typography.labelMedium,
            color = PearlIvory
        )
    }
}

// ============================================================================
// 14. PROGRESS BAR (Cosmic Energy Gradient Track)
// ============================================================================

@Composable
fun MadaratProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    height: Dp = 8.dp,
    indicatorColor: Color = EtherealCyan,
    trackColor: Color = CelestialNavyDark,
    testTag: String = "progress_bar"
) {
    val clampedProgress = progress.coerceIn(0f, 1f)
    val animatedProgress by animateFloatAsState(targetValue = clampedProgress, label = "progress_anim")

    Box(
        modifier = modifier
            .testTag(testTag)
            .fillMaxWidth()
            .height(height)
            .clip(GameCornerRadius.shapePill)
            .background(trackColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(animatedProgress)
                .clip(GameCornerRadius.shapePill)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            indicatorColor,
                            indicatorColor.copy(alpha = 0.85f),
                            AmberGoldLight.copy(alpha = 0.95f)
                        )
                    )
                )
        )
    }
}

// ============================================================================
// 15. SECTION HEADER (RTL-first Screen or Category Section)
// ============================================================================

@Composable
fun MadaratSectionHeader(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    actionText: String? = null,
    onActionClick: (() -> Unit)? = null,
    testTag: String = "section_header"
) {
    Row(
        modifier = modifier
            .testTag(testTag)
            .fillMaxWidth()
            .padding(vertical = GameSpacing.sm),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = title,
                style = Typography.titleLarge,
                color = PearlIvory
            )
            if (!subtitle.isNullOrBlank()) {
                Text(
                    text = subtitle,
                    style = Typography.bodySmall,
                    color = StarlightSilver
                )
            }
        }

        if (actionText != null && onActionClick != null) {
            Box(
                modifier = Modifier
                    .clip(GameCornerRadius.shapePill)
                    .background(CelestialSurfaceElevated)
                    .border(1.dp, CosmicBorder, GameCornerRadius.shapePill)
                    .padding(horizontal = GameSpacing.md, vertical = GameSpacing.xs)
            ) {
                Text(
                    text = actionText,
                    style = Typography.labelSmall,
                    color = AmberGoldLight
                )
            }
        }
    }
}

// ============================================================================
// 16. SMALL STATUS BADGE (Difficulty, Unlocked, Completed)
// ============================================================================

enum class StatusBadgeType {
    Success, Warning, Info, Locked, Error
}

@Composable
fun MadaratStatusBadge(
    text: String,
    type: StatusBadgeType = StatusBadgeType.Info,
    modifier: Modifier = Modifier,
    testTag: String = "status_badge"
) {
    val (bgColor, textColor, borderColor) = when (type) {
        StatusBadgeType.Success -> Triple(EmeraldSuccess.copy(alpha = 0.2f), EmeraldSuccess, EmeraldSuccess.copy(alpha = 0.5f))
        StatusBadgeType.Warning -> Triple(AmberGoldPrimary.copy(alpha = 0.2f), AmberGoldLight, AmberGoldPrimary.copy(alpha = 0.5f))
        StatusBadgeType.Info -> Triple(EtherealCyan.copy(alpha = 0.2f), EtherealCyanLight, EtherealCyan.copy(alpha = 0.5f))
        StatusBadgeType.Locked -> Triple(DisabledElement.copy(alpha = 0.4f), DimmedStarlight, DisabledElement)
        StatusBadgeType.Error -> Triple(CrimsonNovaError.copy(alpha = 0.2f), CrimsonNovaError, CrimsonNovaError.copy(alpha = 0.5f))
    }

    Box(
        modifier = modifier
            .testTag(testTag)
            .clip(GameCornerRadius.shapePill)
            .background(bgColor)
            .border(1.dp, borderColor, GameCornerRadius.shapePill)
            .padding(horizontal = GameSpacing.sm, vertical = 3.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = Typography.labelSmall,
            color = textColor
        )
    }
}
