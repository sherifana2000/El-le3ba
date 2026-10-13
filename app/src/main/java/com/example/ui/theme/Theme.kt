package com.example.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection

// ============================================================================
// CELESTIAL ATLAS / مدارات المعرفة — THEME
// ============================================================================

val CelestialAtlasColorScheme = darkColorScheme(
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

@Composable
fun MadaratTheme(
    forceRtl: Boolean = true,
    content: @Composable () -> Unit
) {
    val layoutDirection = if (forceRtl) LayoutDirection.Rtl else LocalLayoutDirection.current

    CompositionLocalProvider(LocalLayoutDirection provides layoutDirection) {
        MaterialTheme(
            colorScheme = CelestialAtlasColorScheme,
            typography = Typography,
            content = content
        )
    }
}

// Backward compatibility alias
@Composable
fun MyApplicationTheme(content: @Composable () -> Unit) = MadaratTheme(content = content)
