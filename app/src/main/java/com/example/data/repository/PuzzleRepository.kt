package com.example.data.repository

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.data.model.PuzzleCategory
import com.example.data.repository.houses.AnimalsChallenges
import com.example.data.repository.houses.ArabicLiteratureChallenges
import com.example.data.repository.houses.AstronomyChallenges
import com.example.data.repository.houses.CarsChallenges
import com.example.data.repository.houses.GeneralKnowledgeChallenges
import com.example.data.repository.houses.GeographyChallenges
import com.example.data.repository.houses.HistoryChallenges
import com.example.data.repository.houses.InventionsChallenges
import com.example.data.repository.houses.LandmarksChallenges
import com.example.data.repository.houses.MathLogicChallenges
import com.example.data.repository.houses.MysteriesChallenges
import com.example.data.repository.houses.ScienceChallenges
import com.example.ui.theme.HouseTheme
import com.example.ui.theme.HouseThemes

/**
 * Scalable in-memory repository providing educational challenges organized across 12 knowledge houses.
 */
object PuzzleRepository {

    private val categoriesList = listOf(
        PuzzleCategory(
            id = "astronomy",
            arabicName = "الفضاء والفلك",
            shortDescription = "الأجرام الكونية والمدارات والنجوم والمجرات السحيقة",
            iconEmoji = "🌌",
            challenges = AstronomyChallenges.challenges
        ),
        PuzzleCategory(
            id = "science",
            arabicName = "العلوم والطبيعة",
            shortDescription = "الفيزياء والكيمياء والأحياء وقوى الطبيعة الخفية",
            iconEmoji = "🔬",
            challenges = ScienceChallenges.challenges
        ),
        PuzzleCategory(
            id = "history",
            arabicName = "التاريخ والحضارات",
            shortDescription = "الحضارات القديمة وآثار الأجداد والعصر الذهبي والفتوحات",
            iconEmoji = "🏛️",
            challenges = HistoryChallenges.challenges
        ),
        PuzzleCategory(
            id = "geography",
            arabicName = "الجغرافيا والعالم",
            shortDescription = "المحيطات والسلاسل الجبلية والقارات والعواصم العالمية",
            iconEmoji = "🌍",
            challenges = GeographyChallenges.challenges
        ),
        PuzzleCategory(
            id = "cars",
            arabicName = "السيارات والاختراعات",
            shortDescription = "المركبات والمحركات وهندسة النقل وتقنيات السرعة",
            iconEmoji = "🚗",
            challenges = CarsChallenges.challenges
        ),
        PuzzleCategory(
            id = "arabic_literature",
            arabicName = "اللغة العربية والأدب",
            shortDescription = "لغة الضاد والشعر والبلاغة والمعاجم وروائع البيان",
            iconEmoji = "📜",
            challenges = ArabicLiteratureChallenges.challenges
        ),
        PuzzleCategory(
            id = "math_logic",
            arabicName = "الرياضيات والمنطق",
            shortDescription = "الأشكال الهندسية وعلم الجبر والأنماط والأعداد الأولية",
            iconEmoji = "📐",
            challenges = MathLogicChallenges.challenges
        ),
        PuzzleCategory(
            id = "landmarks",
            arabicName = "المعالم والأماكن",
            shortDescription = "عجائب الدنيا والصروح المعمارية والمقدسات العريقة",
            iconEmoji = "🕌",
            challenges = LandmarksChallenges.challenges
        ),
        PuzzleCategory(
            id = "animals",
            arabicName = "عالم الحيوان",
            shortDescription = "الكائنات الصحراوية والطيور الجارحة وأسرار البحار والمحيطات",
            iconEmoji = "🦅",
            challenges = AnimalsChallenges.challenges
        ),
        PuzzleCategory(
            id = "inventions",
            arabicName = "الاختراعات والاكتشافات",
            shortDescription = "المطبعة والكهرباء والبوصلة والحواسيب والطب الحديث",
            iconEmoji = "💡",
            challenges = InventionsChallenges.challenges
        ),
        PuzzleCategory(
            id = "mysteries",
            arabicName = "الألغاز والتحقيق",
            shortDescription = "أحاجي البديهة وتتبع القرائن وفك الشفرات والأدلة",
            iconEmoji = "🔍",
            challenges = MysteriesChallenges.challenges
        ),
        PuzzleCategory(
            id = "general_knowledge",
            arabicName = "الثقافة والمعرفة العامة",
            shortDescription = "الموسوعات والفنون والمكتبات والجوائز الدولية العالمية",
            iconEmoji = "📚",
            challenges = GeneralKnowledgeChallenges.challenges
        )
    )

    fun getCategories(): List<PuzzleCategory> = categoriesList

    fun getCategoryById(id: String): PuzzleCategory? {
        val canonicalId = if (id == "arabic_language") "arabic_literature" else id
        return categoriesList.firstOrNull { it.id == canonicalId }
    }

    fun getChallengesForCategory(id: String, difficulty: GameDifficulty? = null): List<Challenge> {
        val category = getCategoryById(id) ?: return emptyList()
        return if (difficulty != null) {
            category.challenges.filter { it.difficulty == difficulty }
        } else {
            category.challenges
        }
    }

    fun getPuzzlesForCategory(id: String): List<Puzzle> {
        val category = getCategoryById(id) ?: return emptyList()
        return category.puzzles
    }

    fun getAllChallenges(): List<Challenge> {
        return categoriesList.flatMap { it.challenges }
    }

    fun getAllPuzzles(): List<Puzzle> {
        return categoriesList.flatMap { it.puzzles }
    }

    fun getSamplePuzzles(): List<Puzzle> = getPuzzlesForCategory("cars")

    fun getTotalPuzzlesCount(): Int = getAllPuzzles().size

    fun getTotalChallengesCount(): Int = getAllChallenges().size

    fun getCategoryTheme(id: String): HouseTheme {
        return HouseThemes.getThemeForCategory(id)
    }
}
