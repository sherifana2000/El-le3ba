package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object ArabicLiteratureChallenges {

    val challenges = listOf(
        // Challenge 1: أفنان لغة الضاد (EXPLORATION)
        Challenge(
            id = "arabic_literature_c1",
            categoryId = "arabic_literature",
            title = "أفنان لغة الضاد",
            themeDescription = "خصائص ومفردات وبلاغة اللغة العربية الفصحى",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 601,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "الحرف الهجائي الفريد الذي تنفرد به اللغة العربية دون سائر لغات العالم وتلقب باسمه",
                    correctAnswer = "ضاد",
                    availableLetters = LetterScrambler.buildScrambledLetters("ضاد", GameDifficulty.EXPLORATION, listOf("ل", "غ", "ة"), seed = 601L),
                    hint = "لغة الضاد الخالدة",
                    rewardPoints = 15,
                    explanation = "سميت العربية بلغة الضاد لصعوبة نطق هذا الصوت الحلقي الفريد على غير الناطقين بها.",
                    challengeId = "arabic_literature_c1",
                    challengeTitle = "أفنان لغة الضاد",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📜",
                    visualTheme = "أصوات اللغة",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 602,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "كتاب لغوي جامع يشرح معاني المفردات وأصول الكلمات واشتقاقاتها كلسان العرب والقاموس المحيط",
                    correctAnswer = "معجم",
                    availableLetters = LetterScrambler.buildScrambledLetters("معجم", GameDifficulty.EXPLORATION, listOf("ك", "ت", "ا", "ب"), seed = 602L),
                    hint = "المعجم أو القاموس اللغوي",
                    rewardPoints = 15,
                    explanation = "المعاجم العربية تعد من أضخم وأدق المعاجم في تاريخ اللغات لتوثيقها ملايين الألفاظ وجذورها.",
                    challengeId = "arabic_literature_c1",
                    challengeTitle = "أفنان لغة الضاد",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📖",
                    visualTheme = "المعاجم العربية",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 603,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "فن كتابة الحروف العربية بأشكال جمالية متناسقة كالكوفي والرقعة والنسخ والديواني والثلث",
                    correctAnswer = "خط",
                    availableLetters = LetterScrambler.buildScrambledLetters("خط", GameDifficulty.EXPLORATION, listOf("ق", "ل", "م", "ح"), seed = 603L),
                    hint = "الخط العربي الأصيل",
                    rewardPoints = 20,
                    explanation = "الخط العربي فن بصري وهندسي راق ارتبط بتدوين المصحف الشريف والزخارف المعمارية.",
                    challengeId = "arabic_literature_c1",
                    challengeTitle = "أفنان لغة الضاد",
                    questionIndexInChallenge = 3,
                    visualEmoji = "✒️",
                    visualTheme = "فنون الخط",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: ديوان العرب والقوافي (THINKING)
        Challenge(
            id = "arabic_literature_c2",
            categoryId = "arabic_literature",
            title = "ديوان العرب والقوافي",
            themeDescription = "الشعر العربي وأوزان الخليل والمعلقات الخالدة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 604,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "قصائد جاهلية نفيسة علقت على أستار الكعبة لبلاغتها وجمال فصاحتها الشعرية",
                    correctAnswer = "معلقات",
                    availableLetters = LetterScrambler.buildScrambledLetters("معلقات", GameDifficulty.THINKING, listOf("ش", "ع", "ر", "ك"), seed = 604L),
                    hint = "المعلقات السبع أو العشر لأمرئ القيس وعنترة",
                    rewardPoints = 20,
                    explanation = "المعلقات تمثل قمة التعبير الشعري الجاهلي وموسوعة للحياة البدوية والفروسية والقيم العربية.",
                    challengeId = "arabic_literature_c2",
                    challengeTitle = "ديوان العرب والقوافي",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏆",
                    visualTheme = "المعلقات الشعرية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 605,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "علم موسيقى الشعر وأوزانه وبحوره الستة عشر الذي ابتكره العبقري الخليل بن أحمد الفراهيدي",
                    correctAnswer = "عروض",
                    availableLetters = LetterScrambler.buildScrambledLetters("عروض", GameDifficulty.THINKING, listOf("ب", "ح", "ر", "ن"), seed = 605L),
                    hint = "علم العروض وميزان الشعر العربي",
                    rewardPoints = 20,
                    explanation = "علم العروض يضبط إيقاع القصيدة العربية عبر تفاعيل موزونة تقاس بالحركات والسكنات.",
                    challengeId = "arabic_literature_c2",
                    challengeTitle = "ديوان العرب والقوافي",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🎵",
                    visualTheme = "موسيقى الشعر",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 606,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "الحرف الأخير من كل بيت شعري في القصيدة تلتزم به القافية وتنسب القصيدة إليه كاللامية والسينية",
                    correctAnswer = "روي",
                    availableLetters = LetterScrambler.buildScrambledLetters("روي", GameDifficulty.THINKING, listOf("ق", "ا", "ف", "ي"), seed = 606L),
                    hint = "حرف الروي في علم القوافي",
                    rewardPoints = 20,
                    explanation = "الروي هو الحرف الذي يبني عليه الشاعر قصيدته ويكرره في نهاية كل شطر لتكتمل رنة الإيقاع.",
                    challengeId = "arabic_literature_c2",
                    challengeTitle = "ديوان العرب والقوافي",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🪶",
                    visualTheme = "علم القافية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: فرسان البيان والبلاغة (CHALLENGE)
        Challenge(
            id = "arabic_literature_c3",
            categoryId = "arabic_literature",
            title = "فرسان البيان والبلاغة",
            themeDescription = "شعراء وأدباء البلاغة العربية الكلاسيكية وأمراء البيان",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 607,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "شاعر الحكمة والفلسفة العباسي الأسطوري صاحب ديوان الحكمة والقائل: الخيل والليل والبيداء تعرفني",
                    correctAnswer = "متنبي",
                    availableLetters = LetterScrambler.buildScrambledLetters("متنبي", GameDifficulty.CHALLENGE, listOf("ش", "ا", "ع", "ر", "س", "ي"), seed = 607L),
                    hint = "أبو الطيب المتنبي مالك زمام الشعر",
                    rewardPoints = 25,
                    explanation = "المتنبي يعد أشهر شعراء العربية على الإطلاق لجزالة ألفاظه وخلود أمثاله وحكمه الشعرية.",
                    challengeId = "arabic_literature_c3",
                    challengeTitle = "فرسان البيان والبلاغة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "👑",
                    visualTheme = "الشعر العباسي",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 608,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "فارس وشاعر جاهلي من أصحاب المعلقات اشتهر بقوته وشجاعته وعفته ومحبته لعبلة",
                    correctAnswer = "عنترة",
                    availableLetters = LetterScrambler.buildScrambledLetters("عنترة", GameDifficulty.CHALLENGE, listOf("ف", "ا", "ر", "س", "س", "ي"), seed = 608L),
                    hint = "عنترة بن شداد العبسي",
                    rewardPoints = 25,
                    explanation = "عنترة جمع بين البطولة في سوح الوغى والرقة في التعبير الشعري، واشتهرت معلقته بفخرها وعفتها.",
                    challengeId = "arabic_literature_c3",
                    challengeTitle = "فرسان البيان والبلاغة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "⚔️",
                    visualTheme = "الفروسية والأدب",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 609,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "أديب عباسي رائد وفيلسوف البلاغة صاحب كتابي (الحيوان) و(البيان والتبيين)",
                    correctAnswer = "جاحظ",
                    availableLetters = LetterScrambler.buildScrambledLetters("جاحظ", GameDifficulty.CHALLENGE, listOf("ب", "ص", "ر", "ة", "ك", "ت"), seed = 609L),
                    hint = "عمرو بن بحر الجاحظ في البصرة",
                    rewardPoints = 25,
                    explanation = "الجاحظ إمام النثر العربي الكلاسيكي ومؤسس علم البيان والأسلوب الأدبي الساخر الرصين.",
                    challengeId = "arabic_literature_c3",
                    challengeTitle = "فرسان البيان والبلاغة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📜",
                    visualTheme = "النثر العربي",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: علم البيان وأسرار التشبيه والمجاز (THINKING)
        Challenge(
            id = "arabic_literature_c4",
            categoryId = "arabic_literature",
            title = "علم البيان وأسرار التشبيه والمجاز",
            themeDescription = "الفنون البلاغية والتشبيه والاستعارة والكناية في اللسان العربي",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 610,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "تشبيه حُذف أحد طرفيه المشبه أو المشبه به لغرض بلاغي جمالي دقيق",
                    correctAnswer = "استعارة",
                    availableLetters = LetterScrambler.buildScrambledLetters("استعارة", GameDifficulty.THINKING, listOf("ك", "ن", "ا", "ي"), seed = 610L),
                    hint = "تنقسم إلى تصريحية ومكنية في علم البيان",
                    rewardPoints = 20,
                    explanation = "الاستعارة تعتبر من أبلغ أساليب اللغة العربية وتنقل المعنى من الحقيقة إلى المجاز لإبراز الصورة التعبيرية.",
                    challengeId = "arabic_literature_c4",
                    challengeTitle = "علم البيان وأسرار التشبيه والمجاز",
                    questionIndexInChallenge = 1,
                    visualEmoji = "✒️",
                    visualTheme = "البلاغة العربية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 611,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "لفظ أطلق وأريد به لازم معناه مع جواز إرادة المعنى الأصلي لعدم وجود قرينة مانعة",
                    correctAnswer = "كناية",
                    availableLetters = LetterScrambler.buildScrambledLetters("كناية", GameDifficulty.THINKING, listOf("م", "ج", "ا", "ز"), seed = 611L),
                    hint = "مثل قولهم فلان كثير الرماد للدلالة على الكرم والجود",
                    rewardPoints = 20,
                    explanation = "الكناية تدل على المعنى مصحوباً بدليله وتتنوع إلى كناية عن صفة أو موصوف أو نسبة.",
                    challengeId = "arabic_literature_c4",
                    challengeTitle = "علم البيان وأسرار التشبيه والمجاز",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📜",
                    visualTheme = "علم البيان",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 612,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "محسن بديعي لفظي يقوم على توافق الحروف الأخيرة في فواصل الجمل النثرية",
                    correctAnswer = "سجع",
                    availableLetters = LetterScrambler.buildScrambledLetters("سجع", GameDifficulty.THINKING, listOf("ط", "ب", "ا", "ق"), seed = 612L),
                    hint = "يمنح الكلام النثري جرساً موسيقياً وإيقاعاً عذباً",
                    rewardPoints = 20,
                    explanation = "السجع فن نثري قديم ازدهر في المقامات والرسائل الديوانية وخطب البلغاء والأمثال العربية.",
                    challengeId = "arabic_literature_c4",
                    challengeTitle = "علم البيان وأسرار التشبيه والمجاز",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🎶",
                    visualTheme = "المحسنات البديعية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: فحول الشعر في العصرين الأموي والعباسي (THINKING)
        Challenge(
            id = "arabic_literature_c5",
            categoryId = "arabic_literature",
            title = "فحول الشعر في العصرين الأموي والعباسي",
            themeDescription = "شعراء النقائض والحكمة والوصف والموشحات",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 613,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "شاعر عباسي حكيم وفيلسوف لقب بشاعر العقل وألّف ملحمة اللزوميات وعاش رهين المحبسين",
                    correctAnswer = "معري",
                    availableLetters = LetterScrambler.buildScrambledLetters("معري", GameDifficulty.THINKING, listOf("ب", "ح", "ت", "ر"), seed = 613L),
                    hint = "أبو العلاء ... صاحب رسالة الغفران الشاعر الضرير",
                    rewardPoints = 20,
                    explanation = "أبو العلاء المعري لزم بيته وعزلته واشتهر بفلسفته العميقة وشعره الزاهد وإتقانه الفائق لمفردات اللغة.",
                    challengeId = "arabic_literature_c5",
                    challengeTitle = "فحول الشعر في العصرين الأموي والعباسي",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📚",
                    visualTheme = "حكماء الشعر",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 614,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "شاعر عباسي مفلق اشتهر بديباجة شعره العذبة ووصفه الرائع لربيع الطبيعة وقصر الخورنق",
                    correctAnswer = "بحتري",
                    availableLetters = LetterScrambler.buildScrambledLetters("بحتري", GameDifficulty.THINKING, listOf("ت", "م", "ا", "م"), seed = 614L),
                    hint = "صاحب السينية الشهيرة في إيوان كسرى",
                    rewardPoints = 20,
                    explanation = "البحتري تميز بجمال الإيقاع والموسيقى اللفظية وكان قريناً لأبي تمام في سماء البلاغة العباسية.",
                    challengeId = "arabic_literature_c5",
                    challengeTitle = "فحول الشعر في العصرين الأموي والعباسي",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌸",
                    visualTheme = "شعر الوصف",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 615,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "شاعر أموي بدوي فصيح اشتهر بالنقائض الشعرية والمفاخرة مع جرير في البصرة",
                    correctAnswer = "فرزدق",
                    availableLetters = LetterScrambler.buildScrambledLetters("فرزدق", GameDifficulty.THINKING, listOf("أ", "خ", "ط", "ل"), seed = 615L),
                    hint = "قيل لولاه لذهب ثلث لغة العرب",
                    rewardPoints = 20,
                    explanation = "الفرزدق (همام بن غالب) عُرف بقوة لغته وجزالة ألفاظه وقصيدته التاريخية الخالدة في مدح علي بن الحسين.",
                    challengeId = "arabic_literature_c5",
                    challengeTitle = "فحول الشعر في العصرين الأموي والعباسي",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🏛️",
                    visualTheme = "شعر النقائض",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: أمهات المعاجم اللغوية ومصادر الفصحى (THINKING)
        Challenge(
            id = "arabic_literature_c6",
            categoryId = "arabic_literature",
            title = "أمهات المعاجم اللغوية ومصادر الفصحى",
            themeDescription = "لسان العرب والقاموس المحيط وعبقرية تصنيف المفردات",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 616,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "أضخم معجم لغوي في التراث العربي يجمع ألفاظ الفصحى وشواهدها ألفه العلامة ابن منظور",
                    correctAnswer = "لسان",
                    availableLetters = LetterScrambler.buildScrambledLetters("لسان", GameDifficulty.THINKING, listOf("ع", "ي", "ن", "ت"), seed = 616L),
                    hint = "يسمى ... العرب ويقع في عشرين مجلداً ضخماً",
                    rewardPoints = 20,
                    explanation = "معجم لسان العرب جمع بين الاستيعاب المعجمي والشواهد القرآنية والحديثية والشعرية بأعلى درجات التوثيق.",
                    challengeId = "arabic_literature_c6",
                    challengeTitle = "أمهات المعاجم اللغوية ومصادر الفصحى",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📖",
                    visualTheme = "أمهات المعاجم",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 617,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "معجم لغوي شهير وشامل ألفه الفيروزآبادي واشتهر حتى أصبح اسمه مرادفاً لكلمة معجم",
                    correctAnswer = "قاموس",
                    availableLetters = LetterScrambler.buildScrambledLetters("قاموس", GameDifficulty.THINKING, listOf("م", "ح", "ي", "ط"), seed = 617L),
                    hint = "سماه ... المحيط والقابوس الوسيط",
                    rewardPoints = 20,
                    explanation = "القاموس المحيط تميز بدقة الاختصار ورموز الإشارات المعجمية وانتشر انتشاراً هائلاً في أرجاء العالم الإسلامي.",
                    challengeId = "arabic_literature_c6",
                    challengeTitle = "أمهات المعاجم اللغوية ومصادر الفصحى",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📕",
                    visualTheme = "المعاجم المحيطة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 618,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "كتاب رائد في النثر ألفه بديع الزمان الهمذاني وابتكر فيه فن الحكايات القصيرة المسجوعة للبطل عيسى بن هشام",
                    correctAnswer = "مقامات",
                    availableLetters = LetterScrambler.buildScrambledLetters("مقامات", GameDifficulty.THINKING, listOf("ر", "س", "ا", "ئ"), seed = 618L),
                    hint = "فن المقامات الأدبي الشهير الذي تلاه الحريري",
                    rewardPoints = 20,
                    explanation = "المقامات مزجت بين الفكاهة والكدية والبراعة اللغوية النادرة في إيراد الغريب والبديع.",
                    challengeId = "arabic_literature_c6",
                    challengeTitle = "أمهات المعاجم اللغوية ومصادر الفصحى",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📜",
                    visualTheme = "أدب المقامات",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: النحو العربي وأصول المدارس النحوية (CHALLENGE)
        Challenge(
            id = "arabic_literature_c7",
            categoryId = "arabic_literature",
            title = "النحو العربي وأصول المدارس النحوية",
            themeDescription = "مدارس البصرة والكوفة وقواعد الإعراب التوليدية",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 619,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "إمام النحاة صاحب أول كتاب متكامل يوثق قواعد اللغة العربية عرف كتابه بـ الكتاب",
                    correctAnswer = "سيبويه",
                    availableLetters = LetterScrambler.buildScrambledLetters("سيبويه", GameDifficulty.CHALLENGE, listOf("ك", "س", "ا", "ئ", "ي", "ف"), seed = 619L),
                    hint = "تلميذ الخليل بن أحمد الفراهيدي وأعظم علماء البصرة",
                    rewardPoints = 25,
                    explanation = "سيبويه وضع دستورا للنحو العربي في كتابه العظيم الذي ظل المرجع الأول لنحاة الشرق والغرب.",
                    challengeId = "arabic_literature_c7",
                    challengeTitle = "النحو العربي وأصول المدارس النحوية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🖋️",
                    visualTheme = "أئمة النحو",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 620,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "تغير يطرأ على أواخر الكلمات العربية ضبطاً وحركة باختلاف العوامل الداخلة عليها",
                    correctAnswer = "إعراب",
                    availableLetters = LetterScrambler.buildScrambledLetters("إعراب", GameDifficulty.CHALLENGE, listOf("ب", "ن", "ا", "ء", "ص", "ر"), seed = 620L),
                    hint = "خاصية اللسان العربي الفارق بين الفاعل والمفعول",
                    rewardPoints = 25,
                    explanation = "الإعراب هو وسيلة البيان الأساسية لتحديد العلاقات الوظيفية بين الكلمات كالفاعلية والمفعولية والإضافة.",
                    challengeId = "arabic_literature_c7",
                    challengeTitle = "النحو العربي وأصول المدارس النحوية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📐",
                    visualTheme = "قواعد الإعراب",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 621,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "ألفية شعرية شهيرة في النحو والصرف ألفها ابن مالك الأندلسي وشرحها كبار العلماء",
                    correctAnswer = "ألفية",
                    availableLetters = LetterScrambler.buildScrambledLetters("ألفية", GameDifficulty.CHALLENGE, listOf("ش", "ا", "ف", "ي", "ة", "ك"), seed = 621L),
                    hint = "تبدأ بـ: قال محمد هو ابن مالك .. أحمد ربي الله خير مالك",
                    rewardPoints = 25,
                    explanation = "ألفية ابن مالك تضم ألف بيت من بحر الرجز لخصت القواعد النحوية بطريقة محكمة سهلة الحفظ.",
                    challengeId = "arabic_literature_c7",
                    challengeTitle = "النحو العربي وأصول المدارس النحوية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📜",
                    visualTheme = "المنظومات النحوية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: فردوس الأندلس وفن الموشحات (CHALLENGE)
        Challenge(
            id = "arabic_literature_c8",
            categoryId = "arabic_literature",
            title = "فردوس الأندلس وفن الموشحات",
            themeDescription = "شعر الطبيعة والحنين والموشحات الأندلسية المتنوعة الأوزان",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 622,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "فن شعري غنائي أندلسي مبتكر خرج عن نظام القصيدة التقليدية ذات القافية الواحدة إلى أدوار وأقفال",
                    correctAnswer = "موشح",
                    availableLetters = LetterScrambler.buildScrambledLetters("موشح", GameDifficulty.CHALLENGE, listOf("ز", "ج", "ل", "د", "و", "ب"), seed = 622L),
                    hint = "مشتق من الوشاح لجمال ترصيعه وتنوع قوافيه",
                    rewardPoints = 25,
                    explanation = "الموشحات ابتكرها مقدم بن معافى القبري وازدهرت مع الغناء الأندلسي وعمت أرجاء المشرق والمغرب.",
                    challengeId = "arabic_literature_c8",
                    challengeTitle = "فردوس الأندلس وفن الموشحات",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🎶",
                    visualTheme = "موشحات الأندلس",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 623,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "شاعر أندلسي ووزير شهير لقب بشاعر قرطبة وربطته قصة حب ملحمية مع الشاعرة ولادة بنت المستكفي",
                    correctAnswer = "زيدون",
                    availableLetters = LetterScrambler.buildScrambledLetters("زيدون", GameDifficulty.CHALLENGE, listOf("خ", "ف", "ا", "ج", "ة", "ه"), seed = 623L),
                    hint = "ابن ... صاحب النونية الخالدة: أضحى التنائي بديلاً من تدانينا",
                    rewardPoints = 25,
                    explanation = "ابن زيدون كان شاعر الوزارتين وأحد أرق شعراء الحب والوفاء ووصف الرياض الأندلسية في الزهراء.",
                    challengeId = "arabic_literature_c8",
                    challengeTitle = "فردوس الأندلس وفن الموشحات",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌹",
                    visualTheme = "شعر الحب العذري",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 624,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "البيت الأخير أو القفلة الختامية في الموشح الأندلسي وغالباً ما تصاغ باللغة العامية أو الأعجمية الخرجة",
                    correctAnswer = "خرجة",
                    availableLetters = LetterScrambler.buildScrambledLetters("خرجة", GameDifficulty.CHALLENGE, listOf("ق", "ف", "ل", "د", "و", "ر"), seed = 624L),
                    hint = "الجزء الذي يختتم به الموشح وتعتمد عليه موسيقاه",
                    rewardPoints = 25,
                    explanation = "الخرجة هي العنصر الأكثر تميزاً في الموشح وكانت تعكس التمازج الثقافي واللغوي البديع في المجتمع الأندلسي.",
                    challengeId = "arabic_literature_c8",
                    challengeTitle = "فردوس الأندلس وفن الموشحات",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🎼",
                    visualTheme = "ألحان الموشح",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: اللسانيات وعلم الصرف والاشتقاق (EXPERT)
        Challenge(
            id = "arabic_literature_c9",
            categoryId = "arabic_literature",
            title = "اللسانيات وعلم الصرف والاشتقاق",
            themeDescription = "الأوزان الصرفية وجذور الكلمات وخصائص الاشتقاق الأكبر والأصغر",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 625,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "علم لغوي يبحث في بنية الكلمة العربية وصيغها وما يطرأ على حروفها من زيادة أو حذف أو إبدال",
                    correctAnswer = "صرف",
                    availableLetters = LetterScrambler.buildScrambledLetters("صرف", GameDifficulty.EXPERT, listOf("ن", "ح", "و", "ب", "ي", "ا", "ن"), seed = 625L),
                    hint = "يقترن دائماً بالنحو ويعتمد الميزان الصرفي (فعل)",
                    rewardPoints = 30,
                    explanation = "علم الصرف يكشف أصول الكلمات وأوزانها وهو ميزان صياغة المشتقات كاسم الفاعل والمفعول واسم الآلة.",
                    challengeId = "arabic_literature_c9",
                    challengeTitle = "اللسانيات وعلم الصرف والاشتقاق",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⚖️",
                    visualTheme = "علم الصرف",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 626,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "توليد كلمات جديدة من أصل واحد مع التناسب في المعنى والاتفاق في ترتيب الحروف أو بعضها",
                    correctAnswer = "اشتقاق",
                    availableLetters = LetterScrambler.buildScrambledLetters("اشتقاق", GameDifficulty.EXPERT, listOf("ت", "ر", "ا", "د", "ف", "ن"), seed = 626L),
                    hint = "سر مرونة اللغة العربية وقدرتها الهائلة على توليد المصطلحات",
                    rewardPoints = 30,
                    explanation = "الاشتقاق الأصغر والأكبر أتاح للعربية استيعاب العلوم الحديثة وتوليد آلاف الألفاظ من جذور ثلاثية محدودة.",
                    challengeId = "arabic_literature_c9",
                    challengeTitle = "اللسانيات وعلم الصرف والاشتقاق",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌱",
                    visualTheme = "توليد الألفاظ",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 627,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "عالم لغوي وفيلسوف معتزلي عظيم ألف كتاب الخصائص وسر صناعة الإعراب وناقش نشأة اللغة",
                    correctAnswer = "جني",
                    availableLetters = LetterScrambler.buildScrambledLetters("جني", GameDifficulty.EXPERT, listOf("ف", "ا", "ر", "ا", "ب", "ي", "س"), seed = 627L),
                    hint = "ابن ... تلميذ أبي علي الفارسي وصاحب نظرية الاشتقاق الأكبر",
                    rewardPoints = 30,
                    explanation = "ابن جني يعد عبقري فقه اللغة العربية وسبق علماء اللسانيات الغربيين في دراسة الفونولوجيا والأصوات.",
                    challengeId = "arabic_literature_c9",
                    challengeTitle = "اللسانيات وعلم الصرف والاشتقاق",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📚",
                    visualTheme = "فقه اللغة",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: رواد النهضة الأدبية وشعر التفعيلة (EXPERT)
        Challenge(
            id = "arabic_literature_c10",
            categoryId = "arabic_literature",
            title = "رواد النهضة الأدبية وشعر التفعيلة",
            themeDescription = "مدرسة الإحياء وأدب المهجر وحركة الشعر الحر الحديث",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 628,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "شاعر مصري لقب بأمير الشعراء وقاد حركة إحياء الشعر العربي وكتب المسرحيات الشعرية كـ مجنون ليلى",
                    correctAnswer = "شوقي",
                    availableLetters = LetterScrambler.buildScrambledLetters("شوقي", GameDifficulty.EXPERT, listOf("ح", "ا", "ف", "ظ", "ب", "ا", "ر"), seed = 628L),
                    hint = "أحمد ... صاحب نهج البردة والهمزية النبوية",
                    rewardPoints = 35,
                    explanation = "أحمد شوقي جمع بين الجزالة التراثية ورقة المعاصرة وكان رائد المسرح الشعري العربي في القرن العشرين.",
                    challengeId = "arabic_literature_c10",
                    challengeTitle = "رواد النهضة الأدبية وشعر التفعيلة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "👑",
                    visualTheme = "إمارة الشعر",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 629,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "رابطة أدبية أسسها جبران خليل جبران وميخائيل نعيمة في نيويورك عام 1920م لتجديد الأدب العربي",
                    correctAnswer = "قلمية",
                    availableLetters = LetterScrambler.buildScrambledLetters("قلمية", GameDifficulty.EXPERT, listOf("أ", "ن", "د", "ل", "س", "ي", "ة"), seed = 629L),
                    hint = "الرابطة ... أشهر حركات أدب المهجر الشمالي",
                    rewardPoints = 35,
                    explanation = "الرابطة القلمية أحدثت ثورة في النثر والشعر العربي بالدعوة إلى الصدق العاطفي والتحرر من القيود اللفظية الجافة.",
                    challengeId = "arabic_literature_c10",
                    challengeTitle = "رواد النهضة الأدبية وشعر التفعيلة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🖋️",
                    visualTheme = "أدب المهجر",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 630,
                    categoryId = "arabic_literature",
                    category = "بيت اللغة العربية والأدب",
                    question = "شاعرة عراقية رائدة تعتبر من أوائل من كتب شعر التفعيلة (الشعر الحر) بقصيدتها الشهيرة الكوليرا عام 1947م",
                    correctAnswer = "ملائكة",
                    availableLetters = LetterScrambler.buildScrambledLetters("ملائكة", GameDifficulty.EXPERT, listOf("س", "ي", "ا", "ب", "ب", "ي", "ا"), seed = 630L),
                    hint = "نازك الـ ... التي وضعت كتاب قضايا الشعر المعاصر",
                    rewardPoints = 35,
                    explanation = "نازك الملائكة وبدر شاكر السياب أطلقا حركة التحرر من وحدة البيت والقافية والانتقال لنظام السطر الشعري.",
                    challengeId = "arabic_literature_c10",
                    challengeTitle = "رواد النهضة الأدبية وشعر التفعيلة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📖",
                    visualTheme = "الشعر الحديث",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
