package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object LandmarksChallenges {

    val challenges = listOf(
        // Challenge 1: روائع العمارة العالمية (EXPLORATION)
        Challenge(
            id = "landmarks_c1",
            categoryId = "landmarks",
            title = "روائع العمارة العالمية",
            themeDescription = "أشهر الصروح والأبراج المعمارية التي تميز كبرى مدن العالم",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 801,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "أعلى ناطحة سحاب وبرج شيده الإنسان في العالم ويقع في قلب مدينة دبي بالإمارات",
                    correctAnswer = "خليفة",
                    availableLetters = LetterScrambler.buildScrambledLetters("خليفة", GameDifficulty.EXPLORATION, listOf("ب", "ر"), seed = 801L),
                    hint = "برج خليفة الشاهق بارتفاع يتجاوز 828 متراً",
                    rewardPoints = 15,
                    explanation = "برج خليفة تحفة هندسية معمارية فريدة ويضم أعلى شرفة مشاهدة في العالم.",
                    challengeId = "landmarks_c1",
                    challengeTitle = "روائع العمارة العالمية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏙️",
                    visualTheme = "ناطحات السحاب",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 802,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "برج حديدي شبكي شهير يرتفع في العاصمة الفرنسية باريس ويعد رمزاً للثقافة الأوروبية",
                    correctAnswer = "إيفل",
                    availableLetters = LetterScrambler.buildScrambledLetters("إيفل", GameDifficulty.EXPLORATION, listOf("ف", "ر"), seed = 802L),
                    hint = "برج إيفل المصنوع من الحديد المشغول",
                    rewardPoints = 15,
                    explanation = "شيده غوستاف إيفل عام 1889 بمناسبة المعرض العالمي، ويزوره ملايين السياح سنوياً.",
                    challengeId = "landmarks_c1",
                    challengeTitle = "روائع العمارة العالمية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🗼",
                    visualTheme = "المعالم الأوروبية",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 803,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "جدار دفاعي حجري هائل يمتد لآلاف الكيلومترات عبر تلال وجبال الصين الشمالية",
                    correctAnswer = "سور",
                    availableLetters = LetterScrambler.buildScrambledLetters("سور", GameDifficulty.EXPLORATION, listOf("ص", "ي", "ن", "ح"), seed = 803L),
                    hint = "سور الصين العظيم أحد عجائب الدنيا",
                    rewardPoints = 20,
                    explanation = "سور الصين العظيم شيد لحماية الإمبراطورية من الغزوات ويعد أطول بناء عسكري في التاريخ.",
                    challengeId = "landmarks_c1",
                    challengeTitle = "روائع العمارة العالمية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🧱",
                    visualTheme = "عجائب الدنيا",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: المعالم المقدسة والتراثية (THINKING)
        Challenge(
            id = "landmarks_c2",
            categoryId = "landmarks",
            title = "المعالم المقدسة والتراثية",
            themeDescription = "الصروح التاريخية والمقدسات العريقة المحفورة في ذاكرة الشعوب",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 804,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "قبلة المسلمين الأولى وثالث الحرمين الشريفين ويقع في قلب البلدة القديمة بالقدس",
                    correctAnswer = "أقصى",
                    availableLetters = LetterScrambler.buildScrambledLetters("أقصى", GameDifficulty.THINKING, listOf("ق", "د", "س", "م"), seed = 804L),
                    hint = "المسجد الأقصى المبارك وقبة الصخرة",
                    rewardPoints = 20,
                    explanation = "المسجد الأقصى له مكانة روحية وتاريخية سامية وباركه الله في القرآن الكريم.",
                    challengeId = "landmarks_c2",
                    challengeTitle = "المعالم المقدسة والتراثية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🕌",
                    visualTheme = "المقدسات الإسلامية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 805,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "ضريح رخامي أبيض بديع شيده الإمبراطور شاه جهان في مدينة أغرا بالهند تخليداً لزوجته",
                    correctAnswer = "محل",
                    availableLetters = LetterScrambler.buildScrambledLetters("محل", GameDifficulty.THINKING, listOf("ت", "ا", "ج", "هـ"), seed = 805L),
                    hint = "تاج محل درة العمارة المغولية الإسلامية",
                    rewardPoints = 20,
                    explanation = "تاج محل يجمع بين عناصر العمارة الإسلامية والفارسية والهندية ويتميز بتناظره وقبابه الرخامية.",
                    challengeId = "landmarks_c2",
                    challengeTitle = "المعالم المقدسة والتراثية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏛️",
                    visualTheme = "العمارة الهندية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 806,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "مدينة صخرية وردية أثرية نحتها الأنباط في صخور جبال وادي موسى جنوب الأردن",
                    correctAnswer = "بتراء",
                    availableLetters = LetterScrambler.buildScrambledLetters("بتراء", GameDifficulty.THINKING, listOf("ص", "خ", "ر", "ا"), seed = 806L),
                    hint = "البتراء عاصمة الأنباط والخزنة والسيق",
                    rewardPoints = 20,
                    explanation = "البتراء نحتت بالكامل في الصخور الوردية وتعد من أبرز مواقع التراث العالمي لنظام قنوات مياهها المتقن.",
                    challengeId = "landmarks_c2",
                    challengeTitle = "المعالم المقدسة والتراثية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🏺",
                    visualTheme = "الحضارة النبطية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: المدرجات والأبراج المائلة (CHALLENGE)
        Challenge(
            id = "landmarks_c3",
            categoryId = "landmarks",
            title = "المدرجات والأبراج المائلة",
            themeDescription = "الصروح الرومانية والنهضوية التي صمدت لآلاف السنين",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 807,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "مدرج روماني حجري عملاق في روما كان مسرحاً لمعارك المصارعين والعروض الإمبراطورية",
                    correctAnswer = "كولوسيوم",
                    availableLetters = LetterScrambler.buildScrambledLetters("كولوسيوم", GameDifficulty.CHALLENGE, listOf("ر", "و", "م", "ا", "ح", "ج"), seed = 807L),
                    hint = "مدرج الكولوسيوم البيضاوي الشهير",
                    rewardPoints = 25,
                    explanation = "الكولوسيوم استوعب أكثر من 50 ألف متفرج ويعد نموذجاً مبهراً للهندسة الخرسانية والأقواس الرومانية.",
                    challengeId = "landmarks_c3",
                    challengeTitle = "المدرجات والأبراج المائلة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏟️",
                    visualTheme = "العمارة الرومانية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 808,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "برج جرس رخامي مائل في إيطاليا نال شهرة عالمية بسبب انحنائه الناتج عن رخاوة التربة",
                    correctAnswer = "بيزا",
                    availableLetters = LetterScrambler.buildScrambledLetters("بيزا", GameDifficulty.CHALLENGE, listOf("ب", "ر", "ج", "م", "ا", "ئ"), seed = 808L),
                    hint = "برج بيزا المائل واستخدمه غاليليو في تجاربه",
                    rewardPoints = 25,
                    explanation = "برج بيزا استمر بناؤه قرابة قرنين من الزمان، ويجذب الزوار من كل بقاع الأرض لتفرده البصري.",
                    challengeId = "landmarks_c3",
                    challengeTitle = "المدرجات والأبراج المائلة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📐",
                    visualTheme = "الهندسة الإيطالية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 809,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "صخرة أثرية ضخمة وموقع قلعة طبيعية عريقة تطل على خليج البوسفور وقناة إسطنبول التاريخية",
                    correctAnswer = "بوسفور",
                    availableLetters = LetterScrambler.buildScrambledLetters("بوسفور", GameDifficulty.CHALLENGE, listOf("م", "ض", "ي", "ق", "ب", "ح"), seed = 809L),
                    hint = "مضيق البوسفور وجسوره المعلقة",
                    rewardPoints = 25,
                    explanation = "البوسفور يقسم إسطنبول إلى قسم أوروبي وآخر آسيوي، ويعد شرياناً مائياً غنياً بالقلاع والقصور العثمانية.",
                    challengeId = "landmarks_c3",
                    challengeTitle = "المدرجات والأبراج المائلة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌉",
                    visualTheme = "المضائق التركية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: روائع العمارة في الشرق الأقصى (THINKING)
        Challenge(
            id = "landmarks_c4",
            categoryId = "landmarks",
            title = "روائع العمارة في الشرق الأقصى",
            themeDescription = "المعابد الضخمة والقصور الإمبراطورية في آسيا",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 810,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "أضخم مجمع ديني ومعبدي في العالم يقع في كمبوديا وبني في الأصل للإله فشنو على يد إمبراطورية الخمير",
                    correctAnswer = "أنغكور",
                    availableLetters = LetterScrambler.buildScrambledLetters("أنغكور", GameDifficulty.THINKING, listOf("و", "ا", "ت", "ب"), seed = 810L),
                    hint = "يسمى معبد ... وات وتزينه أبراج على شكل براعم اللوتس",
                    rewardPoints = 20,
                    explanation = "أنغكور وات بني في القرن الثاني عشر ويمثل قمة العمارة الخميرية ويظهر على العلم الوطني لكمبوديا.",
                    challengeId = "landmarks_c4",
                    challengeTitle = "روائع العمارة في الشرق الأقصى",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🛕",
                    visualTheme = "معابد الخمير",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 811,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "القصر الإمبراطوري الصيني الفخم في قلب بكين الذي حرم دخوله على عامة الشعب لخمسة قرون",
                    correctAnswer = "محرمة",
                    availableLetters = LetterScrambler.buildScrambledLetters("محرمة", GameDifficulty.THINKING, listOf("م", "ح", "ظ", "و"), seed = 811L),
                    hint = "يسمى المدينة الـ ... ويضم نحو ألف مبنى تاريخي خشبي",
                    rewardPoints = 20,
                    explanation = "المدينة المحرمة كانت مقراً لأباطرة سلالتي مينغ وتشينغ وتمثل أعظم مجمع معماري خشبي قديم في العالم.",
                    challengeId = "landmarks_c4",
                    challengeTitle = "روائع العمارة في الشرق الأقصى",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏯",
                    visualTheme = "القصور الإمبراطورية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 812,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "ضريح ملكي وضريح شاه جهان وزوجته في أغرا بالهند بني بالكامل من الرخام الأبيض الخالص المرصع",
                    correctAnswer = "تاج",
                    availableLetters = LetterScrambler.buildScrambledLetters("تاج", GameDifficulty.THINKING, listOf("م", "ح", "ل", "ق"), seed = 812L),
                    hint = "يسمى ... محل ويعد درة الفن الإسلامي المغولي",
                    rewardPoints = 20,
                    explanation = "تاج محل بني في القرن السابع عشر ويعتبر تحفة هندسية عالمية ترمز للحب والوفاء المعماري الخالد.",
                    challengeId = "landmarks_c4",
                    challengeTitle = "روائع العمارة في الشرق الأقصى",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🕌",
                    visualTheme = "العمارة المغولية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: الكاتدرائيات والقصور الملكية الأوروبية (THINKING)
        Challenge(
            id = "landmarks_c5",
            categoryId = "landmarks",
            title = "الكاتدرائيات والقصور الملكية الأوروبية",
            themeDescription = "العمارة القوطية والباروكية في العواصم الأوروبية الكبرى",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 813,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "القصر الملكي الفرنسي العريق في قلب باريس الذي تحول إلى أكبر متحف للفنون والآثار بالعالم",
                    correctAnswer = "لوفر",
                    availableLetters = LetterScrambler.buildScrambledLetters("لوفر", GameDifficulty.THINKING, listOf("ب", "ا", "ر", "ي", "س"), seed = 813L),
                    hint = "يضم هرم اللوفر الزجاجي الشهير ولوحة الموناليزا",
                    rewardPoints = 20,
                    explanation = "قصر اللوفر كان مقراً لملوك فرنسا قبل الانتقال لفرساي، ويضم اليوم أثمن كنوز الفن والتاريخ الإنساني.",
                    challengeId = "landmarks_c5",
                    challengeTitle = "الكاتدرائيات والقصور الملكية الأوروبية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏰",
                    visualTheme = "القصور الملكية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 814,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "كاتدرائية كاثوليكية تاريخية قوطية الطراز على نهر السين بباريس تشتهر بنوافذها الوردية وبرجيها العاليين",
                    correctAnswer = "نوتردام",
                    availableLetters = LetterScrambler.buildScrambledLetters("نوتردام", GameDifficulty.THINKING, listOf("ب", "ا", "س", "ت"), seed = 814L),
                    hint = "ارتبطت برواية أحدب ... لفيكتور هوغو وتعرضت لحريق 2019",
                    rewardPoints = 20,
                    explanation = "نوتردام دو باري استغرق بناؤها قرابة قرنين من الزمان وتعد أيقونة العمارة القوطية الفرنسية.",
                    challengeId = "landmarks_c5",
                    challengeTitle = "الكاتدرائيات والقصور الملكية الأوروبية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "⛪",
                    visualTheme = "العمارة القوطية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 815,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "برج الساعة الشهير في لندن الذي يعلو قصر وستمنستر البرلماني ويشتهر بدقاته المنتظمة التاريخية",
                    correctAnswer = "بيغبن",
                    availableLetters = LetterScrambler.buildScrambledLetters("بيغبن", GameDifficulty.THINKING, listOf("ل", "ن", "د", "ن"), seed = 815L),
                    hint = "اسم الجرس الضخم داخل البرج الذي يزن أكثر من 13 طناً",
                    rewardPoints = 20,
                    explanation = "برج إليزابيث (المعروف ببيغ بن) صمم بدقة متناهية وظل رمزاً للعاصمة البريطانية لندن منذ منتصف القرن التاسع عشر.",
                    challengeId = "landmarks_c5",
                    challengeTitle = "الكاتدرائيات والقصور الملكية الأوروبية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🕰️",
                    visualTheme = "أبراج الساعات",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: صروح الشرق الأوسط التاريخية العريقة (THINKING)
        Challenge(
            id = "landmarks_c6",
            categoryId = "landmarks",
            title = "صروح الشرق الأوسط التاريخية العريقة",
            themeDescription = "القلاع والمساجد الأثرية والمعالم التاريخية في العالم العربي",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 816,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "مبنى تاريخي فخم في إسطنبول بني ككاتدرائية في عهد جوستينيان ثم تحول لمسجد ثم متحف ثم مسجد مجدداً",
                    correctAnswer = "صوفيا",
                    availableLetters = LetterScrambler.buildScrambledLetters("صوفيا", GameDifficulty.THINKING, listOf("س", "ل", "ي", "م"), seed = 816L),
                    hint = "آيا ... الشهيرة بقبتها المعلقة العظيمة وزخارفها الفسيفسائية",
                    rewardPoints = 20,
                    explanation = "آيا صوفيا تمثل أعظم إنجازات العمارة البيزنطية وظلت أكبر كاتدرائية في العالم لما يقارب ألف عام.",
                    challengeId = "landmarks_c6",
                    challengeTitle = "صروح الشرق الأوسط التاريخية العريقة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🕌",
                    visualTheme = "الصروح التاريخية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 817,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "قلعة تاريخية حربية منيعة في حلب بسوريا تتربع على تل بيضاوي محاط بخندق عميق وتعد أقدم القلاع",
                    correctAnswer = "حلب",
                    availableLetters = LetterScrambler.buildScrambledLetters("حلب", GameDifficulty.THINKING, listOf("د", "م", "ش", "ق"), seed = 817L),
                    hint = "قلعة ... الحصن الأيوبي الشامخ الذي صمد أمام الغزاة",
                    rewardPoints = 20,
                    explanation = "قلعة حلب تعود آثارها للألفية الثالثة قبل الميلاد وشهدت تحصينات كبرى في العهد الأيوبي على يد الظاهر غازي.",
                    challengeId = "landmarks_c6",
                    challengeTitle = "صروح الشرق الأوسط التاريخية العريقة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏰",
                    visualTheme = "القلاع الإسلامية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 818,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "مسجد تاريخي فريد في سامراء بالعراق يتميز بمئذنته الحلزونية الصاعدة على شكل مدرج دائري",
                    correctAnswer = "ملوية",
                    availableLetters = LetterScrambler.buildScrambledLetters("ملوية", GameDifficulty.THINKING, listOf("ج", "ا", "م", "ع"), seed = 818L),
                    hint = "المئذنة الـ ... التي بناها الخليفة العباسي المتوكل على الله",
                    rewardPoints = 20,
                    explanation = "مئذنة الملوية ترتفع 52 متراً وبنيت من الطابوق الفخاري وتعتبر من أندر التصاميم المعمارية في التراث الإسلامي.",
                    challengeId = "landmarks_c6",
                    challengeTitle = "صروح الشرق الأوسط التاريخية العريقة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌀",
                    visualTheme = "المآذن التاريخية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: الجسور والأنفاق المعمارية الخارقة (CHALLENGE)
        Challenge(
            id = "landmarks_c7",
            categoryId = "landmarks",
            title = "الجسور والأنفاق المعمارية الخارقة",
            themeDescription = "الجسور المعلقة الضخمة وشبكات العبور القارية المعقدة",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 819,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "جسر معلق برتقالي شهير يربط مدينة سان فرانسيسكو بمقاطعة مارين عبر مضيق المحيط الهادئ",
                    correctAnswer = "ذهبية",
                    availableLetters = LetterScrambler.buildScrambledLetters("ذهبية", GameDifficulty.CHALLENGE, listOf("ب", "و", "ا", "ب", "ة", "ح"), seed = 819L),
                    hint = "جسر البوابة الـ ... (Golden Gate Bridge)",
                    rewardPoints = 25,
                    explanation = "جسر البوابة الذهبية افتتح عام 1937 وكان أطول جسر معلق في العالم ويمتاز بمقاومته للرياح العاتية والزلازل.",
                    challengeId = "landmarks_c7",
                    challengeTitle = "الجسور والأنفاق المعمارية الخارقة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🌉",
                    visualTheme = "الجسور المعلقة",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 820,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "نفق حديدي تحت مياه القناة الإنجليزية يربط بين بريطانيا وفرنسا ويعد أطول نفق تحت الماء بالعالم",
                    correctAnswer = "مانش",
                    availableLetters = LetterScrambler.buildScrambledLetters("مانش", GameDifficulty.CHALLENGE, listOf("ي", "و", "ر", "و", "ن", "ف"), seed = 820L),
                    hint = "يسمى نفق الـ ... أو نفق القناة (Channel Tunnel)",
                    rewardPoints = 25,
                    explanation = "نفق المانش يمتد بطول 50.5 كم منها 37.9 كم تحت قاع البحر وتمر عبره قطارات يوروستار فائقة السرعة.",
                    challengeId = "landmarks_c7",
                    challengeTitle = "الجسور والأنفاق المعمارية الخارقة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🚇",
                    visualTheme = "الأنفاق البحرية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 821,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "أعلى جسر معلق للمركبات في العالم يقع في جنوب فرنسا ويمتد فوق وادي نهر تارن فوق السحاب",
                    correctAnswer = "ميو",
                    availableLetters = LetterScrambler.buildScrambledLetters("ميو", GameDifficulty.CHALLENGE, listOf("ف", "ي", "ا", "د", "و", "ك"), seed = 821L),
                    hint = "جسر مياو (Millau Viaduct) الذي ترتفع أبراجه لأكثر من 340 متراً",
                    rewardPoints = 25,
                    explanation = "جسر ميو صممه المهندس ميشيل فيرلوجو ونورمان فوستر وترتفع سارياته أعلى من برج إيفل في الهواء الطلق.",
                    challengeId = "landmarks_c7",
                    challengeTitle = "الجسور والأنفاق المعمارية الخارقة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌁",
                    visualTheme = "الجسور الشاهقة",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: العجائب الجيولوجية والأخاديد الطبيعية (CHALLENGE)
        Challenge(
            id = "landmarks_c8",
            categoryId = "landmarks",
            title = "العجائب الجيولوجية والأخاديد الطبيعية",
            themeDescription = "الشلالات العظمى والتشكيلات الصخرية الفريدة في الطبيعة",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 822,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "أخدود عظيم شديد الانحدار حفرته مياه نهر كولورادو في ولاية أريزونا الأمريكية كاشفاً ملياري سنة من تاريخ الأرض",
                    correctAnswer = "غراند",
                    availableLetters = LetterScrambler.buildScrambledLetters("غراند", GameDifficulty.CHALLENGE, listOf("ك", "ا", "ن", "ي", "و", "ن"), seed = 822L),
                    hint = "الأخدود العظيم أو ... كانيون (Grand Canyon)",
                    rewardPoints = 25,
                    explanation = "جراند كانيون يمتد بطول 446 كم ويصل عمقه إلى 1800 متر ويعد أحد أروع النوافذ الجيولوجية على وجه الأرض.",
                    challengeId = "landmarks_c8",
                    challengeTitle = "العجائب الجيولوجية والأخاديد الطبيعية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏞️",
                    visualTheme = "الأخاديد الطبيعية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 823,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "أعلى شلال مائي طبيعي في العالم بارتفاع متواصل يتجاوز 979 متراً ويقع في غابات فنزويلا",
                    correctAnswer = "أنجل",
                    availableLetters = LetterScrambler.buildScrambledLetters("أنجل", GameDifficulty.CHALLENGE, listOf("ن", "ي", "ا", "غ", "ا", "ر"), seed = 823L),
                    hint = "شلالات ... المنسدلة من جبل أيان تيبي المائدة",
                    rewardPoints = 25,
                    explanation = "شلالات أنجل تتدفق من قمة جبل هضبي معزول، وتتبخر قطرات المياه رذاذاً قبل وصولها للأرض في موسم الجفاف.",
                    challengeId = "landmarks_c8",
                    challengeTitle = "العجائب الجيولوجية والأخاديد الطبيعية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "💧",
                    visualTheme = "الشلالات العظمى",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 824,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "أكبر نظام للشعب المرجانية في العالم يمتد لأكثر من ألفي كيلومتر قبالة سواحل كوينزلاند بأستراليا",
                    correctAnswer = "حاجز",
                    availableLetters = LetterScrambler.buildScrambledLetters("حاجز", GameDifficulty.CHALLENGE, listOf("م", "ر", "ج", "ا", "ن", "ي"), seed = 824L),
                    hint = "الـ ... المرجاني العظيم (Great Barrier Reef) المرئي من الفضاء",
                    rewardPoints = 25,
                    explanation = "الحاجز المرجاني العظيم يتكون من مليارات الكائنات الحية الدقيقة ويأوي آلاف الأنواع البحرية النادرة المهددة.",
                    challengeId = "landmarks_c8",
                    challengeTitle = "العجائب الجيولوجية والأخاديد الطبيعية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🐠",
                    visualTheme = "المحميات البحرية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: الأبراج الشاهقة وهندسة الرياح والزلازل (EXPERT)
        Challenge(
            id = "landmarks_c9",
            categoryId = "landmarks",
            title = "الأبراج الشاهقة وهندسة الرياح والزلازل",
            themeDescription = "المخمدات الحركية والتصاميم الالتوائية لأطول ناطحات السحاب",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 825,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "كرة فولاذية عملاقة تزن مئات الأطنان معلقة داخل برج تايبيه 101 لتخميد اهتزازات الأعاصير والزلازل",
                    correctAnswer = "مخمد",
                    availableLetters = LetterScrambler.buildScrambledLetters("مخمد", GameDifficulty.EXPERT, listOf("ب", "ن", "د", "و", "ل", "ث", "ق"), seed = 825L),
                    hint = "يسمى المخمد الكتلي المضبوط (Tuned Mass Damper)",
                    rewardPoints = 30,
                    explanation = "المخمد الكتلي يتحرك عكس اتجاه تأرجح البرج لامتصاص الطاقة الحركية وحماية الهيكل من الانهيار.",
                    challengeId = "landmarks_c9",
                    challengeTitle = "الأبراج الشاهقة وهندسة الرياح والزلازل",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏢",
                    visualTheme = "تخميد الزلازل",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 826,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "برجان توأمان في كوالالمبور بماليزيا كانا الأطول بالعالم حتى 2004 ويربطهما جسر سماوي معلق فريد",
                    correctAnswer = "بتروناس",
                    availableLetters = LetterScrambler.buildScrambledLetters("بتروناس", GameDifficulty.EXPERT, listOf("ك", "و", "ا", "ل", "ا", "ل", "م"), seed = 826L),
                    hint = "صممهما سيزاز بيلي بزخارف هندسية إسلامية ثمانية النجوم",
                    rewardPoints = 30,
                    explanation = "برجا بتروناس يرتفعان 452 متراً وجسرهما السماوي غير مثبت بإحكام ليتيح التمدد والحركة المستقلة لكل برج.",
                    challengeId = "landmarks_c9",
                    challengeTitle = "الأبراج الشاهقة وهندسة الرياح والزلازل",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏙️",
                    visualTheme = "الأبراج التوأم",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 827,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "برج حلزوني ملتوٍ في شنغهاي يعد ثاني أطول مبنى في العالم بزاوية التواء 120 درجة لتشتيت الرياح",
                    correctAnswer = "شنغهاي",
                    availableLetters = LetterScrambler.buildScrambledLetters("شنغهاي", GameDifficulty.EXPERT, listOf("ص", "ي", "ن", "ب", "ك", "ي", "ن"), seed = 827L),
                    hint = "برج ... الذي يرتفع 632 متراً في حي بودونغ المالي",
                    rewardPoints = 30,
                    explanation = "التواء برج شنغهاي يخفض أحمال الرياح بنسبة 24% مما وفر ملايين الدولارات في الفولاذ الإنشائي.",
                    challengeId = "landmarks_c9",
                    challengeTitle = "الأبراج الشاهقة وهندسة الرياح والزلازل",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌪️",
                    visualTheme = "العمارة الالتوائية",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: الآثار الغارقة والمدن الأسطورية (EXPERT)
        Challenge(
            id = "landmarks_c10",
            categoryId = "landmarks",
            title = "الآثار الغارقة والمدن الأسطورية",
            themeDescription = "منارة الإسكندرية وهيراكليون والمدن المغمورة تحت أمواج البحار",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 828,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "إحدى عجائب الدنيا السبع القديمة كانت ترشد السفن في ميناء مصر قبل أن تدمرها الزلازل بالقرون الوسطى",
                    correctAnswer = "منارة",
                    availableLetters = LetterScrambler.buildScrambledLetters("منارة", GameDifficulty.EXPERT, listOf("إ", "س", "ك", "ن", "د", "ر", "ي"), seed = 828L),
                    hint = "فاروس أو ... الإسكندرية التي بنيت في العهد البطلمي",
                    rewardPoints = 35,
                    explanation = "منارة الإسكندرية كانت ترتفع أكثر من مئة متر واستخدمت مرآة عاكسة ضخمة وظلت معلماً بحرياً لأكثر من ألف سنة.",
                    challengeId = "landmarks_c10",
                    challengeTitle = "الآثار الغارقة والمدن الأسطورية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🗼",
                    visualTheme = "عجائب قديمة",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 829,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "مدينة مصرية قديمة غارقة اكتشفت في خليج أبي قير تحت الماء وتعرف أيضاً باسم ثونس",
                    correctAnswer = "هيراكليون",
                    availableLetters = LetterScrambler.buildScrambledLetters("هيراكليون", GameDifficulty.EXPERT, listOf("ك", "ا", "ن", "و", "ب", "س", "م"), seed = 829L),
                    hint = "ميناء مصر الرئيسي للتجارة الإغريقية قبل تأسيس الإسكندرية",
                    rewardPoints = 35,
                    explanation = "مدينة هيراكليون الغارقة كشفت الحفريات البحرية فيها عن تماثيل عملاقة ومعابد وسفن تجارية محفوظة في الطمي.",
                    challengeId = "landmarks_c10",
                    challengeTitle = "الآثار الغارقة والمدن الأسطورية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🌊",
                    visualTheme = "المدن الغارقة",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 830,
                    categoryId = "landmarks",
                    category = "بيت المعالم والأماكن",
                    question = "مدينة أثرية رومانية على خليج نابولي بإيطاليا دفنت تحت الرماد البركاني لبركان فيزوف عام 79م",
                    correctAnswer = "بومبي",
                    availableLetters = LetterScrambler.buildScrambledLetters("بومبي", GameDifficulty.EXPERT, listOf("ه", "ي", "ر", "ك", "و", "ل", "ا"), seed = 830L),
                    hint = "حفظ الرماد شوارعها ومنازلها ورسومها الجدارية بتفاصيلها الكاملة",
                    rewardPoints = 35,
                    explanation = "بومبي تقدم سجلاً تاريخياً أثرياً فريداً للحياة اليومية الرومانية المتجمدة في لحظة ثوران بركاني مباغت.",
                    challengeId = "landmarks_c10",
                    challengeTitle = "الآثار الغارقة والمدن الأسطورية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌋",
                    visualTheme = "المدن المدفونة",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
