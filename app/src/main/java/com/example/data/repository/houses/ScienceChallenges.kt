package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object ScienceChallenges {

    val challenges = listOf(
        // Challenge 1: لبنات المادة والحياة (EXPLORATION)
        Challenge(
            id = "science_c1",
            categoryId = "science",
            title = "لبنات المادة والحياة",
            themeDescription = "استكشاف أصغر المكونات التي تبني أجسام الكائنات والمواد في الكون",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 201,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "الوحدة البنائية والوظيفية الأساسية لجميع الكائنات الحية على وجه الأرض",
                    correctAnswer = "خلية",
                    availableLetters = LetterScrambler.buildScrambledLetters("خلية", GameDifficulty.EXPLORATION, listOf("ن", "و"), seed = 201L),
                    hint = "تتكون من غشاء وسيتوبلازم ونواة وراثية",
                    rewardPoints = 15,
                    explanation = "الخلية هي أصغر وحدة قادرة على الحياة والنمو والتكاثر في الكائنات الحية.",
                    challengeId = "science_c1",
                    challengeTitle = "لبنات المادة والحياة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🔬",
                    visualTheme = "علم الأحياء",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 202,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "أصغر جزء من العنصر الكيميائي يحتفظ بخصائصه ويتكون من نواة محاطة بإلكترونات",
                    correctAnswer = "ذرة",
                    availableLetters = LetterScrambler.buildScrambledLetters("ذرة", GameDifficulty.EXPLORATION, listOf("ج", "ز"), seed = 202L),
                    hint = "تحتوي على بروتونات موجبة ونيوترونات متعادلة",
                    rewardPoints = 15,
                    explanation = "الذرة هي اللبنة التأسيسية لكل عنصر كيميائي في جدول مندليف الدوري.",
                    challengeId = "science_c1",
                    challengeTitle = "لبنات المادة والحياة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "⚛️",
                    visualTheme = "الفيزياء الذرية",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 203,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "القدرة على بذل شغل فيزيائي وتوجد في أشكال كالضوئية والحرارية والحركية",
                    correctAnswer = "طاقة",
                    availableLetters = LetterScrambler.buildScrambledLetters("طاقة", GameDifficulty.EXPLORATION, listOf("ش", "م"), seed = 203L),
                    hint = "قانونها الفيزيائي: لا تفنى ولا تستحدث من العدم",
                    rewardPoints = 20,
                    explanation = "الطاقة هي المحرك الكوني لكل التفاعلات والأنشطة الفيزيائية والكيميائية والحيوية.",
                    challengeId = "science_c1",
                    challengeTitle = "لبنات المادة والحياة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "⚡",
                    visualTheme = "قوانين الفيزياء",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: قوى الطبيعة والتفاعلات (THINKING)
        Challenge(
            id = "science_c2",
            categoryId = "science",
            title = "قوى الطبيعة والتفاعلات",
            themeDescription = "القوى غير المرئية والتفاعلات الكيميائية التي تحكم سلوك الطبيعة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 204,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "قوة جذب طبيعية بين الكتل تشد الأجسام نحو مركز الأرض وتحفظ مدارات الكواكب",
                    correctAnswer = "جاذبية",
                    availableLetters = LetterScrambler.buildScrambledLetters("جاذبية", GameDifficulty.THINKING, listOf("س", "ق", "و", "ط"), seed = 204L),
                    hint = "اكتشف إسحاق نيوتن قانونها الشهير",
                    rewardPoints = 20,
                    explanation = "الجاذبية قوة أساسية في الطبيعة تربط الأجرام السماوية وتمنح الأجسام وزنها على سطح الأرض.",
                    challengeId = "science_c2",
                    challengeTitle = "قوى الطبيعة والتفاعلات",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🍎",
                    visualTheme = "الميكانيكا الكلاسيكية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 205,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "غاز شفاف عديم اللون والرائحة يشكل خمس الغلاف الجوي وضروري لتنفس الكائنات",
                    correctAnswer = "أكسجين",
                    availableLetters = LetterScrambler.buildScrambledLetters("أكسجين", GameDifficulty.THINKING, listOf("هـ", "و", "ا", "ء"), seed = 205L),
                    hint = "رمزه الكيميائي O وتطلقه النباتات أثناء التمثيل الضوئي",
                    rewardPoints = 20,
                    explanation = "الأكسجين غاز أساسي لعملية الأيض الخلوي وحرق الوقود الحيوي في معظم الكائنات الحية.",
                    challengeId = "science_c2",
                    challengeTitle = "قوى الطبيعة والتفاعلات",
                    questionIndexInChallenge = 2,
                    visualEmoji = "💨",
                    visualTheme = "عناصر الغلاف الجوي",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 206,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "عملية حيوية تقوم بها النباتات الخضراء لصنع غذائها باستخدام ضوء الشمس والماء",
                    correctAnswer = "تمثيل",
                    availableLetters = LetterScrambler.buildScrambledLetters("تمثيل", GameDifficulty.THINKING, listOf("ش", "م", "س", "ي"), seed = 206L),
                    hint = "التمثيل الضوئي أو البناء الضوئي في أوراق الشجر",
                    rewardPoints = 20,
                    explanation = "التمثيل الضوئي يحول الطاقة الشمسية إلى طاقة كيميائية مخزنة على شكل سكريات مع إطلاق الأكسجين.",
                    challengeId = "science_c2",
                    challengeTitle = "قوى الطبيعة والتفاعلات",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌱",
                    visualTheme = "النظم البيئية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: أغلفة الأرض وتضاريسها (CHALLENGE)
        Challenge(
            id = "science_c3",
            categoryId = "science",
            title = "أغلفة الأرض وتضاريسها",
            themeDescription = "طبقات الغلاف الجوي والمائي والصخري التي تحفظ توازن الحياة",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 207,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "طبقة غازية في الستراتوسفير تمتص الأشعة فوق البنفسجية الضارة وتحمي كوكب الأرض",
                    correctAnswer = "أوزون",
                    availableLetters = LetterScrambler.buildScrambledLetters("أوزون", GameDifficulty.CHALLENGE, listOf("ش", "م", "س", "ح", "م", "ي"), seed = 207L),
                    hint = "يتكون جزيئه من ثلاث ذرات أكسجين",
                    rewardPoints = 25,
                    explanation = "طبقة الأوزون درع غازي طبيعي يحجب الأشعة الكونية الضارة التي تسبب تلف الخلايا الحية.",
                    challengeId = "science_c3",
                    challengeTitle = "أغلفة الأرض وتضاريسها",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🛡️",
                    visualTheme = "طبقات الجو",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 208,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "اهتزاز مفاجئ وسريع لطبقات القشرة الأرضية نتيجة تحرر طاقة هائلة في الصخور",
                    correctAnswer = "زلزال",
                    availableLetters = LetterScrambler.buildScrambledLetters("زلزال", GameDifficulty.CHALLENGE, listOf("هـ", "ز", "ة", "ص", "خ", "ر"), seed = 208L),
                    hint = "يقاس مقداره وشدته بمقياس ريختر",
                    rewardPoints = 25,
                    explanation = "الزلازل تنجم عن تحرك الصفائح التكتونية الأرضية على طول خطوط الصدوع الجيولوجية.",
                    challengeId = "science_c3",
                    challengeTitle = "أغلفة الأرض وتضاريسها",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌋",
                    visualTheme = "الجيولوجيا الحركية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 209,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "تجمع مائي عذب يتدفق في مسار محدد من منابعه الجبلية حتى يصب في بحر أو بحيرة",
                    correctAnswer = "نهر",
                    availableLetters = LetterScrambler.buildScrambledLetters("نهر", GameDifficulty.CHALLENGE, listOf("م", "ا", "ء", "ع", "ذ", "ب"), seed = 209L),
                    hint = "النيل ودجلة والفرات من أشهر أمثلته",
                    rewardPoints = 25,
                    explanation = "الأنهار شرايين الحياة المائية العذبة التي قامت حول ضفافها أعرق الحضارات الإنسانية.",
                    challengeId = "science_c3",
                    challengeTitle = "أغلفة الأرض وتضاريسها",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌊",
                    visualTheme = "الهيدرولوجيا والمياه",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: عناصر المادة والجدول الدوري (THINKING)
        Challenge(
            id = "science_c4",
            categoryId = "science",
            title = "عناصر المادة والجدول الدوري",
            themeDescription = "العناصر الكيميائية الأساسية وتفاعلات البنية الذرية",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 210,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "أخف العناصر الكيميائية وزناً وأكثرها وفرة في الكون ويمثل وقود تفاعلات النجوم",
                    correctAnswer = "هيدروجين",
                    availableLetters = LetterScrambler.buildScrambledLetters("هيدروجين", GameDifficulty.THINKING, listOf("ن", "ي", "ت", "ر"), seed = 210L),
                    hint = "رمزه الكيميائي في الجدول الدوري H",
                    rewardPoints = 20,
                    explanation = "الهيدروجين يمتلك بروتوناً واحداً وإلكتروناً واحداً ويشكل نحو 75% من الكتلة الباريونية في الكون.",
                    challengeId = "science_c4",
                    challengeTitle = "عناصر المادة والجدول الدوري",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🧪",
                    visualTheme = "العناصر الكيميائية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 211,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "عنصر كيميائي سائل عند درجة حرارة الغرفة يلقب بالفضة السائلة ويستخدم في موازين الحرارة القديمة",
                    correctAnswer = "زئبق",
                    availableLetters = LetterScrambler.buildScrambledLetters("زئبق", GameDifficulty.THINKING, listOf("ر", "ص", "ا", "ص"), seed = 211L),
                    hint = "الفلز الوحيد الذي يبقى سائلاً في الظروف المعيارية",
                    rewardPoints = 20,
                    explanation = "الزئبق فلز انتقالي ثقيل رمزه Hg ويتميز بكثافته العالية وقدرته على التمدد المنتظم بالحرارة.",
                    challengeId = "science_c4",
                    challengeTitle = "عناصر المادة والجدول الدوري",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌡️",
                    visualTheme = "الفلزات السائلة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 212,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "أصلب مادة طبيعية معروفة تتكون من ذرات كربون نقي مرتبة في بنية بلورية رباعية الأوجه فائقة القوة",
                    correctAnswer = "ماس",
                    availableLetters = LetterScrambler.buildScrambledLetters("ماس", GameDifficulty.THINKING, listOf("ف", "ح", "م", "ج"), seed = 212L),
                    hint = "يستخدم في قص الصخور ويعد من أثمن الأحجار الكريمة",
                    rewardPoints = 20,
                    explanation = "الماس يتشكل تحت ضغط وحرارة شديدين في باطن الأرض وتجعله روابطه التساهمية الأقوى على مقياس موس.",
                    challengeId = "science_c4",
                    challengeTitle = "عناصر المادة والجدول الدوري",
                    questionIndexInChallenge = 3,
                    visualEmoji = "💎",
                    visualTheme = "البلورات الصلبة",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: الشفرة الوراثية وأسرار الـ DNA (THINKING)
        Challenge(
            id = "science_c5",
            categoryId = "science",
            title = "الشفرة الوراثية وأسرار الـ DNA",
            themeDescription = "الأسس البيولوجية لانتقال الصفات والبرمجة الوراثية للحياة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 213,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "الجزيء الحيوي الحلزوني المزدوج الحامل للمعلومات والتعليمات الوراثية في جميع الكائنات الحية",
                    correctAnswer = "حمض",
                    availableLetters = LetterScrambler.buildScrambledLetters("حمض", GameDifficulty.THINKING, listOf("د", "ن", "ا", "ب", "ر"), seed = 213L),
                    hint = "يسمى الحمض النووي الريبوزي منقوص الأكسجين (DNA)",
                    rewardPoints = 20,
                    explanation = "الحمض النووي DNA يتكون من سلسلتين ملتفتين من النيوكليوتيدات تشفران تصنيع البروتينات الحيوية.",
                    challengeId = "science_c5",
                    challengeTitle = "الشفرة الوراثية وأسرار الـ DNA",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🧬",
                    visualTheme = "الشيفرة الحيوية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 214,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "الوحدة الأساسية للوراثة في الكائن الحي وهي قطعة محددة من الـ DNA مسؤولة عن صفة معينة",
                    correctAnswer = "جين",
                    availableLetters = LetterScrambler.buildScrambledLetters("جين", GameDifficulty.THINKING, listOf("خ", "ل", "ي", "ة"), seed = 214L),
                    hint = "تتجمع الجينات معاً داخل الكروموسومات",
                    rewardPoints = 20,
                    explanation = "الجين هو تتابع من القواعد النيتروجينية يحمل شفرة صنع بروتين يؤدي وظيفة حيوية بالجسم.",
                    challengeId = "science_c5",
                    challengeTitle = "الشفرة الوراثية وأسرار الـ DNA",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🔬",
                    visualTheme = "الوحدات الوراثية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 215,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "تغير دائم ومفاجئ في التسلسل الجيني للـ DNA قد يورث وينتج عنه صفات جديدة أو طفرات وراثية",
                    correctAnswer = "طفرة",
                    availableLetters = LetterScrambler.buildScrambledLetters("طفرة", GameDifficulty.THINKING, listOf("ت", "غ", "ي", "ر"), seed = 215L),
                    hint = "تعد المصدر الأساسي للتنوع الوراثي والتطور البيولوجي",
                    rewardPoints = 20,
                    explanation = "الطفرات الجينية تنتج عن أخطاء أثناء نسخ الـ DNA أو بفعل مؤثرات بيئية كالإشعاعات والمواد الكيميائية.",
                    challengeId = "science_c5",
                    challengeTitle = "الشفرة الوراثية وأسرار الـ DNA",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔄",
                    visualTheme = "التنوع الجيني",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: ديناميكية الأرض والصفائح التكتونية (THINKING)
        Challenge(
            id = "science_c6",
            categoryId = "science",
            title = "ديناميكية الأرض والصفائح التكتونية",
            themeDescription = "بنية باطن الأرض وحركة القارات وتكوين البراكين والجبال",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 216,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "فتحة أو شق في القشرة الأرضية تتدفق عبرها الصخور المنصهرة والرماد والغازات الحبيسة من باطن الأرض",
                    correctAnswer = "بركان",
                    availableLetters = LetterScrambler.buildScrambledLetters("بركان", GameDifficulty.THINKING, listOf("ز", "ل", "ز", "ا", "ل"), seed = 216L),
                    hint = "يقذف الحمم البركانية واللافا عند ثورانه",
                    rewardPoints = 20,
                    explanation = "البراكين تنشأ نتيجة تصاعد الصهارة (الماغما) تحت ضغط عالٍ نحو سطح القشرة الأرضية.",
                    challengeId = "science_c6",
                    challengeTitle = "ديناميكية الأرض والصفائح التكتونية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌋",
                    visualTheme = "الظواهر الجيولوجية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 217,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "الطبقة الصخرية الصلبة الخارجية الرقيقة التي تغلف كوكب الأرض ونعيش عليها",
                    correctAnswer = "قشرة",
                    availableLetters = LetterScrambler.buildScrambledLetters("قشرة", GameDifficulty.THINKING, listOf("و", "ش", "ا", "ح"), seed = 217L),
                    hint = "تنقسم إلى قشرة قارية سميكة وقشرة محيطية أقل سمكاً",
                    rewardPoints = 20,
                    explanation = "القشرة الأرضية تمثل أقل من 1% من حجم الأرض وتطفو فوق طبقة الوشاح الأكثر مرونة.",
                    challengeId = "science_c6",
                    challengeTitle = "ديناميكية الأرض والصفائح التكتونية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌍",
                    visualTheme = "طبقات الأرض",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 218,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "الصخور المنصهرة الحارة جداً المتدفقة من فوهة البركان بعد وصولها إلى سطح الأرض",
                    correctAnswer = "حمم",
                    availableLetters = LetterScrambler.buildScrambledLetters("حمم", GameDifficulty.THINKING, listOf("ر", "م", "ا", "د"), seed = 218L),
                    hint = "تسمى أيضاً باللافا وتتحول لصخور نارية عند تجمدها",
                    rewardPoints = 20,
                    explanation = "الحمم البركانية تتجاوز حرارتها 700 إلى 1200 درجة مئوية وتتصلب مكونة تضاريس بركانية جديدة.",
                    challengeId = "science_c6",
                    challengeTitle = "ديناميكية الأرض والصفائح التكتونية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔥",
                    visualTheme = "الصخور المنصهرة",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: الديناميكا الحرارية وتحولات الطاقة (CHALLENGE)
        Challenge(
            id = "science_c7",
            categoryId = "science",
            title = "الديناميكا الحرارية وتحولات الطاقة",
            themeDescription = "انتقال الحرارة وحفظ الطاقة ومقاييس درجة الحرارة المطلقة",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 219,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "أدنى درجة حرارة نظرية ممكنة تتوقف عندها حركة الجزيئات تماماً وتعادل 273.15 مئوية تحت الصفر",
                    correctAnswer = "مطلق",
                    availableLetters = LetterScrambler.buildScrambledLetters("مطلق", GameDifficulty.CHALLENGE, listOf("ص", "ف", "ر", "ك", "ل", "ف"), seed = 219L),
                    hint = "يسمى بالصفر المطلق وهو نقطة بداية مقياس كلفن",
                    rewardPoints = 25,
                    explanation = "الصفر المطلق (0 كلفن) يمثل الحالة التي تصل فيها الطاقة الحركية للذرات إلى حدها الأدنى في ميكانيكا الكم.",
                    challengeId = "science_c7",
                    challengeTitle = "الديناميكا الحرارية وتحولات الطاقة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "❄️",
                    visualTheme = "البرودة القصوى",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 220,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "مقياس درجة العشوائية والاضطراب في نظام ديناميكي حراري مغلق والذي يميل دائماً للزيادة",
                    correctAnswer = "إنتروبيا",
                    availableLetters = LetterScrambler.buildScrambledLetters("إنتروبيا", GameDifficulty.CHALLENGE, listOf("ط", "ا", "ق", "ة", "ح", "ر"), seed = 220L),
                    hint = "القانون الثاني للديناميكا الحرارية يحدد اتجاه سهم الزمن بها",
                    rewardPoints = 25,
                    explanation = "الإنتروبيا تعبر عن فقدان الطاقة القابلة للاستخدام وتحولها إلى طاقة حرارية مبعثرة غير منتظمة.",
                    challengeId = "science_c7",
                    challengeTitle = "الديناميكا الحرارية وتحولات الطاقة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌪️",
                    visualTheme = "قوانين الحرارة",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 221,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "طريقة انتقال الحرارة عبر الموائع (السوائل والغازات) بحركة التيارات الصاعدة الساخنة والهابطة الباردة",
                    correctAnswer = "حمل",
                    availableLetters = LetterScrambler.buildScrambledLetters("حمل", GameDifficulty.CHALLENGE, listOf("ت", "و", "ص", "ي", "ل", "ا"), seed = 221L),
                    hint = "تسمى تيارات الحمل الحراري المسؤولة عن تشكل الرياح",
                    rewardPoints = 25,
                    explanation = "انتقال الحرارة بالحمل يعتمد على تغير كثافة المائع مع تغير درجة حرارته مسبباً حركة تدفق مستمرة.",
                    challengeId = "science_c7",
                    challengeTitle = "الديناميكا الحرارية وتحولات الطاقة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "♨️",
                    visualTheme = "انتقال الحرارة",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: الضوء والأطياف الموجية (CHALLENGE)
        Challenge(
            id = "science_c8",
            categoryId = "science",
            title = "الضوء والأطياف الموجية",
            themeDescription = "انكسار الضوء وانعكاسه والخصائص الموجية والجسيمية للفوتونات",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 222,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "انحراف مسار شعاع الضوء عند انتقاله بين وسطين شفافين مختلفين في الكثافة الضوئية كالماء والهواء",
                    correctAnswer = "انكسار",
                    availableLetters = LetterScrambler.buildScrambledLetters("انكسار", GameDifficulty.CHALLENGE, listOf("ا", "ن", "ع", "ك", "ا", "س"), seed = 222L),
                    hint = "يجعل الملعقة تبدو مكسورة داخل كوب الماء",
                    rewardPoints = 25,
                    explanation = "انكسار الضوء ينشأ عن تغير سرعة انتشار الموجة الضوئية عند انتقالها بين وسائط ذات معاملات انكسار مختلفة.",
                    challengeId = "science_c8",
                    challengeTitle = "الضوء والأطياف الموجية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌈",
                    visualTheme = "انحراف الضوء",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 223,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "الجسيم الأولي الكمي الذي يحمل الطاقة الكهرومغناطيسية وينتشر بسرعة الضوء دون كتلة سكونية",
                    correctAnswer = "فوتون",
                    availableLetters = LetterScrambler.buildScrambledLetters("فوتون", GameDifficulty.CHALLENGE, listOf("إ", "ل", "ك", "ت", "ر", "و"), seed = 223L),
                    hint = "الكم الضوئي الأساسي الذي فسره آينشتاين في الظاهرة الكهروضوئية",
                    rewardPoints = 25,
                    explanation = "الفوتون هو وحدة الطاقة الضوئية ويتصرف كجسيم وموجة في آن واحد وفق مبدأ الثنائية الموجية الجسيمية.",
                    challengeId = "science_c8",
                    challengeTitle = "الضوء والأطياف الموجية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "💡",
                    visualTheme = "كمات الضوء",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 224,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "أداة زجاجية مثلثة الشكل تقوم بتحليل الضوء الأبيض المرئي إلى ألوان الطيف السبعة عبر الانكسار",
                    correctAnswer = "منشور",
                    availableLetters = LetterScrambler.buildScrambledLetters("منشور", GameDifficulty.CHALLENGE, listOf("م", "ر", "آ", "ة", "ع", "د"), seed = 224L),
                    hint = "استخدمه إسحاق نيوتن لإثبات طبيعة الضوء المركبة",
                    rewardPoints = 25,
                    explanation = "المنشور الزجاجي يفصل ألوان الضوء لأن لكل لون طولاً موجياً مختلفاً ينكسر بزاوية خاصة.",
                    challengeId = "science_c8",
                    challengeTitle = "الضوء والأطياف الموجية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔺",
                    visualTheme = "تحليل الأطياف",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: الكيمياء العضوية والجزيئات العملاقة (EXPERT)
        Challenge(
            id = "science_c9",
            categoryId = "science",
            title = "الكيمياء العضوية والجزيئات العملاقة",
            themeDescription = "مركبات الكربون المعقدة وبنية البروتينات والبوليمرات الحيوية",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 225,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "العنصر الكيميائي الأساسي في جميع المركبات العضوية الحية بقدرته الفريدة على تكوين أربع روابط تساهمية",
                    correctAnswer = "كربون",
                    availableLetters = LetterScrambler.buildScrambledLetters("كربون", GameDifficulty.EXPERT, listOf("ن", "ي", "ت", "ر", "و", "ج", "ي"), seed = 225L),
                    hint = "يشكل العمود الفقري لسلاسل الحياة الكيميائية",
                    rewardPoints = 30,
                    explanation = "الكربون يستطيع الارتباط بذرات أخرى وبنفسه مشكلاً سلاسل وحلقات مستقرة ومتنوعة لا حصر لها.",
                    challengeId = "science_c9",
                    challengeTitle = "الكيمياء العضوية والجزيئات العملاقة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⚗️",
                    visualTheme = "الكيمياء الحيوية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 226,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "مادة كيميائية حيوية تفرزها الكائنات تعمل كمحفز يسرع التفاعلات الكيميائية دون أن تستهلك فيها",
                    correctAnswer = "إنزيم",
                    availableLetters = LetterScrambler.buildScrambledLetters("إنزيم", GameDifficulty.EXPERT, listOf("ه", "ر", "م", "و", "ن", "ب", "ر"), seed = 226L),
                    hint = "معظم الإنزيمات هي بروتينات دقيقة التخصص في عملها",
                    rewardPoints = 30,
                    explanation = "الإنزيمات تخفض طاقة التنشيط اللازمة للتفاعل الكيميائي وتسمح بحدوث آلاف التفاعلات الحيوية في ثوانٍ.",
                    challengeId = "science_c9",
                    challengeTitle = "الكيمياء العضوية والجزيئات العملاقة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🔑",
                    visualTheme = "المحفزات الحيوية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 227,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "جزيء عضوي ضخم يتكون من تكرار وحدات بنائية صغيرة متماثلة تسمى المونومرات ترتبط بروابط تساهمية",
                    correctAnswer = "بوليمر",
                    availableLetters = LetterScrambler.buildScrambledLetters("بوليمر", GameDifficulty.EXPERT, listOf("ب", "ل", "ا", "س", "ت", "ي", "ك"), seed = 227L),
                    hint = "من أمثلته البروتينات والنشا والبلاستيك والمطاط",
                    rewardPoints = 30,
                    explanation = "البوليمرات تشمل المركبات الطبيعية الحيوية كالحمض النووي والسليلوز، والصناعية كالألياف الاصطناعية.",
                    challengeId = "science_c9",
                    challengeTitle = "الكيمياء العضوية والجزيئات العملاقة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "⛓️",
                    visualTheme = "السلاسل الجزيئية",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: ميكانيكا الكم والجسيمات الأولية (EXPERT)
        Challenge(
            id = "science_c10",
            categoryId = "science",
            title = "ميكانيكا الكم والجسيمات الأولية",
            themeDescription = "عالم ما دون الذرة ومبادئ الريبة والتراكب والتشابك الكمي",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 228,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "جسيم أولي دون ذري يشكل مع جسيمات أخرى البروتونات والنيوترونات داخل نواة الذرة",
                    correctAnswer = "كوارك",
                    availableLetters = LetterScrambler.buildScrambledLetters("كوارك", GameDifficulty.EXPERT, listOf("ل", "ب", "ت", "و", "ن", "ب", "و"), seed = 228L),
                    hint = "يوجد منه ست نكهات أشهرها العلوي والسفلي",
                    rewardPoints = 35,
                    explanation = "الكواركات لا توجد منفردة في الطبيعة بحسب نظرية الحبس اللوني، بل ترتبط بقوة نووية شديدة بواسطة الغلونات.",
                    challengeId = "science_c10",
                    challengeTitle = "ميكانيكا الكم والجسيمات الأولية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⚛️",
                    visualTheme = "الجسيمات الأولية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 229,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "مبدأ كمي وضعه هايزنبرغ ينص على استحالة تحديد موقع وسرعة جسيم دون ذري بدقة متناهية في آن واحد",
                    correctAnswer = "ريبة",
                    availableLetters = LetterScrambler.buildScrambledLetters("ريبة", GameDifficulty.EXPERT, listOf("ش", "ك", "ح", "ت", "م", "ي", "ة"), seed = 229L),
                    hint = "يعرف أيضاً بمبدأ عدم اليقين أو اللايقين الكمي",
                    rewardPoints = 35,
                    explanation = "مبدأ الريبة خاصية جوهرية للأنظمة الكمومية الناتجة عن الطبيعة الموجية التموجية للمادة.",
                    challengeId = "science_c10",
                    challengeTitle = "ميكانيكا الكم والجسيمات الأولية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🎯",
                    visualTheme = "قوانين الكم",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 230,
                    categoryId = "science",
                    category = "بيت العلوم والطبيعة",
                    question = "بوزون جسيمي أولي يمنح الكتلة للجسيمات الأخرى في النموذج القياسي عبر مجاله المنتشر في الكون",
                    correctAnswer = "هيغز",
                    availableLetters = LetterScrambler.buildScrambledLetters("هيغز", GameDifficulty.EXPERT, listOf("ف", "ي", "ر", "م", "ي", "و", "ن"), seed = 230L),
                    hint = "اكتشف في مصادم الهادرونات الكبير بسيرن عام 2012",
                    rewardPoints = 35,
                    explanation = "بوزون هيغز وحقله هو الآلية المسؤولة عن اكتساب الجسيمات الأولية كتلتها عبر التفاعل مع الحقل.",
                    challengeId = "science_c10",
                    challengeTitle = "ميكانيكا الكم والجسيمات الأولية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "⚡",
                    visualTheme = "حقل الكتلة",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
