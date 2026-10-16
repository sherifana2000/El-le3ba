package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object HistoryChallenges {

    val challenges = listOf(
        // Challenge 1: فجر الحضارات الإنسانية (EXPLORATION)
        Challenge(
            id = "history_c1",
            categoryId = "history",
            title = "فجر الحضارات الإنسانية",
            themeDescription = "آثار وإنجازات الحضارات الكبرى التي سكنت وادي الرافدين والنيل",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 301,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "صرح حجري هرمي شاهق بناه فراعنة مصر القديمة ليكون مقبرة ملكية خالدة",
                    correctAnswer = "هرم",
                    availableLetters = LetterScrambler.buildScrambledLetters("هرم", GameDifficulty.EXPLORATION, listOf("م", "ص", "ر", "خ"), seed = 301L),
                    hint = "أهرامات الجيزة وخوفو وخفرع ومنقرع",
                    rewardPoints = 15,
                    explanation = "الأهرامات شواهد هندسية ومعمارية مذهلة تعكس براعة المصريين القدماء في علوم الفلك والبناء.",
                    challengeId = "history_c1",
                    challengeTitle = "فجر الحضارات الإنسانية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏛️",
                    visualTheme = "مصر القديمة",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 302,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "أول نظام تدوين كتابي ابتكره السومريون في بلاد الرافدين بنقش علامات إسفينية على الطين",
                    correctAnswer = "مسمارية",
                    availableLetters = LetterScrambler.buildScrambledLetters("مسمارية", GameDifficulty.EXPLORATION, listOf("ط", "ي", "ن"), seed = 302L),
                    hint = "الكتابة المسمارية على الألواح الفخارية",
                    rewardPoints = 15,
                    explanation = "الكتابة المسمارية نقلت البشرية من عصور ما قبل التاريخ إلى العصور التاريخية الموثقة.",
                    challengeId = "history_c1",
                    challengeTitle = "فجر الحضارات الإنسانية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📜",
                    visualTheme = "بلاد الرافدين",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 303,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "عاصمة الإمبراطورية البابلية الشهيرة بحدائقها المعلقة ومسلة حمورابي القانونية",
                    correctAnswer = "بابل",
                    availableLetters = LetterScrambler.buildScrambledLetters("بابل", GameDifficulty.EXPLORATION, listOf("ع", "ر", "ا", "ق"), seed = 303L),
                    hint = "مدينة تاريخية عريقة على ضفاف نهر الفرات",
                    rewardPoints = 20,
                    explanation = "بابل كانت مركزاً عالمياً للتجارة والعلوم والتشريعات القانونية الأولى في التاريخ.",
                    challengeId = "history_c1",
                    challengeTitle = "فجر الحضارات الإنسانية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🦁",
                    visualTheme = "الحضارة البابلية",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: العصر الذهبي والأندلس (THINKING)
        Challenge(
            id = "history_c2",
            categoryId = "history",
            title = "العصر الذهبي والأندلس",
            themeDescription = "منارات الفكر والعلوم في بغداد وقرطبة وغرناطة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 304,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "دار علم ومكتبة عامة عظمى أسسها هارون الرشيد والمأمون في بغداد لترجمة العلوم",
                    correctAnswer = "حكمة",
                    availableLetters = LetterScrambler.buildScrambledLetters("حكمة", GameDifficulty.THINKING, listOf("ب", "غ", "د", "ا"), seed = 304L),
                    hint = "بيت الحكمة في العصر العباسي",
                    rewardPoints = 20,
                    explanation = "بيت الحكمة جمع علماء العالم وترجم أمهات الكتب في الطب والفلك والرياضيات والفلسفة.",
                    challengeId = "history_c2",
                    challengeTitle = "العصر الذهبي والأندلس",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📚",
                    visualTheme = "بيت الحكمة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 305,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "قصر تاريخي وحصن أندلسي شامخ شيده بنو الأحمر في غرناطة بزخارف هندسية فريدة",
                    correctAnswer = "حمراء",
                    availableLetters = LetterScrambler.buildScrambledLetters("حمراء", GameDifficulty.THINKING, listOf("ق", "ص", "ر", "غ"), seed = 305L),
                    hint = "قصر الحمراء الشهير بأفنيته ونوافيره",
                    rewardPoints = 20,
                    explanation = "قصر الحمراء درة العمارة الإسلامية في الأندلس ويجسد قمة الإتقان الهندسي والزخرفي.",
                    challengeId = "history_c2",
                    challengeTitle = "العصر الذهبي والأندلس",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏰",
                    visualTheme = "العمارة الأندلسية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 306,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "طريق تجاري بري عتيق ربط بين الصين وبلاد الشام وأوروبا لتبادل البضائع والحرير",
                    correctAnswer = "حرير",
                    availableLetters = LetterScrambler.buildScrambledLetters("حرير", GameDifficulty.THINKING, listOf("ط", "ر", "ي", "ق"), seed = 306L),
                    hint = "طريق الحرير التجاري الأسطوري",
                    rewardPoints = 20,
                    explanation = "طريق الحرير لم يكن معبراً تجارياً فحسب، بل جسراً لتبادل الثقافات والاختراعات والأفكار بين الشرق والغرب.",
                    challengeId = "history_c2",
                    challengeTitle = "العصر الذهبي والأندلس",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🐪",
                    visualTheme = "طرق القوافل",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: قادة ورحالة التاريخ (CHALLENGE)
        Challenge(
            id = "history_c3",
            categoryId = "history",
            title = "قادة ورحالة التاريخ",
            themeDescription = "الرحالة والمؤرخون الذين طافوا العالم ودوّنوا سير الشعوب",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 307,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "رحالة ومستكشف مغربي طاف أرجاء إفريقيا وآسيا ودوّن رحلته الشهيرة (تحفة النظار)",
                    correctAnswer = "بطوطة",
                    availableLetters = LetterScrambler.buildScrambledLetters("بطوطة", GameDifficulty.CHALLENGE, listOf("ر", "ح", "ل", "ة", "س", "ف"), seed = 307L),
                    hint = "ابن بطوطة أمير الرحالين المسلمين",
                    rewardPoints = 25,
                    explanation = "ابن بطوطة قطع أكثر من 120 ألف كيلومتر على مدار ثلاثين عاماً زار خلالها معظم بلدان العالم المعروف.",
                    challengeId = "history_c3",
                    challengeTitle = "قادة ورحالة التاريخ",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🗺️",
                    visualTheme = "الرحلات التاريخية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 308,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "مؤسس علم الاجتماع وفلسفة التاريخ وصاحب كتاب (المقدمة) ونظرية العمران البشري",
                    correctAnswer = "خلدون",
                    availableLetters = LetterScrambler.buildScrambledLetters("خلدون", GameDifficulty.CHALLENGE, listOf("ت", "ا", "ر", "ي", "خ", "ع"), seed = 308L),
                    hint = "العلامة التونسي عبد الرحمن ابن خلدون",
                    rewardPoints = 25,
                    explanation = "ابن خلدون أول من درس القوانين الاجتماعية وحركة التاريخ البشري بمنهج علمي تحليلي رصين.",
                    challengeId = "history_c3",
                    challengeTitle = "قادة ورحالة التاريخ",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📜",
                    visualTheme = "علم الاجتماع",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 309,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "بحار وقائد أندلسي فلكي لقب بأسد البحار ورسم خرائط الملاحة البحرية في المحيط الهندي",
                    correctAnswer = "ماجد",
                    availableLetters = LetterScrambler.buildScrambledLetters("ماجد", GameDifficulty.CHALLENGE, listOf("ب", "ح", "ر", "ش", "ر", "ا"), seed = 309L),
                    hint = "ابن ماجد الملاح العربي الشهير",
                    rewardPoints = 25,
                    explanation = "أحمد بن ماجد ابتكر قواعد ملاحية مبتكرة واستخدم البوصلة والإسطرلاب لتوجيه السفن بدقة.",
                    challengeId = "history_c3",
                    challengeTitle = "قادة ورحالة التاريخ",
                    questionIndexInChallenge = 3,
                    visualEmoji = "⚓",
                    visualTheme = "علوم الملاحة القديمة",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: حضارات وادي الرافدين والنيل (THINKING)
        Challenge(
            id = "history_c4",
            categoryId = "history",
            title = "حضارات وادي الرافدين والنيل",
            themeDescription = "مهود الحضارة الأولى ونشوء المدن والشرائع القديمة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 310,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "أقدم شريعة قانونية متكاملة مدونة في بابل نقشت على مسلة حجرية سوداء شهيرة",
                    correctAnswer = "حمورابي",
                    availableLetters = LetterScrambler.buildScrambledLetters("حمورابي", GameDifficulty.THINKING, listOf("ن", "ب", "و", "خ"), seed = 310L),
                    hint = "ملك بابلي تضمنت قوانينه مبدأ العين بالعين",
                    rewardPoints = 20,
                    explanation = "شريعة حمورابي تضمنت 282 مادة قانونية تنظم العدالة والتجارة والأسرة وحقوق المجتمع في بابل القديمة.",
                    challengeId = "history_c4",
                    challengeTitle = "حضارات وادي الرافدين والنيل",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📜",
                    visualTheme = "الشرائع الأولى",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 311,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "شعب سامي عريق بنى إمبراطورية تجارية بحرية على ساحل الشام وابتكر أول أبجدية صوتية",
                    correctAnswer = "فينيقيون",
                    availableLetters = LetterScrambler.buildScrambledLetters("فينيقيون", GameDifficulty.THINKING, listOf("ك", "ن", "ع", "ا"), seed = 311L),
                    hint = "أبحروا من جبيل وصور وقرطاج وصنعوا الصباغ الأرجواني",
                    rewardPoints = 20,
                    explanation = "الفينيقيون نشروا الأبجدية عبر موانئ البحر المتوسط وأسسوا مدينة قرطاج العظيمة في شمال أفريقيا.",
                    challengeId = "history_c4",
                    challengeTitle = "حضارات وادي الرافدين والنيل",
                    questionIndexInChallenge = 2,
                    visualEmoji = "⛵",
                    visualTheme = "الملاحون القدماء",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 312,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "حضارة سودانية قديمة ازدهرت على ضفاف النيل واشتهرت ببناء مئات الأهرامات في مروي",
                    correctAnswer = "كوش",
                    availableLetters = LetterScrambler.buildScrambledLetters("كوش", GameDifficulty.THINKING, listOf("ن", "و", "ب", "ة"), seed = 312L),
                    hint = "حكم ملوكها مصر خلال الأسرة الخامسة والعشرين",
                    rewardPoints = 20,
                    explanation = "مملكة كوش النوبية كانت مركزاً حضارياً وثقافياً وصناعياً كبيراً لصهر الحديد وبناء الأهرامات الملكية.",
                    challengeId = "history_c4",
                    challengeTitle = "حضارات وادي الرافدين والنيل",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🏛️",
                    visualTheme = "ممالك النيل",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: علماء ورواد الحضارة الإسلامية (THINKING)
        Challenge(
            id = "history_c5",
            categoryId = "history",
            title = "علماء ورواد الحضارة الإسلامية",
            themeDescription = "إشعاع المعرفة والطب والفلك والترجمة في بغداد وقرطبة",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 313,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "عالم مسلم وفيلسوف لقب بالشيخ الرئيس وألّف موسوعة القانون في الطب التي درست لقرون بأوروبا",
                    correctAnswer = "سينا",
                    availableLetters = LetterScrambler.buildScrambledLetters("سينا", GameDifficulty.THINKING, listOf("ر", "ا", "ز", "ي"), seed = 313L),
                    hint = "ابن ... الطبيب والفيلسوف الموسوعي الشهير",
                    rewardPoints = 20,
                    explanation = "ابن سينا جمع بين الفلسفة والطب وقدم اكتشافات رائدة في العدوى والتشريح وطبائع الأدوية.",
                    challengeId = "history_c5",
                    challengeTitle = "علماء ورواد الحضارة الإسلامية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📖",
                    visualTheme = "رواد الطب",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 314,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "عالم بصريات وفيزياء مسلم أسس المنهج العلمي التجريبي وفسر آلية الإبصار في كتابه المناظر",
                    correctAnswer = "هيثم",
                    availableLetters = LetterScrambler.buildScrambledLetters("هيثم", GameDifficulty.THINKING, listOf("ب", "ي", "ر", "و"), seed = 314L),
                    hint = "الحسن بن ... مؤسس علم الضوء الحديث والقمراء",
                    rewardPoints = 20,
                    explanation = "ابن الهيثم أثبت أن الضوء ينعكس من الأجسام إلى العين وليس العكس ووضع أساس الكاميرا المظلمة.",
                    challengeId = "history_c5",
                    challengeTitle = "علماء ورواد الحضارة الإسلامية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "👁️",
                    visualTheme = "علم البصريات",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 315,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "مؤسس علم الجبر ومبتكر نظام الترقيم الحسابي ومرجع الخوارزميات الحاسوبية الحديثة",
                    correctAnswer = "خوارزمي",
                    availableLetters = LetterScrambler.buildScrambledLetters("خوارزمي", GameDifficulty.THINKING, listOf("ك", "ن", "د", "ي"), seed = 315L),
                    hint = "عالم الرياضيات والفلك العباسي في بيت الحكمة",
                    rewardPoints = 20,
                    explanation = "محمد بن موسى الخوارزمي ألف كتاب المختصر في حساب الجبر والمقابلة ونقل الصفر والأرقام الهندية للغرب.",
                    challengeId = "history_c5",
                    challengeTitle = "علماء ورواد الحضارة الإسلامية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🧮",
                    visualTheme = "علم الحساب",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: المعارك الفاصلة ونقاط التحول (THINKING)
        Challenge(
            id = "history_c6",
            categoryId = "history",
            title = "المعارك الفاصلة ونقاط التحول",
            themeDescription = "المعارك التاريخية الحاسمة التي غيّرت مجرى التاريخ السياسي والجغرافي",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 316,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "معركة إسلامية كبرى وقعت في بلاد الشام عام 636م بقيادة خالد بن الوليد وأنهت النفوذ البيزنطي",
                    correctAnswer = "يرموك",
                    availableLetters = LetterScrambler.buildScrambledLetters("يرموك", GameDifficulty.THINKING, listOf("ق", "ا", "د", "س"), seed = 316L),
                    hint = "وقعت على ضفاف وادٍ يحمل اسمها قرب هضبة الجولان",
                    rewardPoints = 20,
                    explanation = "معركة اليرموك كانت نصراً استراتيجياً مهد لفتح القدس وكامل بلاد الشام في عهد الخليفة عمر بن الخطاب.",
                    challengeId = "history_c6",
                    challengeTitle = "المعارك الفاصلة ونقاط التحول",
                    questionIndexInChallenge = 1,
                    visualEmoji = "⚔️",
                    visualTheme = "المعارك الفاصلة",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 317,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "معركة تاريخية حاسمة انتصر فيها صلاح الدين الأيوبي عام 1187م ومهدت لتحرير بيت المقدس",
                    correctAnswer = "حطين",
                    availableLetters = LetterScrambler.buildScrambledLetters("حطين", GameDifficulty.THINKING, listOf("ع", "ي", "ن", "ج"), seed = 317L),
                    hint = "وقعت قرب قرون تقع غرب طبريا بفلسطين",
                    rewardPoints = 20,
                    explanation = "معركة حطين حطمت القوة العسكرية للصليبيين وفتحت الطريق أمام استعادة القدس في نفس العام.",
                    challengeId = "history_c6",
                    challengeTitle = "المعارك الفاصلة ونقاط التحول",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏰",
                    visualTheme = "تحرير القدس",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 318,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "معركة فاصلة عام 1260م في فلسطين أوقف فيها سيف الدين قطز والظاهر بيبرس زحف المغول التتار",
                    correctAnswer = "جالوت",
                    availableLetters = LetterScrambler.buildScrambledLetters("جالوت", GameDifficulty.THINKING, listOf("ش", "ق", "ح", "ب"), seed = 318L),
                    hint = "تسمى معركة عين ... الشهيرة",
                    rewardPoints = 20,
                    explanation = "عين جالوت كانت أول هزيمة قاسية للجيش المغولي بعد سقوط بغداد وحمت العالم الإسلامي من الاندثار.",
                    challengeId = "history_c6",
                    challengeTitle = "المعارك الفاصلة ونقاط التحول",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🛡️",
                    visualTheme = "رد الغزاة",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: طرق التجارة البحرية والبرية الكبرى (CHALLENGE)
        Challenge(
            id = "history_c7",
            categoryId = "history",
            title = "طرق التجارة البحرية والبرية الكبرى",
            themeDescription = "شبكات القوافل وتبادل السلع والتوابل بين الشرق والغرب",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 319,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "طريق تجاري أثري قديم نقل الصمغ المتحجر الأصفر اللامع من سواحل بحر البلطيق إلى روما ومصر",
                    correctAnswer = "كهرمان",
                    availableLetters = LetterScrambler.buildScrambledLetters("كهرمان", GameDifficulty.CHALLENGE, listOf("ع", "ن", "ب", "ر", "ذ", "ه"), seed = 319L),
                    hint = "يسمى طريق ... الصمغ الأحفوري الثمين",
                    rewardPoints = 25,
                    explanation = "طريق الكهرمان كان من أقدم الممرات التجارية في أوروبا ونقل حجر الكهرمان المرغوب لصناعة الحلي والتمائم.",
                    challengeId = "history_c7",
                    challengeTitle = "طرق التجارة البحرية والبرية الكبرى",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🐪",
                    visualTheme = "طرق القوافل",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 320,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "الطريق التجاري البحري العربي الذي نقل البهارات والمر من الهند وظفار واليمن إلى الشام ومصر",
                    correctAnswer = "بخور",
                    availableLetters = LetterScrambler.buildScrambledLetters("بخور", GameDifficulty.CHALLENGE, listOf("ع", "ط", "و", "ر", "ل", "ؤ"), seed = 320L),
                    hint = "عرف تاريخياً بطريق البخور أو اللبان العربي القديم",
                    rewardPoints = 25,
                    explanation = "طريق البخور سيطرت عليه ممالك جنوب الجزيرة العربية كسبأ وحضرموت والأنباط وكان مورداً اقتصادياً عظيماً.",
                    challengeId = "history_c7",
                    challengeTitle = "طرق التجارة البحرية والبرية الكبرى",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏺",
                    visualTheme = "تجارة اللبان",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 321,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "تحالف تجاري بحري من مدن ألمانيا وشمال أوروبا احتكر التجارة في بحر البلطيق بالقرون الوسطى",
                    correctAnswer = "هانزا",
                    availableLetters = LetterScrambler.buildScrambledLetters("هانزا", GameDifficulty.CHALLENGE, listOf("ب", "ن", "د", "ق", "ي", "ة"), seed = 321L),
                    hint = "عرفت تاريخياً بالرابطة الهانزية وتمركزت في لوبيك وهامبورغ",
                    rewardPoints = 25,
                    explanation = "رابطة الهانزا حمت السفن التجارية من القراصنة واحتكرت تجارة الحبوب والأخشاب والأسماك في بحر البلطيق.",
                    challengeId = "history_c7",
                    challengeTitle = "طرق التجارة البحرية والبرية الكبرى",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🚢",
                    visualTheme = "الروابط التجارية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: عصر النهضة والثورات الفكرية (CHALLENGE)
        Challenge(
            id = "history_c8",
            categoryId = "history",
            title = "عصر النهضة والثورات الفكرية",
            themeDescription = "التحول نحو الحداثة وسقوط الإقطاع وتطور الفكر السياسي",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 322,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "حركة فكرية وثقافية انطلقت من فلورنسا بإيطاليا في القرن الرابع عشر أحيت التراث والعلوم",
                    correctAnswer = "نهضة",
                    availableLetters = LetterScrambler.buildScrambledLetters("نهضة", GameDifficulty.CHALLENGE, listOf("ث", "و", "ر", "ة", "ت", "ن"), seed = 322L),
                    hint = "ارتبطت بأسماء مثل ليوناردو دافنشي ومايكل أنجلو",
                    rewardPoints = 25,
                    explanation = "عصر النهضة الأوروبية قاد إلى ولادة النزعة الإنسانية والمنهج التجريبي والاكتشافات الجغرافية الكبرى.",
                    challengeId = "history_c8",
                    challengeTitle = "عصر النهضة والثورات الفكرية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🎨",
                    visualTheme = "النهضة الفنية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 323,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "ثورة شعبية كبرى عام 1789م أسقطت الحكم الملكي المطلق ورفعت شعار حرية إخاء مساواة",
                    correctAnswer = "فرنسية",
                    availableLetters = LetterScrambler.buildScrambledLetters("فرنسية", GameDifficulty.CHALLENGE, listOf("ب", "ر", "ي", "ط", "ا", "ن"), seed = 323L),
                    hint = "ارتبطت باقتحام سجن الباستيل وإعلان حقوق الإنسان",
                    rewardPoints = 25,
                    explanation = "الثورة الفرنسية غيرت الخريطة السياسية لأوروبا وأسست لسيادة القانون وحقوق المواطن الدستورية.",
                    challengeId = "history_c8",
                    challengeTitle = "عصر النهضة والثورات الفكرية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🚩",
                    visualTheme = "الثورات الكبرى",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 324,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "الوثيقة الإنجليزية التاريخية العظمى الموقعة عام 1215م التي قيدت سلطة الملك وأرست سيادة القانون",
                    correctAnswer = "ماغناكارتا",
                    availableLetters = LetterScrambler.buildScrambledLetters("ماغناكارتا", GameDifficulty.CHALLENGE, listOf("د", "س", "ت", "و", "ر", "ق"), seed = 324L),
                    hint = "الميثاق الأعظم للحريات الذي فرضه البارونات على الملك جون",
                    rewardPoints = 25,
                    explanation = "الماغنا كارتا تعتبر حجر الزاوية في تطور الأنظمة البرلمانية والدستورية الحديثة عالمياً.",
                    challengeId = "history_c8",
                    challengeTitle = "عصر النهضة والثورات الفكرية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📜",
                    visualTheme = "المواثيق الدستورية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: ألغاز حضارات أمريكا القديمة وإفريقيا (EXPERT)
        Challenge(
            id = "history_c9",
            categoryId = "history",
            title = "ألغاز حضارات أمريكا القديمة وإفريقيا",
            themeDescription = "حضارات المايا والإنكا وزيمبابوي والمدن الحجرية المفقودة",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 325,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "حضارة متقدمة في أمريكا الوسطى اشتهرت بنظام كتابة هيروغليفي متقن وتقويم فلكي دقيق",
                    correctAnswer = "مايا",
                    availableLetters = LetterScrambler.buildScrambledLetters("مايا", GameDifficulty.EXPERT, listOf("أ", "ز", "ت", "ك", "إ", "ن", "ك"), seed = 325L),
                    hint = "بنوا أهرامات تيكال وشيتشن إيتزا في الغابات المطرية",
                    rewardPoints = 30,
                    explanation = "حضارة المايا طورت علم الفلك والرياضيات واستخدمت الصفر قبل ظهوره في أغلب أنحاء أوروبا.",
                    challengeId = "history_c9",
                    challengeTitle = "ألغاز حضارات أمريكا القديمة وإفريقيا",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🗿",
                    visualTheme = "شعوب المايا",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 326,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "إمبراطورية جبلية شاسعة في جبال الأنديز بنوا مدناً معلقة فوق القمم مثل ماتشو بيتشو",
                    correctAnswer = "إنكا",
                    availableLetters = LetterScrambler.buildScrambledLetters("إنكا", GameDifficulty.EXPERT, listOf("ت", "و", "ل", "ت", "ك", "أ", "ز"), seed = 326L),
                    hint = "استخدموا حبال الكيبو المعقودة لتدوين الحسابات بدلاً من الحروف",
                    rewardPoints = 30,
                    explanation = "حضارة الإنكا شقت آلاف الكيلومترات من الطرق الجبلية المعبدة وأتقنت الزراعة في المدرجات الحجرية.",
                    challengeId = "history_c9",
                    challengeTitle = "ألغاز حضارات أمريكا القديمة وإفريقيا",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏔️",
                    visualTheme = "إمبراطورية الأنديز",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 327,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "مملكة إفريقية عظيمة في القرون الوسطى اشتهرت ببناء مجمع معماري حجري بيضاوي دون استخدام الملاط",
                    correctAnswer = "زيمبابوي",
                    availableLetters = LetterScrambler.buildScrambledLetters("زيمبابوي", GameDifficulty.EXPERT, listOf("غ", "ا", "ن", "ا", "م", "ا", "ل"), seed = 327L),
                    hint = "تعني بالحجر الكبير وهي اليوم اسم دولة إفريقية عاصمتها هراري",
                    rewardPoints = 30,
                    explanation = "مملكة زيمبابوي العظمى سيطرت على تجارة الذهب والعاج مع الساحل السواحيلي والهند في القرون الوسطى.",
                    challengeId = "history_c9",
                    challengeTitle = "ألغاز حضارات أمريكا القديمة وإفريقيا",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🏰",
                    visualTheme = "المعمار الحجري",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: معاهدات السلام ونشأة المنظمات العالمية (EXPERT)
        Challenge(
            id = "history_c10",
            categoryId = "history",
            title = "معاهدات السلام ونشأة المنظمات العالمية",
            themeDescription = "صلح وستفاليا وعصبة الأمم والنظام العالمي بعد الحرب العالمية",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 328,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "معاهدة السلام الشهيرة عام 1648م التي أنهت حرب الثلاثين عاماً وأرست مفهوم سيادة الدولة القومية",
                    correctAnswer = "وستفاليا",
                    availableLetters = LetterScrambler.buildScrambledLetters("وستفاليا", GameDifficulty.EXPERT, listOf("ف", "ي", "ر", "س", "ا", "ي", "ل"), seed = 328L),
                    hint = "صلح ألماني تاريخي وضع مبدأ عدم التدخل في شؤون الدول",
                    rewardPoints = 35,
                    explanation = "صلح وستفاليا أسس القانون الدولي الحديث الدبلوماسي القائم على سيادة الدول المعترف بها وتوازن القوى.",
                    challengeId = "history_c10",
                    challengeTitle = "معاهدات السلام ونشأة المنظمات العالمية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🤝",
                    visualTheme = "المعاهدات الكبرى",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 329,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "معاهدة فرضت شروطاً قاسية على ألمانيا عام 1919م وأنهت رسمياً الحرب العالمية الأولى",
                    correctAnswer = "فرساي",
                    availableLetters = LetterScrambler.buildScrambledLetters("فرساي", GameDifficulty.EXPERT, listOf("ج", "ن", "ي", "ف", "ل", "و", "ز"), seed = 329L),
                    hint = "وقعت في قاعة المرايا بالقصر الملكي الفرنسي قرب باريس",
                    rewardPoints = 35,
                    explanation = "معاهدة فرساي أنشأت عصبة الأمم ولكن تداعياتها الاقتصادية والسياسية مهدت لصعود التوتر المؤدي للحرب الثانية.",
                    challengeId = "history_c10",
                    challengeTitle = "معاهدات السلام ونشأة المنظمات العالمية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏛️",
                    visualTheme = "مؤتمرات السلام",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 330,
                    categoryId = "history",
                    category = "بيت التاريخ والحضارات",
                    question = "مؤتمر دبلوماسي تاريخي عقد عام 1955م في إندونيسيا وشهد ولادة حركة عدم الانحياز بين دول العالم الثالث",
                    correctAnswer = "باندونغ",
                    availableLetters = LetterScrambler.buildScrambledLetters("باندونغ", GameDifficulty.EXPERT, listOf("ب", "ل", "غ", "ر", "ا", "د", "ق"), seed = 330L),
                    hint = "جمع زعماء مثل عبد الناصر ونهرو وتيتو وسوكارنو",
                    rewardPoints = 35,
                    explanation = "مؤتمر باندونغ أسس لمبادئ التعايش السلمي وحق تقرير المصير ورفض الاصطفاف مع المعسكرين الشرقي والغربي.",
                    challengeId = "history_c10",
                    challengeTitle = "معاهدات السلام ونشأة المنظمات العالمية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌍",
                    visualTheme = "حركة عدم الانحياز",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
