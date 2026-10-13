package com.example.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
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
import com.example.ui.theme.GameElevation
import com.example.ui.theme.GameTileMetrics
import com.example.ui.theme.GameTypography
import com.example.ui.theme.GoldGlowBorder
import com.example.ui.theme.PearlIvory
import com.example.ui.theme.StarlightSilver

// ============================================================================
// LETTER TILE STATE DEFINITIONS
// ============================================================================

enum class LetterTileState {
    Available,  // In letter pool, ready to be tapped
    Pressed,    // Finger currently down
    Selected,   // Highlighted for hint or focus
    Placed,     // Already tapped & moved to answer slot (dimmed placeholder)
    Correct,    // Verified correct in puzzle
    Incorrect,  // Verified incorrect (shakes/turns red)
    Disabled    // Inactive / non-interactive
}

enum class AnswerSlotState {
    Empty,      // Empty waiting for letter
    Active,     // Next target slot (glowing cyan outline)
    Filled,     // Contains a placed letter
    Revealed,   // Revealed and locked by hint (glowing amber gold border & accent)
    Correct,    // Validated word
    Incorrect   // Validated wrong word
}

// ============================================================================
// 12. LETTER TILE (Tactile Interactive 3D Arabic Puzzle Tile)
// ============================================================================

@Composable
fun MadaratLetterTile(
    letter: String,
    state: LetterTileState,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    size: Dp = GameTileMetrics.defaultTileSize,
    compact: Boolean = false,
    testTag: String = "letter_tile"
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isHardwarePressed by interactionSource.collectIsPressedAsState()
    val isPressed = isHardwarePressed || state == LetterTileState.Pressed

    // Physical 3D Elevation & Scale
    val animatedElevation by animateDpAsState(
        targetValue = when {
            state == LetterTileState.Placed || state == LetterTileState.Disabled -> GameElevation.flat
            isPressed -> GameElevation.tilePressed
            else -> GameElevation.tileResting
        },
        label = "tile_elevation"
    )

    val animatedScale by animateFloatAsState(
        targetValue = when {
            isPressed -> 0.93f
            state == LetterTileState.Selected -> 1.05f
            state == LetterTileState.Placed -> 0.88f
            else -> 1.0f
        },
        animationSpec = spring(dampingRatio = 0.65f),
        label = "tile_scale"
    )

    // Dynamic State Colors
    val surfaceColor by animateColorAsState(
        targetValue = when (state) {
            LetterTileState.Available -> CelestialSurfaceElevated
            LetterTileState.Pressed -> AmberGoldPrimary
            LetterTileState.Selected -> AmberGoldPrimary
            LetterTileState.Placed -> CelestialNavyMedium
            LetterTileState.Correct -> EmeraldSuccess
            LetterTileState.Incorrect -> CrimsonNovaError
            LetterTileState.Disabled -> DisabledElement
        },
        label = "tile_surface_color"
    )

    val textColor by animateColorAsState(
        targetValue = when (state) {
            LetterTileState.Available -> PearlIvory
            LetterTileState.Pressed, LetterTileState.Selected -> CelestialNavyDark
            LetterTileState.Placed -> DimmedStarlight
            LetterTileState.Correct -> PearlIvory
            LetterTileState.Incorrect -> PearlIvory
            LetterTileState.Disabled -> DimmedStarlight
        },
        label = "tile_text_color"
    )

    val borderColor by animateColorAsState(
        targetValue = when (state) {
            LetterTileState.Available -> CosmicBorder
            LetterTileState.Selected -> GoldGlowBorder
            LetterTileState.Correct -> EmeraldSuccess
            LetterTileState.Incorrect -> CrimsonNovaError
            LetterTileState.Placed -> DisabledElement
            else -> Color.Transparent
        },
        label = "tile_border"
    )

    val isInteractive = state == LetterTileState.Available || state == LetterTileState.Selected

    Box(
        modifier = modifier
            .testTag(testTag)
            .size(size)
            .scale(animatedScale)
            .shadow(
                elevation = animatedElevation,
                shape = GameCornerRadius.shapeTile,
                spotColor = AmberGoldPrimary
            )
            .clip(GameCornerRadius.shapeTile)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        surfaceColor,
                        surfaceColor.copy(alpha = 0.85f)
                    )
                )
            )
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = isInteractive,
                role = Role.Button,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        // Inner Bevel Highlight
        Box(
            modifier = Modifier
                .matchParentSize()
                .padding(1.dp)
                .clip(RoundedCornerShape(13.dp))
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.White.copy(alpha = if (state == LetterTileState.Available) 0.15f else 0.05f),
                            Color.Transparent
                        )
                    )
                )
        )

        // Letter Typography
        Text(
            text = letter,
            style = if (compact) GameTypography.LetterTileCompact else GameTypography.LetterTile,
            color = textColor
        )
    }
}

