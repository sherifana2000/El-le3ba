package com.example.ui.components

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
import androidx.compose.material.icons.filled.DeleteSweep
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material.icons.filled.Vibration
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.AmberGoldDark
import com.example.ui.theme.AmberGoldLight
import com.example.ui.theme.AmberGoldPrimary
import com.example.ui.theme.CelestialNavyDark
import com.example.ui.theme.CelestialSurfaceElevated
import com.example.ui.theme.CosmicBorder
import com.example.ui.theme.CrimsonNovaError
import com.example.ui.theme.GameCornerRadius
import com.example.ui.theme.GameElevation
import com.example.ui.theme.GameSpacing
import com.example.ui.theme.PearlIvory
import com.example.ui.theme.StarlightSilver
import com.example.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MadaratSettingsDialog(
    onDismissRequest: () -> Unit,
    onResetProgress: () -> Unit,
    modifier: Modifier = Modifier,
    appVersion: String = "Beta 0.1.0"
) {
    var soundEnabled by remember { mutableStateOf(true) }
    var hapticsEnabled by remember { mutableStateOf(true) }
    var showConfirmReset by remember { mutableStateOf(false) }

    BasicAlertDialog(
        onDismissRequest = onDismissRequest,
        modifier = modifier.testTag("madarat_settings_dialog")
    ) {
        Surface(
            shape = GameCornerRadius.shapeLg,
            color = CelestialSurfaceElevated,
            border = androidx.compose.foundation.BorderStroke(1.2.dp, CosmicBorder),
            shadowElevation = GameElevation.high
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(GameSpacing.lg),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Header
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(AmberGoldPrimary.copy(alpha = 0.2f))
                        .border(1.2.dp, AmberGoldPrimary.copy(alpha = 0.5f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "أيقونة الإعدادات",
                        tint = AmberGoldLight,
                        modifier = Modifier.size(26.dp)
                    )
                }

                Spacer(modifier = Modifier.height(GameSpacing.sm))

                Text(
                    text = "إعدادات مدارات",
                    style = Typography.titleLarge,
                    color = PearlIvory
                )

                MadaratStatusBadge(
                    text = "الإصدار التجريبي $appVersion",
                    type = StatusBadgeType.Info,
                    modifier = Modifier.padding(top = 4.dp, bottom = GameSpacing.md)
                )

                if (showConfirmReset) {
                    // Confirmation View for Reset
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(GameCornerRadius.shapeMd)
                            .background(CelestialNavyDark.copy(alpha = 0.7f))
                            .border(1.dp, CrimsonNovaError.copy(alpha = 0.5f), GameCornerRadius.shapeMd)
                            .padding(GameSpacing.md),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "هل أنت متأكد من مسح جميع الإحصائيات المحفوظة للبيوت المعرفية؟",
                            style = Typography.bodyMedium.copy(lineHeight = 22.sp),
                            color = PearlIvory,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(GameSpacing.md))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(GameSpacing.sm)
                        ) {
                            MadaratSecondaryButton(
                                text = "إلغاء",
                                onClick = { showConfirmReset = false },
                                modifier = Modifier.weight(1f)
                            )
                            MadaratPrimaryButton(
                                text = "تأكيد المسح",
                                onClick = {
                                    onResetProgress()
                                    showConfirmReset = false
                                    onDismissRequest()
                                },
                                modifier = Modifier.weight(1f),
                                testTag = "confirm_reset_progress_button"
                            )
                        }
                    }
                } else {
                    // Standard Options List
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(GameSpacing.sm)
                    ) {
                        // Sound FX Toggle
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(GameCornerRadius.shapeMd)
                                .background(CelestialNavyDark.copy(alpha = 0.5f))
                                .border(1.dp, CosmicBorder.copy(alpha = 0.5f), GameCornerRadius.shapeMd)
                                .padding(horizontal = GameSpacing.md, vertical = GameSpacing.sm),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(GameSpacing.sm)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.VolumeUp,
                                    contentDescription = null,
                                    tint = AmberGoldLight,
                                    modifier = Modifier.size(20.dp)
                                )
                                Column {
                                    Text(text = "المؤثرات الصوتية", style = Typography.bodyMedium, color = PearlIvory)
                                    Text(text = "أصوات حركة الحروف والحل", style = Typography.labelSmall, color = StarlightSilver)
                                }
                            }
                            Switch(
                                checked = soundEnabled,
                                onCheckedChange = { soundEnabled = it },
                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = AmberGoldPrimary,
                                    checkedTrackColor = AmberGoldDark,
                                    uncheckedThumbColor = StarlightSilver,
                                    uncheckedTrackColor = CelestialNavyDark
                                ),
                                modifier = Modifier.testTag("sound_switch")
                            )
                        }

                        // Haptics Toggle
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(GameCornerRadius.shapeMd)
                                .background(CelestialNavyDark.copy(alpha = 0.5f))
                                .border(1.dp, CosmicBorder.copy(alpha = 0.5f), GameCornerRadius.shapeMd)
                                .padding(horizontal = GameSpacing.md, vertical = GameSpacing.sm),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(GameSpacing.sm)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Vibration,
                                    contentDescription = null,
                                    tint = AmberGoldLight,
                                    modifier = Modifier.size(20.dp)
                                )
                                Column {
                                    Text(text = "التفاعل اللمسي", style = Typography.bodyMedium, color = PearlIvory)
                                    Text(text = "اهتزاز لطيف عند النقر", style = Typography.labelSmall, color = StarlightSilver)
                                }
                            }
                            Switch(
                                checked = hapticsEnabled,
                                onCheckedChange = { hapticsEnabled = it },
                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = AmberGoldPrimary,
                                    checkedTrackColor = AmberGoldDark,
                                    uncheckedThumbColor = StarlightSilver,
                                    uncheckedTrackColor = CelestialNavyDark
                                ),
                                modifier = Modifier.testTag("haptics_switch")
                            )
                        }

                        // Reset Progress Button
                        MadaratSecondaryButton(
                            text = "إعادة ضبط السجل والتقدم",
                            icon = Icons.Default.DeleteSweep,
                            onClick = { showConfirmReset = true },
                            modifier = Modifier.fillMaxWidth(),
                            testTag = "reset_progress_button"
                        )
                    }

                    Spacer(modifier = Modifier.height(GameSpacing.md))

                    // Close Button
                    MadaratPrimaryButton(
                        text = "إغلاق",
                        onClick = onDismissRequest,
                        modifier = Modifier.fillMaxWidth(),
                        testTag = "close_settings_button"
                    )
                }
            }
        }
    }
}
