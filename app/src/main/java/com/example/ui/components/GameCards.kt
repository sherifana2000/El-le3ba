package com.example.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.example.ui.theme.AmberGoldDark
import com.example.ui.theme.AmberGoldLight
import com.example.ui.theme.AmberGoldPrimary
import com.example.ui.theme.CelestialNavyDark
import com.example.ui.theme.CelestialNavyMedium
import com.example.ui.theme.CelestialSurface
import com.example.ui.theme.CelestialSurfaceElevated
import com.example.ui.theme.CosmicBorder
import com.example.ui.theme.DimmedStarlight
import com.example.ui.theme.DisabledElement
import com.example.ui.theme.EtherealCyan
import com.example.ui.theme.EtherealCyanLight
import com.example.ui.theme.GameCornerRadius
import com.example.ui.theme.GameElevation
import com.example.ui.theme.GameSpacing
import com.example.ui.theme.GameTypography
import com.example.ui.theme.PearlIvory
import com.example.ui.theme.StarlightSilver
import com.example.ui.theme.Typography

// ============================================================================
// 6. GAME CARD (Standard elevated cosmic surface)
// ============================================================================

@Composable
fun MadaratGameCard(
    modifier: Modifier = Modifier,
    backgroundColor: Color = CelestialSurface,
    borderColor: Color = CosmicBorder,
    onClick: (() -> Unit)? = null,
    testTag: String = "game_card",
    content: @Composable () -> Unit
) {
    Surface(
        onClick = onClick ?: {},
        enabled = onClick != null,
        shape = GameCornerRadius.shapeCard,
        color = backgroundColor,
        border = BorderStroke(1.dp, borderColor),
        shadowElevation = GameElevation.medium,
        modifier = modifier.testTag(testTag)
    ) {
        Box(modifier = Modifier.padding(GameSpacing.lg)) {
            content()
        }
    }
}

// ============================================================================
// 7. CATEGORY CARD (House / Realm Card)
// ============================================================================

@Composable
fun MadaratCategoryCard(
    title: String,
    subtitle: String,
    icon: ImageVector,
    accentColor: Color,
    completedPuzzles: Int,
    totalPuzzles: Int,
    isLocked: Boolean,
    requiredStars: Int = 0,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    testTag: String = "category_card"
) {
    val progress = if (totalPuzzles > 0) completedPuzzles.toFloat() / totalPuzzles.toFloat() else 0f

    Surface(
        onClick = onClick,
        shape = GameCornerRadius.shapeCard,
        color = if (isLocked) CelestialNavyMedium else CelestialSurfaceElevated,
        border = BorderStroke(1.2.dp, if (isLocked) DisabledElement else CosmicBorder),
        shadowElevation = if (isLocked) GameElevation.flat else GameElevation.medium,
        modifier = modifier
            .testTag(testTag)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(GameSpacing.lg)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    // Category Icon Avatar
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(GameCornerRadius.shapeLg)
                            .background(
                                if (isLocked) DisabledElement.copy(alpha = 0.5f)
                                else accentColor.copy(alpha = 0.2f)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = icon,
                            contentDescription = null,
                            tint = if (isLocked) DimmedStarlight else accentColor,
                            modifier = Modifier.size(26.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(GameSpacing.md))

                    Column {
                        Text(
                            text = title,
                            style = Typography.titleLarge,
                            color = if (isLocked) StarlightSilver else PearlIvory
                        )
                        Text(
                            text = subtitle,
                            style = Typography.bodySmall,
                            color = DimmedStarlight
                        )
                    }
                }

                if (isLocked) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .clip(GameCornerRadius.shapePill)
                            .background(CelestialNavyDark)
                            .padding(horizontal = GameSpacing.sm, vertical = GameSpacing.xs)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "مقفل",
                            tint = StarlightSilver,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "$requiredStars ⭐",
                            style = Typography.labelSmall,
                            color = AmberGoldPrimary
                        )
                    }
                } else {
                    Text(
                        text = "$completedPuzzles / $totalPuzzles",
                        style = GameTypography.GameNumberMedium,
                        color = AmberGoldLight
                    )
                }
            }

            if (!isLocked) {
                Spacer(modifier = Modifier.height(GameSpacing.md))
                // House Progress Bar
                MadaratProgressBar(
                    progress = progress,
                    indicatorColor = accentColor
                )
            }
        }
    }
}

// ============================================================================
// 8. PROGRESS CARD (Player Overall Summary Card)
// ============================================================================

@Composable
fun MadaratProgressCard(
    currentRank: String,
    totalStars: Int,
    totalCoins: Int,
    solvedPuzzles: Int,
    overallPercent: Float,
    modifier: Modifier = Modifier,
    testTag: String = "progress_card"
) {
    Surface(
        shape = GameCornerRadius.shapeCard,
        color = CelestialSurface,
        border = BorderStroke(1.dp, CosmicBorder),
        shadowElevation = GameElevation.high,
        modifier = modifier
            .testTag(testTag)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(GameSpacing.lg)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "الرتبة الاستكشافية",
                        style = Typography.bodySmall,
                        color = StarlightSilver
                    )
                    Text(
                        text = currentRank,
                        style = Typography.titleLarge,
                        color = AmberGoldLight
                    )
                }

                Row(horizontalArrangement = Arrangement.spacedBy(GameSpacing.sm)) {
                    MadaratCounter(
                        count = totalStars,
                        iconTint = AmberGoldLight,
                        isCoin = false
                    )
                    MadaratCounter(
                        count = totalCoins,
                        iconTint = AmberGoldPrimary,
                        isCoin = true
                    )
                }
            }

            Spacer(modifier = Modifier.height(GameSpacing.md))

            // Overall Progression
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "الألغاز المحلولة: $solvedPuzzles",
                    style = Typography.labelMedium,
                    color = PearlIvory
                )
                Text(
                    text = "${(overallPercent * 100).toInt()}%",
                    style = GameTypography.GameNumberMedium,
                    color = EtherealCyanLight
                )
            }

            Spacer(modifier = Modifier.height(GameSpacing.xs))

            MadaratProgressBar(
                progress = overallPercent,
                indicatorColor = EtherealCyan
            )
        }
    }
}
