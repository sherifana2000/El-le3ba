package com.example.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CleaningServices
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
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
import com.example.ui.theme.EmeraldSuccess
import com.example.ui.theme.EtherealCyan
import com.example.ui.theme.EtherealCyanLight
import com.example.ui.theme.GameCornerRadius
import com.example.ui.theme.GameElevation
import com.example.ui.theme.GameSpacing
import com.example.ui.theme.PearlIvory
import com.example.ui.theme.StarlightSilver
import com.example.ui.theme.Typography

// ============================================================================
// 1. PRIMARY BUTTON (Amber Gold Tactile 3D Button)
// ============================================================================

@Composable
fun MadaratPrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    enabled: Boolean = true,
    testTag: String = "primary_button"
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(targetValue = if (isPressed) 0.96f else 1f, label = "button_scale")

    val bgGradient = if (enabled) {
        Brush.verticalGradient(
            colors = listOf(AmberGoldLight, AmberGoldPrimary, AmberGoldDark)
        )
    } else {
        Brush.verticalGradient(
            colors = listOf(DisabledElement, CelestialNavyDark)
        )
    }

    Box(
        modifier = modifier
            .testTag(testTag)
            .scale(scale)
            .shadow(
                elevation = if (enabled) (if (isPressed) GameElevation.low else GameElevation.medium) else GameElevation.flat,
                shape = GameCornerRadius.shapeButton
            )
            .background(brush = bgGradient, shape = GameCornerRadius.shapeButton)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = enabled,
                role = Role.Button,
                onClick = onClick
            )
            .defaultMinSize(minWidth = 140.dp, minHeight = 52.dp)
            .padding(horizontal = GameSpacing.xl, vertical = GameSpacing.md),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            if (icon != null) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = if (enabled) CelestialNavyDark else DimmedStarlight,
                    modifier = Modifier
                        .padding(end = GameSpacing.sm)
                        .size(20.dp)
                )
            }
            Text(
                text = text,
                style = Typography.labelLarge,
                color = if (enabled) CelestialNavyDark else DimmedStarlight
            )
        }
    }
}

// ============================================================================
// 2. SECONDARY BUTTON (Deep Navy Elevated with Cyan Border)
// ============================================================================

@Composable
fun MadaratSecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    enabled: Boolean = true,
    testTag: String = "secondary_button"
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(targetValue = if (isPressed) 0.97f else 1f, label = "btn_scale")

    Surface(
        onClick = onClick,
        enabled = enabled,
        shape = GameCornerRadius.shapeButton,
        color = if (enabled) CelestialSurfaceElevated else CelestialSurface,
        border = BorderStroke(1.2.dp, if (enabled) CosmicBorder else Color.Transparent),
        shadowElevation = if (enabled) GameElevation.low else GameElevation.flat,
        modifier = modifier
            .testTag(testTag)
            .scale(scale)
            .defaultMinSize(minWidth = 120.dp, minHeight = 50.dp)
    ) {
        Row(
            modifier = Modifier.padding(horizontal = GameSpacing.lg, vertical = GameSpacing.md),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            if (icon != null) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = if (enabled) EtherealCyanLight else DimmedStarlight,
                    modifier = Modifier
                        .padding(end = GameSpacing.sm)
                        .size(18.dp)
                )
            }
            Text(
                text = text,
                style = Typography.labelLarge,
                color = if (enabled) PearlIvory else DimmedStarlight
            )
        }
    }
}

// ============================================================================
// 3. ICON BUTTON (Circular / Rounded Tactile Pill)
// ============================================================================

@Composable
fun MadaratIconButton(
    icon: ImageVector,
    contentDescription: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tint: Color = PearlIvory,
    backgroundColor: Color = CelestialSurfaceElevated,
    enabled: Boolean = true,
    testTag: String = "icon_button"
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(targetValue = if (isPressed) 0.92f else 1f, label = "icon_scale")

    Surface(
        onClick = onClick,
        enabled = enabled,
        shape = GameCornerRadius.shapeLg,
        color = if (enabled) backgroundColor else CelestialSurface,
        border = BorderStroke(1.dp, if (enabled) CosmicBorder else Color.Transparent),
        shadowElevation = if (enabled) GameElevation.low else GameElevation.flat,
        modifier = modifier
            .testTag(testTag)
            .scale(scale)
            .size(48.dp)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
                tint = if (enabled) tint else DimmedStarlight,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

// ============================================================================
// 4. LOCKED BUTTON (Displays Lock State with Requirements)
// ============================================================================

@Composable
fun MadaratLockedButton(
    title: String,
    requiredDescription: String,
    modifier: Modifier = Modifier,
    onClickLocked: () -> Unit = {},
    testTag: String = "locked_button"
) {
    Surface(
        onClick = onClickLocked,
        shape = GameCornerRadius.shapeButton,
        color = CelestialNavyMedium,
        border = BorderStroke(1.dp, DisabledElement),
        modifier = modifier
            .testTag(testTag)
            .defaultMinSize(minHeight = 52.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(horizontal = GameSpacing.lg, vertical = GameSpacing.md),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "مقفل",
                    tint = StarlightSilver,
                    modifier = Modifier
                        .size(18.dp)
                        .padding(end = GameSpacing.xs)
                )
                Text(
                    text = title,
                    style = Typography.labelLarge,
                    color = StarlightSilver
                )
            }
            Text(
                text = requiredDescription,
                style = Typography.labelSmall,
                color = AmberGoldPrimary
            )
        }
    }
}

