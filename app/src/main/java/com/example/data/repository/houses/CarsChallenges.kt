package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object CarsChallenges {

    val challenges = listOf(
        // Challenge 1: مركبات الطرق والتنقل (EXPLORATION)
        Challenge(
            id = "cars_c1",
            categoryId = "cars",
            title = "مركبات الطرق والتنقل",
            themeDescription = "المركبات البرية التي نستخدمها في رحلاتنا وتنقلاتنا اليومية",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 501,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "مركبة برية تسير على أربع عجلات مخصصة لنقل الركاب والعائلات على الطرق",
                    correctAnswer = "سيارة",
                    availableLetters = LetterScrambler.buildScrambledLetters("سيارة", GameDifficulty.EXPLORATION, listOf("ق", "ط"), seed = 501L),
                    hint = "تبدأ بالسين وتنتهي بتاء مربوطة",
                    rewardPoints = 15,
                    explanation = "السيارة الحديثة تتكامل فيها أنظمة الدفع الميكانيكي والكهربائي مع تقنيات الأمان الذكية.",
                    challengeId = "cars_c1",
                    challengeTitle = "مركبات الطرق والتنقل",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🚗",
                    visualTheme = "المركبات البرية",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 502,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "وسيلة نقل جوية عملاقة تحلق بجناحين ومحركات نفاثة لنقل المسافرين عبر القارات",
                    correctAnswer = "طائرة",
                    availableLetters = LetterScrambler.buildScrambledLetters("طائرة", GameDifficulty.EXPLORATION, listOf("س", "ف"), seed = 502L),
                    hint = "تطير في الأجواء وتقلع من المطارات",
                    rewardPoints = 15,
                    explanation = "الطائرة تعتمد على قوانين الديناميكا الهوائية وفرق الضغط الجوي بين سطحي الجناح للارتفاع.",
                    challengeId = "cars_c1",
                    challengeTitle = "مركبات الطرق والتنقل",
                    questionIndexInChallenge = 2,
                    visualEmoji = "✈️",
                    visualTheme = "الطيران المدني",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 503,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "مركبة ضخمة تسير على قضبان حديدية ممهدة وتجر خلفها عربات المسافرين والبضائع",
                    correctAnswer = "قطار",
                    availableLetters = LetterScrambler.buildScrambledLetters("قطار", GameDifficulty.EXPLORATION, listOf("م", "ح"), seed = 503L),
                    hint = "ينطلق على السكة الحديدية مسافراً بين المدن",
                    rewardPoints = 20,
                    explanation = "القطار من أكثر وسائل النقل كفاءة واستدامة بيئية وخاصة القطارات فائقة السرعة الحديثة.",
                    challengeId = "cars_c1",
                    challengeTitle = "مركبات الطرق والتنقل",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🚆",
                    visualTheme = "السكك الحديدية",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: هندسة المحركات والأجزاء (THINKING)
        Challenge(
            id = "cars_c2",
            categoryId = "cars",
            title = "هندسة المحركات والأجزاء",
            themeDescription = "القلب الميكانيكي للمركبات وأنظمة نقل العزم والحركة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 504,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "القلب النابض في المركبة الذي يحول الطاقة الكيميائية أو الكهربائية إلى حركة ميكانيكية",
                    correctAnswer = "محرك",
                    availableLetters = LetterScrambler.buildScrambledLetters("محرك", GameDifficulty.THINKING, listOf("ز", "ي", "ت", "د"), seed = 504L),
                    hint = "مصدر العزم والقوة الدافعة للسيارة",
                    rewardPoints = 20,
                    explanation = "المحرك سواء كان محرك احتراق داخلي أو محركاً كهربائياً هو مصدر الطاقة الحركية للمركبة.",
                    challengeId = "cars_c2",
                    challengeTitle = "هندسة المحركات والأجزاء",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⚙️",
                    visualTheme = "أنظمة الدفع",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 505,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "جزء دائري مطاطي يرتكز عليه هيكل السيارة ويدور على الطريق ليمنحها الثبات والانطلاق",
                    correctAnswer = "عجلة",
                    availableLetters = LetterScrambler.buildScrambledLetters("عجلة", GameDifficulty.THINKING, listOf("د", "ا", "ئ", "ر"), seed = 505L),
                    hint = "تدور بانسيابية لتتحرك المركبة إلى الأمام",
                    rewardPoints = 20,
                    explanation = "العجلة من أعظم الاختراعات البشرية التي غيرت مجرى تاريخ النقل والحضارة الإنسانية.",
                    challengeId = "cars_c2",
                    challengeTitle = "هندسة المحركات والأجزاء",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🛞",
                    visualTheme = "أنظمة التعليق",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 506,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "نظام أمان ميكانيكي هيدروليكي يضغط على أقراص العجلات لإيقاف السيارة أو تخفيف سرعتها",
                    correctAnswer = "مكابح",
                    availableLetters = LetterScrambler.buildScrambledLetters("مكابح", GameDifficulty.THINKING, listOf("ف", "ر", "ا", "م"), seed = 506L),
                    hint = "الفرامل التي تضمن سلامة المركبة والركاب",
                    rewardPoints = 20,
                    explanation = "المكابح تحول الطاقة الحركية إلى طاقة حرارية بالاحتكاك لإيقاف السيارة بأمان وسرعة.",
                    challengeId = "cars_c2",
                    challengeTitle = "هندسة المحركات والأجزاء",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🛑",
                    visualTheme = "أنظمة الأمان",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: مركبات المستقبل والسرعة (CHALLENGE)
        Challenge(
            id = "cars_c3",
            categoryId = "cars",
            title = "مركبات المستقبل والسرعة",
            themeDescription = "السيارات الكهربائية والمركبات الذكية وتقنيات القيادة الذاتية",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 507,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "وحدة تخزين كهروكيميائية تزود المحرك الكهربائي بالطاقة اللازمة لتحريك السيارة النظيفة",
                    correctAnswer = "بطارية",
                    availableLetters = LetterScrambler.buildScrambledLetters("بطارية", GameDifficulty.CHALLENGE, listOf("ش", "ح", "ن", "ط", "ا", "ق"), seed = 507L),
                    hint = "خلايا الليثيوم أيون القابلة لإعادة الشحن",
                    rewardPoints = 25,
                    explanation = "البطاريات تمثل جوهر ثورة السيارات الكهربائية المستدامة الخالية من الانبعاثات الكربونية.",
                    challengeId = "cars_c3",
                    challengeTitle = "مركبات المستقبل والسرعة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🔋",
                    visualTheme = "السيارات الكهربائية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 508,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "جهاز استشعار يعتمد على الموجات الراديوية أو الليزرية لكشف العوائق ومساعدة السيارة على القيادة الذاتية",
                    correctAnswer = "رادار",
                    availableLetters = LetterScrambler.buildScrambledLetters("رادار", GameDifficulty.CHALLENGE, listOf("ح", "س", "ا", "س", "م", "و"), seed = 508L),
                    hint = "يكتشف المسافات وسرعة الأجسام المحيطة",
                    rewardPoints = 25,
                    explanation = "الرادار وأنظمة الليدار تمثل أعين السيارات الذكية لرسم خريطة محيطية ثلاثية الأبعاد بدقة فائقة.",
                    challengeId = "cars_c3",
                    challengeTitle = "مركبات المستقبل والسرعة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📡",
                    visualTheme = "القيادة الذاتية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 509,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "مقياس دقيق في لوحة القيادة يعرض المسافة المقطوعة وسرعة اندفاع السيارة بالكيلومترات في الساعة",
                    correctAnswer = "عداد",
                    availableLetters = LetterScrambler.buildScrambledLetters("عداد", GameDifficulty.CHALLENGE, listOf("س", "ر", "ع", "ة", "ق", "ي"), seed = 509L),
                    hint = "عداد السرعة أمام نظر السائق",
                    rewardPoints = 25,
                    explanation = "عداد السرعة يتيح للسائق مراقبة سرعة المركبة والالتزام بحدود السلامة المرورية على الطرق.",
                    challengeId = "cars_c3",
                    challengeTitle = "مركبات المستقبل والسرعة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "⏱️",
                    visualTheme = "لوحة التحكم",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: نواقل الحركة والديناميكا الميكانيكية (THINKING)
        Challenge(
            id = "cars_c4",
            categoryId = "cars",
            title = "نواقل الحركة والديناميكا الميكانيكية",
            themeDescription = "صندوق التروس ونقل عزم الدوران من المحرك إلى العجلات",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 510,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "جهاز ميكانيكي يتكون من تروس مسننة متعددة النسب يغير عزم وسرعة دوران عجلات السيارة",
                    correctAnswer = "ترس",
                    availableLetters = LetterScrambler.buildScrambledLetters("ترس", GameDifficulty.THINKING, listOf("ق", "ا", "ب", "ض"), seed = 510L),
                    hint = "يسمى صندوق التروس أو الجير بوكس (Gearbox)",
                    rewardPoints = 20,
                    explanation = "صندوق التروس يسمح للمحرك بالعمل في نطاق دوراته المثالي مع توفير السرعة أو القوة المطلوبة للمركبة.",
                    challengeId = "cars_c4",
                    challengeTitle = "نواقل الحركة والديناميكا الميكانيكية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⚙️",
                    visualTheme = "نواقل الحركة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 511,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "ترس ميكانيكي محوري في مؤخرة سيارات الدفع الخلفي يوزع العزم بين العجلتين يسمى شعبياً بالدفرنس",
                    correctAnswer = "دفرنس",
                    availableLetters = LetterScrambler.buildScrambledLetters("دفرنس", GameDifficulty.THINKING, listOf("م", "ح", "و", "ر"), seed = 511L),
                    hint = "يسمى الترس التفاضلي أو الدفرنس (Differential)",
                    rewardPoints = 20,
                    explanation = "الدفرنس هو الترس المحوري الذي يعوض فارق السرعة الدورانية بين العجلة الداخلية والخارجية في المنعطف.",
                    challengeId = "cars_c4",
                    challengeTitle = "نواقل الحركة والديناميكا الميكانيكية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🔄",
                    visualTheme = "آليات الدوران",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 512,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "أداة فصل ووصل ميكانيكية بين محرك السيارة وعلبة التروس في السيارات ذات الناقل اليدوي",
                    correctAnswer = "قابض",
                    availableLetters = LetterScrambler.buildScrambledLetters("قابض", GameDifficulty.THINKING, listOf("د", "و", "ا", "س"), seed = 512L),
                    hint = "يسمى بالكلتش (Clutch) ويضغط عليه بالقدم لتبديل السرعات",
                    rewardPoints = 20,
                    explanation = "القابض يعتمد على قوة الاحتكاك لنقل الحركة تدريجياً وبسلاسة لمنع توقف المحرك المفاجئ عند بدء الحركة.",
                    challengeId = "cars_c4",
                    challengeTitle = "نواقل الحركة والديناميكا الميكانيكية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🕹️",
                    visualTheme = "التحكم الحركي",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: أنظمة التعليق وامتصاص الصدمات (THINKING)
        Challenge(
            id = "cars_c5",
            categoryId = "cars",
            title = "أنظمة التعليق وامتصاص الصدمات",
            themeDescription = "ثبات المركبة وعزل الركاب عن تضاريس الطريق الوعرة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 513,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "مكون هيدروليكي أو غازي في نظام التعليق يخمد الاهتزازات ويمنع ارتجاج السيارة فوق المطبات",
                    correctAnswer = "مساعد",
                    availableLetters = LetterScrambler.buildScrambledLetters("مساعد", GameDifficulty.THINKING, listOf("ي", "ا", "ي", "ن"), seed = 513L),
                    hint = "يسمى ممتص الصدمات أو المساعدات (Shock Absorber)",
                    rewardPoints = 20,
                    explanation = "ممتص الصدمات يحول الطاقة الحركية الناشئة عن اهتزاز النوابض إلى طاقة حرارية داخل السائل الهيدروليكي.",
                    challengeId = "cars_c5",
                    challengeTitle = "أنظمة التعليق وامتصاص الصدمات",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🛞",
                    visualTheme = "امتصاص الاهتزاز",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 514,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "عجلة القيادة الدائرية التي يمسكها السائق لتوجيه مسار عجلات السيارة الأمامية يميناً ويساراً",
                    correctAnswer = "مقود",
                    availableLetters = LetterScrambler.buildScrambledLetters("مقود", GameDifficulty.THINKING, listOf("د", "ر", "ك", "س"), seed = 514L),
                    hint = "يتصل بعمود التوجيه وعلبة الدركسيون",
                    rewardPoints = 20,
                    explanation = "نظام التوجيه الحديث يعتمد على المساعدة الكهربائية أو الهيدروليكية لتسهيل دوران المقود بأقل جهد.",
                    challengeId = "cars_c5",
                    challengeTitle = "أنظمة التعليق وامتصاص الصدمات",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🎯",
                    visualTheme = "نظام التوجيه",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 515,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "نظام ذكي مانع لانغلاق المكابح يمنع انزلاق الإطارات عند التوقف المفاجئ ويحافظ على التوجيه",
                    correctAnswer = "مانع",
                    availableLetters = LetterScrambler.buildScrambledLetters("مانع", GameDifficulty.THINKING, listOf("ا", "ن", "ز", "ل", "ا"), seed = 515L),
                    hint = "يعرف اختصاراً بالرمز العالمي ABS",
                    rewardPoints = 20,
                    explanation = "نظام ABS يضخ الزيت للمكابح عشرات المرات في الثانية لمنع قفل العجلة مما يتيح للسائق المناورة أثناء الكبح.",
                    challengeId = "cars_c5",
                    challengeTitle = "أنظمة التعليق وامتصاص الصدمات",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🛑",
                    visualTheme = "أنظمة الأمان",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: المركبات الكهربائية ومنظومات الطاقة النظيفة (THINKING)
        Challenge(
            id = "cars_c6",
            categoryId = "cars",
            title = "المركبات الكهربائية ومنظومات الطاقة النظيفة",
            themeDescription = "المحركات الكهرومغناطيسية وخلايا الليثيوم واستعادة طاقة الكبح",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 516,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "سيارة تجمع بين محرك احتراق داخلي تقليدي ومحرك كهربائي مع بطارية لتوفير استهلاك الوقود",
                    correctAnswer = "هجينة",
                    availableLetters = LetterScrambler.buildScrambledLetters("هجينة", GameDifficulty.THINKING, listOf("ش", "ح", "ن", "ك"), seed = 516L),
                    hint = "تعرف عالمياً بالهايبرد (Hybrid)",
                    rewardPoints = 20,
                    explanation = "السيارات الهجينة تستفيد من المحرك الكهربائي في السرعات المنخفضة وتشحن بطاريتها ذاتياً عند التباطؤ.",
                    challengeId = "cars_c6",
                    challengeTitle = "المركبات الكهربائية ومنظومات الطاقة النظيفة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🔋",
                    visualTheme = "السيارات الهجينة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 517,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "عنصر كيميائي فلزي خفيف يشكل العنصر الأساسي في تصنيع بطاريات السيارات الكهربائية الحديثة",
                    correctAnswer = "ليثيوم",
                    availableLetters = LetterScrambler.buildScrambledLetters("ليثيوم", GameDifficulty.THINKING, listOf("ن", "ي", "ك", "ل"), seed = 517L),
                    hint = "بطاريات ليثيوم أيون ذات الكثافة الطاقية العالية",
                    rewardPoints = 20,
                    explanation = "الليثيوم يتميز بأنه أخف الفلزات ويمتلك جهداً كهرروكيميائياً عالياً يجعله مثالياً لتخزين الشحنات الكهربائية.",
                    challengeId = "cars_c6",
                    challengeTitle = "المركبات الكهربائية ومنظومات الطاقة النظيفة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "⚡",
                    visualTheme = "خلايا البطاريات",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 518,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "عملية إعادة تزويد بطارية السيارة الكهربائية بالطاقة عبر كابل مخصص من محطة تيار ثابت أو متردد",
                    correctAnswer = "شحن",
                    availableLetters = LetterScrambler.buildScrambledLetters("شحن", GameDifficulty.THINKING, listOf("ت", "ف", "ر", "ي"), seed = 518L),
                    hint = "تتراوح بين الشحن البطيء المنزلي والشحن السريع الفائق",
                    rewardPoints = 20,
                    explanation = "محطات الشحن السريع بالتيار المباشر DC تستطيع شحن 80% من بطارية السيارة في أقل من 30 دقيقة.",
                    challengeId = "cars_c6",
                    challengeTitle = "المركبات الكهربائية ومنظومات الطاقة النظيفة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔌",
                    visualTheme = "محطات الطاقة",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: الديناميكا الهوائية وهندسة السرعة (CHALLENGE)
        Challenge(
            id = "cars_c7",
            categoryId = "cars",
            title = "الديناميكا الهوائية وهندسة السرعة",
            themeDescription = "تقليل مقاومة الهواء وتوليد القوة الضاغطة لثبات سيارات السباق",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 519,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "قطعة هوائية تثبت في مؤخرة السيارة لتوجيه تدفق الهواء وتوليد قوة ضاغطة تثبتها على السرعات العالية",
                    correctAnswer = "جناح",
                    availableLetters = LetterScrambler.buildScrambledLetters("جناح", GameDifficulty.CHALLENGE, listOf("س", "ب", "و", "ي", "ل", "ر"), seed = 519L),
                    hint = "يسمى أيضاً بالسبويلر (Spoiler) ومستوحى من الطيران",
                    rewardPoints = 25,
                    explanation = "الجناح الخلفي ينتج قوة سفلية (Downforce) تزيد من التصاق الإطارات بحلبة السباق عند الانعطاف السريع.",
                    challengeId = "cars_c7",
                    challengeTitle = "الديناميكا الهوائية وهندسة السرعة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏎️",
                    visualTheme = "الديناميكا الهوائية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 520,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "مروحة توربينية تعمل بغازات العادم المضغوطة لضخ كمية هواء إضافية للمحرك ورفع قوته الحصانية",
                    correctAnswer = "توربو",
                    availableLetters = LetterScrambler.buildScrambledLetters("توربو", GameDifficulty.CHALLENGE, listOf("س", "و", "ب", "ر", "ش", "ح"), seed = 520L),
                    hint = "يسمى الشاحن التوربيني (Turbocharger)",
                    rewardPoints = 25,
                    explanation = "التوربو يستغل طاقة غازات العادم المهدرة لزيادة كثافة الهواء والأكسجين في غرف الاحتراق.",
                    challengeId = "cars_c7",
                    challengeTitle = "الديناميكا الهوائية وهندسة السرعة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "💨",
                    visualTheme = "شواحن الهواء",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 521,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "قناة هوائية في أسفل مؤخرة سيارة السباق تعمل على تسريع تفريغ الهواء وتوليد تأثير أرضي ساحب",
                    correctAnswer = "مشتت",
                    availableLetters = LetterScrambler.buildScrambledLetters("مشتت", GameDifficulty.CHALLENGE, listOf("د", "ا", "ي", "ف", "ي", "و"), seed = 521L),
                    hint = "يسمى ناشر الهواء أو الديفيوزر (Diffuser)",
                    rewardPoints = 25,
                    explanation = "مشتت الهواء السفلي يستغل مبدأ برنولي لتخفيض ضغط الهواء تحت السيارة مما يشدها إلى الأرض بإحكام.",
                    challengeId = "cars_c7",
                    challengeTitle = "الديناميكا الهوائية وهندسة السرعة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🏁",
                    visualTheme = "التأثير الأرضي",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: القيادة الذاتية وأنظمة الاستشعار الفائقة (CHALLENGE)
        Challenge(
            id = "cars_c8",
            categoryId = "cars",
            title = "القيادة الذاتية وأنظمة الاستشعار الفائقة",
            themeDescription = "الرؤية الحاسوبية والمسح الليزري والذكاء الاصطناعي للمركبات المستقلة",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 522,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "تقنية استشعار ليزري ترسل ملايين النبضات الضوئية لبناء خريطة ثلاثية الأبعاد لمحيط السيارة",
                    correctAnswer = "ليدار",
                    availableLetters = LetterScrambler.buildScrambledLetters("ليدار", GameDifficulty.CHALLENGE, listOf("س", "و", "ن", "ا", "ر", "ك"), seed = 522L),
                    hint = "يسمى LiDAR وهو العين الأساسية لمعظم السيارات ذاتية القيادة",
                    rewardPoints = 25,
                    explanation = "الليدار يقيس زمن ارتداد حزم الليزر لتحديد المسافات بدقة الملليمتر حتى في ظروف الظلام التام.",
                    challengeId = "cars_c8",
                    challengeTitle = "القيادة الذاتية وأنظمة الاستشعار الفائقة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📡",
                    visualTheme = "المسح الليزري",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 523,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "نظام قيادة متطور يتحكم في سرعة السيارة تلقائياً ويحافظ على مسافة أمان ثابتة مع المركبة التي أمامها",
                    correctAnswer = "تكيفي",
                    availableLetters = LetterScrambler.buildScrambledLetters("تكيفي", GameDifficulty.CHALLENGE, listOf("م", "ث", "ب", "ت", "س", "ر"), seed = 523L),
                    hint = "مثبت السرعة التفاعلي التكيفي (ACC)",
                    rewardPoints = 25,
                    explanation = "مثبت السرعة التكيفي يستخدم الرادار والكاميرا لتهدئة السيارة أوتوماتيكياً عند التزاحم وتسريعها عند خلو الطريق.",
                    challengeId = "cars_c8",
                    challengeTitle = "القيادة الذاتية وأنظمة الاستشعار الفائقة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🚗",
                    visualTheme = "التحكم الذاتي",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 524,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "نظام أمان ينبه السائق أو يتدخل بتوجيه طفيف إذا بدأت السيارة بالانحراف عن مسار خطوط الشارع دون إشارة",
                    correctAnswer = "مسار",
                    availableLetters = LetterScrambler.buildScrambledLetters("مسار", GameDifficulty.CHALLENGE, listOf("ح", "ا", "ف", "ة", "ط", "ر"), seed = 524L),
                    hint = "نظام الحفاظ على المسار (Lane Keep Assist)",
                    rewardPoints = 25,
                    explanation = "هذا النظام يقرأ علامات الطريق عبر كاميرا الزجاج الأمامي ويقلل حوادث الخروج عن الطريق الناتجة عن النعاس.",
                    challengeId = "cars_c8",
                    challengeTitle = "القيادة الذاتية وأنظمة الاستشعار الفائقة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🛣️",
                    visualTheme = "مراقبة المسار",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: الهياكل الخارقة وألياف الكربون (EXPERT)
        Challenge(
            id = "cars_c9",
            categoryId = "cars",
            title = "الهياكل الخارقة وألياف الكربون",
            themeDescription = "المونوكوك والمواد المركبة فائقة الصلابة في السيارات الفارهة",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 525,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "مادة مركبة من خيوط كربونية مصفوفة تمتاز بصلابة فائقة وخفة وزن تسمى ألياف الكربون",
                    correctAnswer = "فايبر",
                    availableLetters = LetterScrambler.buildScrambledLetters("فايبر", GameDifficulty.EXPERT, listOf("ك", "ر", "ب", "و", "ن", "ت"), seed = 525L),
                    hint = "الكربون ... (Carbon Fiber) المستعمل في سيارات السباق",
                    rewardPoints = 30,
                    explanation = "الكربون فايبر يتميز بنسبة متانة إلى وزن خارقة تجعله المادة المفضلة في سيارات الفورمولا 1 والخارقة.",
                    challengeId = "cars_c9",
                    challengeTitle = "الهياكل الخارقة وألياف الكربون",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🛡️",
                    visualTheme = "المواد المركبة",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 526,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "هيكل موحد للسيارة تندمج فيه مقصورة الركاب كخلية حماية صلبة واحدة مستوحاة من صناعة الطيران",
                    correctAnswer = "مونوكوك",
                    availableLetters = LetterScrambler.buildScrambledLetters("مونوكوك", GameDifficulty.EXPERT, listOf("ش", "ا", "س", "ي", "ه", "ق", "ط"), seed = 526L),
                    hint = "خلية النجاة الكربونية في سيارات السباق الخارقة",
                    rewardPoints = 30,
                    explanation = "هيكل المونوكوك يوزع قوى الاصطدام على كامل الهيكل الخارجي لحماية السائق من اختراق الحطام للمقصورة.",
                    challengeId = "cars_c9",
                    challengeTitle = "الهياكل الخارقة وألياف الكربون",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏎️",
                    visualTheme = "هياكل الأمان",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 527,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "مكابح مصنوعة من مركب السيليكون الكربوني الخزفي تتحمل درجات حرارة تتجاوز ألف مئوية دون تلاشي كفاءتها",
                    correctAnswer = "سيراميك",
                    availableLetters = LetterScrambler.buildScrambledLetters("سيراميك", GameDifficulty.EXPERT, listOf("ف", "و", "ل", "ا", "ذ", "ح", "د"), seed = 527L),
                    hint = "مكابح الكربون سيراميك عالية الأداء للمسارات السريعة",
                    rewardPoints = 30,
                    explanation = "مكابح السيراميك تقاوم ظاهرة الاضمحلال الحراري (Brake Fade) وتدوم لعشرات آلاف الكيلومترات دون تآكل ملحوظ.",
                    challengeId = "cars_c9",
                    challengeTitle = "الهياكل الخارقة وألياف الكربون",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔥",
                    visualTheme = "المكابح الخزفية",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: الفورمولا 1 ومستقبل خلايا الهيدروجين (EXPERT)
        Challenge(
            id = "cars_c10",
            categoryId = "cars",
            title = "الفورمولا 1 ومستقبل خلايا الهيدروجين",
            themeDescription = "تقنيات استعادة الطاقة الحركية وخلايا وقود الهيدروجين للمركبات",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 528,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "نظام في سيارات الفورمولا 1 يخزن الطاقة الحركية المهدورة أثناء الكبح ويطلقها كدفعة قوة مؤقتة",
                    correctAnswer = "كيرز",
                    availableLetters = LetterScrambler.buildScrambledLetters("كيرز", GameDifficulty.EXPERT, listOf("د", "ي", "ا", "ر", "ا", "س", "ت"), seed = 528L),
                    hint = "نظام استعادة الطاقة الحركية (KERS) الشهير",
                    rewardPoints = 35,
                    explanation = "نظام KERS تطور إلى وحدات MGU-K و MGU-H المعقدة لتوليد مئات الأحصنة الهجينة في سيارات الجائزة الكبرى.",
                    challengeId = "cars_c10",
                    challengeTitle = "الفورمولا 1 ومستقبل خلايا الهيدروجين",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⚡",
                    visualTheme = "طاقة السباقات",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 529,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "خلية كهروكيميائية تدمج غاز الهيدروجين مع الأكسجين لإنتاج الكهرباء وتسيير السيارة والماء هو العادم الوحيد",
                    correctAnswer = "وقود",
                    availableLetters = LetterScrambler.buildScrambledLetters("وقود", GameDifficulty.EXPERT, listOf("ب", "ط", "ا", "ر", "ي", "ة", "ش"), seed = 529L),
                    hint = "سيارات خلايا الوقود الهيدروجينية (Fuel Cell)",
                    rewardPoints = 35,
                    explanation = "خلايا وقود الهيدروجين تمنح مدى قيادة طويلاً مع سرعة تزود بالوقود لا تتجاوز 5 دقائق دون أي انبعاثات كربونية.",
                    challengeId = "cars_c10",
                    challengeTitle = "الفورمولا 1 ومستقبل خلايا الهيدروجين",
                    questionIndexInChallenge = 2,
                    visualEmoji = "💧",
                    visualTheme = "خلايا الهيدروجين",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 530,
                    categoryId = "cars",
                    category = "بيت السيارات والمحركات",
                    question = "نظام تقليل السحب الهوائي بفتح جزء من الجناح الخلفي في الفورمولا 1 لتسهيل التجاوز في الخطوط المستقيمة",
                    correctAnswer = "دياراس",
                    availableLetters = LetterScrambler.buildScrambledLetters("دياراس", GameDifficulty.EXPERT, listOf("ك", "ي", "ر", "ز", "ت", "و", "ر"), seed = 530L),
                    hint = "يعرف اختصاراً بالرمز DRS (Drag Reduction System)",
                    rewardPoints = 35,
                    explanation = "نظام DRS يمنح السيارة سرعة إضافية تصل إلى 15 كم/ساعة عبر تقليل مقاومة الهواء خلف السيارة المنافسة.",
                    challengeId = "cars_c10",
                    challengeTitle = "الفورمولا 1 ومستقبل خلايا الهيدروجين",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🏁",
                    visualTheme = "تقنيات التجاوز",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
