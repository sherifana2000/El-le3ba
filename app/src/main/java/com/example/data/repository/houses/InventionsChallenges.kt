package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object InventionsChallenges {

    val challenges = listOf(
        // Challenge 1: بصائر النور والملاحة (EXPLORATION)
        Challenge(
            id = "inventions_c1",
            categoryId = "inventions",
            title = "بصائر النور والملاحة",
            themeDescription = "الاختراعات المبكرة التي وجهت المسافرين ونقلت المعرفة بين الأمم",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 1001,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "أداة ملاحية مغناطيسية تشير إبرتها دوماً نحو الشمال وتوجه السفن والمسافرين في الظلمات",
                    correctAnswer = "بوصلة",
                    availableLetters = LetterScrambler.buildScrambledLetters("بوصلة", GameDifficulty.EXPLORATION, listOf("م", "غ"), seed = 1001L),
                    hint = "البوصلة البحرية التي طوّرها ابن ماجد",
                    rewardPoints = 15,
                    explanation = "البوصلة تعتمد على الحقل المغناطيسي لكوكب الأرض لتحديد الاتجاهات الأربعة بدقة.",
                    challengeId = "inventions_c1",
                    challengeTitle = "بصائر النور والملاحة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🧭",
                    visualTheme = "أدوات الملاحة",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 1002,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "اختراع ألماني ليوهان غوتنبرغ مكن من طباعة الكتب وتوزيع العلوم في كل أنحاء العالم",
                    correctAnswer = "مطبعة",
                    availableLetters = LetterScrambler.buildScrambledLetters("مطبعة", GameDifficulty.EXPLORATION, listOf("ح", "ر"), seed = 1002L),
                    hint = "المطبعة ذات الحروف المعدنية المتحركة",
                    rewardPoints = 15,
                    explanation = "المطبعة أحدثت ثورة معرفية بنقل نسخ الكتب من المخطوطات اليدوية البطيئة إلى النشر الجماهيري الواسع.",
                    challengeId = "inventions_c1",
                    challengeTitle = "بصائر النور والملاحة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📰",
                    visualTheme = "عصر التنوير",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 1003,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "مصدر إضاءة كهربائي ابتكره توماس إديسون بفتيل متوهج ليقهر ظلام البيوت والشوارع",
                    correctAnswer = "مصباح",
                    availableLetters = LetterScrambler.buildScrambledLetters("مصباح", GameDifficulty.EXPLORATION, listOf("ن", "و", "ر", "ض"), seed = 1003L),
                    hint = "المصباح الكهربائي المتوهج",
                    rewardPoints = 20,
                    explanation = "المصباح الكهربائي فتح آفاق العمل والإنتاج الليلي وغيّر شكل المدن الحديثة إلى الأبد.",
                    challengeId = "inventions_c1",
                    challengeTitle = "بصائر النور والملاحة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "💡",
                    visualTheme = "عصر الكهرباء",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: ثورة الاتصال والطب (THINKING)
        Challenge(
            id = "inventions_c2",
            categoryId = "inventions",
            title = "ثورة الاتصال والطب",
            themeDescription = "الاكتشافات التي قربت المسافات وأنقذت أرواح ملايين البشر",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1004,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "جهاز اتصال صوتي ابتكره غراهام بيل ينقل صوت المتحدث عبر الأسلاك لمسافات بعيدة",
                    correctAnswer = "هاتف",
                    availableLetters = LetterScrambler.buildScrambledLetters("هاتف", GameDifficulty.THINKING, listOf("ص", "و", "ت", "س"), seed = 1004L),
                    hint = "الهاتف السلكي والنقال",
                    rewardPoints = 20,
                    explanation = "الهاتف أزال حواجز العزلة وحول العالم إلى قرية صغيرة تتواصل لحظياً عبر شبكات الاتصال.",
                    challengeId = "inventions_c2",
                    challengeTitle = "ثورة الاتصال والطب",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📞",
                    visualTheme = "الاتصالات السلكية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1005,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "أول مضاد حيوي طبيعي اكتشفه ألكسندر فليمنغ من عفن البنسيليوم لمحاربة البكتيريا",
                    correctAnswer = "بنسلين",
                    availableLetters = LetterScrambler.buildScrambledLetters("بنسلين", GameDifficulty.THINKING, listOf("د", "و", "ا", "ء"), seed = 1005L),
                    hint = "دواء البنسلين الذي أنقذ ملايين الجرحى",
                    rewardPoints = 20,
                    explanation = "اكتشاف البنسلين فتح الباب أمام العصر الذهبي للمضادات الحيوية والقضاء على الأوبئة البكتيرية الفتاكة.",
                    challengeId = "inventions_c2",
                    challengeTitle = "ثورة الاتصال والطب",
                    questionIndexInChallenge = 2,
                    visualEmoji = "💊",
                    visualTheme = "الطب الحيوي",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1006,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "آلة تنقل الصور والأصوات عبر الأثير إلى الشاشات المنزلية وابتكرها جون لوجي بيرد",
                    correctAnswer = "تلفاز",
                    availableLetters = LetterScrambler.buildScrambledLetters("تلفاز", GameDifficulty.THINKING, listOf("ش", "ا", "ش", "ة"), seed = 1006L),
                    hint = "التلفزيون والشاشة الفضية",
                    rewardPoints = 20,
                    explanation = "التلفاز جمع بين البث المرئي والمسموع وأصبح الوسيلة الإعلامية والترفيهية الأولى في القرن العشرين.",
                    challengeId = "inventions_c2",
                    challengeTitle = "ثورة الاتصال والطب",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📺",
                    visualTheme = "البث المرئي",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: آفاق الرقمنة والمجهر (CHALLENGE)
        Challenge(
            id = "inventions_c3",
            categoryId = "inventions",
            title = "آفاق الرقمنة والمجهر",
            themeDescription = "معالجة البيانات والمجاهر التي كشفت أسرار العالم غير المرئي",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 1007,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "جهاز إلكتروني يعالج البيانات ويجري العمليات الحسابية والبرمجية المعقدة بمليارات النبضات",
                    correctAnswer = "حاسوب",
                    availableLetters = LetterScrambler.buildScrambledLetters("حاسوب", GameDifficulty.CHALLENGE, listOf("ب", "ر", "م", "ج", "ة", "ق"), seed = 1007L),
                    hint = "الكمبيوتر والحواسيب الرقمية",
                    rewardPoints = 25,
                    explanation = "الحاسوب قاد الثورة الصناعية الثالثة والرابعة ومكن الإنسان من معالجة البيانات واستكشاف الفضاء.",
                    challengeId = "inventions_c3",
                    challengeTitle = "آفاق الرقمنة والمجهر",
                    questionIndexInChallenge = 1,
                    visualEmoji = "💻",
                    visualTheme = "علوم الحوسبة",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1008,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "شبكة اتصالات عالمية تربط مليارات الأجهزة لتبادل المعلومات والمواقع والمعارف فورياً",
                    correctAnswer = "إنترنت",
                    availableLetters = LetterScrambler.buildScrambledLetters("إنترنت", GameDifficulty.CHALLENGE, listOf("ش", "ب", "ك", "ة", "ع", "ا"), seed = 1008L),
                    hint = "الشبكة العنكبوتية العالمية (الويب)",
                    rewardPoints = 25,
                    explanation = "الإنترنت هو البنية التحتية لعصر المعلومات والاقتصاد الرقمي والتواصل البشري الشامل.",
                    challengeId = "inventions_c3",
                    challengeTitle = "آفاق الرقمنة والمجهر",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌐",
                    visualTheme = "الشبكة العنكبوتية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1009,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "أداة بصرية تكبر الأجسام الدقيقة آلاف المرات لتكشف البكتيريا والفيروسات وخلايا الدم",
                    correctAnswer = "مجهر",
                    availableLetters = LetterScrambler.buildScrambledLetters("مجهر", GameDifficulty.CHALLENGE, listOf("ع", "د", "س", "ة", "خ", "ل"), seed = 1009L),
                    hint = "الميكروسكوب والمجهر الإلكتروني",
                    rewardPoints = 25,
                    explanation = "المجهر مكن العلماء من تأسيس نظرية الخلية واكتشاف الكائنات الدقيقة ومسببات الأمراض المستعصية.",
                    challengeId = "inventions_c3",
                    challengeTitle = "آفاق الرقمنة والمجهر",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔬",
                    visualTheme = "الأجهزة البصرية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: الثورة الصناعية وطاقة البخار (THINKING)
        Challenge(
            id = "inventions_c4",
            categoryId = "inventions",
            title = "الثورة الصناعية وطاقة البخار",
            themeDescription = "المحركات البخارية وغزل النسيج والتحول من اليدوي إلى الميكانيكي",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1010,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "مخترع اسكتلندي طور المحرك البخاري بمكثف منفصل مما أطلق شرارة الثورة الصناعية الكبرى",
                    correctAnswer = "واط",
                    availableLetters = LetterScrambler.buildScrambledLetters("واط", GameDifficulty.THINKING, listOf("ن", "ي", "و", "ت"), seed = 1010L),
                    hint = "جيمس ... وسميت وحدة القدرة الكهربائية تيمناً باسمه",
                    rewardPoints = 20,
                    explanation = "محرك جيمس واط وفر كفاءة ميكانيكية غير مسبوقة مكنت من تشغيل المصانع والمناجم والقطارات بالبخار.",
                    challengeId = "inventions_c4",
                    challengeTitle = "الثورة الصناعية وطاقة البخار",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🚂",
                    visualTheme = "طاقة البخار",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1011,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "نظام اتصال سلكي قديم يرسل نبضات كهربائية عبر الأسلاك لترجمة الحروف بنبضات قصيرة وطويلة",
                    correctAnswer = "تلغراف",
                    availableLetters = LetterScrambler.buildScrambledLetters("تلغراف", GameDifficulty.THINKING, listOf("ه", "ا", "ت", "ف"), seed = 1011L),
                    hint = "ابتكره صامويل مورس واعتمد شفرة مورس الشهيرة",
                    rewardPoints = 20,
                    explanation = "التلغراف سمح بنقل الأخبار والمعلومات اللحظية عبر القارات والمحيطات لأول مرة في التاريخ البشري.",
                    challengeId = "inventions_c4",
                    challengeTitle = "الثورة الصناعية وطاقة البخار",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📻",
                    visualTheme = "الاتصالات السلكية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1012,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "مادة تفجيرية آمنة في التعامل ابتكرها ألفريد نوبل بخلط النيتروجليسرين بالتراب السليكوني",
                    correctAnswer = "ديناميت",
                    availableLetters = LetterScrambler.buildScrambledLetters("ديناميت", GameDifficulty.THINKING, listOf("ب", "ا", "ر", "و"), seed = 1012L),
                    hint = "استخدم في شق الأنفاق وخصص نوبل ثروته لجوائز السلام والعلوم",
                    rewardPoints = 20,
                    explanation = "الديناميت ثوّر أعمال الهندسة المدنية والمناجم بحمايته للعمال من الانفجارات العشوائية للنيتروجليسرين.",
                    challengeId = "inventions_c4",
                    challengeTitle = "الثورة الصناعية وطاقة البخار",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🧨",
                    visualTheme = "الهندسة المدنية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: ثورة التصوير وحفظ الضوء (THINKING)
        Challenge(
            id = "inventions_c5",
            categoryId = "inventions",
            title = "ثورة التصوير وحفظ الضوء",
            themeDescription = "الداجيروتايب وتطور الكاميرات والأفلام الحساسة للضوء",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1013,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "جهاز بصري يسجل الصور الثابتة أو المتحركة بحبس الضوء على وسيط كيميائي أو مستشعر إلكتروني",
                    correctAnswer = "كاميرا",
                    availableLetters = LetterScrambler.buildScrambledLetters("كاميرا", GameDifficulty.THINKING, listOf("م", "ر", "آ", "ة"), seed = 1013L),
                    hint = "كلمة مشتقة من القمرة (الغرفة المظلمة) لابن الهيثم",
                    rewardPoints = 20,
                    explanation = "تطورت الكاميرا من الحجرة المظلمة البدائية إلى مستشعرات CMOS الرقمية فائقة الملايين من البكسلات.",
                    challengeId = "inventions_c5",
                    challengeTitle = "ثورة التصوير وحفظ الضوء",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📷",
                    visualTheme = "التصوير الضوئي",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1014,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "فيلم بلاستيكي مرن مغطى بهاليدات الفضة الحساسة للضوء يحفظ الصور السالبة قبل تحميضها",
                    correctAnswer = "نيغاتيف",
                    availableLetters = LetterScrambler.buildScrambledLetters("نيغاتيف", GameDifficulty.THINKING, listOf("ش", "ر", "ي", "ط"), seed = 1014L),
                    hint = "الصورة السالبة التي تظهر فيها الألوان معكوسة",
                    rewardPoints = 20,
                    explanation = "الأفلام الحساسة طورتها شركة كوداك وجعلت التصوير الفوتوغرافي متاحاً لعامة الناس في رحلاتهم ومنازلهم.",
                    challengeId = "inventions_c5",
                    challengeTitle = "ثورة التصوير وحفظ الضوء",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🎞️",
                    visualTheme = "أفلام التصوير",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1015,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "أول عملية تصوير فوتوغرافي عملية وناجحة تجارياً أعلن عنها في باريس عام 1839م",
                    correctAnswer = "داغيروتيب",
                    availableLetters = LetterScrambler.buildScrambledLetters("داغيروتيب", GameDifficulty.THINKING, listOf("ب", "و", "ل", "ا", "ر"), seed = 1015L),
                    hint = "ابتكرها لويس داغير على ألواح نحاسية مطلية بالفضة",
                    rewardPoints = 20,
                    explanation = "الداغيروتيب منح العالم أول صور واضحة المعالم للوجوه والشوارع دون الحاجة لرسم الفنانين اليدوي.",
                    challengeId = "inventions_c5",
                    challengeTitle = "ثورة التصوير وحفظ الضوء",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🖼️",
                    visualTheme = "بدايات الفوتوغرافيا",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: أجنحة البشرية وغزو السماء (THINKING)
        Challenge(
            id = "inventions_c6",
            categoryId = "inventions",
            title = "أجنحة البشرية وغزو السماء",
            themeDescription = "المناطيد وأولى رحلات الطيران بمحرك للأخوين رايت",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1016,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "أخوان أمريكيان حققا أول طيران آلي أثقل من الهواء بمحرك وتحكم كامل في طائرتهما عام 1903م",
                    correctAnswer = "رايت",
                    availableLetters = LetterScrambler.buildScrambledLetters("رايت", GameDifficulty.THINKING, listOf("ب", "ل", "ف", "و"), seed = 1016L),
                    hint = "أورفيل وويلبر ... في كيتي هوك بولاية كارولاينا الشمالية",
                    rewardPoints = 20,
                    explanation = "ابتكار الأخوين رايت الحاسم كان نظام التحكم ثلاثي المحاور الذي سمح بالانعطاف والتوازن في الهواء.",
                    challengeId = "inventions_c6",
                    challengeTitle = "أجنحة البشرية وغزو السماء",
                    questionIndexInChallenge = 1,
                    visualEmoji = "✈️",
                    visualTheme = "رواد الطيران",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1017,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "بالون ضخم طائر يرتفع في الهواء بفعل الهواء الساخن أو غاز أخف من الهواء كالهيليوم",
                    correctAnswer = "منطاد",
                    availableLetters = LetterScrambler.buildScrambledLetters("منطاد", GameDifficulty.THINKING, listOf("ش", "ر", "ا", "ع"), seed = 1017L),
                    hint = "اخترعه الأخوان مونتغولفييه في فرنسا عام 1783م",
                    rewardPoints = 20,
                    explanation = "المنطاد كان أول وسيلة مكنت الإنسان من الارتفاع فوق الأرض ومراقبة الغيوم ورسم الخرائط الجوية.",
                    challengeId = "inventions_c6",
                    challengeTitle = "أجنحة البشرية وغزو السماء",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🎈",
                    visualTheme = "المناطيد الهوائية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1018,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "طائرة عمودية تعتمد على دوارات أفقية تدور بمحرك للإقلاع والهبوط العمودي دون مدرج",
                    correctAnswer = "مروحية",
                    availableLetters = LetterScrambler.buildScrambledLetters("مروحية", GameDifficulty.THINKING, listOf("ن", "ف", "ا", "ث"), seed = 1018L),
                    hint = "تسمى الهليكوبتر وبرع إيغور سيكورسكي في تصميمها العملي",
                    rewardPoints = 20,
                    explanation = "المروحية تتميز بالقدرة على التحليق الثابت في موضعها مما يجعلها مثالية للإنقاذ في المناطق الوعرة.",
                    challengeId = "inventions_c6",
                    challengeTitle = "أجنحة البشرية وغزو السماء",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🚁",
                    visualTheme = "الطيران العمودي",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: المضادات الحيوية واللقاحات الطبية (CHALLENGE)
        Challenge(
            id = "inventions_c7",
            categoryId = "inventions",
            title = "المضادات الحيوية واللقاحات الطبية",
            themeDescription = "مكافحة الأوبئة والتخدير الجراحي والتعقيم الطبي",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 1019,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "طبيب بريطاني ابتكر أول لقاح ناجح في التاريخ ضد مرض الجدري القاتل باستخدام جدري البقر",
                    correctAnswer = "جينر",
                    availableLetters = LetterScrambler.buildScrambledLetters("جينر", GameDifficulty.CHALLENGE, listOf("ب", "ا", "س", "ت", "و", "ر"), seed = 1019L),
                    hint = "إدوارد ... مؤسس علم المناعة والتحصين باللقاحات",
                    rewardPoints = 25,
                    explanation = "إدوارد جينر أسس مفهوم التلقيح (Vaccination) المشتق من الكلمة اللاتينية للبقرة (Vacca) عام 1796.",
                    challengeId = "inventions_c7",
                    challengeTitle = "المضادات الحيوية واللقاحات الطبية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "💉",
                    visualTheme = "علم المناعة",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1020,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "عالم كيمياء دقيقة فرنسي ابتكر عملية تسخين السوائل لقتل الجراثيم وطور لقاح داء الكلب",
                    correctAnswer = "باستور",
                    availableLetters = LetterScrambler.buildScrambledLetters("باستور", GameDifficulty.CHALLENGE, listOf("ك", "و", "خ", "ل", "ي", "س"), seed = 1020L),
                    hint = "لويس ... ونسبت إليه عملية البسترة الغذائية",
                    rewardPoints = 25,
                    explanation = "باستور دحض نظرية التولد الذاتي وأثبت أن الكائنات الدقيقة المحمولة بالهواء هي سبب تعفن الأطعمة والعدوى.",
                    challengeId = "inventions_c7",
                    challengeTitle = "المضادات الحيوية واللقاحات الطبية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🥛",
                    visualTheme = "البسترة والتعقيم",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1021,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "أول جهاز تصوير طبي داخلي يعتمد على أشعة كهرومغناطيسية مجهولة اكتشفها رونتغن عام 1895م",
                    correctAnswer = "سينية",
                    availableLetters = LetterScrambler.buildScrambledLetters("سينية", GameDifficulty.CHALLENGE, listOf("م", "ق", "ط", "ع", "ي", "ة"), seed = 1021L),
                    hint = "الأشعة الـ ... أو أشعة إكس (X-Ray) لكشف كسور العظام",
                    rewardPoints = 25,
                    explanation = "الأشعة السينية تنفذ عبر الأنسجة الرخوة وتمتصها العظام الكثيفة مما منح الأطباء نافذة فورية على داخل الجسم.",
                    challengeId = "inventions_c7",
                    challengeTitle = "المضادات الحيوية واللقاحات الطبية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🩻",
                    visualTheme = "الأشعة الطبية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: الترانزستور والدوائر المتكاملة (CHALLENGE)
        Challenge(
            id = "inventions_c8",
            categoryId = "inventions",
            title = "الترانزستور والدوائر المتكاملة",
            themeDescription = "أشباه الموصلات وتصغير الحواسيب وثورة الرقائق الإلكترونية",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 1022,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "مفتاح ومضخم إلكتروني ثوري من أشباه الموصلات حل محل الصمامات المفرغة واعتبر أهم اختراع بالقرن العشرين",
                    correctAnswer = "ترانزستور",
                    availableLetters = LetterScrambler.buildScrambledLetters("ترانزستور", GameDifficulty.CHALLENGE, listOf("د", "ا", "ي", "و", "د", "م"), seed = 1022L),
                    hint = "اخترع في مختبرات بيل عام 1947 ونال صانعوه جائزة نوبل",
                    rewardPoints = 25,
                    explanation = "الترانزستور سمح بتصغير الأجهزة الإلكترونية واستهلاك طاقة ضئيلة وأتاح بناء مليارات المفاتيح على رقاقة واحدة.",
                    challengeId = "inventions_c8",
                    challengeTitle = "الترانزستور والدوائر المتكاملة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📻",
                    visualTheme = "أشباه الموصلات",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1023,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "شريحة دقيقة من السيليكون تجمع ملايين أو مليارات الترانزستورات والمكونات الإلكترونية معاً",
                    correctAnswer = "رقاقة",
                    availableLetters = LetterScrambler.buildScrambledLetters("رقاقة", GameDifficulty.CHALLENGE, listOf("ل", "و", "ح", "ة", "م", "ك"), seed = 1023L),
                    hint = "الدائرة المتكاملة (Integrated Circuit / Microchip)",
                    rewardPoints = 25,
                    explanation = "ابتكرها روبرت نويس وجاك كيلبي وأسست لقيام وادي السيليكون وثورة الحواسيب الشخصية والهواتف الذكية.",
                    challengeId = "inventions_c8",
                    challengeTitle = "الترانزستور والدوائر المتكاملة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "💾",
                    visualTheme = "الدوائر المتكاملة",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1024,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "قانون تجريبي وضعه غوردون مور ينص على تضاعف عدد الترانزستورات في الرقاقة كل عامين تقريباً",
                    correctAnswer = "مور",
                    availableLetters = LetterScrambler.buildScrambledLetters("مور", GameDifficulty.CHALLENGE, listOf("ب", "ي", "ل", "ج", "ي", "ت"), seed = 1024L),
                    hint = "قانون ... المحرك لصناعة الحواسيب لنصف قرن",
                    rewardPoints = 25,
                    explanation = "قانون مور دفع شركات الإلكترونيات لتطوير تقنيات الطباعة الحجرية الضوئية للوصول لأحجام النانومتر.",
                    challengeId = "inventions_c8",
                    challengeTitle = "الترانزستور والدوائر المتكاملة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📈",
                    visualTheme = "تطور الحوسبة",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: أشعة الليزر ونبضات الضوء الكوانتية (EXPERT)
        Challenge(
            id = "inventions_c9",
            categoryId = "inventions",
            title = "أشعة الليزر ونبضات الضوء الكوانتية",
            themeDescription = "تضخيم الضوء بالانبعاث المستحث والألياف الزجاجية لنقل البيانات",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 1025,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "حزمة ضوئية أحادية اللون متشاكهة ومكثفة للغاية تنتج عن تضخيم الضوء بالانبعاث المحفز للإشعاع",
                    correctAnswer = "ليزر",
                    availableLetters = LetterScrambler.buildScrambledLetters("ليزر", GameDifficulty.EXPERT, listOf("م", "ي", "ز", "ر", "ف", "و"), seed = 1025L),
                    hint = "اخترعه ثيودور ميمان عام 1960 باستخدام بلورة الياقوت",
                    rewardPoints = 30,
                    explanation = "الليزر يستخدم في جراحة العيون وقص المعادن وقراءة الأقراص المدمجة والاتصالات الشبكية المتقدمة.",
                    challengeId = "inventions_c9",
                    challengeTitle = "أشعة الليزر ونبضات الضوء الكوانتية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🔴",
                    visualTheme = "أشعة الليزر",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1026,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "خيوط زجاجية نقية فائقة الدقة تنقل البيانات الرقمية بسرعة الضوء عبر الانعكاس الداخلي الكلي",
                    correctAnswer = "ألياف",
                    availableLetters = LetterScrambler.buildScrambledLetters("ألياف", GameDifficulty.EXPERT, listOf("أ", "س", "ل", "ا", "ك", "ن"), seed = 1026L),
                    hint = "الـ ... الضوئية أو البصرية (Fiber Optics)",
                    rewardPoints = 30,
                    explanation = "الألياف الضوئية شكلت العمود الفقري لشبكة الإنترنت العالمية وحلت محل الأسلاك النحاسية بكفاءة وسرعة هائلة.",
                    challengeId = "inventions_c9",
                    challengeTitle = "أشعة الليزر ونبضات الضوء الكوانتية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "💡",
                    visualTheme = "الألياف البصرية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1027,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "تقنية ميكروسكوبية ثورية سمحت برؤية الذرات الفردية وتحريكها على السطوح بمسابر فائقة الحدة",
                    correctAnswer = "نفقي",
                    availableLetters = LetterScrambler.buildScrambledLetters("نفقي", GameDifficulty.EXPERT, listOf("إ", "ل", "ك", "ت", "ر", "و"), seed = 1027L),
                    hint = "المجهر الأنبوبي النفقي الماسح (STM) القائم على النفق الكمي",
                    rewardPoints = 30,
                    explanation = "مجهر النفق الكمي فتح الباب أمام تقنية النانو عام 1981م وحصل مخترعوه في شركة IBM على جائزة نوبل.",
                    challengeId = "inventions_c9",
                    challengeTitle = "أشعة الليزر ونبضات الضوء الكوانتية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔬",
                    visualTheme = "تقنية النانو",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: الحوسبة الكمومية وثورة الخوارزميات الفائقة (EXPERT)
        Challenge(
            id = "inventions_c10",
            categoryId = "inventions",
            title = "الحوسبة الكمومية وثورة الخوارزميات الفائقة",
            themeDescription = "الكيو بت والشبكات العصبية العميقة ومعالجة البيانات المتوازية",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 1028,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "الوحدة الأساسية للمعلومات في الحاسوب الكمومي التي تستفيد من التراكب والتشابك لتكون 0 و 1 معاً",
                    correctAnswer = "كيوبت",
                    availableLetters = LetterScrambler.buildScrambledLetters("كيوبت", GameDifficulty.EXPERT, listOf("ب", "ا", "ي", "ت", "ب", "ت"), seed = 1028L),
                    hint = "البت الكمومي (Qubit)",
                    rewardPoints = 35,
                    explanation = "الكيوبت يتيح للحواسيب الكمومية معالجة عدد هائل من الاحتمالات المتوازية في جزء من الثانية لحل أصعب المعادلات.",
                    challengeId = "inventions_c10",
                    challengeTitle = "الحوسبة الكمومية وثورة الخوارزميات الفائقة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⚛️",
                    visualTheme = "الحوسبة الكمومية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1029,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "اختبار فلسفي وتقني وضعه آلان تورنغ عام 1950م لتحديد قدرة الآلة على إظهار سلوك ذكي يماثل الإنسان",
                    correctAnswer = "تورنغ",
                    availableLetters = LetterScrambler.buildScrambledLetters("تورنغ", GameDifficulty.EXPERT, listOf("ف", "و", "ن", "ن", "ي", "و"), seed = 1029L),
                    hint = "اختبار ... الشهير في الذكاء الاصطناعي",
                    rewardPoints = 35,
                    explanation = "اختبار تورنغ يقوم على محكم بشري يتحاور نصياً مع إنسان وآلة ويحاول معرفة أيهما الكيان المصطنع.",
                    challengeId = "inventions_c10",
                    challengeTitle = "الحوسبة الكمومية وثورة الخوارزميات الفائقة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🤖",
                    visualTheme = "اختبار الذكاء",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1030,
                    categoryId = "inventions",
                    category = "بيت الاختراعات والاكتشافات",
                    question = "تقنية تعديل جيني ثورية دقيقة كالمقص الجزيئي مستوحاة من جهاز مناعة البكتيريا لاستهداف وقص الـ DNA",
                    correctAnswer = "كريسبر",
                    availableLetters = LetterScrambler.buildScrambledLetters("كريسبر", GameDifficulty.EXPERT, listOf("ك", "ا", "س", "ب", "و", "ل"), seed = 1030L),
                    hint = "نظام CRISPR-Cas9 الحائز على جائزة نوبل للكيمياء 2020",
                    rewardPoints = 35,
                    explanation = "كريسبر سمح للأطباء والعلماء بتعديل الجينات المسببة للأمراض الوراثية بدقة وسرعة وتكلفة غير مسبوقة.",
                    challengeId = "inventions_c10",
                    challengeTitle = "الحوسبة الكمومية وثورة الخوارزميات الفائقة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "✂️",
                    visualTheme = "الهندسة الوراثية",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
