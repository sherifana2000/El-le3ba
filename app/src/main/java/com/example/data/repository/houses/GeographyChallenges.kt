package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object GeographyChallenges {

    val challenges = listOf(
        // Challenge 1: اليابسة والمحيطات (EXPLORATION)
        Challenge(
            id = "geography_c1",
            categoryId = "geography",
            title = "اليابسة والمحيطات",
            themeDescription = "أكبر الكتل القارية والمسطحات المائية التي تغطي كوكب الأرض",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 401,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أكبر محيطات كوكب الأرض مساحة وعمقاً ويمتد بين الأمريكتين وآسيا وأستراليا",
                    correctAnswer = "هادئ",
                    availableLetters = LetterScrambler.buildScrambledLetters("هادئ", GameDifficulty.EXPLORATION, listOf("ب", "ح"), seed = 401L),
                    hint = "المحيط الهادئ الشاسع",
                    rewardPoints = 15,
                    explanation = "المحيط الهادئ يغطي أكثر من ثلث مساحة الكرة الأرضية ويضم أعمق نقطة بحرية (خندق ماريانا).",
                    challengeId = "geography_c1",
                    challengeTitle = "اليابسة والمحيطات",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌊",
                    visualTheme = "المحيطات العالمية",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 402,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أكبر قارات العالم من حيث المساحة وعدد السكان وتحتضن أعلى قمة جبلية",
                    correctAnswer = "آسيا",
                    availableLetters = LetterScrambler.buildScrambledLetters("آسيا", GameDifficulty.EXPLORATION, listOf("ق", "ا"), seed = 402L),
                    hint = "قارة شاسعة تضم الصين والهند واليابان والعالم العربي",
                    rewardPoints = 15,
                    explanation = "قارة آسيا تمتد من البحر المتوسط غرباً حتى المحيط الهادئ شرقاً وتضم نحو 60% من سكان العالم.",
                    challengeId = "geography_c1",
                    challengeTitle = "اليابسة والمحيطات",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌏",
                    visualTheme = "القارات الكبرى",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 403,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أطول نهر في العالم ينبع من بحيرة فيكتوريا ويجري شمالاً ليصب في البحر المتوسط",
                    correctAnswer = "نيل",
                    availableLetters = LetterScrambler.buildScrambledLetters("نيل", GameDifficulty.EXPLORATION, listOf("م", "ص", "ر", "س"), seed = 403L),
                    hint = "شريان مصر والسودان وإفريقيا العظيم",
                    rewardPoints = 20,
                    explanation = "نهر النيل يمتد بطول يقارب 6650 كم، ويغذي حوضه إحدى عشرة دولة إفريقية.",
                    challengeId = "geography_c1",
                    challengeTitle = "اليابسة والمحيطات",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🏞️",
                    visualTheme = "الأنهار العالمية",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: القمم والمضائق الاستراتيجية (THINKING)
        Challenge(
            id = "geography_c2",
            categoryId = "geography",
            title = "القمم والمضائق الاستراتيجية",
            themeDescription = "أعلى السلاسل الجبلية والممرات المائية الحاكمة لحركة التجارة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 404,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "سلسلة جبلية عملاقة في آسيا تحتضن قمة إيفرست وهي سقف العالم الثلجي",
                    correctAnswer = "هملايا",
                    availableLetters = LetterScrambler.buildScrambledLetters("هملايا", GameDifficulty.THINKING, listOf("ج", "ب", "ل", "ث"), seed = 404L),
                    hint = "جبال الهملايا الشاهقة",
                    rewardPoints = 20,
                    explanation = "جبال الهملايا تشكلت من اصطدام الصفيحة الهندية بالصفيحة الأوراسية وتضم أعلى 14 قمة في العالم.",
                    challengeId = "geography_c2",
                    challengeTitle = "القمم والمضائق الاستراتيجية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏔️",
                    visualTheme = "السلاسل الجبلية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 405,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "مضيق بحري استراتيجي يصل بين المحيط الأطلسي والبحر المتوسط ويفصل إسبانيا عن المغرب",
                    correctAnswer = "طارق",
                    availableLetters = LetterScrambler.buildScrambledLetters("طارق", GameDifficulty.THINKING, listOf("ج", "ب", "ل", "م"), seed = 405L),
                    hint = "مضيق جبل طارق المائي",
                    rewardPoints = 20,
                    explanation = "مضيق جبل طارق سمي نسبة للقائد المسلم طارق بن زياد، وهو أحد أهم الممرات الملاحية في العالم.",
                    challengeId = "geography_c2",
                    challengeTitle = "القمم والمضائق الاستراتيجية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "⚓",
                    visualTheme = "الممرات البحرية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 406,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أكبر صحراء رملية حارة في العالم تمتد عبر شمال القارة الإفريقية برمالها الشاسعة",
                    correctAnswer = "كبرى",
                    availableLetters = LetterScrambler.buildScrambledLetters("كبرى", GameDifficulty.THINKING, listOf("ص", "ح", "ر", "ا"), seed = 406L),
                    hint = "الصحراء الكبرى الإفريقية",
                    rewardPoints = 20,
                    explanation = "الصحراء الكبرى تغطي مساحة تفوق 9 ملايين كيلومتر مربع، وتتميز بكثبانها الرملية وواحاتها النضرة.",
                    challengeId = "geography_c2",
                    challengeTitle = "القمم والمضائق الاستراتيجية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🏜️",
                    visualTheme = "المناخات الصحراوية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: عواصم وظواهر طبيعية (CHALLENGE)
        Challenge(
            id = "geography_c3",
            categoryId = "geography",
            title = "عواصم وظواهر طبيعية",
            themeDescription = "العواصم التاريخية والظواهر المناخية الفريدة في أرجاء العالم",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 407,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "عاصمة دولة المغرب العريقة وتلقب بمدينة الأنوار وتطل على المحيط الأطلسي",
                    correctAnswer = "رباط",
                    availableLetters = LetterScrambler.buildScrambledLetters("رباط", GameDifficulty.CHALLENGE, listOf("م", "د", "ي", "ن", "ة", "ق"), seed = 407L),
                    hint = "مدينة الرباط التاريخية بصومعة حسان",
                    rewardPoints = 25,
                    explanation = "الرباط عاصمة المملكة المغربية وإحدى المدن الإمبراطورية المسجلة على لائحة التراث العالمي لليونسكو.",
                    challengeId = "geography_c3",
                    challengeTitle = "عواصم وظواهر طبيعية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏰",
                    visualTheme = "العواصم العالمية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 408,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أكبر جزيرة في العالم من حيث المساحة وتقع في شمال المحيط الأطلسي ويكسوها الجليد",
                    correctAnswer = "جرينلاند",
                    availableLetters = LetterScrambler.buildScrambledLetters("جرينلاند", GameDifficulty.CHALLENGE, listOf("ق", "ط", "ب", "ج", "ل", "ي"), seed = 408L),
                    hint = "جزيرة قطبية تتبع الدنمارك ذاتياً",
                    rewardPoints = 25,
                    explanation = "جرينلاند أكبر جزيرة غير قارية في العالم، وتغطي الطبقة الجليدية نحو 80% من مساحتها الكلية.",
                    challengeId = "geography_c3",
                    challengeTitle = "عواصم وظواهر طبيعية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "❄️",
                    visualTheme = "الجزر القطبية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 409,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "قناة مائية صناعية في مصر تربط بين البحرين الأحمر والمتوسط واختصرت طرق التجارة العالمية",
                    correctAnswer = "سويس",
                    availableLetters = LetterScrambler.buildScrambledLetters("سويس", GameDifficulty.CHALLENGE, listOf("ق", "ن", "ا", "ة", "م", "ص"), seed = 409L),
                    hint = "قناة السويس الملاحية الدولية",
                    rewardPoints = 25,
                    explanation = "قناة السويس افتتحت عام 1869 وتعد أهم ممر ملاحي يربط بين آسيا وأوروبا دون الدوران حول إفريقيا.",
                    challengeId = "geography_c3",
                    challengeTitle = "عواصم وظواهر طبيعية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🚢",
                    visualTheme = "القنوات الملاحية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: المضايق والممرات البحرية الدولية (THINKING)
        Challenge(
            id = "geography_c4",
            categoryId = "geography",
            title = "المضايق والممرات البحرية الدولية",
            themeDescription = "شرايين التجارة البحرية والتحكم في الملاحة العالمية",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 410,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "مضيق مائي استراتيجي يفصل شبه الجزيرة العربية عن إيران ويتحكم في تدفق صادرات نفط الخليج",
                    correctAnswer = "هرمز",
                    availableLetters = LetterScrambler.buildScrambledLetters("هرمز", GameDifficulty.THINKING, listOf("م", "ن", "د", "ب"), seed = 410L),
                    hint = "يربط الخليج العربي بخليج عمان وبحر العرب",
                    rewardPoints = 20,
                    explanation = "مضيق هرمز يمر عبره نحو خمس استهلاك العالم اليومي من البترول مما يجعله أهم ممر طاقة في العالم.",
                    challengeId = "geography_c4",
                    challengeTitle = "المضايق والممرات البحرية الدولية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🚢",
                    visualTheme = "الممرات المائية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 411,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "مضيق بحري يصل البحر الأحمر بخليج عدن وبحر العرب ويقع بين اليمن وجيبوتي وإريتريا",
                    correctAnswer = "مندب",
                    availableLetters = LetterScrambler.buildScrambledLetters("مندب", GameDifficulty.THINKING, listOf("ب", "ا", "ب", "س"), seed = 411L),
                    hint = "يسمى باب ... والمدخل الجنوبي لقناة السويس",
                    rewardPoints = 20,
                    explanation = "مضيق باب المندب يعد البوابة الجنوبية للبحر الأحمر وحلقة الوصل الملاحية بين أوروبا وآسيا.",
                    challengeId = "geography_c4",
                    challengeTitle = "المضايق والممرات البحرية الدولية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌊",
                    visualTheme = "المضايق الاستراتيجية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 412,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "ممر بحري ضيق بين شبه جزيرة ماليزيا وجزيرة سومطرة يعد أكثر ممرات العالم ازدحاماً بالسفن",
                    correctAnswer = "ملقا",
                    availableLetters = LetterScrambler.buildScrambledLetters("ملقا", GameDifficulty.THINKING, listOf("ب", "و", "س", "ف"), seed = 412L),
                    hint = "يربط المحيط الهندي ببحر الصين الجنوبي والمحيط الهادئ",
                    rewardPoints = 20,
                    explanation = "مضيق ملقا تمر عبره ربع التجارة العالمية وحركة سفن الحاويات بين شرق آسيا والشرق الأوسط وأوروبا.",
                    challengeId = "geography_c4",
                    challengeTitle = "المضايق والممرات البحرية الدولية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "⚓",
                    visualTheme = "شرايين الشحن",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: الأنهار العظمى وأحواض الصرف (THINKING)
        Challenge(
            id = "geography_c5",
            categoryId = "geography",
            title = "الأنهار العظمى وأحواض الصرف",
            themeDescription = "الأنهار الأغزر تدفقاً وشبكات الروافد المائية حول العالم",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 413,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أغزر أنهار العالم تدفقاً وأكبرها حوضاً ويخترق أكبر غابة مطرية استوائية في أمريكا الجنوبية",
                    correctAnswer = "أمازون",
                    availableLetters = LetterScrambler.buildScrambledLetters("أمازون", GameDifficulty.THINKING, listOf("ك", "و", "ن", "غ"), seed = 413L),
                    hint = "يصب في المحيط الأطلسي ويضخ خمس المياه العذبة عالمياً",
                    rewardPoints = 20,
                    explanation = "نهر الأمازون يمتلك حوض صرف يغطي 7 ملايين كيلومتر مربع ويضم أكبر تنوع بيولوجي مائي على كوكب الأرض.",
                    challengeId = "geography_c5",
                    challengeTitle = "الأنهار العظمى وأحواض الصرف",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌿",
                    visualTheme = "الأنهار الاستوائية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 414,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أطول أنهار قارة آسيا وثالث أطول نهر في العالم وينبع من هضبة التبت ويخترق الصين",
                    correctAnswer = "يانغتسي",
                    availableLetters = LetterScrambler.buildScrambledLetters("يانغتسي", GameDifficulty.THINKING, listOf("أ", "ص", "ف", "ر"), seed = 414L),
                    hint = "يقع عليه سد الخوانق الثلاثة أضخم محطة كهرومائية",
                    rewardPoints = 20,
                    explanation = "نهر يانغتسي يمتد لأكثر من 6300 كيلومتر ويعيش في حوضه نحو ثلث سكان جمهورية الصين الشعبية.",
                    challengeId = "geography_c5",
                    challengeTitle = "الأنهار العظمى وأحواض الصرف",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏞️",
                    visualTheme = "أنهار آسيا",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 415,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أطول أنهار قارة أوروبا ويمر بالكامل داخل الأراضي الروسية ليصب في بحر قزوين المغلق",
                    correctAnswer = "فولغا",
                    availableLetters = LetterScrambler.buildScrambledLetters("فولغا", GameDifficulty.THINKING, listOf("د", "ا", "ن", "و"), seed = 415L),
                    hint = "الملقب بنهر الأم في الأدب والتراث الروسي",
                    rewardPoints = 20,
                    explanation = "نهر الفولغا يبلغ طوله نحو 3530 كيلومتراً ويمثل الشريان المائي والكهربائي الأهم في غرب روسيا.",
                    challengeId = "geography_c5",
                    challengeTitle = "الأنهار العظمى وأحواض الصرف",
                    questionIndexInChallenge = 3,
                    visualEmoji = "⛵",
                    visualTheme = "أنهار أوروبا",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: الصحاري والهضاب المرتفعة (THINKING)
        Challenge(
            id = "geography_c6",
            categoryId = "geography",
            title = "الصحاري والهضاب المرتفعة",
            themeDescription = "المناطق الجغرافية القاسية من هضاب جليدية وصحارٍ قاحلة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 416,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أعلى هضبة في العالم تسمى سقف العالم ومتوسط ارتفاعها يتجاوز 4500 متر فوق سطح البحر",
                    correctAnswer = "تبت",
                    availableLetters = LetterScrambler.buildScrambledLetters("تبت", GameDifficulty.THINKING, listOf("د", "ك", "ن", "أ"), seed = 416L),
                    hint = "تقع شمال جبال الهيمالايا وتنبع منها كبرى أنهار آسيا",
                    rewardPoints = 20,
                    explanation = "هضبة التبت تحتوي على أكبر تجمع للجليد خارج القطبين ولذلك يطلق عليها القطب الثالث للأرض.",
                    challengeId = "geography_c6",
                    challengeTitle = "الصحاري والهضاب المرتفعة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏔️",
                    visualTheme = "سقف العالم",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 417,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أكثر صحاري العالم جفافاً وتقع في تشيلي بأمريكا الجنوبية حيث تنعدم الأمطار لسنوات متواصلة",
                    correctAnswer = "أتاكاما",
                    availableLetters = LetterScrambler.buildScrambledLetters("أتاكاما", GameDifficulty.THINKING, listOf("ن", "ا", "م", "ي"), seed = 417L),
                    hint = "تشبه تضاريسها سطح المريخ وتضم مراصد فلكية عالمية",
                    rewardPoints = 20,
                    explanation = "صحراء أتاكاما محمية من الرطوبة بسلسلة جبال الأنديز وتيار همبولت البارد في المحيط الهادئ.",
                    challengeId = "geography_c6",
                    challengeTitle = "الصحاري والهضاب المرتفعة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏜️",
                    visualTheme = "الصحاري الجافة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 418,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أكبر بحر داخلي مغلق في العالم تحيط به خمس دول ولا يتصل بأي محيط",
                    correctAnswer = "قزوين",
                    availableLetters = LetterScrambler.buildScrambledLetters("قزوين", GameDifficulty.THINKING, listOf("م", "ي", "ت", "أ"), seed = 418L),
                    hint = "يحده من الجنوب إيران ومن الغرب أذربيجان وروسيا",
                    rewardPoints = 20,
                    explanation = "بحر قزوين تبلغ مساحته 371 ألف كم مربع وتصنف مياهه مالحة قليلاً ويضم ثروات كافيار ونفط هائلة.",
                    challengeId = "geography_c6",
                    challengeTitle = "الصحاري والهضاب المرتفعة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌊",
                    visualTheme = "البحار المغلقة",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: المناخ والتيارات المحيطية العظمى (CHALLENGE)
        Challenge(
            id = "geography_c7",
            categoryId = "geography",
            title = "المناخ والتيارات المحيطية العظمى",
            themeDescription = "دورات الغلاف الجوي وتأثير التيارات المائية على طقس الكوكب",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 419,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "تيار محيطي دافئ ينطلق من خليج المكسيك عبر الأطلسي ليمنح شمال غرب أوروبا مناخاً معتدلاً",
                    correctAnswer = "خليج",
                    availableLetters = LetterScrambler.buildScrambledLetters("خليج", GameDifficulty.CHALLENGE, listOf("ب", "ر", "ا", "ز", "ي", "ل"), seed = 419L),
                    hint = "يعرف باسم تيار الخليج (Gulf Stream) الحار",
                    rewardPoints = 25,
                    explanation = "تيار الخليج ينقل كميات حرارية هائلة تمنع تجمد موانئ بريطانيا والدول الاسكندنافية شتاءً.",
                    challengeId = "geography_c7",
                    challengeTitle = "المناخ والتيارات المحيطية العظمى",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌡️",
                    visualTheme = "التيارات البحرية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 420,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "ظاهرة مناخية دورية بالمحيط الهادئ الاستوائي تتسم بارتفاع غير طبيعي في درجات حرارة سطح الماء",
                    correctAnswer = "نينيو",
                    availableLetters = LetterScrambler.buildScrambledLetters("نينيو", GameDifficulty.CHALLENGE, listOf("ل", "ا", "ن", "ي", "ن", "ا"), seed = 420L),
                    hint = "تسبب اضطرابات طقس وفيضانات وجفافاً في مناطق متباعدة بالعالم",
                    rewardPoints = 25,
                    explanation = "ظاهرة إل نينيو تحدث كل بضع سنوات وتؤثر جذرياً على حركة الرياح التجارية وأنماط هطول الأمطار عالمياً.",
                    challengeId = "geography_c7",
                    challengeTitle = "المناخ والتيارات المحيطية العظمى",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌀",
                    visualTheme = "التقلبات المناخية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 421,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "قوة وهمية تنشأ عن دوران الأرض حول محورها تسبب انحراف مسار الرياح والتيارات البحرية يمنة في الشمال",
                    correctAnswer = "كوريوليس",
                    availableLetters = LetterScrambler.buildScrambledLetters("كوريوليس", GameDifficulty.CHALLENGE, listOf("ج", "ا", "ذ", "ب", "ي", "ة"), seed = 421L),
                    hint = "تحدد اتجاه دوران الأعاصير والحلزونات الهوائية",
                    rewardPoints = 25,
                    explanation = "تأثير كوريوليس يجعل الأعاصير تدور عكس عقارب الساعة في نصف الكرة الشمالي ومعها في الجنوبي.",
                    challengeId = "geography_c7",
                    challengeTitle = "المناخ والتيارات المحيطية العظمى",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌪️",
                    visualTheme = "ديناميكية الغلاف الجوي",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: الجيوب الجغرافية والدول الحبيسة (CHALLENGE)
        Challenge(
            id = "geography_c8",
            categoryId = "geography",
            title = "الجيوب الجغرافية والدول الحبيسة",
            themeDescription = "الكيانات السياسية المحاطة بالكامل بدول أخرى والحدود المعقدة",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 422,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "دولة ذات سيادة محاطة بالكامل من جميع جهاتها بأراضي دولة أخرى واحدة كإيطاليا",
                    correctAnswer = "سانمارينو",
                    availableLetters = LetterScrambler.buildScrambledLetters("سانمارينو", GameDifficulty.CHALLENGE, listOf("م", "و", "ن", "ا", "ك", "و"), seed = 422L),
                    hint = "أقدم جمهورية دستورية متبقية في العالم وتقع داخل إيطاليا",
                    rewardPoints = 25,
                    explanation = "سان مارينو إلى جانب الفاتيكان وليسوتو تمثل الدول الحبيسة المحاطة كلياً بدولة واحدة فقط.",
                    challengeId = "geography_c8",
                    challengeTitle = "الجيوب الجغرافية والدول الحبيسة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏰",
                    visualTheme = "الجيوب السياسية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 423,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أكبر دولة حبيسة في العالم لا تطل على أي بحر مفتوح وتقع في قلب آسيا الوسطى",
                    correctAnswer = "كازاخستان",
                    availableLetters = LetterScrambler.buildScrambledLetters("كازاخستان", GameDifficulty.CHALLENGE, listOf("م", "ن", "غ", "و", "ل", "ي"), seed = 423L),
                    hint = "تاسع أكبر دولة في العالم من حيث المساحة وعاصمتها أستانا",
                    rewardPoints = 25,
                    explanation = "كازاخستان تبلغ مساحتها أكثر من 2.7 مليون كم مربع وتحد كلاً من روسيا والصين وأوزبكستان وقيرغيزستان.",
                    challengeId = "geography_c8",
                    challengeTitle = "الجيوب الجغرافية والدول الحبيسة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🗺️",
                    visualTheme = "الدول الحبيسة",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 424,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "دولة حبيسة مزدوجة لا تطل على بحار وجميع الدول المجاورة لها دول حبيسة أيضاً في وسط آسيا",
                    correctAnswer = "أوزبكستان",
                    availableLetters = LetterScrambler.buildScrambledLetters("أوزبكستان", GameDifficulty.CHALLENGE, listOf("ط", "ا", "ج", "ي", "ك", "س"), seed = 424L),
                    hint = "تشترك في هذه الصفة النادرة مع إمارة ليختنشتاين فقط",
                    rewardPoints = 25,
                    explanation = "أوزبكستان تقع في حوض بحيرة آرال التاريخي وتتطلب الوصول للبحر المفتوح عبور دولتين على الأقل.",
                    challengeId = "geography_c8",
                    challengeTitle = "الجيوب الجغرافية والدول الحبيسة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📍",
                    visualTheme = "المواقع المعزولة",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: الأرخبيلات والخنادق المحيطية العميقة (EXPERT)
        Challenge(
            id = "geography_c9",
            categoryId = "geography",
            title = "الأرخبيلات والخنادق المحيطية العميقة",
            themeDescription = "أعمق نقاط القيعان البحرية والدول الجزرية المتشعبة",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 425,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أعمق نقطة منخفضة على وجه الأرض في خندق ماريانا بالمحيط الهادئ وتتجاوز 10900 متر عمقاً",
                    correctAnswer = "تشالنجر",
                    availableLetters = LetterScrambler.buildScrambledLetters("تشالنجر", GameDifficulty.EXPERT, listOf("م", "ا", "ر", "ي", "ا", "ن", "ا"), seed = 425L),
                    hint = "تسمى هُوّة أو فجوة ... وسميت تيمناً بسفينة أبحاث بريطانية",
                    rewardPoints = 30,
                    explanation = "فجوة تشالنجر يبلغ الضغط في قاعها أكثر من ألف ضعف الضغط الجوي السطحي في ظلام دائم وبرودة قاسية.",
                    challengeId = "geography_c9",
                    challengeTitle = "الأرخبيلات والخنادق المحيطية العميقة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌊",
                    visualTheme = "أعماق المحيط",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 426,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أكبر دولة أرخبيلية في العالم تتألف من أكثر من 17 ألف جزيرة بركانية بين المحيطين الهندي والهادئ",
                    correctAnswer = "إندونيسيا",
                    availableLetters = LetterScrambler.buildScrambledLetters("إندونيسيا", GameDifficulty.EXPERT, listOf("ف", "ل", "ب", "ي", "ن", "ي"), seed = 426L),
                    hint = "عاصمتها جاكرتا وتضم جزر جاوة وسومطرة وبالي وبورنيو",
                    rewardPoints = 30,
                    explanation = "إندونيسيا تقع ضمن حزام النار الباسيفيكي وتعتبر أكبر دولة ذات أغلبية سكانية مسلمة في العالم.",
                    challengeId = "geography_c9",
                    challengeTitle = "الأرخبيلات والخنادق المحيطية العميقة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏝️",
                    visualTheme = "الدول الأرخبيلية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 427,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "أرخبيل نرويجي قطبي يقع في أقصى المحيط المتجمد الشمالي ويضم القبو العالمي لبذور النباتات",
                    correctAnswer = "سفالبارد",
                    availableLetters = LetterScrambler.buildScrambledLetters("سفالبارد", GameDifficulty.EXPERT, listOf("غ", "ر", "ي", "ن", "ل", "ا", "ن"), seed = 427L),
                    hint = "تخضع لمعاهدة دولية تسمح بالأنشطة السلمية والبحثية",
                    rewardPoints = 30,
                    explanation = "سفالبارد تتميز بظلام قطبي يمتد لأشهر وتضم سفينة نوح لبذور النباتات للحفاظ على التنوع الوراثي الزراعي.",
                    challengeId = "geography_c9",
                    challengeTitle = "الأرخبيلات والخنادق المحيطية العميقة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "❄️",
                    visualTheme = "الجزر القطبية",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: رسم الخرائط وخطوط التاريخ الدولي (EXPERT)
        Challenge(
            id = "geography_c10",
            categoryId = "geography",
            title = "رسم الخرائط وخطوط التاريخ الدولي",
            themeDescription = "إسقاطات مركاتور وخط الطول المرجعي وتحديد فارق التوقيت العالمي",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 428,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "خط طول وهمي يمر بمرصد فلكي في ضواحي لندن تم اختياره مرجعاً دولياً لحساب التوقيت ودرجات الطول (صفر)",
                    correctAnswer = "غرينتش",
                    availableLetters = LetterScrambler.buildScrambledLetters("غرينتش", GameDifficulty.EXPERT, listOf("ا", "س", "ت", "و", "ا", "ء", "م"), seed = 428L),
                    hint = "يقسم الكرة الأرضية إلى نصف شرقي ونصف غربي",
                    rewardPoints = 35,
                    explanation = "خط غرينتش تم اعتماده عالمياً في مؤتمر واشنطن عام 1884 كنقطة الصفر للتوقيت العالمي المنسق UTC.",
                    challengeId = "geography_c10",
                    challengeTitle = "رسم الخرائط وخطوط التاريخ الدولي",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⏱️",
                    visualTheme = "خطوط الزمان",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 429,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "خط وهمي متعرج في المحيط الهادئ عند خط طول 180 درجة يؤدي عبوره إلى تغيير التاريخ بيوم كامل",
                    correctAnswer = "تاريخ",
                    availableLetters = LetterScrambler.buildScrambledLetters("تاريخ", GameDifficulty.EXPERT, listOf("ز", "م", "ن", "د", "و", "ل", "ي"), seed = 429L),
                    hint = "يسمى خط ... الدولي (International Date Line)",
                    rewardPoints = 35,
                    explanation = "خط التاريخ الدولي يتعرج لتفادي تقسيم الدول والمجموعات الجزرية إلى يومين مختلفين في التوقيت المحلي.",
                    challengeId = "geography_c10",
                    challengeTitle = "رسم الخرائط وخطوط التاريخ الدولي",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📅",
                    visualTheme = "خط التاريخ",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 430,
                    categoryId = "geography",
                    category = "بيت الجغرافيا والعالم",
                    question = "الإسقاط الأسطواني الشهير للخرائط الذي وضعه جغرافي فلمنكي عام 1569م ويضخم مساحات القطبين",
                    correctAnswer = "مركاتور",
                    availableLetters = LetterScrambler.buildScrambledLetters("مركاتور", GameDifficulty.EXPERT, listOf("ب", "ي", "ت", "ر", "ز", "غ", "و"), seed = 430L),
                    hint = "جعل غرينلاند تبدو بحجم قارة أفريقيا رغم أنها أصغر بكثير",
                    rewardPoints = 35,
                    explanation = "إسقاط مركاتور صمم أساساً للملاحة البحرية لأنه يحافظ على استقامة خطوط البوصلة والاتجاهات الملاحية.",
                    challengeId = "geography_c10",
                    challengeTitle = "رسم الخرائط وخطوط التاريخ الدولي",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🗺️",
                    visualTheme = "علم الخرائط",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
