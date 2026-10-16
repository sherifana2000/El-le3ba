package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object MysteriesChallenges {

    val challenges = listOf(
        // Challenge 1: أحاجي البديهة والقرائن (EXPLORATION)
        Challenge(
            id = "mysteries_c1",
            categoryId = "mysteries",
            title = "أحاجي البديهة والقرائن",
            themeDescription = "ألغاز ذكية تعتمد على التفكير اللماح وملاحظة الأدلة الخفية",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 1101,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "يمشي بلا أرجل ويسيل بلا عينين ويبكي بلا دموع ويسقي الزرع في الحقول",
                    correctAnswer = "سحاب",
                    availableLetters = LetterScrambler.buildScrambledLetters("سحاب", GameDifficulty.EXPLORATION, listOf("م", "ط"), seed = 1101L),
                    hint = "الغيوم المثقلة بالمطر في السماء",
                    rewardPoints = 15,
                    explanation = "السحاب يتكون من بخار الماء المتكاثف الذي تحركه الرياح ويهطل منه الغيث ليحيي الأرض.",
                    challengeId = "mysteries_c1",
                    challengeTitle = "أحاجي البديهة والقرائن",
                    questionIndexInChallenge = 1,
                    visualEmoji = "☁️",
                    visualTheme = "أحاجي الطبيعة",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 1102,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "يتبعك أينما ذهبت في وضح النهار ولا يفارقك، لكنه يختفي تماماً إذا حل الظلام",
                    correctAnswer = "ظل",
                    availableLetters = LetterScrambler.buildScrambledLetters("ظل", GameDifficulty.EXPLORATION, listOf("ش", "م", "س", "ن"), seed = 1102L),
                    hint = "خيال جسمك الذي يحجب أشعة الشمس",
                    rewardPoints = 15,
                    explanation = "الظل ينشأ عندما يحجب جسم معتم مسار الضوء، فيظهر شكله على السطح المقابل.",
                    challengeId = "mysteries_c1",
                    challengeTitle = "أحاجي البديهة والقرائن",
                    questionIndexInChallenge = 2,
                    visualEmoji = "👤",
                    visualTheme = "ظواهر بصرية",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 1103,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "أداة معدنية صغيرة تفتح المغاليق والأبواب وتكشف ما وراء الحصون والخزائن",
                    correctAnswer = "مفتاح",
                    availableLetters = LetterScrambler.buildScrambledLetters("مفتاح", GameDifficulty.EXPLORATION, listOf("ب", "ا", "ب", "ق"), seed = 1103L),
                    hint = "المفتاح الذي يطابق أسنان القفل",
                    rewardPoints = 20,
                    explanation = "المفتاح رمز حل الألغاز واكتشاف الأسرار المغلقة في عالم التحقيق والأحاجي.",
                    challengeId = "mysteries_c1",
                    challengeTitle = "أحاجي البديهة والقرائن",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🗝️",
                    visualTheme = "رموز التحقيق",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: مسرح الدليل والاستنتاج (THINKING)
        Challenge(
            id = "mysteries_c2",
            categoryId = "mysteries",
            title = "مسرح الدليل والاستنتاج",
            themeDescription = "أدوات المحققين في تتبع البصمات وفك شفرات الجريمة الخفية",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1104,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "أثر فريد تتركه أنامل الأصابع على الأشياء لا يتطابق فيه اثنان من البشر أبداً",
                    correctAnswer = "بصمة",
                    availableLetters = LetterScrambler.buildScrambledLetters("بصمة", GameDifficulty.THINKING, listOf("ي", "د", "ك", "ف"), seed = 1104L),
                    hint = "بصمة الأصبع الدليل الجنائي القاطع",
                    rewardPoints = 20,
                    explanation = "خطوط الحلمات الجلدية في بصمات الأصابع تتشكل قبل الولادة وتظل ثابتة مدى الحياة.",
                    challengeId = "mysteries_c2",
                    challengeTitle = "مسرح الدليل والاستنتاج",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🔍",
                    visualTheme = "الأدلة الجنائية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1105,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "نظام سري لتحويل النصوص الواضحة إلى رموز غامضة لا يفهمها إلا من يملك مفتاح الحل",
                    correctAnswer = "تشفير",
                    availableLetters = LetterScrambler.buildScrambledLetters("تشفير", GameDifficulty.THINKING, listOf("ر", "م", "ز", "س"), seed = 1105L),
                    hint = "علم التعمية والشفرات السرية",
                    rewardPoints = 20,
                    explanation = "علم التشفير أبدع فيه الكندي في كتابه (رسالة في استخراج المعمى) لحماية الرسائل السرية.",
                    challengeId = "mysteries_c2",
                    challengeTitle = "مسرح الدليل والاستنتاج",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🔐",
                    visualTheme = "علم الشفرات",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1106,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "مسار معقد من الممرات الملتوية والجدران المتشابكة يسهل الضياع فيه ويصعب الخروج منه",
                    correctAnswer = "متاهة",
                    availableLetters = LetterScrambler.buildScrambledLetters("متاهة", GameDifficulty.THINKING, listOf("د", "ر", "ب", "خ"), seed = 1106L),
                    hint = "المتاهة ذات المخرج الواحد الصعب",
                    rewardPoints = 20,
                    explanation = "المتاهات استخدمت في القصور القديمة لاختبار الذكاء والقدرة على التوجيه وحل المعضلات المكانية.",
                    challengeId = "mysteries_c2",
                    challengeTitle = "مسرح الدليل والاستنتاج",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🧩",
                    visualTheme = "المعضلات المكانية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: ألغاز الزمن والحكمة (CHALLENGE)
        Challenge(
            id = "mysteries_c3",
            categoryId = "mysteries",
            title = "ألغاز الزمن والحكمة",
            themeDescription = "الأحاجي الوجودية والزمنية العميقة التي حيرت عقول الفلاسفة",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 1107,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "يمر سريعاً ولا ينتظر أحداً، إن فاتك لم يعد، وإن أهدرته خسرت أغلى ما تملك في الحياة",
                    correctAnswer = "وقت",
                    availableLetters = LetterScrambler.buildScrambledLetters("وقت", GameDifficulty.CHALLENGE, listOf("ز", "م", "ن", "س", "ا", "ع"), seed = 1107L),
                    hint = "الوقت كالسيف إن لم تقطعه قطعك",
                    rewardPoints = 25,
                    explanation = "الوقت هو البعد الرابع في الفيزياء والوعاء الذي تتحقق فيه أفعال الإنسان وإنجازاته.",
                    challengeId = "mysteries_c3",
                    challengeTitle = "ألغاز الزمن والحكمة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⏳",
                    visualTheme = "معضلة الوقت",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1108,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "يرى كل شيء حوله بدقة لكنه لا يرى نفسه أبداً بدون مرآة عاكسة أمامه",
                    correctAnswer = "عين",
                    availableLetters = LetterScrambler.buildScrambledLetters("عين", GameDifficulty.CHALLENGE, listOf("ب", "ص", "ر", "ن", "ظ", "ر"), seed = 1108L),
                    hint = "عضو الإبصار والنظر في رأس الإنسان",
                    rewardPoints = 25,
                    explanation = "العين نافذة الإدراك البصري التي تستقبل الفوتونات وتحولها إلى إشارات عصبية يفسرها الدماغ.",
                    challengeId = "mysteries_c3",
                    challengeTitle = "ألغاز الزمن والحكمة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "👁️",
                    visualTheme = "الإدراك الحسي",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1109,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "كلما أخذت منه كَبُر واتسع، وكلما وضعت فيه صَغُر وضاق فما هو",
                    correctAnswer = "حفرة",
                    availableLetters = LetterScrambler.buildScrambledLetters("حفرة", GameDifficulty.CHALLENGE, listOf("ت", "ر", "ا", "ب", "ع", "م"), seed = 1109L),
                    hint = "التجويف المحفور في باطن الأرض",
                    rewardPoints = 25,
                    explanation = "لغز لغوي وفلسفي شهير يعتمد على التناقض الظاهري بين الأخذ من التراب وزيادة حجم الفراغ.",
                    challengeId = "mysteries_c3",
                    challengeTitle = "ألغاز الزمن والحكمة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🕳️",
                    visualTheme = "المفارقات اللغوية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: ألغاز الطبيعة الصامتة والظواهر الخادعة (THINKING)
        Challenge(
            id = "mysteries_c4",
            categoryId = "mysteries",
            title = "ألغاز الطبيعة الصامتة والظواهر الخادعة",
            themeDescription = "السراب والصدى والمفارقات البصرية المدهشة في الطبيعة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1110,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "ظاهرة بصرية وهمية تحدث في الصحراء والأسفلت الحار تجعل الرائي يظن بوجود بركة ماء عاكسة",
                    correctAnswer = "سراب",
                    availableLetters = LetterScrambler.buildScrambledLetters("سراب", GameDifficulty.THINKING, listOf("ض", "ب", "ا", "ب"), seed = 1110L),
                    hint = "تنجم عن انكسار أشعة الضوء بين طبقات الهواء الساخنة والباردة",
                    rewardPoints = 20,
                    explanation = "السراب ظاهرة انكسار ضوئي حقيقية ناتجة عن تباين كثافة طبقات الهواء الملامسة لسطح الأرض الحار.",
                    challengeId = "mysteries_c4",
                    challengeTitle = "ألغاز الطبيعة الصامتة والظواهر الخادعة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏜️",
                    visualTheme = "الخداع البصري",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1111,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "ارتداد موجات الصوت وسماعها مكررة بعد اصطدامها بحاجز صلب كجدار جبل شاهق أو وادٍ عميق",
                    correctAnswer = "صدى",
                    availableLetters = LetterScrambler.buildScrambledLetters("صدى", GameDifficulty.THINKING, listOf("ر", "ن", "ي", "ن"), seed = 1111L),
                    hint = "يستخدمه الخفاش والدلفين للملاحة الصوتية في الظلام",
                    rewardPoints = 20,
                    explanation = "الصدى يحدث عندما يفصل بين الصوت الأصلي والصوت المنعكس زمن لا يقل عن عشر ثانية لتميزه الأذن البشرية.",
                    challengeId = "mysteries_c4",
                    challengeTitle = "ألغاز الطبيعة الصامتة والظواهر الخادعة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🔊",
                    visualTheme = "الأمواج الصوتية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1112,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "أحجار وصخور في وادي الموت بكاليفورنيا تتحرك ببطء وتترك خلفها مسارات طويلة على الطين الجاف دون تدخل بشري",
                    correctAnswer = "متحركة",
                    availableLetters = LetterScrambler.buildScrambledLetters("متحركة", GameDifficulty.THINKING, listOf("س", "ا", "ك", "ن", "ة"), seed = 1112L),
                    hint = "الصخور الـ ... التي حيرت العلماء لعقود حتى فسرها الجليد والرياح",
                    rewardPoints = 20,
                    explanation = "اتضح أن طبقات جليدية بالغة الرقة تتشكل ليلاً تحرك الصخور بدفع الرياح الخفيفة فوق الطين الزلق.",
                    challengeId = "mysteries_c4",
                    challengeTitle = "ألغاز الطبيعة الصامتة والظواهر الخادعة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🪨",
                    visualTheme = "ألغاز جيولوجية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: مفارقات المنطق وألعاب العقل (THINKING)
        Challenge(
            id = "mysteries_c5",
            categoryId = "mysteries",
            title = "مفارقات المنطق وألعاب العقل",
            themeDescription = "التناقضات الظاهرية والمغالطات الفلسفية التي تصدم البديهة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1113,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "عبارة تبدو صحيحة في مقدماتها ولكنها تقود إلى تناقض ذاتي غير قابل للحل مثل جملة هذه العبارة كاذبة",
                    correctAnswer = "مفارقة",
                    availableLetters = LetterScrambler.buildScrambledLetters("مفارقة", GameDifficulty.THINKING, listOf("م", "غ", "ا", "ل", "ط"), seed = 1113L),
                    hint = "تسمى البارادوكس (Paradox) وأشهرها مفارقة الحلاق وكريت",
                    rewardPoints = 20,
                    explanation = "المفارقات المنطقية ساعدت علماء الرياضيات والفلسفة على إعادة ضبط بديهيات المنطق ونظرية المجموعات.",
                    challengeId = "mysteries_c5",
                    challengeTitle = "مفارقات المنطق وألعاب العقل",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌀",
                    visualTheme = "المفارقات الفلسفية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1114,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "لغز فلسفي قديم يتساءل: إذا استبدلت جميع أخشاب السفينة قطعة قطعة فهل تبقى نفس السفينة الأصلية؟",
                    correctAnswer = "ثيسيوس",
                    availableLetters = LetterScrambler.buildScrambledLetters("ثيسيوس", GameDifficulty.THINKING, listOf("أ", "و", "د", "ي", "س"), seed = 1114L),
                    hint = "سفينة ... الشهيرة في الفلسفة اليونانية حول الهوية",
                    rewardPoints = 20,
                    explanation = "مفارقة سفينة ثيسيوس تناقش جوهر الهوية وما إذا كان الشيء يحدده مكوناته المادية أم استمراريته المعنوية.",
                    challengeId = "mysteries_c5",
                    challengeTitle = "مفارقات المنطق وألعاب العقل",
                    questionIndexInChallenge = 2,
                    visualEmoji = "⛵",
                    visualTheme = "لغز الهوية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1115,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "لغز مشهور: إذا رمي سهم نحو هدف فهل يبلغه أبداً إذا كان يقطع نصف المسافة المتبقية في كل مرحلة؟",
                    correctAnswer = "زينون",
                    availableLetters = LetterScrambler.buildScrambledLetters("زينون", GameDifficulty.THINKING, listOf("أ", "ر", "س", "ط", "و"), seed = 1115L),
                    hint = "مفارقة ... الإيلي وأخيل والسلحفاة لنفي الحركة",
                    rewardPoints = 20,
                    explanation = "مفارقات زينون حول الحركة واللانهاية حلت لاحقاً باكتشاف حساب التكامل والمتسلسلات اللانهائية المتقاربة.",
                    challengeId = "mysteries_c5",
                    challengeTitle = "مفارقات المنطق وألعاب العقل",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🏹",
                    visualTheme = "ألغاز اللانهاية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: المخطوطات والرسائل غير المفكوكة (THINKING)
        Challenge(
            id = "mysteries_c6",
            categoryId = "mysteries",
            title = "المخطوطات والرسائل غير المفكوكة",
            themeDescription = "مخطوطة فوينيتش ولغات العالم القديمة الصامتة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1116,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "مخطوطة غامضة من القرون الوسطى مكتوبة بلغة ورسوم نباتية وفلكية غير معروفة عجزت كل الحواسيب عن فكها",
                    correctAnswer = "فوينيتش",
                    availableLetters = LetterScrambler.buildScrambledLetters("فوينيتش", GameDifficulty.THINKING, listOf("د", "ا", "ف", "ن", "ش"), seed = 1116L),
                    hint = "سميت باسم بائع الكتب البولندي الذي عثر عليها عام 1912م",
                    rewardPoints = 20,
                    explanation = "مخطوطة فوينيتش مؤرخة بالكربون المشع لأوائل القرن الخامس عشر وتعتبر أكثر الكتب غموضاً في تاريخ البشرية.",
                    challengeId = "mysteries_c6",
                    challengeTitle = "المخطوطات والرسائل غير المفكوكة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📜",
                    visualTheme = "المخطوطات الغامضة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1117,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "حضارة وادي السند العظيمة في موهينجو دارو وهارابا التي لم يتمكن العلماء حتى اليوم من فك رموز كتابتها",
                    correctAnswer = "سند",
                    availableLetters = LetterScrambler.buildScrambledLetters("سند", GameDifficulty.THINKING, listOf("غ", "ا", "ن", "ج", "ب"), seed = 1117L),
                    hint = "حضارة وادي الـ ... ذات المدن المخططة المتطورة والصرف الصحي",
                    rewardPoints = 20,
                    explanation = "كتابة وادي السند تحتوي على مئات الرموز المنقوشة على أختام فخارية مجهولة الصلة باللغات الهندو-أوروبية.",
                    challengeId = "mysteries_c6",
                    challengeTitle = "المخطوطات والرسائل غير المفكوكة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏛️",
                    visualTheme = "الكتابات الصامتة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1118,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "حجر أسود اكتشف في مصر عام 1799م كان المفتاح السحري لفك رموز اللغة الهيروغليفية على يد شامبليون",
                    correctAnswer = "رشيد",
                    availableLetters = LetterScrambler.buildScrambledLetters("رشيد", GameDifficulty.THINKING, listOf("إ", "س", "ك", "ن"), seed = 1118L),
                    hint = "حجر ... المكتوب بثلاثة خطوط: الهيروغليفي والديموطيقي واليوناني",
                    rewardPoints = 20,
                    explanation = "مقارنة النص اليوناني بالهيروغليفي كشفت أن الكتابة المصرية القديمة تعتمد على علامات صوتية وأبجدية.",
                    challengeId = "mysteries_c6",
                    challengeTitle = "المخطوطات والرسائل غير المفكوكة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🪨",
                    visualTheme = "فك الشفرات",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: آلات التشفير والحرب السرية (CHALLENGE)
        Challenge(
            id = "mysteries_c7",
            categoryId = "mysteries",
            title = "آلات التشفير والحرب السرية",
            themeDescription = "آلة إنجما الألمانية وكاسرو الشفرات في حديقة بلتشلي",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 1119,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "آلة تشفير كهروميكانيكية ألمانية استعملت في الحرب العالمية الثانية وكسر الحلفاء شفرتها في بلتشلي بارك",
                    correctAnswer = "إنجما",
                    availableLetters = LetterScrambler.buildScrambledLetters("إنجما", GameDifficulty.CHALLENGE, listOf("ل", "و", "ر", "ن", "ز", "ك"), seed = 1119L),
                    hint = "تعتمد على دوارات دوارة لتغيير الحروف بمليارات التباديل",
                    rewardPoints = 25,
                    explanation = "كسر شفرة إنجما بجهود آلان تورنغ والرياضيين البولنديين اختصر الحرب العالمية وقدر بأنه أنقذ ملايين الأرواح.",
                    challengeId = "mysteries_c7",
                    challengeTitle = "آلات التشفير والحرب السرية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📠",
                    visualTheme = "آلات التشفير",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1120,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "طريقة تشفير تقليدية تعتمد على إزاحة كل حرف في النص بعدد ثابت من المواقع في الأبجدية",
                    correctAnswer = "قيصر",
                    availableLetters = LetterScrambler.buildScrambledLetters("قيصر", GameDifficulty.CHALLENGE, listOf("ش", "ف", "ر", "ة", "س", "ر"), seed = 1120L),
                    hint = "شفرة ... التي استخدمها يوليوس قيصر لحماية رسائله العسكرية",
                    rewardPoints = 25,
                    explanation = "شفرة القيصر هي أبسط أنواع التعمية البديلة وتكسر بسهولة عبر تحليل تكرار الحروف في اللغة.",
                    challengeId = "mysteries_c7",
                    challengeTitle = "آلات التشفير والحرب السرية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🔤",
                    visualTheme = "شفرات التعمية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1121,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "علم تحليل تكرار ظهور الحروف والكلمات في النص المشفر لكسر التعمية دون معرفة المفتاح السري",
                    correctAnswer = "تردد",
                    availableLetters = LetterScrambler.buildScrambledLetters("تردد", GameDifficulty.CHALLENGE, listOf("ت", "ح", "ل", "ي", "ل", "خ"), seed = 1121L),
                    hint = "ابتكره العالم العربي الكندي في كتابه رسالة في استخراج المعمى",
                    rewardPoints = 25,
                    explanation = "الكندي اكتشف في القرن التاسع الميلادي أن كل لغة لها نسب تردد حروف ثابتة تكشف الحروف المشفرة.",
                    challengeId = "mysteries_c7",
                    challengeTitle = "آلات التشفير والحرب السرية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📊",
                    visualTheme = "استخراج المعمى",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: البحث الجنائي ومسرح الجريمة (CHALLENGE)
        Challenge(
            id = "mysteries_c8",
            categoryId = "mysteries",
            title = "البحث الجنائي ومسرح الجريمة",
            themeDescription = "البصمات الوراثية والمقذوفات النارية وتتبع الآثار المجهرية",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 1122,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "التحليل المخبري للحمض النووي في مسرح الجريمة الذي يحدد هوية الجاني بدقة قطعية لا تقبل الشك",
                    correctAnswer = "وراثية",
                    availableLetters = LetterScrambler.buildScrambledLetters("وراثية", GameDifficulty.CHALLENGE, listOf("ج", "ي", "ن", "ي", "ة", "د"), seed = 1122L),
                    hint = "البصمة الـ ... (DNA Profiling) التي طورها أليك جيفريز",
                    rewardPoints = 25,
                    explanation = "البصمة الوراثية تقارن المقاطع المتكررة في الحمض النووي وتعتبر المعيار الذهبي للإدانة أو البراءة في القضاء.",
                    challengeId = "mysteries_c8",
                    challengeTitle = "البحث الجنائي ومسرح الجريمة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "👆",
                    visualTheme = "الأدلة الجنائية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1123,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "مادة كيميائية ترش في مسرح الجريمة فتتوهج بلون أزرق فوسفوري في الظلام عند ملامسة الحديد في الدم",
                    correctAnswer = "لومينول",
                    availableLetters = LetterScrambler.buildScrambledLetters("لومينول", GameDifficulty.CHALLENGE, listOf("ف", "و", "س", "ف", "و", "ر"), seed = 1123L),
                    hint = "تكشف بقع الدم حتى لو تم غسلها ومسحها بمواد تنظيف",
                    rewardPoints = 25,
                    explanation = "اللومينول يتأكسد بوجود الهيموغلوبين كالحديد كعامل محفز باعثاً ضوءاً كيميائياً يكشف آثار الدماء الخفية.",
                    challengeId = "mysteries_c8",
                    challengeTitle = "البحث الجنائي ومسرح الجريمة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🧪",
                    visualTheme = "الكيمياء الجنائية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1124,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "علم فحص الآثار والخطوط المجهرية التي تتركها سبطانة السلاح على الرصاصة والمقذوف لتحديد هوية السلاح",
                    correctAnswer = "بالستيات",
                    availableLetters = LetterScrambler.buildScrambledLetters("بالستيات", GameDifficulty.CHALLENGE, listOf("م", "ق", "ذ", "و", "ف", "ا"), seed = 1124L),
                    hint = "علم المقذوفات الجنائية (Forensic Ballistics)",
                    rewardPoints = 25,
                    explanation = "أخاديد السبطانة اللولبية تترك بصمة ميكانيكية حصرية على الرصاصة تميز كل سلاح ناري بشكل فريد.",
                    challengeId = "mysteries_c8",
                    challengeTitle = "البحث الجنائي ومسرح الجريمة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔍",
                    visualTheme = "المقذوفات الجنائية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: مفارقات الزمن وتمدد الساعات (EXPERT)
        Challenge(
            id = "mysteries_c9",
            categoryId = "mysteries",
            title = "مفارقات الزمن وتمدد الساعات",
            themeDescription = "مفارقة التوأم وتباطؤ الزمن بالسرعة والجاذبية الشديدة",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 1125,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "ظاهرة في النظرية النسبية تجعل الساعات المتحركة بسرعة تقارب الضوء تدق أبطأ مقارنة بساعات الراصد الساكن",
                    correctAnswer = "تمدد",
                    availableLetters = LetterScrambler.buildScrambledLetters("تمدد", GameDifficulty.EXPERT, listOf("ت", "ب", "ا", "ط", "ؤ", "ز", "م"), seed = 1125L),
                    hint = "يسمى تمدد الزمن (Time Dilation) الذي أثبته آينشتاين",
                    rewardPoints = 30,
                    explanation = "تمدد الزمن تم التحقق منه تجريبياً بساعات ذرية دقيقة على متن طائرات وأقمار نظام الملاحة GPS.",
                    challengeId = "mysteries_c9",
                    challengeTitle = "مفارقات الزمن وتمدد الساعات",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⏳",
                    visualTheme = "نسبية الزمان",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1126,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "الحد النظري المحيط بالثقب الأسود الذي إذا تجاوزه أي جسم يستحيل عليه العودة أو إرسال إشارة للخارج",
                    correctAnswer = "أفق",
                    availableLetters = LetterScrambler.buildScrambledLetters("أفق", GameDifficulty.EXPERT, listOf("ح", "د", "ث", "ن", "ه", "ا", "ي"), seed = 1126L),
                    hint = "يسمى ... الحدث (Event Horizon) نقطة اللاعودة الكونية",
                    rewardPoints = 30,
                    explanation = "أفق الحدث هو الغشاء الرياضي الذي تصبح عنده سرعة الإفلات من الجاذبية مساوية تماماً لسرعة الضوء.",
                    challengeId = "mysteries_c9",
                    challengeTitle = "مفارقات الزمن وتمدد الساعات",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🕳️",
                    visualTheme = "أفق الحدث",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1127,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "نفق زمكاني نظري افتراضي يربط بين نقطتين متباعدتين جداً في الكون كطريق مختصر عبر الأبعاد",
                    correctAnswer = "دودي",
                    availableLetters = LetterScrambler.buildScrambledLetters("دودي", GameDifficulty.EXPERT, listOf("ث", "ق", "ب", "ج", "س", "ر"), seed = 1127L),
                    hint = "الثقب الـ ... أو جسر آينشتاين-روزين (Wormhole)",
                    rewardPoints = 30,
                    explanation = "الثقوب الدودية حلول رياضية لمعادلات النسبية العامة ولكنها تتطلب مادة ذات طاقة سلبية لإبقائها مفتوحة ومستقرة.",
                    challengeId = "mysteries_c9",
                    challengeTitle = "مفارقات الزمن وتمدد الساعات",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌀",
                    visualTheme = "أنفاق الزمكان",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: أسرار الوعي البشري وخريطة الدماغ (EXPERT)
        Challenge(
            id = "mysteries_c10",
            categoryId = "mysteries",
            title = "أسرار الوعي البشري وخريطة الدماغ",
            themeDescription = "المشكلة الصعبة للوعي وتخزين الذكريات في المشابك العصبية",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 1128,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "منطقة عميقة في الدماغ البشري تشبه فرس البحر وتعتبر المركز الأساسي لدمج الذاكرة القصيرة وتحويلها لذاكرة طويلة",
                    correctAnswer = "حصين",
                    availableLetters = LetterScrambler.buildScrambledLetters("حصين", GameDifficulty.EXPERT, listOf("م", "خ", "ي", "خ", "ل", "و"), seed = 1128L),
                    hint = "يسمى قرن آمون أو الحصين (Hippocampus)",
                    rewardPoints = 35,
                    explanation = "تلف الحصين يمنع الإنسان من تكوين ذكريات جديدة للأحداث اليومية مع بقاء الذكريات القديمة سليمة.",
                    challengeId = "mysteries_c10",
                    challengeTitle = "أسرار الوعي البشري وخريطة الدماغ",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🧠",
                    visualTheme = "مراكز الذاكرة",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1129,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "شعور نفسي غامض ومفاجئ يمر به المرء يوهمه بأنه عاش الموقف الحاضر ورآه بتفاصيله مسبقاً",
                    correctAnswer = "ديجافو",
                    availableLetters = LetterScrambler.buildScrambledLetters("ديجافو", GameDifficulty.EXPERT, listOf("و", "ه", "م", "ح", "ل", "م"), seed = 1129L),
                    hint = "ظاهرة شوهد من قبل (Déjà vu) في علم النفس العصبي",
                    rewardPoints = 35,
                    explanation = "الديجافو ينتج عن تأخر طفيف لا يتجاوز أجزاء من الثانية في معالجة الإشارات العصبية بين نصفي الدماغ.",
                    challengeId = "mysteries_c10",
                    challengeTitle = "أسرار الوعي البشري وخريطة الدماغ",
                    questionIndexInChallenge = 2,
                    visualEmoji = "👁️",
                    visualTheme = "الظواهر الإدراكية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1130,
                    categoryId = "mysteries",
                    category = "بيت الألغاز والتحقيق",
                    question = "المسألة الفلسفية والعلمية الكبرى حول كيفية توليد المادة الفيزيائية والشبكات العصبية لتجارب شعورية ذاتية واعية",
                    correctAnswer = "وعي",
                    availableLetters = LetterScrambler.buildScrambledLetters("وعي", GameDifficulty.EXPERT, listOf("ع", "ق", "ل", "ر", "و", "ح"), seed = 1130L),
                    hint = "المعضلة الصعبة للـ ... (The Hard Problem of Consciousness)",
                    rewardPoints = 35,
                    explanation = "مسألة الوعي طرحها الفيلسوف ديفيد تشالمرز وتعد من أعظم أسرار العلم العصبي والفلسفي الحديث غير المحلولة.",
                    challengeId = "mysteries_c10",
                    challengeTitle = "أسرار الوعي البشري وخريطة الدماغ",
                    questionIndexInChallenge = 3,
                    visualEmoji = "💡",
                    visualTheme = "لغز الوعي",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
