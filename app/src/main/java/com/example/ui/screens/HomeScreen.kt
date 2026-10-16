package com.example.ui.screens

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.ui.components.MadaratCounter
import com.example.ui.components.MadaratIconButton
import com.example.ui.components.MadaratPrimaryButton
import com.example.ui.components.MadaratProgressBar
import com.example.ui.components.MadaratSecondaryButton
import com.example.ui.theme.AmberGoldDark
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
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
import com.example.ui.theme.GameTypography
import com.example.ui.theme.GoldGlowBorder
import com.example.ui.theme.MysticalPurple
import com.example.ui.theme.MysticalPurpleLight
import com.example.ui.theme.PearlIvory
import com.example.ui.theme.StarlightSilver
import com.example.ui.theme.SupernovaReward
import com.example.ui.theme.Typography

// ============================================================================
// PHASE 6 — HOME SCREEN (PORTRAIT MOBILE EXPERIENCE)
// ============================================================================

@Composable
fun HomeScreen(
    onPlayClick: () -> Unit = {},
    onExploreWorldsClick: () -> Unit = {},
    onSettingsClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    // Subtle living celestial pulse animation for the hero orb
    val infiniteTransition = rememberInfiniteTransition(label = "celestial_orbit")
    val orbitPulse by infiniteTransition.animateFloat(
        initialValue = 0.98f,
        targetValue = 1.02f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 3200, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulse_scale"
    )

    val haloAlpha by infiniteTransition.animateFloat(
        initialValue = 0.28f,
        targetValue = 0.48f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 2600, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "halo_glow"
    )

    val slowRotation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 48000, easing = androidx.compose.animation.core.LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "slow_orbit_rotation"
    )

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
            .testTag("home_screen")
    ) {
        // Atmospheric Celestial Dust & Constellation Background Canvas
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            // Soft atmospheric celestial ambient glows
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(EtherealCyan.copy(alpha = 0.09f), Color.Transparent),
                    center = Offset(width * 0.8f, height * 0.22f),
                    radius = width * 0.65f
                )
            )

            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(AmberGoldPrimary.copy(alpha = 0.07f), Color.Transparent),
                    center = Offset(width * 0.25f, height * 0.42f),
                    radius = width * 0.55f
                )
            )

            // Constellation line guides in the upper celestial quadrant
            drawLine(
                color = CosmicBorder.copy(alpha = 0.18f),
                start = Offset(width * 0.12f, height * 0.14f),
                end = Offset(width * 0.38f, height * 0.20f),
                strokeWidth = 1.2f
            )
            drawLine(
                color = CosmicBorder.copy(alpha = 0.18f),
                start = Offset(width * 0.38f, height * 0.20f),
                end = Offset(width * 0.86f, height * 0.16f),
                strokeWidth = 1.2f
            )

            // Faint starlight nodes
            drawCircle(
                color = PearlIvory.copy(alpha = 0.45f),
                center = Offset(width * 0.12f, height * 0.14f),
                radius = 2.2f
            )
            drawCircle(
                color = AmberGoldLight.copy(alpha = 0.6f),
                center = Offset(width * 0.38f, height * 0.20f),
                radius = 2.8f
            )
            drawCircle(
                color = EtherealCyanLight.copy(alpha = 0.5f),
                center = Offset(width * 0.86f, height * 0.16f),
                radius = 2.2f
            )
        }

        // Main Scrollable Content (Ensures small phones don't clip)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
                .padding(horizontal = GameSpacing.screenPadding)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // ----------------------------------------------------------------
            // 1. TOP BAR AREA (Brand Identity & Currencies)
            // ----------------------------------------------------------------
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = GameSpacing.sm, bottom = GameSpacing.md),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Game Brand Lockup (Refined presence: 42dp container, clearer typography)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(GameSpacing.sm)
                ) {
                    Box(
                        modifier = Modifier
                            .size(42.dp)
                            .clip(GameCornerRadius.shapeLg)
                            .background(CelestialSurfaceElevated)
                            .border(1.2.dp, AmberGoldPrimary.copy(alpha = 0.45f), GameCornerRadius.shapeLg)
                            .padding(4.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_logo_symbol_vector),
                            contentDescription = null,
                            tint = AmberGoldPrimary,
                            modifier = Modifier.size(28.dp)
                        )
                    }

                    Column {
                        Text(
                            text = "لُغْز وَكَنْز",
                            style = Typography.titleLarge.copy(fontSize = 18.sp, fontWeight = FontWeight.Bold),
                            color = PearlIvory
                        )
                        Text(
                            text = "رحلة المعرفة والألغاز",
                            style = Typography.labelSmall.copy(fontSize = 11.sp),
                            color = EtherealCyanLight
                        )
                    }
                }

                // Currency Counters & Quick Settings
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(GameSpacing.xs)
                ) {
                    MadaratCounter(
                        count = 42,
                        isCoin = false,
                        testTag = "stars_counter"
                    )
                    MadaratCounter(
                        count = 350,
                        isCoin = true,
                        testTag = "coins_counter"
                    )
                    MadaratIconButton(
                        icon = Icons.Default.Settings,
                        contentDescription = "الإعدادات",
                        onClick = onSettingsClick,
                        modifier = Modifier.size(36.dp),
                        testTag = "settings_icon_button"
                    )
                }
            }

            Spacer(modifier = Modifier.height(GameSpacing.xs))

            // ----------------------------------------------------------------
            // 2. MAIN HERO AREA (Celestial Discovery Core / Portal)
            // ----------------------------------------------------------------
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = GameSpacing.xs),
                contentAlignment = Alignment.Center
            ) {
                // Outer Ambient Orbital Halo (Reduced empty space feel)
                Box(
                    modifier = Modifier
                        .size(230.dp)
                        .scale(orbitPulse)
                        .clip(CircleShape)
                        .background(
                            brush = Brush.radialGradient(
                                colors = listOf(
                                    AmberGoldPrimary.copy(alpha = haloAlpha * 0.45f),
                                    EtherealCyan.copy(alpha = haloAlpha * 0.22f),
                                    Color.Transparent
                                )
                            )
                        )
                )

                // Delicate Astrolabe Coordinate Orbit Ring with Starlight Points
                Canvas(
                    modifier = Modifier
                        .size(200.dp)
                        .rotate(slowRotation)
                ) {
                    val radius = size.minDimension / 2f
                    val center = Offset(size.width / 2f, size.height / 2f)

                    // Faint celestial orbit trace
                    drawCircle(
                        color = CosmicBorder.copy(alpha = 0.35f),
                        radius = radius - 10f,
                        center = center,
                        style = Stroke(width = 1f)
                    )

                    // Secondary inner orbit
                    drawCircle(
                        color = EtherealCyan.copy(alpha = 0.2f),
                        radius = radius - 26f,
                        center = center,
                        style = Stroke(width = 0.8f)
                    )

                    // 4 Cardinal Starlight Nodes on the Orbit
                    val angles = listOf(0.0, 90.0, 180.0, 270.0)
                    for (deg in angles) {
                        val rad = Math.toRadians(deg)
                        val orbX = center.x + (radius - 10f) * Math.cos(rad).toFloat()
                        val orbY = center.y + (radius - 10f) * Math.sin(rad).toFloat()
                        drawCircle(
                            color = AmberGoldLight.copy(alpha = 0.8f),
                            radius = 2.4f,
                            center = Offset(orbX, orbY)
                        )
                    }
                }

                // Central Celestial Discovery Portal Surface
                Surface(
                    shape = CircleShape,
                    color = CelestialSurfaceElevated,
                    border = androidx.compose.foundation.BorderStroke(
                        width = 1.8.dp,
                        brush = Brush.sweepGradient(
                            colors = listOf(
                                AmberGoldPrimary,
                                EtherealCyanLight,
                                AmberGoldLight,
                                CosmicBorder,
                                AmberGoldPrimary
                            )
                        )
                    ),
                    shadowElevation = GameElevation.high,
                    modifier = Modifier.size(144.dp)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        // Portal Star Chamber (Deep Cosmic Core with Golden Flare)
                        Box(
                            modifier = Modifier
                                .size(124.dp)
                                .clip(CircleShape)
                                .background(
                                    brush = Brush.radialGradient(
                                        colors = listOf(
                                            AmberGoldPrimary.copy(alpha = 0.25f),
                                            CelestialNavyDark,
                                            Color(0xFF060B18)
                                        )
                                    )
                                )
                                .border(1.dp, CosmicBorder.copy(alpha = 0.5f), CircleShape)
                        )

                        // Central Scaled Brand Vector Inside Portal
                        Icon(
                            painter = painterResource(id = R.drawable.ic_logo_symbol_vector),
                            contentDescription = "شعار لغز وكنز",
                            tint = Color.Unspecified,
                            modifier = Modifier.size(92.dp)
                        )
                    }
                }
            }

            // Hero Welcoming Title & High-Contrast Exploration Subtitle
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(horizontal = GameSpacing.md, vertical = GameSpacing.xs)
            ) {
                Text(
                    text = "فكّ الألغاز واجمع الكنوز",
                    style = Typography.headlineMedium,
                    color = PearlIvory
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "اكتشف أسرار البيوت واستخرج الكنوز المعرفية",
                    style = Typography.bodyMedium.copy(lineHeight = 22.sp),
                    color = Color(0xFFCBD5E1) // Enhanced Slate-300 contrast while keeping secondary hierarchy
                )
            }

            Spacer(modifier = Modifier.height(GameSpacing.md))

            // ----------------------------------------------------------------
            // 3. PRIMARY ACTION (Prominent, High-Priority Tactile Button)
            // ----------------------------------------------------------------
            MadaratPrimaryButton(
                text = "ابدأ اللعب",
                icon = Icons.Default.PlayArrow,
                onClick = onPlayClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = GameSpacing.lg),
                testTag = "home_start_game_button"
            )

            Spacer(modifier = Modifier.height(GameSpacing.md))

            // ----------------------------------------------------------------
            // 4. CONTINUE / CURRENT PROGRESS CARD
            // ----------------------------------------------------------------
            Surface(
                onClick = onPlayClick,
                shape = GameCornerRadius.shapeCard,
                color = CelestialSurface,
                border = androidx.compose.foundation.BorderStroke(1.dp, CosmicBorder),
                shadowElevation = GameElevation.medium,
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("home_current_progress_card")
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
                        // Current House Icon Indicator (Cars / Exploration House)
                        Box(
                            modifier = Modifier
                                .size(46.dp)
                                .clip(GameCornerRadius.shapeLg)
                                .background(AmberGoldPrimary.copy(alpha = 0.2f))
                                .border(1.dp, AmberGoldPrimary.copy(alpha = 0.4f), GameCornerRadius.shapeLg),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "🚗",
                                fontSize = 22.sp
                            )
                        }

                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "بيت السيارات",
                                    style = Typography.titleMedium,
                                    color = PearlIvory
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "• اللغز 7",
                                    style = Typography.labelMedium,
                                    color = AmberGoldLight
                                )
                            }
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "التقدم: 14 من 20 لغزاً",
                                style = Typography.bodySmall,
                                color = StarlightSilver
                            )
                        }
                    }

                    // Forward Navigation Hint
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "استمرار",
                        tint = EtherealCyanLight,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(GameSpacing.sm))

            // ----------------------------------------------------------------
            // 5. WORLD / CATEGORIES ACCESS ENTRY
            // ----------------------------------------------------------------
            MadaratSecondaryButton(
                text = "خريطة المغامرة والكنوز (12 بيتاً)",
                icon = Icons.Default.Explore,
                onClick = onExploreWorldsClick,
                modifier = Modifier
                    .fillMaxWidth(),
                testTag = "home_explore_worlds_button"
            )

            Spacer(modifier = Modifier.height(GameSpacing.md))
        }
    }
}
