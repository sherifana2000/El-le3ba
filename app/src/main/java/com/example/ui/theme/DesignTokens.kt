package com.example.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// ============================================================================
// CELESTIAL ATLAS / مدارات المعرفة — DESIGN TOKENS
// ============================================================================

object GameSpacing {
    val xxs: Dp = 2.dp
    val xs: Dp = 4.dp
    val sm: Dp = 8.dp
    val md: Dp = 12.dp
    val lg: Dp = 16.dp
    val xl: Dp = 20.dp
    val xxl: Dp = 24.dp
    val xxxl: Dp = 32.dp
    val screenPadding: Dp = 16.dp
}

object GameCornerRadius {
    val none: Dp = 0.dp
    val xs: Dp = 4.dp
    val sm: Dp = 8.dp
    val md: Dp = 12.dp
    val lg: Dp = 16.dp
    val xl: Dp = 20.dp
    val tile: Dp = 14.dp
    val button: Dp = 16.dp
    val card: Dp = 22.dp
    val pill: Dp = 999.dp

    val shapeSm = RoundedCornerShape(sm)
    val shapeMd = RoundedCornerShape(md)
    val shapeLg = RoundedCornerShape(lg)
    val shapeTile = RoundedCornerShape(tile)
    val shapeButton = RoundedCornerShape(button)
    val shapeCard = RoundedCornerShape(card)
    val shapePill = RoundedCornerShape(pill)
}

object GameElevation {
    val flat: Dp = 0.dp
    val low: Dp = 2.dp
    val medium: Dp = 4.dp
    val high: Dp = 8.dp
    val tileResting: Dp = 4.dp
    val tilePressed: Dp = 1.dp
    val modal: Dp = 16.dp
}

object GameTileMetrics {
    val minTileSize: Dp = 48.dp
    val defaultTileSize: Dp = 54.dp
    val largeTileSize: Dp = 60.dp
    val tileSpacing: Dp = 6.dp
    val answerSlotSpacing: Dp = 6.dp
}
