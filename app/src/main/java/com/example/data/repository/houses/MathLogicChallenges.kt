package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object MathLogicChallenges {

    val challenges = listOf(
        // Challenge 1: الأشكال الهندسية والنسب (EXPLORATION)
        Challenge(
            id = "math_logic_c1",
            categoryId = "math_logic",
            title = "الأشكال الهندسية والنسب",
            themeDescription = "الأشكال المستوية والزوايا والخصائص الهندسية البسيطة",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 701,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "شكل هندسي مستوٍ مغلق يتكون من ثلاثة أضلاع وثلاث زوايا مجموع قياسها 180 درجة",
                    correctAnswer = "مثلث",
                    availableLetters = LetterScrambler.buildScrambledLetters("مثلث", GameDifficulty.EXPLORATION, listOf("ش", "ك"), seed = 701L),
                    hint = "الأشكال الثلاثية مثل متساوي الأضلاع وقائم الزاوية",
                    rewardPoints = 15,
                    explanation = "المثلث أبسط الأشكال المضلعة، ومبرهنة فيثاغورس ترتبط مباشرة بالمثلث قائم الزاوية.",
                    challengeId = "math_logic_c1",
                    challengeTitle = "الأشكال الهندسية والنسب",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📐",
                    visualTheme = "الهندسة المستوية",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 702,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "شكل هندسي منحني مستدير تبعد جميع نقاط محيطه مسافة متساوية وثابتة عن مركزه",
                    correctAnswer = "دائرة",
                    availableLetters = LetterScrambler.buildScrambledLetters("دائرة", GameDifficulty.EXPLORATION, listOf("ق", "ط"), seed = 702L),
                    hint = "محيطها يحسب بضرب القطر في الثابت ط (باي)",
                    rewardPoints = 15,
                    explanation = "الدائرة تمثل رمز التناظر التام في الرياضيات ولها نصف قطر ومحيط ومساحة منتظمة.",
                    challengeId = "math_logic_c1",
                    challengeTitle = "الأشكال الهندسية والنسب",
                    questionIndexInChallenge = 2,
                    visualEmoji = "⭕",
                    visualTheme = "المنحنيات والتناظر",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 703,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "الرمز الرياضي العبقري الذي ابتكره الخوارزمي ومثل نقطة تحول في نظام العد والحساب",
                    correctAnswer = "صفر",
                    availableLetters = LetterScrambler.buildScrambledLetters("صفر", GameDifficulty.EXPLORATION, listOf("ع", "د", "د", "ح"), seed = 703L),
                    hint = "يمثل القيمة الفارغة ويغير القيمة المكانية للأرقام",
                    rewardPoints = 20,
                    explanation = "الصفر العربي مكن علماء العالم من تطوير الحساب الموضعي وتأسيس علم الجبر الحديث.",
                    challengeId = "math_logic_c1",
                    challengeTitle = "الأشكال الهندسية والنسب",
                    questionIndexInChallenge = 3,
                    visualEmoji = "0️⃣",
                    visualTheme = "نظام الأعداد",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: علم الجبر والمعادلات (THINKING)
        Challenge(
            id = "math_logic_c2",
            categoryId = "math_logic",
            title = "علم الجبر والمعادلات",
            themeDescription = "قواعد حل المسائل والمتغيرات والعمليات الحسابية المتوازنة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 704,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "علم رياضي أسسه محمد بن موسى الخوارزمي يعتمد على إيجاد المجاهيل عبر المعادلات",
                    correctAnswer = "جبر",
                    availableLetters = LetterScrambler.buildScrambledLetters("جبر", GameDifficulty.THINKING, listOf("ح", "س", "ا", "ب"), seed = 704L),
                    hint = "كتاب الجبر والمقابلة الشهير",
                    rewardPoints = 20,
                    explanation = "الجبر يتعامل مع المتغيرات (س و ص) لصياغة القوانين الرياضية وحل المعضلات الحسابية.",
                    challengeId = "math_logic_c2",
                    challengeTitle = "علم الجبر والمعادلات",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🧮",
                    visualTheme = "الجبر والمقابلة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 705,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "تعبير رياضي يتكون من طرفين متساويين تفصل بينهما إشارة يساوي ويحتوي على مجهول",
                    correctAnswer = "معادلة",
                    availableLetters = LetterScrambler.buildScrambledLetters("معادلة", GameDifficulty.THINKING, listOf("ح", "ل", "ط", "ر"), seed = 705L),
                    hint = "المعادلة الرياضية الخطية أو التربيعية",
                    rewardPoints = 20,
                    explanation = "المعادلة توازن بين كميتين متطابقتين، وحلها يعني إيجاد القيمة الحقيقية للمتغير المجهول.",
                    challengeId = "math_logic_c2",
                    challengeTitle = "علم الجبر والمعادلات",
                    questionIndexInChallenge = 2,
                    visualEmoji = "⚖️",
                    visualTheme = "التوازن الرياضي",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 706,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "سلسلة من الأرقام تتبع نمطاً حسابياً أو هندسياً ثابتاً للانتقال من حد إلى الحد التالي",
                    correctAnswer = "متتالية",
                    availableLetters = LetterScrambler.buildScrambledLetters("متتالية", GameDifficulty.THINKING, listOf("ن", "م", "ط", "ق"), seed = 706L),
                    hint = "متتالية فيبوناتشي الشهيرة في الطبيعة",
                    rewardPoints = 20,
                    explanation = "المتتاليات الرياضية تصف الأنماط المتكررة في علوم الحاسوب ونمو النباتات في الطبيعة.",
                    challengeId = "math_logic_c2",
                    challengeTitle = "علم الجبر والمعادلات",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🔢",
                    visualTheme = "الأنماط والمتتاليات",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: الأعداد الأولية والبراهين (CHALLENGE)
        Challenge(
            id = "math_logic_c3",
            categoryId = "math_logic",
            title = "الأعداد الأولية والبراهين",
            themeDescription = "الأعداد التي لا تقبل القسمة إلا على نفسها والبراهين المنطقية الصارمة",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 707,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "عدد صحيح أكبر من واحد لا يقبل القسمة بدون باقٍ إلا على نفسه وعلى الواحد فقط",
                    correctAnswer = "أولي",
                    availableLetters = LetterScrambler.buildScrambledLetters("أولي", GameDifficulty.CHALLENGE, listOf("ع", "د", "د", "ق", "س", "م"), seed = 707L),
                    hint = "العدد الأولي مثل 2 و 3 و 5 و 7",
                    rewardPoints = 25,
                    explanation = "الأعداد الأولية تمثل ذرات علم الحساب وتعتمد عليها خوارزميات التشفير الرقمي الحديثة.",
                    challengeId = "math_logic_c3",
                    challengeTitle = "الأعداد الأولية والبراهين",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🔐",
                    visualTheme = "نظرية الأعداد",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 708,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "أطول أضلاع المثلث القائم الزاوية ويقابل الزاوية القائمة وتتعلق به مبرهنة فيثاغورس",
                    correctAnswer = "وتر",
                    availableLetters = LetterScrambler.buildScrambledLetters("وتر", GameDifficulty.CHALLENGE, listOf("ض", "ل", "ع", "ق", "ا", "ئ"), seed = 708L),
                    hint = "مربع طول الوتر يساوي مجموع مربعي الضلعين الآخرين",
                    rewardPoints = 25,
                    explanation = "الوتر هو حجر الزاوية في حساب المثلثات والملاحة الجوية وتحديد المواقع الفضائية.",
                    challengeId = "math_logic_c3",
                    challengeTitle = "الأعداد الأولية والبراهين",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📐",
                    visualTheme = "حساب المثلثات",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 709,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "خطوات رياضية ومنطقية متسلسلة لحل مسألة محددة خطوة بخطوة وتنسب للخوارزمي",
                    correctAnswer = "خوارزمية",
                    availableLetters = LetterScrambler.buildScrambledLetters("خوارزمية", GameDifficulty.CHALLENGE, listOf("ح", "ا", "س", "و", "ب", "ب"), seed = 709L),
                    hint = "أساس عمل البرمجة والذكاء الاصطناعي",
                    rewardPoints = 25,
                    explanation = "الخوارزميات هي المنهج المنطقي الصارم الذي تقوم عليه كافة معالجات الحواسيب وأنظمة البيانات اليوم.",
                    challengeId = "math_logic_c3",
                    challengeTitle = "الأعداد الأولية والبراهين",
                    questionIndexInChallenge = 3,
                    visualEmoji = "💻",
                    visualTheme = "المنطق البرمجي",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: الهندسة الإقليدية وخواص الزوايا (THINKING)
        Challenge(
            id = "math_logic_c4",
            categoryId = "math_logic",
            title = "الهندسة الإقليدية وخواص الزوايا",
            themeDescription = "نظريات المثلثات وتطابق الأشكال وقياسات الزوايا",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 710,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "زاوية هندسية قياسها يساوي تماماً 90 درجة وتتعامد فيها القطعتان المستقيمتان",
                    correctAnswer = "قائمة",
                    availableLetters = LetterScrambler.buildScrambledLetters("قائمة", GameDifficulty.THINKING, listOf("ح", "ا", "د", "ة"), seed = 710L),
                    hint = "تمثل ربع دورة كاملة وتظهر في زوايا المربع والمستطيل",
                    rewardPoints = 20,
                    explanation = "الزاوية القائمة هي أساس نظرية فيثاغورس وحساب المثلثات وتطبيقات البناء والإنشاءات.",
                    challengeId = "math_logic_c4",
                    challengeTitle = "الهندسة الإقليدية وخواص الزوايا",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📐",
                    visualTheme = "الهندسة المستوية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 711,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "مجموع قياسات الزوايا الداخلية لأي مثلث في الهندسة الإقليدية المستوية بالدرجات",
                    correctAnswer = "مائةوثمانون",
                    availableLetters = LetterScrambler.buildScrambledLetters("مائةوثمانون", GameDifficulty.THINKING, listOf("ث", "ل", "ا", "ث"), seed = 711L),
                    hint = "تعادل نصف دورة كاملة أو زاوية مستقيمة واحدة",
                    rewardPoints = 20,
                    explanation = "مجموع زوايا المثلث يساوي 180 درجة دائماً في السطح المستوي بينما يختلف في الهندسات الكروية واللاإقليدية.",
                    challengeId = "math_logic_c4",
                    challengeTitle = "الهندسة الإقليدية وخواص الزوايا",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🔺",
                    visualTheme = "نظريات المثلثات",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 712,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "ضلع في المثلث قائم الزاوية يشكل مع الضلعين الآخرين أضلاع الزاوية القائمة ويسمى ضلع القائمة",
                    correctAnswer = "ساق",
                    availableLetters = LetterScrambler.buildScrambledLetters("ساق", GameDifficulty.THINKING, listOf("ض", "ل", "ع", "ق"), seed = 712L),
                    hint = "يسمى ساق المثلث القائم أو ضلع القائمة المجاور",
                    rewardPoints = 20,
                    explanation = "ساقا المثلث القائم هما الضلعان المتعامدان اللذان يلتقيان عند رأس الزاوية القائمة 90 درجة.",
                    challengeId = "math_logic_c4",
                    challengeTitle = "الهندسة الإقليدية وخواص الزوايا",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📏",
                    visualTheme = "أضلاع المثلث",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: الأعداد النسبية ونظرية القسمة (THINKING)
        Challenge(
            id = "math_logic_c5",
            categoryId = "math_logic",
            title = "الأعداد النسبية ونظرية القسمة",
            themeDescription = "الأعداد الكسرية والعوامل المشتركة والمضاعفات الحسابية",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 713,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "العدد الذي يقع فوق خط الكسر الاعتيادي ويمثل عدد الأجزاء المأخوذة من الكل",
                    correctAnswer = "بسط",
                    availableLetters = LetterScrambler.buildScrambledLetters("بسط", GameDifficulty.THINKING, listOf("م", "ق", "ا", "م"), seed = 713L),
                    hint = "يقابله في الأسفل المقام الذي يمثل إجمالي الأجزاء",
                    rewardPoints = 20,
                    explanation = "الكسر يتكون من بسط ومقام، وإذا كان البسط أصغر من المقام كان الكسر حقيقياً وأقل من واحد.",
                    challengeId = "math_logic_c5",
                    challengeTitle = "الأعداد النسبية ونظرية القسمة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "➗",
                    visualTheme = "حساب الكسور",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 714,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "أكبر عدد صحيح يقسم عددين صحيحين أو أكثر معاً دون باقٍ في الحساب",
                    correctAnswer = "قاسم",
                    availableLetters = LetterScrambler.buildScrambledLetters("قاسم", GameDifficulty.THINKING, listOf("م", "ض", "ا", "ع"), seed = 714L),
                    hint = "يسمى القاسم المشترك الأكبر (ق.م.أ)",
                    rewardPoints = 20,
                    explanation = "إيجاد القاسم المشترك الأكبر يعتبر خطوة أساسية لتبسيط الكسور ويحسب عبر خوارزمية إقليدس الشهيرة.",
                    challengeId = "math_logic_c5",
                    challengeTitle = "الأعداد النسبية ونظرية القسمة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🔢",
                    visualTheme = "نظرية الأعداد",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 715,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "أصغر عدد صحيح موجب يكون مضاعفاً لعددين أو أكثر في آن واحد",
                    correctAnswer = "مضاعف",
                    availableLetters = LetterScrambler.buildScrambledLetters("مضاعف", GameDifficulty.THINKING, listOf("ج", "ذ", "ر", "ك"), seed = 715L),
                    hint = "يسمى المضاعف المشترك الأصغر (م.م.أ) لتوحيد المقامات",
                    rewardPoints = 20,
                    explanation = "المضاعف المشترك الأصغر يستخدم لجمع وطرح الكسور ذات المقامات المختلفة بكفاءة.",
                    challengeId = "math_logic_c5",
                    challengeTitle = "الأعداد النسبية ونظرية القسمة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "✖️",
                    visualTheme = "المضاعفات الحسابية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: المنطق الرياضي والعبارات الشرطية (THINKING)
        Challenge(
            id = "math_logic_c6",
            categoryId = "math_logic",
            title = "المنطق الرياضي والعبارات الشرطية",
            themeDescription = "بوابات الصواب والخطأ والروابط المنطقية والاستدلال الاستنتاجي",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 716,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "جملة خبرية مفيدة في علم المنطق تحتمل أن تكون إما صائبة أو خاطئة ولا تحتمل الأمرين معاً",
                    correctAnswer = "قضية",
                    availableLetters = LetterScrambler.buildScrambledLetters("قضية", GameDifficulty.THINKING, listOf("ع", "ب", "ا", "ر", "ة"), seed = 716L),
                    hint = "تسمى القضية المنطقية أو التقرير المنطقي (Proposition)",
                    rewardPoints = 20,
                    explanation = "القضايا المنطقية هي اللبنة الأولى لبناء البراهين الرياضية وتصميم الدوائر المنطقية في الحاسوب.",
                    challengeId = "math_logic_c6",
                    challengeTitle = "المنطق الرياضي والعبارات الشرطية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⚖️",
                    visualTheme = "المنطق الصوري",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 717,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "رابطة منطقية لا تكون العبارة المركبة بها صائبة إلا إذا كانت جميع العبارات المكونة لها صائبة معاً",
                    correctAnswer = "وصل",
                    availableLetters = LetterScrambler.buildScrambledLetters("وصل", GameDifficulty.THINKING, listOf("ف", "ص", "ل", "ن", "ف"), seed = 717L),
                    hint = "رابطة (و) أو بوابة AND المنطقية",
                    rewardPoints = 20,
                    explanation = "بوابة الوصل المنطقية تتطلب تحقق جميع الشروط في وقت واحد لتعطي نتيجة صحيحة (True).",
                    challengeId = "math_logic_c6",
                    challengeTitle = "المنطق الرياضي والعبارات الشرطية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🔗",
                    visualTheme = "الروابط المنطقية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 718,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "عملية منطقية تحول العبارة الصائبة إلى خاطئة والعبارة الخاطئة إلى صائبة برمز النفي",
                    correctAnswer = "نفي",
                    availableLetters = LetterScrambler.buildScrambledLetters("نفي", GameDifficulty.THINKING, listOf("ش", "ر", "ط", "ع", "ك"), seed = 718L),
                    hint = "بوابة NOT المنطقية العاكسة للقيمة",
                    rewardPoints = 20,
                    explanation = "النفي المنطقي يعكس حالة الإثبات، ونفي النفي يعتبر إثباتاً في المنطق الكلاسيكي الأرسطي.",
                    challengeId = "math_logic_c6",
                    challengeTitle = "المنطق الرياضي والعبارات الشرطية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🚫",
                    visualTheme = "بوابات المنطق",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: علم الاحتمالات والتوزيعات الإحصائية (CHALLENGE)
        Challenge(
            id = "math_logic_c7",
            categoryId = "math_logic",
            title = "علم الاحتمالات والتوزيعات الإحصائية",
            themeDescription = "فضاء العينة والمتوسطات والانحراف المعياري والتوزيع الطبيعي",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 719,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "مجموع قيم مجموعة من البيانات مقسوماً على عددها الإجمالي في علم الإحصاء",
                    correctAnswer = "متوسط",
                    availableLetters = LetterScrambler.buildScrambledLetters("متوسط", GameDifficulty.CHALLENGE, listOf("و", "س", "ي", "ط", "م", "ن"), seed = 719L),
                    hint = "يسمى الوسط الحسابي أو المعدل (Mean)",
                    rewardPoints = 25,
                    explanation = "المتوسط الحسابي هو المقياس الأكثر استخداماً للنزعة المركزية ولكنه يتأثر بالقيم المتطرفة الشاذة.",
                    challengeId = "math_logic_c7",
                    challengeTitle = "علم الاحتمالات والتوزيعات الإحصائية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📊",
                    visualTheme = "مقاييس الإحصاء",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 720,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "القيمة التي تتوسط مجموعة البيانات العددية بعد ترتيبها تصاعدياً أو تنازلياً",
                    correctAnswer = "وسيط",
                    availableLetters = LetterScrambler.buildScrambledLetters("وسيط", GameDifficulty.CHALLENGE, listOf("م", "ن", "و", "ا", "ل", "م"), seed = 720L),
                    hint = "يقسم العينة الإحصائية إلى نصفين متساويين بنسبة 50%",
                    rewardPoints = 25,
                    explanation = "الوسيط يتميز بمقاومته للقيم المتطرفة الشاذة ولذلك يفضل استخدامه في دراسات توزيع الدخل والثروات.",
                    challengeId = "math_logic_c7",
                    challengeTitle = "علم الاحتمالات والتوزيعات الإحصائية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📈",
                    visualTheme = "توزيع البيانات",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 721,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "مقياس إحصائي يقيس مدى تشتت وتباعد قيم البيانات عن وسطها الحسابي",
                    correctAnswer = "انحراف",
                    availableLetters = LetterScrambler.buildScrambledLetters("انحراف", GameDifficulty.CHALLENGE, listOf("ت", "ب", "ا", "ي", "ن", "م"), seed = 721L),
                    hint = "يسمى الانحراف المعياري وهو الجذر التربيعي للتباين",
                    rewardPoints = 25,
                    explanation = "الانحراف المعياري الصغير يعني تقارب البيانات الشديد حول المتوسط، بينما الكبير يدل على تشتت واسع.",
                    challengeId = "math_logic_c7",
                    challengeTitle = "علم الاحتمالات والتوزيعات الإحصائية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📉",
                    visualTheme = "مقاييس التشتت",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: حساب التفاضل والتكامل وسرعة التغير (CHALLENGE)
        Challenge(
            id = "math_logic_c8",
            categoryId = "math_logic",
            title = "حساب التفاضل والتكامل وسرعة التغير",
            themeDescription = "المشتقات والنهايات والمساحات تحت المنحنيات في الحسبان",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 722,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "فرع في الرياضيات يدرس معدل التغير اللحظي للدوال وميل المماس لمنحنى عند نقطة معينة",
                    correctAnswer = "تفاضل",
                    availableLetters = LetterScrambler.buildScrambledLetters("تفاضل", GameDifficulty.CHALLENGE, listOf("ت", "ك", "ا", "م", "ل", "ج"), seed = 722L),
                    hint = "المشتقة الأولى للدالة بالنسبة للمتغير",
                    rewardPoints = 25,
                    explanation = "حساب التفاضل طوره نيوتن ولايبنتز لحساب السرعة اللحظية والتسارع وتحديد القيم العظمى والصغرى.",
                    challengeId = "math_logic_c8",
                    challengeTitle = "حساب التفاضل والتكامل وسرعة التغير",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📐",
                    visualTheme = "معدلات التغير",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 723,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "عملية رياضية عكسية للتفاضل تحسب المساحة المحصورة تحت منحنى الدالة أو الحجم التراكمي",
                    correctAnswer = "تكامل",
                    availableLetters = LetterScrambler.buildScrambledLetters("تكامل", GameDifficulty.CHALLENGE, listOf("ت", "ف", "ا", "ض", "ل", "ح"), seed = 723L),
                    hint = "يرمز له برمز الحرف S الممدود الشهير",
                    rewardPoints = 25,
                    explanation = "النظرية الأساسية للحسبان أثبتت أن التكامل والتفاضل عمليتان عكسيتان تمثلان جوهر الفيزياء الحديثة.",
                    challengeId = "math_logic_c8",
                    challengeTitle = "حساب التفاضل والتكامل وسرعة التغير",
                    questionIndexInChallenge = 2,
                    visualEmoji = "∫",
                    visualTheme = "المساحات التراكمية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 724,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "القيمة التي تقترب منها الدالة عندما يقترب المتغير من قيمة محددة دون الوصول إليها بالضرورة",
                    correctAnswer = "نهاية",
                    availableLetters = LetterScrambler.buildScrambledLetters("نهاية", GameDifficulty.CHALLENGE, listOf("غ", "ا", "ي", "ة", "ح", "د"), seed = 724L),
                    hint = "مفهوم الليمت (Limit) أساس تعريف المشتقة والتكامل",
                    rewardPoints = 25,
                    explanation = "مفهوم النهايات سمح للرياضيين بالتعامل الصارم مع الكميات المتناهية في الصغر وتفادي مغالطة القسمة على صفر.",
                    challengeId = "math_logic_c8",
                    challengeTitle = "حساب التفاضل والتكامل وسرعة التغير",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🎯",
                    visualTheme = "النهايات الرياضية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: الرياضيات المتقطعة ونظرية المخططات (EXPERT)
        Challenge(
            id = "math_logic_c9",
            categoryId = "math_logic",
            title = "الرياضيات المتقطعة ونظرية المخططات",
            themeDescription = "التباديل والتوافيق ومخططات أويلر والمسارات الشبكية",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 725,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "عدد الطرق الممكنة لترتيب مجموعة من العناصر حيث يكون ترتيب العناصر مهماً جداً",
                    correctAnswer = "تباديل",
                    availableLetters = LetterScrambler.buildScrambledLetters("تباديل", GameDifficulty.EXPERT, listOf("ت", "و", "ا", "ف", "ي", "ق", "ن"), seed = 725L),
                    hint = "رمزها الرياضي P وتستخدم مضروب العدد n!",
                    rewardPoints = 30,
                    explanation = "التباديل تهتم بالترتيب (مثل تشكيل أرقام السر)، بينما التوافيق تهتم باختيار المجموعات دون اعتبار للترتيب.",
                    challengeId = "math_logic_c9",
                    challengeTitle = "الرياضيات المتقطعة ونظرية المخططات",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🔀",
                    visualTheme = "التحليل التوافقي",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 726,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "بنية رياضية تتكون من مجموعة رؤوس (عقد) متصلة بحواف (أقواس) لنمذجة الشبكات",
                    correctAnswer = "مخطط",
                    availableLetters = LetterScrambler.buildScrambledLetters("مخطط", GameDifficulty.EXPERT, listOf("ش", "ب", "ك", "ة", "ر", "س", "م"), seed = 726L),
                    hint = "يسمى الجراف (Graph) وأساس خوارزميات الملاحة",
                    rewardPoints = 30,
                    explanation = "نظرية المخططات بدأت بمسألة جسور كونيغسبرغ السبعة لأويلر وتشكل عصب محركات البحث وشبكات التواصل.",
                    challengeId = "math_logic_c9",
                    challengeTitle = "الرياضيات المتقطعة ونظرية المخططات",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🕸️",
                    visualTheme = "نظرية المخططات",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 727,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "مسألة رياضية شهيرة أثبتت بالحاسوب عام 1976م تنص على كفاية أربعة ألوان لتلوين أي خريطة مستوية",
                    correctAnswer = "ألوان",
                    availableLetters = LetterScrambler.buildScrambledLetters("ألوان", GameDifficulty.EXPERT, listOf("خ", "ر", "ا", "ئ", "ط", "د", "و"), seed = 727L),
                    hint = "مبرهنة الألوان الأربعة الشهيرة (Four Color Theorem)",
                    rewardPoints = 30,
                    explanation = "مبرهنة الألوان الأربعة كانت أول برهان رياضي كبير يعتمد على الحساب الآلي لفحص آلاف الحالات الخاصة.",
                    challengeId = "math_logic_c9",
                    challengeTitle = "الرياضيات المتقطعة ونظرية المخططات",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🎨",
                    visualTheme = "مبرهنات الخرائط",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: مسائل الألفية وألغاز الأعداد الأولية (EXPERT)
        Challenge(
            id = "math_logic_c10",
            categoryId = "math_logic",
            title = "مسائل الألفية وألغاز الأعداد الأولية",
            themeDescription = "فرضية ريمان ومسألة P مقابل NP ومبرهنة فيرما الأخيرة",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 728,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "فرضية رياضية عظمى ترتبط بدالة زيتا وتوزيع الأصفار غير البديهية على الخط الحرج 1/2 للأعداد الأولية",
                    correctAnswer = "ريمان",
                    availableLetters = LetterScrambler.buildScrambledLetters("ريمان", GameDifficulty.EXPERT, listOf("ب", "و", "ا", "ن", "ك", "ا", "ر"), seed = 728L),
                    hint = "أشهر مسألة رياضية غير محلولة منذ عام 1859م",
                    rewardPoints = 35,
                    explanation = "فرضية ريمان تعتبر الكأس المقدسة في الرياضيات البحتة، وإثباتها يكشف السر الدقيق لتوزيع الأعداد الأولية.",
                    challengeId = "math_logic_c10",
                    challengeTitle = "مسائل الألفية وألغاز الأعداد الأولية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🧩",
                    visualTheme = "مسائل الألفية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 729,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "مبرهنة تاريخية ادعى فيرما أنه يملك برهاناً ضيق الهامش لها وظلت لغزاً لأكثر من 350 سنة حتى حلها أندرو وايلز",
                    correctAnswer = "أخيرة",
                    availableLetters = LetterScrambler.buildScrambledLetters("أخيرة", GameDifficulty.EXPERT, listOf("ك", "ب", "ر", "ى", "ص", "غ", "ر"), seed = 729L),
                    hint = "مبرهنة فيرما الـ ... التي تنص على عدم وجود حلول صحيحة لـ x^n + y^n = z^n لـ n > 2",
                    rewardPoints = 35,
                    explanation = "أندرو وايلز أثبت مبرهنة فيرما الأخيرة عام 1994م باستخدام منحنيات إهليلجية ونظرية النماذج النمطية.",
                    challengeId = "math_logic_c10",
                    challengeTitle = "مسائل الألفية وألغاز الأعداد الأولية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📜",
                    visualTheme = "مبرهنات تاريخية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 730,
                    categoryId = "math_logic",
                    category = "بيت الرياضيات والمنطق",
                    question = "مبرهنة المنطق الرياضي لكورت غودل التي أثبتت استحالة وجود نظام بديهيات رياضي كامل ومتسق في آن واحد",
                    correctAnswer = "اكتمال",
                    availableLetters = LetterScrambler.buildScrambledLetters("اكتمال", GameDifficulty.EXPERT, listOf("ن", "ق", "ص", "ع", "د", "ا", "ل"), seed = 730L),
                    hint = "مبرهنة عدم الـ ... التي حطمت حلم هيلبرت في حسم الرياضيات نهائياً",
                    rewardPoints = 35,
                    explanation = "مبرهنتا عدم الاكتمال لغودل أثبتتا وجود قضايا رياضية صحيحة لا يمكن إثبات صحتها أو خطئها ضمن النظام نفسه.",
                    challengeId = "math_logic_c10",
                    challengeTitle = "مسائل الألفية وألغاز الأعداد الأولية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🧠",
                    visualTheme = "فلسفة المنطق",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
