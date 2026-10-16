package com.example.data.model

enum class GameDifficulty(
    val titleArabic: String,
    val descriptionArabic: String,
    val distractorCount: Int,
    val pointMultiplier: Float,
    val badgeEmoji: String
) {
    EXPLORATION(
        titleArabic = "الاستكشاف",
        descriptionArabic = "أسئلة مباشرة مع تلميحات واضحة للمبتدئين",
        distractorCount = 2,
        pointMultiplier = 1.0f,
        badgeEmoji = "🧭"
    ),
    THINKING(
        titleArabic = "التفكير",
        descriptionArabic = "أسئلة تتطلب الربط والاستنتاج الذهني",
        distractorCount = 4,
        pointMultiplier = 1.25f,
        badgeEmoji = "💡"
    ),
    CHALLENGE(
        titleArabic = "التحدي",
        descriptionArabic = "أسئلة دقيقة مع مشتتات متعددة",
        distractorCount = 6,
        pointMultiplier = 1.5f,
        badgeEmoji = "⚔️"
    ),
    EXPERT(
        titleArabic = "الخبير",
        descriptionArabic = "ألغاز عميقة وقرائن لغوية للمحترفين",
        distractorCount = 8,
        pointMultiplier = 2.0f,
        badgeEmoji = "👑"
    )
}