// ============================================================================
// 5. DISABLED BUTTON
// ============================================================================

@Composable
fun MadaratDisabledButton(
    text: String,
    modifier: Modifier = Modifier,
    testTag: String = "disabled_button"
) {
    Surface(
        shape = GameCornerRadius.shapeButton,
        color = CelestialNavyMedium,
        border = BorderStroke(1.dp, DisabledElement),
        modifier = modifier
            .testTag(testTag)
            .defaultMinSize(minWidth = 120.dp, minHeight = 50.dp)
    ) {
        Box(
            modifier = Modifier.padding(horizontal = GameSpacing.lg, vertical = GameSpacing.md),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                style = Typography.labelLarge,
                color = DimmedStarlight
            )
        }
    }
}

// ============================================================================
// 6. ASSISTANCE CHIP & BAR (Hints & Strategic Aids)
// ============================================================================

@Composable
fun MadaratAssistanceChip(
    text: String,
    icon: ImageVector,
    cost: Int,
    isUsed: Boolean,
    isEnabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    testTag: String = "assistance_chip"
) {
    val canInteract = isEnabled && !isUsed

    val surfaceColor = when {
        isUsed -> CelestialNavyDark.copy(alpha = 0.55f)
        canInteract -> CelestialSurfaceElevated.copy(alpha = 0.85f)
        else -> CelestialNavyMedium.copy(alpha = 0.35f)
    }

    val borderColor = when {
        isUsed -> EmeraldSuccess.copy(alpha = 0.35f)
        canInteract -> EtherealCyan.copy(alpha = 0.45f)
        else -> CosmicBorder.copy(alpha = 0.25f)
    }

    Surface(
        onClick = onClick,
        enabled = canInteract,
        shape = GameCornerRadius.shapePill,
        color = surfaceColor,
        border = BorderStroke(1.dp, borderColor),
        modifier = modifier
            .testTag(testTag)
            .defaultMinSize(minHeight = 44.dp)
    ) {
        Row(
            modifier = Modifier.padding(horizontal = GameSpacing.sm, vertical = GameSpacing.xs),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = if (isUsed) Icons.Default.Check else icon,
                contentDescription = null,
                tint = when {
                    isUsed -> EmeraldSuccess
                    canInteract -> EtherealCyanLight
                    else -> DisabledElement
                },
                modifier = Modifier.size(16.dp)
            )

            Text(
                text = text,
                style = Typography.labelSmall,
                color = when {
                    isUsed -> DimmedStarlight
                    canInteract -> PearlIvory
                    else -> DisabledElement
                },
                modifier = Modifier.padding(horizontal = 4.dp)
            )

            Text(
                text = if (isUsed) "تم" else "-$cost",
                style = Typography.labelSmall,
                color = when {
                    isUsed -> EmeraldSuccess
                    canInteract -> AmberGoldPrimary
                    else -> DisabledElement
                }
            )
        }
    }
}

@Composable
fun MadaratAssistanceBar(
    canReveal: Boolean,
    isRevealUsed: Boolean,
    onRevealLetter: () -> Unit,
    canRemoveWrong: Boolean,
    isRemoveWrongUsed: Boolean,
    onRemoveWrongLetters: () -> Unit,
    canShowHint: Boolean,
    isHintUsed: Boolean,
    onShowHint: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .testTag("assistance_bar"),
        horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs),
        verticalAlignment = Alignment.CenterVertically
    ) {
        MadaratAssistanceChip(
            text = "تلميح",
            icon = Icons.Default.Lightbulb,
            cost = 1,
            isUsed = isHintUsed,
            isEnabled = canShowHint,
            onClick = onShowHint,
            modifier = Modifier.weight(1f),
            testTag = "hint_show_hint"
        )

        MadaratAssistanceChip(
            text = "حذف حروف",
            icon = Icons.Default.CleaningServices,
            cost = 2,
            isUsed = isRemoveWrongUsed,
            isEnabled = canRemoveWrong,
            onClick = onRemoveWrongLetters,
            modifier = Modifier.weight(1f),
            testTag = "hint_remove_letters"
        )

        MadaratAssistanceChip(
            text = "كشف حرف",
            icon = Icons.Default.AutoAwesome,
            cost = 3,
            isUsed = isRevealUsed,
            isEnabled = canReveal,
            onClick = onRevealLetter,
            modifier = Modifier.weight(1f),
            testTag = "hint_reveal_letter"
        )
    }
}

