package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object AstronomyChallenges {

    val challenges = listOf(
        // Challenge 1: رواد الفضاء والمدارات (EXPLORATION)
        Challenge(
            id = "astronomy_c1",
            categoryId = "astronomy",
            title = "رواد الفضاء والمدارات",
            themeDescription = "رحلة إلى أعالي الغلاف الجوي واستكشاف المراكب الفلكية",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 101,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "مركبة فضائية تنطلق بنفث صاروخي جبار لحمل رواد الفضاء والأقمار إلى المدار",
                    correctAnswer = "صاروخ",
                    availableLetters = LetterScrambler.buildScrambledLetters("صاروخ", GameDifficulty.EXPLORATION, listOf("م", "ج"), seed = 101L),
                    hint = "يندفع بقوة نفث هائلة نحو أعالي السماء",
                    rewardPoints = 15,
                    explanation = "الصاروخ هو وسيلة الإطلاق الفضائي التي تستخدم الدفع النفاث للتغلب على قوة جاذبية الأرض.",
                    challengeId = "astronomy_c1",
                    challengeTitle = "رواد الفضاء والمدارات",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🚀",
                    visualTheme = "المراكب الفضائية",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 102,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "جرم سماوي معتم يدور في فلك دائري حول الشمس وتعيش عليه الكائنات الحية",
                    correctAnswer = "كوكب",
                    availableLetters = LetterScrambler.buildScrambledLetters("كوكب", GameDifficulty.EXPLORATION, listOf("ش", "ن"), seed = 102L),
                    hint = "الأرض والمريخ والمشتري أمثلة عليه",
                    rewardPoints = 15,
                    explanation = "الكواكب أجرام كروية تدور حول النجوم، وتتميز بجاذبيتها الكافية لتنظيف مداراتها.",
                    challengeId = "astronomy_c1",
                    challengeTitle = "رواد الفضاء والمدارات",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🪐",
                    visualTheme = "الأجرام المدارية",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 103,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "أداة بصرية فلكية تقرب النجوم والمجرات وتكشف تفاصيل الأجرام السحيقة",
                    correctAnswer = "تلسكوب",
                    availableLetters = LetterScrambler.buildScrambledLetters("تلسكوب", GameDifficulty.EXPLORATION, listOf("م", "ر"), seed = 103L),
                    hint = "مقراب يرصد الأضواء القادمة من أعماق الفضاء",
                    rewardPoints = 20,
                    explanation = "التلسكوب أحدث ثورة في علم الفلك منذ استخدامه بواسطة غاليليو وحتى تلسكوب جيمس ويب الحديث.",
                    challengeId = "astronomy_c1",
                    challengeTitle = "رواد الفضاء والمدارات",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔭",
                    visualTheme = "المراصد الفلكية",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: أسرار النجوم والمجرات (THINKING)
        Challenge(
            id = "astronomy_c2",
            categoryId = "astronomy",
            title = "أسرار النجوم والمجرات",
            themeDescription = "استكشاف النجوم المشعة والتجمعات المجرية العظمى في الكون",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 104,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "نجم ملتهب ضخم يمثل مركز نظامنا الكوكبي ومصدر الضوء والحرارة على الأرض",
                    correctAnswer = "شمس",
                    availableLetters = LetterScrambler.buildScrambledLetters("شمس", GameDifficulty.THINKING, listOf("ق", "م", "ر", "ك"), seed = 104L),
                    hint = "تشرق صباحاً وتبث الحياة في كوكب الأرض",
                    rewardPoints = 20,
                    explanation = "الشمس كرة غازية عملاقة من الهيدروجين والهيليوم تنتج طاقتها من الاندماج النووي.",
                    challengeId = "astronomy_c2",
                    challengeTitle = "أسرار النجوم والمجرات",
                    questionIndexInChallenge = 1,
                    visualEmoji = "☀️",
                    visualTheme = "النجوم المتوهجة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 105,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "تجمع هائل من مليارات النجوم والغازات والغبار الكوني مرتبط بجاذبية مشتركة",
                    correctAnswer = "مجرة",
                    availableLetters = LetterScrambler.buildScrambledLetters("مجرة", GameDifficulty.THINKING, listOf("س", "ح", "ا", "ب"), seed = 105L),
                    hint = "درب التبانة مثال شهير عليها",
                    rewardPoints = 20,
                    explanation = "المجرة هي اللبنة الكبرى في بنية الكون، وتحتوي مجرتنا درب التبانة على أكثر من 100 مليار نجم.",
                    challengeId = "astronomy_c2",
                    challengeTitle = "أسرار النجوم والمجرات",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌌",
                    visualTheme = "الهياكل الكونية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 106,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "تابع طبيعي يدور حول الأرض ويعكس ضوء الشمس بأطوار هلال وبدر",
                    correctAnswer = "قمر",
                    availableLetters = LetterScrambler.buildScrambledLetters("قمر", GameDifficulty.THINKING, listOf("ن", "ج", "م", "ك"), seed = 106L),
                    hint = "ينير الليل وتحدث بسببه ظاهرة المد والجزر",
                    rewardPoints = 20,
                    explanation = "القمر هو التابع الطبيعي الوحيد للأرض، ويبعد عنها حوالي 384 ألف كيلومتر.",
                    challengeId = "astronomy_c2",
                    challengeTitle = "أسرار النجوم والمجرات",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌕",
                    visualTheme = "الأقمار الطبيعية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: أعماق الفضاء السحيق (CHALLENGE)
        Challenge(
            id = "astronomy_c3",
            categoryId = "astronomy",
            title = "أعماق الفضاء السحيق",
            themeDescription = "الظواهر الفلكية العميقة والثقوب الكونية والأجرام الجليدية",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 107,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "جرم جليدي صخري يدور حول الشمس ويخلف ذيلاً مضيئاً طويلاً عند اقترابه من حرارتها",
                    correctAnswer = "مذنب",
                    availableLetters = LetterScrambler.buildScrambledLetters("مذنب", GameDifficulty.CHALLENGE, listOf("ش", "هـ", "ا", "ب", "ن", "و"), seed = 107L),
                    hint = "مذنب هالي من أشهر أفراده",
                    rewardPoints = 25,
                    explanation = "المذنبات تتكون من جليد وغبار صخري، وعند اقترابها من الشمس يتسامى الجليد مشكلاً ذيلاً ساطعاً.",
                    challengeId = "astronomy_c3",
                    challengeTitle = "أعماق الفضاء السحيق",
                    questionIndexInChallenge = 1,
                    visualEmoji = "☄️",
                    visualTheme = "الأجرام الجليدية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 108,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "سحابة كونية عملاقة من الغاز والغبار تولد في أحضانها النجوم الجديدة",
                    correctAnswer = "سديم",
                    availableLetters = LetterScrambler.buildScrambledLetters("سديم", GameDifficulty.CHALLENGE, listOf("غ", "ي", "م", "ك", "و", "ن"), seed = 108L),
                    hint = "حاضنة النجوم ذات الألوان المتوهجة",
                    rewardPoints = 25,
                    explanation = "السدم هي سحب فلكية تتكون من الغازات المتأينة التي تنكمش بالجاذبية لتكوين نجوم حديثة الولادة.",
                    challengeId = "astronomy_c3",
                    challengeTitle = "أعماق الفضاء السحيق",
                    questionIndexInChallenge = 2,
                    visualEmoji = "✨",
                    visualTheme = "حواضن النجوم",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 109,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "كتلة هائلة في الفضاء ذات جاذبية خارقة لا يفلت من قبضتها حتى شعاع الضوء",
                    correctAnswer = "ثقب",
                    availableLetters = LetterScrambler.buildScrambledLetters("ثقب", GameDifficulty.CHALLENGE, listOf("ظ", "ل", "ا", "م", "س", "و"), seed = 109L),
                    hint = "يسمى بالثقب الأسود الكوني",
                    rewardPoints = 25,
                    explanation = "الثقب الأسود هو منطقة زمكانية تتمتع بجاذبية مطلقة نتيجة انهيار نجم عملاق على نفسه.",
                    challengeId = "astronomy_c3",
                    challengeTitle = "أعماق الفضاء السحيق",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🕳️",
                    visualTheme = "الجاذبية الكونية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: كواكب المجموعة الشمسية الداخلية (THINKING)
        Challenge(
            id = "astronomy_c4",
            categoryId = "astronomy",
            title = "كواكب المجموعة الشمسية الداخلية",
            themeDescription = "الكواكب الصخرية الأقرب إلى الشمس وخصائص مداراتها",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 110,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "أقرب الكواكب إلى الشمس وأصغرها حجماً ويشهد تقلبات حرارية قصوى",
                    correctAnswer = "عطارد",
                    availableLetters = LetterScrambler.buildScrambledLetters("عطارد", GameDifficulty.THINKING, listOf("ز", "ح", "ل", "م"), seed = 110L),
                    hint = "يدور حول الشمس في 88 يوماً فقط",
                    rewardPoints = 20,
                    explanation = "عطارد كوكب صخري شديد القرب من الشمس ولا يمتلك غلافاً جوياً سميكاً يحفظ حرارته.",
                    challengeId = "astronomy_c4",
                    challengeTitle = "كواكب المجموعة الشمسية الداخلية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌑",
                    visualTheme = "الكواكب الصخرية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 111,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "الكوكب الملقب بنجمة الصباح والمساء وهو الأكثر لمعاناً وحرارة بسبب احتباسه الحراري",
                    correctAnswer = "زهرة",
                    availableLetters = LetterScrambler.buildScrambledLetters("زهرة", GameDifficulty.THINKING, listOf("ق", "م", "ر", "ن"), seed = 111L),
                    hint = "توأم الأرض من حيث الحجم ولكنه جحيم مستعر",
                    rewardPoints = 20,
                    explanation = "الزهرة يمتلك غلافاً كثيفاً من ثاني أكسيد الكربون يرفع درجة حرارته السطحية لأكثر من 460 مئوية.",
                    challengeId = "astronomy_c4",
                    challengeTitle = "كواكب المجموعة الشمسية الداخلية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "✨",
                    visualTheme = "الغلاف المتوهج",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 112,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "الكوكب الأحمر الذي تغطي سطحه أكاسيد الحديد ويعد الهدف الأول لرحلات الاستيطان البشري",
                    correctAnswer = "مريخ",
                    availableLetters = LetterScrambler.buildScrambledLetters("مريخ", GameDifficulty.THINKING, listOf("ز", "ح", "ل", "ش"), seed = 112L),
                    hint = "يضم جبل أوليمبوس أعلى بركان في النظام الشمسي",
                    rewardPoints = 20,
                    explanation = "المريخ كوكب صخري جاف يحتوي على آثار مياه قديمة وقطبين جليديين وغلاف جوي رقيق.",
                    challengeId = "astronomy_c4",
                    challengeTitle = "كواكب المجموعة الشمسية الداخلية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔴",
                    visualTheme = "الكوكب الأحمر",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: العمالقة الغازية وأطراف النظام الشمسي (THINKING)
        Challenge(
            id = "astronomy_c5",
            categoryId = "astronomy",
            title = "العمالقة الغازية وأطراف النظام الشمسي",
            themeDescription = "الكواكب الضخمة ذات الحلقات المدارية والأقمار الجليدية",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 113,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "أكبر كواكب المجموعة الشمسية حجماً وكتلة ويمتلك عاصفة البقعة الحمراء الشهيرة",
                    correctAnswer = "مشتري",
                    availableLetters = LetterScrambler.buildScrambledLetters("مشتري", GameDifficulty.THINKING, listOf("ن", "ب", "ت", "و"), seed = 113L),
                    hint = "يمتلك أقوى مجال مغناطيسي بين كواكب المجموعة",
                    rewardPoints = 20,
                    explanation = "المشتري عملاق غازي تتجاوز كتلته ضعفي ونصف كتلة جميع الكواكب الأخرى مجتمعة.",
                    challengeId = "astronomy_c5",
                    challengeTitle = "العمالقة الغازية وأطراف النظام الشمسي",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌀",
                    visualTheme = "العمالقة الغازية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 114,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "كوكب غازي مهيب يشتهر بنظامه الحلقي البديع المكون من قطع الجليد والصخور",
                    correctAnswer = "زحل",
                    availableLetters = LetterScrambler.buildScrambledLetters("زحل", GameDifficulty.THINKING, listOf("ش", "م", "س", "ف"), seed = 114L),
                    hint = "كثافته الكلية أقل من كثافة الماء",
                    rewardPoints = 20,
                    explanation = "زحل يتميز بحلقات فلكية عريضة ولامعة تمتد لآلاف الكيلومترات حول استوائه.",
                    challengeId = "astronomy_c5",
                    challengeTitle = "العمالقة الغازية وأطراف النظام الشمسي",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🪐",
                    visualTheme = "الحلقات الفلكية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 115,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "كوكب جليدي أزرق يعد أبعد كواكب المجموعة الشمسية والمعروف برياحه الفائقة السرعة",
                    correctAnswer = "نبتون",
                    availableLetters = LetterScrambler.buildScrambledLetters("نبتون", GameDifficulty.THINKING, listOf("ع", "ط", "ا", "ر"), seed = 115L),
                    hint = "أطلق عليه اسم إله البحر بسبب زرقته العميقة",
                    rewardPoints = 20,
                    explanation = "نبتون كوكب عملاق جليدي يستغرق نحو 165 سنة أرضية ليكمل دورة واحدة حول الشمس.",
                    challengeId = "astronomy_c5",
                    challengeTitle = "العمالقة الغازية وأطراف النظام الشمسي",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔵",
                    visualTheme = "الكواكب البعيدة",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: الظواهر الضوئية والمقاييس الكونية (THINKING)
        Challenge(
            id = "astronomy_c6",
            categoryId = "astronomy",
            title = "الظواهر الضوئية والمقاييس الكونية",
            themeDescription = "احتجاب الأجرام والمقاييس الفلكية الشاسعة للأبعاد والزمن",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 116,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "ظاهرة فلكية تحدث عند وقوع القمر بين الشمس والأرض فيحجب ضوءها كلياً أو جزئياً",
                    correctAnswer = "كسوف",
                    availableLetters = LetterScrambler.buildScrambledLetters("كسوف", GameDifficulty.THINKING, listOf("خ", "س", "و", "ف"), seed = 116L),
                    hint = "يتحول النهار إلى ظلام دامس للحظات معدودة",
                    rewardPoints = 20,
                    explanation = "الكسوف الشمسي يحدث حصراً عند ولادة القمر الجديد (المحاق) على خط استقامة واحد مع الشمس.",
                    challengeId = "astronomy_c6",
                    challengeTitle = "الظواهر الضوئية والمقاييس الكونية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌘",
                    visualTheme = "احتجاب الأجرام",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 117,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "ظاهرة فلكية تحدث عندما تقع الأرض بين الشمس والقمر فيسقط ظلها على وجه القمر",
                    correctAnswer = "خسوف",
                    availableLetters = LetterScrambler.buildScrambledLetters("خسوف", GameDifficulty.THINKING, listOf("ك", "س", "و", "ف"), seed = 117L),
                    hint = "يكتسي القمر أحياناً لوناً أحمر نحاسياً كالقمر الدموي",
                    rewardPoints = 20,
                    explanation = "الخسوف القمري يحدث عندما يكتمل القمر بدراً ويدخل في مخروط ظل كوكب الأرض.",
                    challengeId = "astronomy_c6",
                    challengeTitle = "الظواهر الضوئية والمقاييس الكونية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌖",
                    visualTheme = "ظلال الفضاء",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 118,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "وميض ضوئي ساطع ينتج عن احتراق قطعة صخرية فضائية صغيرة في الغلاف الجوي للأرض",
                    correctAnswer = "شهاب",
                    availableLetters = LetterScrambler.buildScrambledLetters("شهاب", GameDifficulty.THINKING, listOf("م", "ذ", "ن", "ب"), seed = 118L),
                    hint = "يظهر كخط ضوئي خاطف يطلق عليه سهم السماء",
                    rewardPoints = 20,
                    explanation = "الشهب هي جسيمات غبارية تحترق بفعل الاحتكاك بالهواء بسرعة فائقة محدثة خطاً ضوئياً.",
                    challengeId = "astronomy_c6",
                    challengeTitle = "الظواهر الضوئية والمقاييس الكونية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌠",
                    visualTheme = "الومضات الضوئية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: الميكانيكا المدارية وقوانين الفضاء (CHALLENGE)
        Challenge(
            id = "astronomy_c7",
            categoryId = "astronomy",
            title = "الميكانيكا المدارية وقوانين الفضاء",
            themeDescription = "القوى الفيزيائية الحاكمة لحركة الأجرام ومسارات الأقمار الصناعية",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 119,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "المسار المنحني الهندسي المنتظم الذي يسلكه جرم سماوي حول جرم آخر تحت تأثير الجاذبية",
                    correctAnswer = "مدار",
                    availableLetters = LetterScrambler.buildScrambledLetters("مدار", GameDifficulty.CHALLENGE, listOf("ف", "ل", "ك", "س", "م", "ح"), seed = 119L),
                    hint = "قد يكون دائرياً أو إهليلجياً بيضاوياً",
                    rewardPoints = 25,
                    explanation = "المدار الفلكي هو توازن ديناميكي دقيق بين القصور الذاتي للجرم وقوة الجاذبية المركزية.",
                    challengeId = "astronomy_c7",
                    challengeTitle = "الميكانيكا المدارية وقوانين الفضاء",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🔄",
                    visualTheme = "المسارات الكونية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 120,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "الشكل الهندسي البيضاوي الحقيقي لمدارات الكواكب حول الشمس كما أثبته العالم كبلر",
                    correctAnswer = "قطع",
                    availableLetters = LetterScrambler.buildScrambledLetters("قطع", GameDifficulty.CHALLENGE, listOf("د", "ا", "ئ", "ر", "ي", "م"), seed = 120L),
                    hint = "نوع من المنحنيات المخروطية يسمى قطعاً ناقصاً",
                    rewardPoints = 25,
                    explanation = "قانون كبلر الأول ينص على أن مدار كل كوكب هو قطع ناقص تقع الشمس في إحدى بؤرتيه.",
                    challengeId = "astronomy_c7",
                    challengeTitle = "الميكانيكا المدارية وقوانين الفضاء",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📐",
                    visualTheme = "هندسة المدارات",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 121,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "أقرب نقطة في مدار الجرم السماوي إلى الجرم الذي يدور حوله مثل الأرض حول الشمس",
                    correctAnswer = "حضيض",
                    availableLetters = LetterScrambler.buildScrambledLetters("حضيض", GameDifficulty.CHALLENGE, listOf("ا", "و", "ج", "ق", "م", "ر"), seed = 121L),
                    hint = "عكس نقطة الأوج التي تمثل أبعد مسافة مدارية",
                    rewardPoints = 25,
                    explanation = "نقطة الحضيض المداري تمثل الموضع الذي يبلغ فيه الجرم أقصى سرعة مدارية له بسبب قرب الجاذبية.",
                    challengeId = "astronomy_c7",
                    challengeTitle = "الميكانيكا المدارية وقوانين الفضاء",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📍",
                    visualTheme = "النقاط المدارية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: دورة حياة النجوم والانفجارات العظمى (CHALLENGE)
        Challenge(
            id = "astronomy_c8",
            categoryId = "astronomy",
            title = "دورة حياة النجوم والانفجارات العظمى",
            themeDescription = "ولادة النجوم ومراحل شيخوختها حتى الانفجارات النجمية الكارثية",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 122,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "الانفجار النجمي الهائل فائق السطوع الذي يختم حياة نجم عملاق بقوة تفوق إشعاع مجرة كاملة",
                    correctAnswer = "مستعر",
                    availableLetters = LetterScrambler.buildScrambledLetters("مستعر", GameDifficulty.CHALLENGE, listOf("س", "د", "ي", "م", "ن", "و"), seed = 122L),
                    hint = "يطلق عليه فلكياً السوبرنوفا",
                    rewardPoints = 25,
                    explanation = "المستعر الأعظم (السوبرنوفا) يقذف معظم مادة النجم في الفضاء مخلّفاً نجماً نيوترونياً أو ثقباً أسود.",
                    challengeId = "astronomy_c8",
                    challengeTitle = "دورة حياة النجوم والانفجارات العظمى",
                    questionIndexInChallenge = 1,
                    visualEmoji = "💥",
                    visualTheme = "الانفجارات النجمية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 123,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "نجم فائق الكثافة وصغير الحجم يتكون بالكامل تقريباً من جسيمات نيوترونية متعادلة بعد انهيار نواته",
                    correctAnswer = "نباض",
                    availableLetters = LetterScrambler.buildScrambledLetters("نباض", GameDifficulty.CHALLENGE, listOf("م", "ش", "ع", "ل", "ك", "و"), seed = 123L),
                    hint = "يرسل نبضات كهرومغناطيسية لاسلكية منتظمة بدقة متناهية",
                    rewardPoints = 25,
                    explanation = "النجم النباض هو نجم نيوتروني سريع الدوران يطلق حزمة إشعاعية تكنس الفضاء كفنار كوني.",
                    challengeId = "astronomy_c8",
                    challengeTitle = "دورة حياة النجوم والانفجارات العظمى",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📡",
                    visualTheme = "النجوم النيوترونية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 124,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "مرحلة متأخرة من حياة النجوم متوسطة الحجم كالشمس حيث تنتفخ وتبرد طبقاتها الخارجية متحولة للون الأحمر",
                    correctAnswer = "عملاق",
                    availableLetters = LetterScrambler.buildScrambledLetters("عملاق", GameDifficulty.CHALLENGE, listOf("ق", "ز", "م", "ص", "غ", "ي"), seed = 124L),
                    hint = "يسمى بالعملاق الأحمر قبل أن يقذف سديمه الكوكبي",
                    rewardPoints = 25,
                    explanation = "العملاق الأحمر يتشكل بعد نفاد الهيدروجين في قلب النجم وبدء اندماج الهيليوم في القشرة المحيطة.",
                    challengeId = "astronomy_c8",
                    challengeTitle = "دورة حياة النجوم والانفجارات العظمى",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🟠",
                    visualTheme = "أطوار النجوم",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: مراصد الفضاء والمقاييس الكونية الفائقة (EXPERT)
        Challenge(
            id = "astronomy_c9",
            categoryId = "astronomy",
            title = "مراصد الفضاء والمقاييس الكونية الفائقة",
            themeDescription = "أدوات رصد أعماق الزمان والمكان ووحدات القياس بين المجرات",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 125,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "المسافة الهائلة التي يقطعها شعاع الضوء في الفراغ خلال سنة أرضية كاملة وتعادل نحو 9.5 تريليون كم",
                    correctAnswer = "ضوئية",
                    availableLetters = LetterScrambler.buildScrambledLetters("ضوئية", GameDifficulty.EXPERT, listOf("ف", "ل", "ك", "ي", "ة", "س", "م"), seed = 125L),
                    hint = "الوحدة الأساسية لقياس أبعاد النجوم والمجرات (سنة ...)",
                    rewardPoints = 30,
                    explanation = "السنة الضوئية هي وحدة قياس مسافة لا زمن، وتستخدم لحساب أبعاد الأجرام خارج نظامنا الشمسي.",
                    challengeId = "astronomy_c9",
                    challengeTitle = "مراصد الفضاء والمقاييس الكونية الفائقة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📏",
                    visualTheme = "المقاييس الكونية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 126,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "أحدث وأقوى تلسكوب فضائي يعمل بالأشعة تحت الحمراء تم إطلاقه في نقطة لاغرانج L2 لرصد بواكير الكون",
                    correctAnswer = "ويب",
                    availableLetters = LetterScrambler.buildScrambledLetters("ويب", GameDifficulty.EXPERT, listOf("ه", "ا", "ب", "ل", "ك", "ب", "ل"), seed = 126L),
                    hint = "يحمل اسم جيمس ويب المدير الأسبق لوكالة ناسا",
                    rewardPoints = 30,
                    explanation = "تلسكوب جيمس ويب الفضائي يمتلك مرآة ذهبية قطرها 6.5 أمتار لاستكشاف أقدم المجرات المتشكلة بعد الانفجار العظيم.",
                    challengeId = "astronomy_c9",
                    challengeTitle = "مراصد الفضاء والمقاييس الكونية الفائقة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🛰️",
                    visualTheme = "المراصد الحديثة",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 127,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "نواة مجرية نشطة شديدة الإضاءة والبعد تستمد طاقتها الهائلة من قرص متنامٍ يحيط بثقب أسود فائق الكتلة",
                    correctAnswer = "كوازار",
                    availableLetters = LetterScrambler.buildScrambledLetters("كوازار", GameDifficulty.EXPERT, listOf("ب", "ل", "ا", "ز", "ا", "ر", "س"), seed = 127L),
                    hint = "يسمى بالنجم الزائف ويبعث طاقة تفوق مئات المجرات",
                    rewardPoints = 30,
                    explanation = "الكوازارات هي أسطع الأجرام في الكون المنظور، وتعتبر منارات كونية نشأت في بدايات تاريخ المجرات.",
                    challengeId = "astronomy_c9",
                    challengeTitle = "مراصد الفضاء والمقاييس الكونية الفائقة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔆",
                    visualTheme = "الأنوية المجرية",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: المادة المظلمة وتوسع الزمكان (EXPERT)
        Challenge(
            id = "astronomy_c10",
            categoryId = "astronomy",
            title = "المادة المظلمة وتوسع الزمكان",
            themeDescription = "ألغاز الكتلة المفقودة والطاقة الخفية المسيطرة على مصير الكون",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 128,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "مادة خفية لا تتفاعل مع الضوء ولا تطلق إشعاعاً لكنها تشكل أكثر من 85% من كتلة المادة في الكون بجاذبيتها",
                    correctAnswer = "مظلمة",
                    availableLetters = LetterScrambler.buildScrambledLetters("مظلمة", GameDifficulty.EXPERT, listOf("س", "و", "د", "ا", "ء", "خ", "ف"), seed = 128L),
                    hint = "اكتشفت من سرعة دوران النجوم على أطراف المجرات (مادة ...)",
                    rewardPoints = 35,
                    explanation = "المادة المظلمة تمسك المجرات من التفكك عبر جاذبيتها الفائقة رغم تعذر رؤيتها بالأدوات التقليدية.",
                    challengeId = "astronomy_c10",
                    challengeTitle = "المادة المظلمة وتوسع الزمكان",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌌",
                    visualTheme = "المادة الخفية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 129,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "قوة غامضة متجانسة تملأ أرجاء الفضاء وتعمل في الاتجاه المعاكس للجاذبية مسببة تسارع تمدد الكون",
                    correctAnswer = "ثابت",
                    availableLetters = LetterScrambler.buildScrambledLetters("ثابت", GameDifficulty.EXPERT, listOf("ك", "و", "ن", "ي", "ل", "ا", "م"), seed = 129L),
                    hint = "يرمز له بالحرف اليوناني لامبدا ويسمى الثابت الكوني",
                    rewardPoints = 35,
                    explanation = "الثابت الكوني لآينشتاين هو التعبير الرياضي الأقرب لما يعرف اليوم بتأثير الطاقة المظلمة.",
                    challengeId = "astronomy_c10",
                    challengeTitle = "المادة المظلمة وتوسع الزمكان",
                    questionIndexInChallenge = 2,
                    visualEmoji = "⚡",
                    visualTheme = "الطاقة الكونية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 130,
                    categoryId = "astronomy",
                    category = "بيت الفضاء والفلك",
                    question = "الوهج الإشعاعي الخافت المتبقي من اللحظات الأولى للانفجار العظيم والذي يملأ الكون بدرجة 2.7 كلفن",
                    correctAnswer = "خلفية",
                    availableLetters = LetterScrambler.buildScrambledLetters("خلفية", GameDifficulty.EXPERT, listOf("ا", "ش", "ع", "ا", "ع", "م", "و"), seed = 130L),
                    hint = "يسمى إشعاع الخلفية الكونية الميكروي (CMB)",
                    rewardPoints = 35,
                    explanation = "إشعاع الخلفية الكونية يعتبر أهم وثيقة أحفورية ضوئية تؤكد صحة نموذج الانفجار العظيم لبداية الكون.",
                    challengeId = "astronomy_c10",
                    challengeTitle = "المادة المظلمة وتوسع الزمكان",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📻",
                    visualTheme = "إشعاع البداية",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
