package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object AnimalsChallenges {

    val challenges = listOf(
        // Challenge 1: كائنات البادية والسافانا (EXPLORATION)
        Challenge(
            id = "animals_c1",
            categoryId = "animals",
            title = "كائنات البادية والسافانا",
            themeDescription = "الحيوانات المتأقلمة مع بيئات الصحراء والبراري المفتوحة",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 901,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "حيوان صحراوي صبور يلقب بسفينة الصحراء ويخزن الدهون في سنامه لتحمل العطش",
                    correctAnswer = "جمل",
                    availableLetters = LetterScrambler.buildScrambledLetters("جمل", GameDifficulty.EXPLORATION, listOf("ص", "ح", "ر"), seed = 901L),
                    hint = "الإبل والجمال العربية الأصيلة",
                    rewardPoints = 15,
                    explanation = "الجمل يتمتع بخف عريض يمنعه من الغوص في الرمال ورموش مزدوجة تحميه من العواصف الرملية.",
                    challengeId = "animals_c1",
                    challengeTitle = "كائنات البادية والسافانا",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🐪",
                    visualTheme = "حيوانات الصحراء",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 902,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "حيوان مفترس قوي يلقب بملك الغابة ويعيش في جماعات وزئيره يسمع من مسافات بعيدة",
                    correctAnswer = "أسد",
                    availableLetters = LetterScrambler.buildScrambledLetters("أسد", GameDifficulty.EXPLORATION, listOf("غ", "ا", "ب"), seed = 902L),
                    hint = "السبع والغضنفر والضرغام",
                    rewardPoints = 15,
                    explanation = "الأسد من السنوريات الكبرى وتتولى اللبؤات مهمة الصيد الرئيسية لتغذية القطيع.",
                    challengeId = "animals_c1",
                    challengeTitle = "كائنات البادية والسافانا",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🦁",
                    visualTheme = "الضواري والسنوريات",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 903,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "أضخم حيوان ثديي بري على وجه الأرض يمتلك خرطوماً طويلاً وأنياباً عاجية وأذنين كبيرتين",
                    correctAnswer = "فيل",
                    availableLetters = LetterScrambler.buildScrambledLetters("فيل", GameDifficulty.EXPLORATION, listOf("ض", "خ", "م", "ع"), seed = 903L),
                    hint = "الفيل الإفريقي والفيل الآسيوي",
                    rewardPoints = 20,
                    explanation = "الفيل يتمتع بذاكرة مدهشة وروابط عائلية وثيقة ويستخدم خرطومه للشرب ورفع الأثقال.",
                    challengeId = "animals_c1",
                    challengeTitle = "كائنات البادية والسافانا",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🐘",
                    visualTheme = "الثدييات الضخمة",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: أعماق البحار والمحيطات (THINKING)
        Challenge(
            id = "animals_c2",
            categoryId = "animals",
            title = "أعماق البحار والمحيطات",
            themeDescription = "الكائنات البحرية والثدييات المائية الذكية في المحيطات",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 904,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "أضخم كائن حي على وجه الأرض قاطبة يفوق حجم الديناصورات ويتغذى على العوالق",
                    correctAnswer = "حوت",
                    availableLetters = LetterScrambler.buildScrambledLetters("حوت", GameDifficulty.THINKING, listOf("ب", "ح", "ر", "م"), seed = 904L),
                    hint = "الحوت الأزرق العملاق في المحيطات",
                    rewardPoints = 20,
                    explanation = "الحوت الأزرق قد يصل طوله إلى 30 متراً ووزنه إلى 180 طناً ويتنفس الهواء بالرئتين.",
                    challengeId = "animals_c2",
                    challengeTitle = "أعماق البحار والمحيطات",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🐋",
                    visualTheme = "الحيتان العملاقة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 905,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "ثديي بحري ودود ذكي يتواصل بالصفير ويقفز برشاقة فوق الأمواج ويحب مرافقة السفن",
                    correctAnswer = "دلفين",
                    availableLetters = LetterScrambler.buildScrambledLetters("دلفين", GameDifficulty.THINKING, listOf("م", "ا", "ء", "س"), seed = 905L),
                    hint = "الدولفين صديق الإنسان في البحار",
                    rewardPoints = 20,
                    explanation = "الدلافين تستخدم نظام الصدى الصوتي (السونار) لتحديد مواقع الفرائس والتنقل في المياه المظلمة.",
                    challengeId = "animals_c2",
                    challengeTitle = "أعماق البحار والمحيطات",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🐬",
                    visualTheme = "الثدييات البحرية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 906,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "حيوان رخوي بحري يمتلك ثمانية أذرع وثلاثة قلوب ويغير لونه للتمويه ويطلق الحبر",
                    correctAnswer = "أخطبوط",
                    availableLetters = LetterScrambler.buildScrambledLetters("أخطبوط", GameDifficulty.THINKING, listOf("ح", "ب", "ر", "ذ"), seed = 906L),
                    hint = "الأخطبوط فائق الذكاء في التخفي",
                    rewardPoints = 20,
                    explanation = "الأخطبوط كائن بحري شديد الذكاء وقادر على حل المتاهات وتغيير ملمس جلده ليتطابق مع الشعاب المرجانية.",
                    challengeId = "animals_c2",
                    challengeTitle = "أعماق البحار والمحيطات",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🐙",
                    visualTheme = "الرخويات والتمويه",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: الجوارح وعجائب الطيران (CHALLENGE)
        Challenge(
            id = "animals_c3",
            categoryId = "animals",
            title = "الجوارح وعجائب الطيران",
            themeDescription = "الطيور الجارحة ذات البصر الحاد والكائنات ذات القدرات الخارقة",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 907,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "طائر جارح مهيب بصرُه حاد جداً ويحلق في أعالي السماء وينقض بسرعة فائقة على طرائده",
                    correctAnswer = "صقر",
                    availableLetters = LetterScrambler.buildScrambledLetters("صقر", GameDifficulty.CHALLENGE, listOf("ط", "ي", "ر", "ج", "ن", "ا"), seed = 907L),
                    hint = "الصقر والشاهين رمز العزة والفروسية العربية",
                    rewardPoints = 25,
                    explanation = "صقر الشاهين أسرع كائن حي على وجه الأرض، حيث تتجاوز سرعته 300 كم/ساعة أثناء انقضاضه الجوي.",
                    challengeId = "animals_c3",
                    challengeTitle = "الجوارح وعجائب الطيران",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🦅",
                    visualTheme = "الطيور الجارحة",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 908,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "أسرع حيوان بري على الإطلاق ينطلق كالبرق الخاطف في مطاردة الغزلان في البراري",
                    correctAnswer = "فهد",
                    availableLetters = LetterScrambler.buildScrambledLetters("فهد", GameDifficulty.CHALLENGE, listOf("س", "ر", "ي", "ع", "ب", "ر"), seed = 908L),
                    hint = "الفهد الصياد (الشيتا) ذو الرشاقة الفائقة",
                    rewardPoints = 25,
                    explanation = "الفهد يتسارع من 0 إلى 100 كم/ساعة في أقل من 3 ثوانٍ بفضل عموده الفقري المرن ومخالبه الثابتة.",
                    challengeId = "animals_c3",
                    challengeTitle = "الجوارح وعجائب الطيران",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🐆",
                    visualTheme = "سرعة الحيوانات",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 909,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "طائر ليلي يتميز بعينين واسعتين وقدرة على تدوير رأسه بزاوية تقارب 270 درجة وريش صامت",
                    correctAnswer = "بومة",
                    availableLetters = LetterScrambler.buildScrambledLetters("بومة", GameDifficulty.CHALLENGE, listOf("ل", "ي", "ل", "ص", "و", "ت"), seed = 909L),
                    hint = "طائر البوم الحكيم صياد الليل",
                    rewardPoints = 25,
                    explanation = "البومة تطير بصمت مطلق بفضل الحواف المسننة لريشها التي تمتص ضجيج الهواء فتفاجئ فرائسها.",
                    challengeId = "animals_c3",
                    challengeTitle = "الجوارح وعجائب الطيران",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🦉",
                    visualTheme = "الصيادون الليليون",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: أسرار الطيور والملاحة المغناطيسية (THINKING)
        Challenge(
            id = "animals_c4",
            categoryId = "animals",
            title = "أسرار الطيور والملاحة المغناطيسية",
            themeDescription = "هجرة الطيور لمسافات قارية والتكيفات الجوية الفريدة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 910,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "أكبر طائر حي على وجه الأرض لا يطير ولكنه يتميز بسرعته الفائقة في الجري في الصحراء",
                    correctAnswer = "نعامة",
                    availableLetters = LetterScrambler.buildScrambledLetters("نعامة", GameDifficulty.THINKING, listOf("ح", "ب", "ا", "ر"), seed = 910L),
                    hint = "تضع أكبر بيضة بين جميع الطيور الحية وتعيش في إفريقيا",
                    rewardPoints = 20,
                    explanation = "النعامة تستطيع الركض بسرعة تصل إلى 70 كم/ساعة بفضل عضلات ساقيها القوية وخطوتها الواسعة.",
                    challengeId = "animals_c4",
                    challengeTitle = "أسرار الطيور والملاحة المغناطيسية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🦤",
                    visualTheme = "الطيور الأرضية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 911,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "طائر بحري قطبي يقطع أطول رحلة هجرة سنوية في العالم من القطب الشمالي إلى الجنوبي والعودة",
                    correctAnswer = "خرشنة",
                    availableLetters = LetterScrambler.buildScrambledLetters("خرشنة", GameDifficulty.THINKING, listOf("ن", "و", "ر", "س"), seed = 911L),
                    hint = "الخرشنة القطبية التي تسافر أكثر من 70 ألف كم سنوياً",
                    rewardPoints = 20,
                    explanation = "طائر الخرشنة القطبية يعيش تجربتي صيف كل عام ويحظى بأكبر قدر من ضوء النهار بين جميع الكائنات.",
                    challengeId = "animals_c4",
                    challengeTitle = "أسرار الطيور والملاحة المغناطيسية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🕊️",
                    visualTheme = "هجرة الطيور",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 912,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "طائر بحري لا يطير في الهواء بل يسبح بمهارة ويعيش في مستعمرات ضخمة في القارة القطبية الجنوبية",
                    correctAnswer = "بطريق",
                    availableLetters = LetterScrambler.buildScrambledLetters("بطريق", GameDifficulty.THINKING, listOf("ف", "ق", "م", "ة"), seed = 912L),
                    hint = "يمتلك طبقة دهون وريشاً كثيفاً لمقاومة صقيع أنتاركتيكا",
                    rewardPoints = 20,
                    explanation = "البطاريق طيور مائية تحورت أجنحتها إلى زعانف صلبة تمكنها من الغوص لصيد الأسماك والحبار.",
                    challengeId = "animals_c4",
                    challengeTitle = "أسرار الطيور والملاحة المغناطيسية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🐧",
                    visualTheme = "الطيور السابحة",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: الزواحف والتمويه والدم البارد (THINKING)
        Challenge(
            id = "animals_c5",
            categoryId = "animals",
            title = "الزواحف والتمويه والدم البارد",
            themeDescription = "تكيفات الزواحف وتنظيم الحرارة وأسلحة السموم الطبيعية",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 913,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "زاحف شجري يشتهر بقدرته المدهشة على تغيير لون جلده وعينيه اللتين تتحركان باستقلال تام",
                    correctAnswer = "حرباء",
                    availableLetters = LetterScrambler.buildScrambledLetters("حرباء", GameDifficulty.THINKING, listOf("ض", "ب", "و", "ر"), seed = 913L),
                    hint = "تمتلك لساناً لزجاً طويلاً ينطلق كالسهم لاصطياد الحشرات",
                    rewardPoints = 20,
                    explanation = "الحرباء تغير لونها عبر خلايا صباغية متخصصة (الكروماتوفور) للتواصل وتنظيم الحرارة والتمويه.",
                    challengeId = "animals_c5",
                    challengeTitle = "الزواحف والتمويه والدم البارد",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🦎",
                    visualTheme = "التمويه الحيوي",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 914,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "أكبر الزواحف الحية حجماً ومفترس برمائي مهيب يمتلك أقوى عضة فك بين الكائنات الحية",
                    correctAnswer = "تمساح",
                    availableLetters = LetterScrambler.buildScrambledLetters("تمساح", GameDifficulty.THINKING, listOf("ث", "ع", "ب", "ا"), seed = 914L),
                    hint = "يعيش في الأنهار والمستنقعات ومصبات المياه المالحة الاستوائية",
                    rewardPoints = 20,
                    explanation = "التماسيح تعود لعصر الديناصورات وتمتلك جلداً مدرعاً وحاسة سمع واستشعار اهتزاز بالغة الدقة في الماء.",
                    challengeId = "animals_c5",
                    challengeTitle = "الزواحف والتمويه والدم البارد",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🐊",
                    visualTheme = "الزواحف البرمائية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 915,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "زاحف ذو درع صلب قرني يحميه من المفترسين ويشتهر ببطء حركته وطول عمره الذي يتجاوز قرناً",
                    correctAnswer = "سلحفاة",
                    availableLetters = LetterScrambler.buildScrambledLetters("سلحفاة", GameDifficulty.THINKING, listOf("ح", "ر", "ذ", "و"), seed = 915L),
                    hint = "توجد منها أنواع برية وأخرى بحرية تهاجر عبر المحيطات",
                    rewardPoints = 20,
                    explanation = "السلاحف تنتمي لأقدم رتب الزواحف ودرعها جزء لا يتجزأ من هيكلها العظمي وقفصها الصدري.",
                    challengeId = "animals_c5",
                    challengeTitle = "الزواحف والتمويه والدم البارد",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🐢",
                    visualTheme = "الزواحف المدرعة",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: مجتمعات الحشرات والهندسة الفائقة (THINKING)
        Challenge(
            id = "animals_c6",
            categoryId = "animals",
            title = "مجتمعات الحشرات والهندسة الفائقة",
            themeDescription = "مستعمرات النمل والنحل والتواصل الكيميائي الدقيق",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 916,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "حشرة اجتماعية منظمة تعيش في مستعمرات جبارة تحت الأرض وتبني أنفاقاً وتزرع الفطر",
                    correctAnswer = "نمل",
                    availableLetters = LetterScrambler.buildScrambledLetters("نمل", GameDifficulty.THINKING, listOf("ن", "ح", "ل", "د"), seed = 916L),
                    hint = "تستطيع حمل أوزان تفوق وزن جسمها بعشرات المرات",
                    rewardPoints = 20,
                    explanation = "النمل يتواصل باستخدام الفيرمونات الكيميائية ويمتلك تقسيماً طبقياً دقيقاً بين الملكة والعمال والجنود.",
                    challengeId = "animals_c6",
                    challengeTitle = "مجتمعات الحشرات والهندسة الفائقة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🐜",
                    visualTheme = "ممالك الحشرات",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 917,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "حشرة طائرة تنتج العسل والشمع وتبني خلايا سداسية هندسية مثالية لتخزين الرحيق واليرقات",
                    correctAnswer = "نحل",
                    availableLetters = LetterScrambler.buildScrambledLetters("نحل", GameDifficulty.THINKING, listOf("د", "ب", "و", "ر"), seed = 917L),
                    hint = "تؤدي دوراً بيئياً لا غنى عنه في تلقيح ثلث المحاصيل الزراعية بالعالم",
                    rewardPoints = 20,
                    explanation = "النحل يتواصل بـ رقصة الاهتزاز لإرشاد أفراد الخلية إلى اتجاه ومسافة حقول الزهور بدقة متناهية.",
                    challengeId = "animals_c6",
                    challengeTitle = "مجتمعات الحشرات والهندسة الفائقة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🐝",
                    visualTheme = "التنظيم الاجتماعي",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 918,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "حشرة تمر بتحول كامل من يرقة زاحفة شرهة داخل شرنقة حريرية إلى كائن طائر بديع الألوان",
                    correctAnswer = "فراشة",
                    availableLetters = LetterScrambler.buildScrambledLetters("فراشة", GameDifficulty.THINKING, listOf("ي", "ع", "س", "و"), seed = 918L),
                    hint = "تتغذى على رحيق الأزهار وتهاجر فراشة الملك لمسافات شاسعة",
                    rewardPoints = 20,
                    explanation = "الفراشات مغطاة بآلاف الحراشف المجهرية الدقيقة التي تعكس الضوء لتعطي ألوانها الزاهية الباهرة.",
                    challengeId = "animals_c6",
                    challengeTitle = "مجتمعات الحشرات والهندسة الفائقة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🦋",
                    visualTheme = "التحول الحيوي",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: كائنات الأعماق والإضاءة الحيوية (CHALLENGE)
        Challenge(
            id = "animals_c7",
            categoryId = "animals",
            title = "كائنات الأعماق والإضاءة الحيوية",
            themeDescription = "التكيف مع الضغط الهائل والظلام الدامس في قيعان البحار",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 919,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "رخوي عملاق في أعماق المحيط يمتلك أكبر عينين في المملكة الحيوانية بحجم كرة السلة",
                    correctAnswer = "حبار",
                    availableLetters = LetterScrambler.buildScrambledLetters("حبار", GameDifficulty.CHALLENGE, listOf("أ", "خ", "ط", "ب", "و", "ط"), seed = 919L),
                    hint = "الحبار العملاق أو الحبار الهائل الذي يصارع حيتان العنبر",
                    rewardPoints = 25,
                    explanation = "الحبار العملاق يعيش في منطقة الغسق المحيطي ويستخدم عينيه الضخمتين لرصد خيالات الضوء في الظلام السحيق.",
                    challengeId = "animals_c7",
                    challengeTitle = "كائنات الأعماق والإضاءة الحيوية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🦑",
                    visualTheme = "عمالقة الأعماق",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 920,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "ظاهرة إنتاج الضوء البارد وانبعاثه من أجسام الكائنات الحية عبر تفاعل اللوسيفيرين والأكسجين",
                    correctAnswer = "تألق",
                    availableLetters = LetterScrambler.buildScrambledLetters("تألق", GameDifficulty.CHALLENGE, listOf("إ", "ش", "ع", "ا", "ع", "ض"), seed = 920L),
                    hint = "تسمى الإضاءة الحيوية أو التألق الحيوي (Bioluminescence)",
                    rewardPoints = 25,
                    explanation = "أكثر من 75% من كائنات الأعماق تستخدم الإضاءة الحيوية للتخفي أو استدراج الفرائس أو التواصل التزاوجي.",
                    challengeId = "animals_c7",
                    challengeTitle = "كائنات الأعماق والإضاءة الحيوية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "✨",
                    visualTheme = "الإضاءة الحيوية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 921,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "سمكة من أسماك الأعماق المظلمة تتدلى من رأسها زائدة مضيئة تشبه الصنارة لإغراء الأسماك نحو فمها",
                    correctAnswer = "صياد",
                    availableLetters = LetterScrambler.buildScrambledLetters("صياد", GameDifficulty.CHALLENGE, listOf("ق", "ر", "ش", "ف", "ا", "س"), seed = 921L),
                    hint = "سمكة الشص أو السمكة الصيادة (Anglerfish)",
                    rewardPoints = 25,
                    explanation = "أنثى سمكة الشص تستضيف بكتيريا مضيئة تكافلياً في طعمها وتملك أسناناً شفافة حادة تميل للداخل لمنع فرار الفريسة.",
                    challengeId = "animals_c7",
                    challengeTitle = "كائنات الأعماق والإضاءة الحيوية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🐟",
                    visualTheme = "مفترسات الأعماق",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: الثدييات والذكاء الحيواني والعلاقات البيئية (CHALLENGE)
        Challenge(
            id = "animals_c8",
            categoryId = "animals",
            title = "الثدييات والذكاء الحيواني والعلاقات البيئية",
            themeDescription = "استخدام الأدوات والتعاطف والتواصل الصوتي المعقد لدى الحيوانات",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 922,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "ثديي مائي ذكي ومرح يعتبر أكبر أفراد فصيلة الدلافين ويعرف بالحوت القاتل أو صائد الحيتان",
                    correctAnswer = "أوركا",
                    availableLetters = LetterScrambler.buildScrambledLetters("أوركا", GameDifficulty.CHALLENGE, listOf("ع", "ن", "ب", "ر", "د", "ل"), seed = 922L),
                    hint = "يتميز بلونه الأسود والأبيض الصريح وزعنفته الظهرية الشاهقة",
                    rewardPoints = 25,
                    explanation = "الأوركا تعيش في مجموعات عائلية معقدة وتمتلك لهجات صوتية خاصة بكل قطيع واستراتيجيات صيد متباينة.",
                    challengeId = "animals_c8",
                    challengeTitle = "الثدييات والذكاء الحيواني والعلاقات البيئية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🐋",
                    visualTheme = "المفترسات البحرية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 923,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "قرد عليا شديد الذكاء يشترك مع الإنسان في أكثر من 98% من تسلسل الحمض النووي ويستخدم الأدوات في البرية",
                    correctAnswer = "شمبانزي",
                    availableLetters = LetterScrambler.buildScrambledLetters("شمبانزي", GameDifficulty.CHALLENGE, listOf("غ", "و", "ر", "ي", "ل", "ا"), seed = 923L),
                    hint = "يعيش في غابات وسط وغرب إفريقيا ويحل المشكلات المنطقية المعقدة",
                    rewardPoints = 25,
                    explanation = "الشمبانزي يصنع رماحاً للصيد ويستخدم أحجاراً لتكسير الجوز ويتعلم لغة الإشارة للتواصل مع البشر.",
                    challengeId = "animals_c8",
                    challengeTitle = "الثدييات والذكاء الحيواني والعلاقات البيئية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🐒",
                    visualTheme = "الذكاء الحيواني",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 924,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "علاقة بيئية وثيقة ومستمرة بين نوعين مختلفين يستفيد فيها الطرفان معاً كتبادل المنفعة",
                    correctAnswer = "تكافل",
                    availableLetters = LetterScrambler.buildScrambledLetters("تكافل", GameDifficulty.CHALLENGE, listOf("ت", "ط", "ف", "ل", "ا", "ف"), seed = 924L),
                    hint = "مثل سمكة المهرج داخل شقائق النعمان السامة",
                    rewardPoints = 25,
                    explanation = "التكافل البيئي (Symbiosis) يعتبر من أهم محركات التطور والتنوع واستقرار السلاسل الغذائية في الطبيعة.",
                    challengeId = "animals_c8",
                    challengeTitle = "الثدييات والذكاء الحيواني والعلاقات البيئية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🤝",
                    visualTheme = "العلاقات البيئية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: عصر الديناصورات والعمالقة المنقرضة (EXPERT)
        Challenge(
            id = "animals_c9",
            categoryId = "animals",
            title = "عصر الديناصورات والعمالقة المنقرضة",
            themeDescription = "الماموث والزواحف المجنحة وسجلات الانقراض العظيم",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 925,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "فيل صوفي عملاق منقرض عاش في العصر الجليدي وامتلك أنياباً مقوسة ضخمة وشعراً كثيفاً يحميه من الصقيع",
                    correctAnswer = "ماموث",
                    availableLetters = LetterScrambler.buildScrambledLetters("ماموث", GameDifficulty.EXPERT, listOf("م", "ا", "س", "ت", "و", "د", "و"), seed = 925L),
                    hint = "عثر على جثثه المحفوظة بالكامل في صقيع سيبيريا الدائم",
                    rewardPoints = 30,
                    explanation = "الماموث الصوفي عاصر البشر الأوائل ورسموه على جدران الكهوف قبل أن ينقرض مع نهاية العصر الجليدي الأخير.",
                    challengeId = "animals_c9",
                    challengeTitle = "عصر الديناصورات والعمالقة المنقرضة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🦣",
                    visualTheme = "عمالقة الجليد",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 926,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "أشهر ديناصور لاحم مفترس عاش في العصر الطباشيري وتميز بفكوك هائلة وأطراف أمامية بالغة الصغر",
                    correctAnswer = "تيرانوصور",
                    availableLetters = LetterScrambler.buildScrambledLetters("تيرانوصور", GameDifficulty.EXPERT, listOf("ر", "ا", "ب", "ت", "و", "ر", "س"), seed = 926L),
                    hint = "الملقب بـ تي ريكس (T-Rex) ملك الزواحف الطاغية",
                    rewardPoints = 30,
                    explanation = "التيرانوصور ريكس امتلك قوة عضة استثنائية قادرة على سحق عظام الفرائس وبصراً ثنائي الأبعاد فائق الحدة.",
                    challengeId = "animals_c9",
                    challengeTitle = "عصر الديناصورات والعمالقة المنقرضة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🦖",
                    visualTheme = "عصر الديناصورات",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 927,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "طائر حمامي ضخم لا يطير كان موطنه جزيرة موريشيوس وانقرض تماماً في القرن السابع عشر بسبب الصيد الجائر",
                    correctAnswer = "دودو",
                    availableLetters = LetterScrambler.buildScrambledLetters("دودو", GameDifficulty.EXPERT, listOf("م", "و", "ا", "ك", "ي", "و", "ي"), seed = 927L),
                    hint = "أصبح مضرب المثل العالمي في الانقراض وفقدان الحذر الطبيعي",
                    rewardPoints = 30,
                    explanation = "طائر الدودو لم يمتلك أي خوف من البشر أو الحيوانات الدخيلة لأنه عاش معزولاً لآلاف السنين دون مفترسات.",
                    challengeId = "animals_c9",
                    challengeTitle = "عصر الديناصورات والعمالقة المنقرضة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🦤",
                    visualTheme = "الطيور المنقرضة",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: مقاومو الموت والظروف الفضائية القاسية (EXPERT)
        Challenge(
            id = "animals_c10",
            categoryId = "animals",
            title = "مقاومو الموت والظروف الفضائية القاسية",
            themeDescription = "دب الماء وتجدد الأطراف والتكيف مع السموم والحرارة الفائقة",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 928,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "حيوان مجهري خارق ثماني الأرجل يستطيع البقاء حياً في فراغ الفضاء والإشعاع النووي والغليان والتجمد",
                    correctAnswer = "تارديغراد",
                    availableLetters = LetterScrambler.buildScrambledLetters("تارديغراد", GameDifficulty.EXPERT, listOf("ب", "ر", "ا", "م", "ي", "س", "ي"), seed = 928L),
                    hint = "يسمى بطيء الخطو أو دب الماء (Water Bear)",
                    rewardPoints = 35,
                    explanation = "التارديغراد يدخل في حالة سبات زجاجي جاف تنخفض فيها عملياته الحيوية لتقارب الصفر لعشرات السنين.",
                    challengeId = "animals_c10",
                    challengeTitle = "مقاومو الموت والظروف الفضائية القاسية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🔬",
                    visualTheme = "مقاومة الفناء",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 929,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "قنفذ بحري صغير أو هيدرا مائية تمتلك القدرة على تجديد خلاياها باستمرار والعودة لمرحلة الطفولة الحيوية",
                    correctAnswer = "خالد",
                    availableLetters = LetterScrambler.buildScrambledLetters("خالد", GameDifficulty.EXPERT, listOf("ق", "ن", "د", "ي", "ل", "ب", "ح"), seed = 929L),
                    hint = "قنديل البحر الـ ... (Turritopsis dohrnii) بيولوجياً",
                    rewardPoints = 35,
                    explanation = "هذا القنديل يستطيع تحويل خلاياه الناضجة إلى خلايا جذعية غير متمايزة متفادياً الموت الطبيعي بالشيخوخة.",
                    challengeId = "animals_c10",
                    challengeTitle = "مقاومو الموت والظروف الفضائية القاسية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🪼",
                    visualTheme = "التجدد الخلوي",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 930,
                    categoryId = "animals",
                    category = "بيت عالم الحيوان",
                    question = "سمندل مكسيكي برمائي فريد يمتلك خياشيم ريشية خارجية ويستطيع إعادة إنماء أطرافه وعينيه وحتى أجزاء من دماغه",
                    correctAnswer = "أكسولوتل",
                    availableLetters = LetterScrambler.buildScrambledLetters("أكسولوتل", GameDifficulty.EXPERT, listOf("س", "ل", "م", "ن", "د", "ر", "ف"), seed = 930L),
                    hint = "وحش الماء المكسيكي الذي يحتفظ بصفات اليرقة طوال حياته",
                    rewardPoints = 35,
                    explanation = "الأكسولوتل نموذج فريد في أبحاث الطب التجديدي لقدرته الفائقة على شفاء الجروح العميقة دون ترك ندبات نسيجية.",
                    challengeId = "animals_c10",
                    challengeTitle = "مقاومو الموت والظروف الفضائية القاسية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🦎",
                    visualTheme = "التجدد العضوي",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
