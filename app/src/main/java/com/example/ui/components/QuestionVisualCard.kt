package com.example.ui.components

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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.Puzzle
import com.example.ui.theme.AmberGoldLight
import com.example.ui.theme.AmberGoldPrimary
import com.example.ui.theme.CelestialNavyDark
import com.example.ui.theme.CelestialSurfaceElevated
import com.example.ui.theme.CosmicBorder
import com.example.ui.theme.EmeraldSuccess
import com.example.ui.theme.EtherealCyan
import com.example.ui.theme.GameCornerRadius
import com.example.ui.theme.GameSpacing
import com.example.ui.theme.GoldGlowBorder
import com.example.ui.theme.HouseThemes
import com.example.ui.theme.PearlIvory
import com.example.ui.theme.StarlightSilver
import com.example.ui.theme.Typography

/**
 * Visual illustration card for the current question in Madarat Beta 0.2.0.
 *
 * Displays:
 * - Thematic House background pattern and orbital rings.
 * - Question-specific visual badge emoji and topic subtitle.
 * - Challenge metadata (e.g. "السؤال 2 من 3" and challenge title).
 * - Animated educational explanation banner once correctly solved.
 */
@Composable
fun QuestionVisualCard(
    puzzle: Puzzle,
    isSolved: Boolean,
    modifier: Modifier = Modifier
) {
    val houseTheme = HouseThemes.getThemeForCategory(puzzle.categoryId)

    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(GameCornerRadius.shapeLg)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        houseTheme.backgroundGradient.first(),
                        CelestialSurfaceElevated
                    )
                )
            )
            .border(
                width = if (isSolved) 2.dp else 1.dp,
                brush = Brush.horizontalGradient(
                    colors = if (isSolved) {
                        listOf(EmeraldSuccess, AmberGoldPrimary)
                    } else {
                        listOf(houseTheme.primaryColor.copy(alpha = 0.6f), CosmicBorder)
                    }
                ),
                shape = GameCornerRadius.shapeLg
            )
            .testTag("question_visual_card")
    ) {
        // Orbital Ambient Background Canvas
        Canvas(modifier = Modifier.matchParentSize()) {
            val w = size.width
            val h = size.height

            // Thematic orbital glow
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(houseTheme.accentGlow.copy(alpha = 0.12f), Color.Transparent),
                    center = Offset(w * 0.85f, h * 0.3f),
                    radius = w * 0.45f
                )
            )

            // Orbital Ring
            drawCircle(
                color = houseTheme.primaryColor.copy(alpha = 0.08f),
                center = Offset(w * 0.85f, h * 0.3f),
                radius = w * 0.3f,
                style = Stroke(width = 1.dp.toPx())
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(GameSpacing.md)
        ) {
            // Top Challenge Info Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Challenge & Step Tag
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(GameCornerRadius.shapeSm)
                            .background(houseTheme.primaryColor.copy(alpha = 0.25f))
                            .border(1.dp, houseTheme.primaryColor.copy(alpha = 0.5f), GameCornerRadius.shapeSm)
                            .padding(horizontal = GameSpacing.sm, vertical = 3.dp)
                    ) {
                        Text(
                            text = "السؤال ${puzzle.questionIndexInChallenge} من ${puzzle.totalQuestionsInChallenge}",
                            style = Typography.labelSmall.copy(fontWeight = FontWeight.Bold),
                            color = PearlIvory
                        )
                    }

                    if (puzzle.challengeTitle.isNotBlank()) {
                        Text(
                            text = puzzle.challengeTitle,
                            style = Typography.labelSmall,
                            color = StarlightSilver
                        )
                    }
                }

                // Difficulty Badge
                Box(
                    modifier = Modifier
                        .clip(GameCornerRadius.shapeSm)
                        .background(CelestialNavyDark.copy(alpha = 0.7f))
                        .border(1.dp, CosmicBorder, GameCornerRadius.shapeSm)
                        .padding(horizontal = GameSpacing.sm, vertical = 3.dp)
                ) {
                    Text(
                        text = "${puzzle.difficulty.badgeEmoji} ${puzzle.difficulty.titleArabic}",
                        style = Typography.labelSmall,
                        color = AmberGoldLight
                    )
                }
            }

            Spacer(modifier = Modifier.height(GameSpacing.sm))

            // Visual Center Illustration Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(GameSpacing.md)
            ) {
                // Thematic Illustration Emblem
                Box(
                    modifier = Modifier
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(
                            brush = Brush.radialGradient(
                                colors = listOf(
                                    houseTheme.accentGlow.copy(alpha = 0.35f),
                                    houseTheme.primaryColor.copy(alpha = 0.15f)
                                )
                            )
                        )
                        .border(1.5.dp, houseTheme.primaryColor.copy(alpha = 0.6f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = puzzle.visualEmoji,
                        fontSize = 30.sp
                    )
                }

                Column(modifier = Modifier.weight(1f)) {
                    if (puzzle.visualTheme.isNotBlank()) {
                        Text(
                            text = puzzle.visualTheme,
                            style = Typography.labelMedium.copy(fontWeight = FontWeight.Bold),
                            color = houseTheme.accentGlow
                        )
                    }
                    Text(
                        text = puzzle.question,
                        style = Typography.bodyMedium.copy(lineHeight = 22.sp),
                        color = PearlIvory
                    )
                }
            }

            // Animated Educational Explanation Revealed Upon Solving
            AnimatedVisibility(
                visible = isSolved && puzzle.explanation.isNotBlank(),
                enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = GameSpacing.md)
                        .clip(GameCornerRadius.shapeMd)
                        .background(CelestialNavyDark.copy(alpha = 0.9f))
                        .border(1.dp, GoldGlowBorder, GameCornerRadius.shapeMd)
                        .padding(GameSpacing.md)
                        .testTag("explanation_card")
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs)
                    ) {
                        Icon(
                            imageVector = Icons.Default.AutoAwesome,
                            contentDescription = null,
                            tint = AmberGoldLight,
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = "سر المعرفة المدارية:",
                            style = Typography.labelMedium.copy(fontWeight = FontWeight.Bold),
                            color = AmberGoldLight
                        )
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = puzzle.explanation,
                        style = Typography.bodySmall.copy(lineHeight = 20.sp),
                        color = PearlIvory
                    )
                }
            }
        }
    }
}