// ============================================================================
// 13. ANSWER SLOT (Upper Word Discovery Slot)
// ============================================================================

@Composable
fun MadaratAnswerSlot(
    letter: String?,
    state: AnswerSlotState,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    size: Dp = GameTileMetrics.defaultTileSize,
    compact: Boolean = false,
    testTag: String = "answer_slot"
) {
    val borderColor by animateColorAsState(
        targetValue = when (state) {
            AnswerSlotState.Empty -> DisabledElement
            AnswerSlotState.Active -> EtherealCyanLight
            AnswerSlotState.Filled -> AmberGoldPrimary
            AnswerSlotState.Revealed -> AmberGoldLight
            AnswerSlotState.Correct -> EmeraldSuccess
            AnswerSlotState.Incorrect -> CrimsonNovaError
        },
        label = "slot_border"
    )

    val surfaceColor by animateColorAsState(
        targetValue = when (state) {
            AnswerSlotState.Empty -> CelestialNavyMedium.copy(alpha = 0.6f)
            AnswerSlotState.Active -> CelestialSurface.copy(alpha = 0.9f)
            AnswerSlotState.Filled -> CelestialSurfaceElevated
            AnswerSlotState.Revealed -> AmberGoldPrimary.copy(alpha = 0.22f)
            AnswerSlotState.Correct -> EmeraldSuccess.copy(alpha = 0.25f)
            AnswerSlotState.Incorrect -> CrimsonNovaError.copy(alpha = 0.25f)
        },
        label = "slot_bg"
    )

    Surface(
        onClick = onClick,
        enabled = state == AnswerSlotState.Filled || state == AnswerSlotState.Incorrect,
        shape = GameCornerRadius.shapeTile,
        color = surfaceColor,
        border = BorderStroke(if (state == AnswerSlotState.Active || state == AnswerSlotState.Revealed) 2.dp else 1.2.dp, borderColor),
        shadowElevation = if (state == AnswerSlotState.Filled || state == AnswerSlotState.Revealed) GameElevation.low else GameElevation.flat,
        modifier = modifier
            .testTag(testTag)
            .size(size)
    ) {
        Box(contentAlignment = Alignment.Center) {
            if (!letter.isNullOrEmpty()) {
                Text(
                    text = letter,
                    style = if (compact) GameTypography.LetterTileCompact else GameTypography.LetterTile,
                    color = when (state) {
                        AnswerSlotState.Correct -> EmeraldSuccess
                        AnswerSlotState.Incorrect -> CrimsonNovaError
                        AnswerSlotState.Revealed -> AmberGoldLight
                        else -> PearlIvory
                    }
                )
            } else if (state == AnswerSlotState.Active) {
                // Subtle glowing indicator for active typing position
                Box(
                    modifier = Modifier
                        .size(width = 16.dp, height = 3.dp)
                        .clip(RoundedCornerShape(2.dp))
                        .background(EtherealCyanLight)
                        .align(Alignment.BottomCenter)
                        .offset(y = (-8).dp)
                )
            }

            if (state == AnswerSlotState.Revealed) {
                // Subtle golden locked accent indicator at top corner
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(5.dp)
                        .size(6.dp)
                        .clip(RoundedCornerShape(3.dp))
                        .background(AmberGoldLight)
                )
            }
        }
    }
}
