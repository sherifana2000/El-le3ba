package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection

// ============================================================================
// RIDDLE & TREASURE / لغز وكنز — DUAL THEME (DARK & LIGHT)
// ============================================================================

val LocalThemeIsDark = compositionLocalOf { true }

val RiddleTreasureDarkColorScheme = darkColorScheme(
    primary = AmberGoldPrimary,
    onPrimary = CelestialNavyDark,
    primaryContainer = CelestialSurfaceElevated,
    onPrimaryContainer = AmberGoldLight,

    secondary = EtherealCyan,
    onSecondary = CelestialNavyDark,
    secondaryContainer = CelestialSurface,
    onSecondaryContainer = EtherealCyanLight,

    tertiary = MysticalPurple,
    onTertiary = PearlIvory,
    tertiaryContainer = CelestialSurface,
    onTertiaryContainer = MysticalPurpleLight,

    background = CelestialNavyDark,
    onBackground = PearlIvory,

    surface = CelestialSurface,
    onSurface = PearlIvory,
    surfaceVariant = CelestialSurfaceElevated,
    onSurfaceVariant = StarlightSilver,

    outline = CosmicBorder,
    outlineVariant = DimmedStarlight,

    error = CrimsonNovaError,
    onError = PearlIvory,
    errorContainer = CelestialSurfaceElevated,
    onErrorContainer = CrimsonNovaError
)

val RiddleTreasureLightColorScheme = lightColorScheme(
    primary = AmberGoldPrimary,
    onPrimary = PearlIvory,
    primaryContainer = AmberGoldLight.copy(alpha = 0.2f),
    onPrimaryContainer = AmberGoldDark,

    secondary = EtherealCyanDark,
    onSecondary = PearlIvory,
    secondaryContainer = EtherealCyan.copy(alpha = 0.15f),
    onSecondaryContainer = EtherealCyanDark,

    tertiary = MysticalPurple,
    onTertiary = PearlIvory,
    tertiaryContainer = MysticalPurpleLight.copy(alpha = 0.2f),
    onTertiaryContainer = MysticalPurple,

    background = LightBackground,
    onBackground = LightTextPrimary,

    surface = LightSurface,
    onSurface = LightTextPrimary,
    surfaceVariant = LightBackgroundSecondary,
    onSurfaceVariant = LightTextSecondary,

    outline = LightOutline,
    outlineVariant = LightBorder,

    error = CrimsonNovaError,
    onError = PearlIvory,
    errorContainer = CrimsonNovaError.copy(alpha = 0.15f),
    onErrorContainer = CrimsonNovaError
)

// Legacy alias to guarantee 100% backwards compatibility
val CelestialAtlasColorScheme = RiddleTreasureDarkColorScheme

@Composable
fun MadaratTheme(
    darkTheme: Boolean = true,
    forceRtl: Boolean = true,
    content: @Composable () -> Unit
) {
    val layoutDirection = if (forceRtl) LayoutDirection.Rtl else LocalLayoutDirection.current
    val colorScheme = if (darkTheme) RiddleTreasureDarkColorScheme else RiddleTreasureLightColorScheme

    CompositionLocalProvider(
        LocalLayoutDirection provides layoutDirection,
        LocalThemeIsDark provides darkTheme
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}

// Brand theme alias
@Composable
fun RiddleTreasureTheme(
    darkTheme: Boolean = true,
    forceRtl: Boolean = true,
    content: @Composable () -> Unit
) = MadaratTheme(darkTheme = darkTheme, forceRtl = forceRtl, content = content)

// Backward compatibility alias
@Composable
fun MyApplicationTheme(content: @Composable () -> Unit) = MadaratTheme(content = content)
