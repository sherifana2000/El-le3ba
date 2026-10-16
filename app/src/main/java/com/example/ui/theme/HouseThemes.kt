package com.example.ui.theme

import androidx.compose.ui.graphics.Color

data class HouseTheme(
    val categoryId: String,
    val arabicTitle: String,
    val iconEmoji: String,
    val primaryColor: Color,
    val secondaryColor: Color,
    val backgroundGradient: List<Color>,
    val accentGlow: Color,
    val patternSymbol: String
)

object HouseThemes {
    val Astronomy = HouseTheme(
        categoryId = "astronomy",
        arabicTitle = "الفضاء والفلك",
        iconEmoji = "🌌",
        primaryColor = Color(0xFF6366F1),
        secondaryColor = Color(0xFFA855F7),
        backgroundGradient = listOf(Color(0xFF070B19), Color(0xFF131038), Color(0xFF090D24)),
        accentGlow = Color(0xFF818CF8),
        patternSymbol = "🪐"
    )
    val Science = HouseTheme(
        categoryId = "science",
        arabicTitle = "العلوم والطبيعة",
        iconEmoji = "🔬",
        primaryColor = Color(0xFF10B981),
        secondaryColor = Color(0xFF06B6D4),
        backgroundGradient = listOf(Color(0xFF041712), Color(0xFF0A2E24), Color(0xFF06181A)),
        accentGlow = Color(0xFF34D399),
        patternSymbol = "⚛️"
    )
    val History = HouseTheme(
        categoryId = "history",
        arabicTitle = "التاريخ والحضارات",
        iconEmoji = "🏛️",
        primaryColor = Color(0xFFD97706),
        secondaryColor = Color(0xFFB45309),
        backgroundGradient = listOf(Color(0xFF191104), Color(0xFF2E1F0A), Color(0xFF1A1208)),
        accentGlow = Color(0xFFFBBF24),
        patternSymbol = "📜"
    )
    val Geography = HouseTheme(
        categoryId = "geography",
        arabicTitle = "الجغرافيا والعالم",
        iconEmoji = "🌍",
        primaryColor = Color(0xFF0284C7),
        secondaryColor = Color(0xFF0D9488),
        backgroundGradient = listOf(Color(0xFF041421), Color(0xFF072638), Color(0xFF051724)),
        accentGlow = Color(0xFF38BDF8),
        patternSymbol = "🧭"
    )
    val Cars = HouseTheme(
        categoryId = "cars",
        arabicTitle = "السيارات والاختراعات",
        iconEmoji = "🚗",
        primaryColor = Color(0xFFE11D48),
        secondaryColor = Color(0xFFBE123C),
        backgroundGradient = listOf(Color(0xFF1A060A), Color(0xFF300C14), Color(0xFF1A070E)),
        accentGlow = Color(0xFFFB7185),
        patternSymbol = "🏎️"
    )
    val ArabicLiterature = HouseTheme(
        categoryId = "arabic_literature",
        arabicTitle = "اللغة العربية والأدب",
        iconEmoji = "📜",
        primaryColor = Color(0xFF8B5CF6),
        secondaryColor = Color(0xFFD97706),
        backgroundGradient = listOf(Color(0xFF120A24), Color(0xFF241542), Color(0xFF140D26)),
        accentGlow = Color(0xFFA78BFA),
        patternSymbol = "✒️"
    )
    val MathLogic = HouseTheme(
        categoryId = "math_logic",
        arabicTitle = "الرياضيات والمنطق",
        iconEmoji = "📐",
        primaryColor = Color(0xFF2563EB),
        secondaryColor = Color(0xFF7C3AED),
        backgroundGradient = listOf(Color(0xFF061126), Color(0xFF0D2147), Color(0xFF07142E)),
        accentGlow = Color(0xFF60A5FA),
        patternSymbol = "🔢"
    )
    val Landmarks = HouseTheme(
        categoryId = "landmarks",
        arabicTitle = "المعالم والأماكن",
        iconEmoji = "🕌",
        primaryColor = Color(0xFFCA8A04),
        secondaryColor = Color(0xFFEA580C),
        backgroundGradient = listOf(Color(0xFF170F03), Color(0xFF2E2008), Color(0xFF181206)),
        accentGlow = Color(0xFFFACC15),
        patternSymbol = "🗼"
    )
    val Animals = HouseTheme(
        categoryId = "animals",
        arabicTitle = "عالم الحيوان",
        iconEmoji = "🦅",
        primaryColor = Color(0xFF059669),
        secondaryColor = Color(0xFF65A30D),
        backgroundGradient = listOf(Color(0xFF04170E), Color(0xFF0C2B1C), Color(0xFF061C12)),
        accentGlow = Color(0xFF34D399),
        patternSymbol = "🐬"
    )
    val Inventions = HouseTheme(
        categoryId = "inventions",
        arabicTitle = "الاختراعات والاكتشافات",
        iconEmoji = "💡",
        primaryColor = Color(0xFFEA580C),
        secondaryColor = Color(0xFFF59E0B),
        backgroundGradient = listOf(Color(0xFF1A0C03), Color(0xFF331A08), Color(0xFF1C0E05)),
        accentGlow = Color(0xFFFB923C),
        patternSymbol = "⚙️"
    )
    val Mysteries = HouseTheme(
        categoryId = "mysteries",
        arabicTitle = "الألغاز والتحقيق",
        iconEmoji = "🔍",
        primaryColor = Color(0xFF7C3AED),
        secondaryColor = Color(0xFFDB2777),
        backgroundGradient = listOf(Color(0xFF130621), Color(0xFF290E45), Color(0xFF140824)),
        accentGlow = Color(0xFFA855F7),
        patternSymbol = "🗝️"
    )
    val GeneralKnowledge = HouseTheme(
        categoryId = "general_knowledge",
        arabicTitle = "الثقافة والمعرفة العامة",
        iconEmoji = "📚",
        primaryColor = Color(0xFF0891B2),
        secondaryColor = Color(0xFF4F46E5),
        backgroundGradient = listOf(Color(0xFF04151B), Color(0xFF0A2B36), Color(0xFF061820)),
        accentGlow = Color(0xFF22D3EE),
        patternSymbol = "🌐"
    )

    fun getThemeForCategory(categoryId: String): HouseTheme {
        return when (categoryId) {
            "astronomy" -> Astronomy
            "science" -> Science
            "history" -> History
            "geography" -> Geography
            "cars" -> Cars
            "arabic_literature", "arabic_language" -> ArabicLiterature
            "math_logic" -> MathLogic
            "landmarks" -> Landmarks
            "animals" -> Animals
            "inventions" -> Inventions
            "mysteries" -> Mysteries
            "general_knowledge" -> GeneralKnowledge
            else -> Astronomy
        }
    }
}
