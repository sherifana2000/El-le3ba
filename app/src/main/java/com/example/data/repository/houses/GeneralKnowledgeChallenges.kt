package com.example.data.repository.houses

import com.example.data.model.Challenge
import com.example.data.model.GameDifficulty
import com.example.data.model.Puzzle
import com.example.domain.LetterScrambler

object GeneralKnowledgeChallenges {

    val challenges = listOf(
        // Challenge 1: معالم الثقافة والتراث (EXPLORATION)
        Challenge(
            id = "general_knowledge_c1",
            categoryId = "general_knowledge",
            title = "معالم الثقافة والتراث",
            themeDescription = "الرموز الثقافية والتراثية المشتركة في الذاكرة الإنسانية",
            difficulty = GameDifficulty.EXPLORATION,
            questions = listOf(
                Puzzle(
                    id = 1201,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "صرح ثقافي عام يضم آلاف المجلدات والكتب والوثائق للباحثين والقراء وطلاب العلم",
                    correctAnswer = "مكتبة",
                    availableLetters = LetterScrambler.buildScrambledLetters("مكتبة", GameDifficulty.EXPLORATION, listOf("ع", "ل"), seed = 1201L),
                    hint = "خزانة الكتب كدار الكتب والمكتبات العامة",
                    rewardPoints = 15,
                    explanation = "المكتبات منارات المعرفة التي حفظت تراث الأمم من الضياع ونقلت العلوم عبر الأجيال.",
                    challengeId = "general_knowledge_c1",
                    challengeTitle = "معالم الثقافة والتراث",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📚",
                    visualTheme = "خزائن المعرفة",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 1202,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "مبنى مخصص لحفظ وعرض التحف الفنية والآثار التاريخية والمقتنيات النادرة للشعوب",
                    correctAnswer = "متحف",
                    availableLetters = LetterScrambler.buildScrambledLetters("متحف", GameDifficulty.EXPLORATION, listOf("ف", "ن"), seed = 1202L),
                    hint = "المتحف الوطني ومتاحف الآثار",
                    rewardPoints = 15,
                    explanation = "المتاحف صروح تصون الذاكرة التاريخية والفنية وتتيح للزوار معاينة إبداعات الحضارات السابقة.",
                    challengeId = "general_knowledge_c1",
                    challengeTitle = "معالم الثقافة والتراث",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏛️",
                    visualTheme = "المقتنيات والآثار",
                    difficulty = GameDifficulty.EXPLORATION
                ),
                Puzzle(
                    id = 1203,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "معدن نفيس أصفر لامع لا يصدأ استخدمه الإنسان عبر العصور للزينة والعملات واكتناز الثروة",
                    correctAnswer = "ذهب",
                    availableLetters = LetterScrambler.buildScrambledLetters("ذهب", GameDifficulty.EXPLORATION, listOf("ف", "ض", "ة", "م"), seed = 1203L),
                    hint = "المعدن الأصفر الثمين ورمزه الكيميائي Au",
                    rewardPoints = 20,
                    explanation = "الذهب معدن نادر وقابل للسحب والتشكيل واعتبر معياراً عالمياً للقيمة المالية والتجارة الدولية.",
                    challengeId = "general_knowledge_c1",
                    challengeTitle = "معالم الثقافة والتراث",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🪙",
                    visualTheme = "المعادن النفيسة",
                    difficulty = GameDifficulty.EXPLORATION
                )
            )
        ),
        // Challenge 2: الفنون والفكر الإنساني (THINKING)
        Challenge(
            id = "general_knowledge_c2",
            categoryId = "general_knowledge",
            title = "الفنون والفكر الإنساني",
            themeDescription = "إبداعات الرسم والمسرح والفلسفة في خدمة الوعي والمجتمع",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1204,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "أبو الفنون كلها يجمع بين النص والتمثيل المسرحي المباشر أمام الجمهور فوق الخشبة",
                    correctAnswer = "مسرح",
                    availableLetters = LetterScrambler.buildScrambledLetters("مسرح", GameDifficulty.THINKING, listOf("ف", "ن", "و", "ن"), seed = 1204L),
                    hint = "خشبة المسرح والستارة والعرض المسرحي",
                    rewardPoints = 20,
                    explanation = "المسرح من أقدم الفنون التعبيرية التي جسدت قضايا الإنسان وصراعاته الأخلاقية والاجتماعية.",
                    challengeId = "general_knowledge_c2",
                    challengeTitle = "الفنون والفكر الإنساني",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🎭",
                    visualTheme = "أبو الفنون",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1205,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "أداة خشبية ذات أوتار موسيقية تضرب بالريشة وتعد سيدة الآلات الشرقية وأم الطرب",
                    correctAnswer = "عود",
                    availableLetters = LetterScrambler.buildScrambledLetters("عود", GameDifficulty.THINKING, listOf("ن", "غ", "م", "ص"), seed = 1205L),
                    hint = "آلة العود العربي التي برع فيها زرياب والفارابي",
                    rewardPoints = 20,
                    explanation = "العود أساس المقامات الشرقية، وأدخل زرياب الوتر الخامس عليه في بلاط قرطبة الأندلسية.",
                    challengeId = "general_knowledge_c2",
                    challengeTitle = "الفنون والفكر الإنساني",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🪕",
                    visualTheme = "الموسيقى الشرقية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1206,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "علم حب الحكمة والبحث في علل الوجود وحقائق الأشياء بالبرهان العقلي الخالص",
                    correctAnswer = "فلسفة",
                    availableLetters = LetterScrambler.buildScrambledLetters("فلسفة", GameDifficulty.THINKING, listOf("م", "ن", "ط", "ق"), seed = 1206L),
                    hint = "الفلسفة من فيلو (حب) وسوفيا (حكمة)",
                    rewardPoints = 20,
                    explanation = "الفلسفة هي أم العلوم الإنسانية التي انطلقت منها مناهج التفكير النقدي والبحث العلمي المنظم.",
                    challengeId = "general_knowledge_c2",
                    challengeTitle = "الفنون والفكر الإنساني",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🧠",
                    visualTheme = "حب الحكمة",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),
        // Challenge 3: الأوسمة والإنجاز البشري (CHALLENGE)
        Challenge(
            id = "general_knowledge_c3",
            categoryId = "general_knowledge",
            title = "الأوسمة والإنجاز البشري",
            themeDescription = "الجوائز الدولية الكبرى والألعاب التي تجمع شعوب الأرض قاطبة",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 1207,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "أرفع جائزة عالمية سنوية تمنح في السلام والأدب والفيزياء والكيمياء والطب والاقتصاد",
                    correctAnswer = "نوبل",
                    availableLetters = LetterScrambler.buildScrambledLetters("نوبل", GameDifficulty.CHALLENGE, listOf("ج", "ا", "ئ", "ز", "ة", "س"), seed = 1207L),
                    hint = "جوائز نوبل التي أسسها ألفريد نوبل",
                    rewardPoints = 25,
                    explanation = "جوائز نوبل تكرم منذ عام 1901 الشخصيات التي قدمت أعظم الخدمات للبشرية في شتى الميادين.",
                    challengeId = "general_knowledge_c3",
                    challengeTitle = "الأوسمة والإنجاز البشري",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏅",
                    visualTheme = "الجوائز العالمية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1208,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "أكبر دورة ألعاب رياضية دولية تقام كل أربع سنوات وتجمع رياضيين من شتى بلدان الكوكب",
                    correctAnswer = "أولمبياد",
                    availableLetters = LetterScrambler.buildScrambledLetters("أولمبياد", GameDifficulty.CHALLENGE, listOf("ر", "ي", "ا", "ض", "ة", "ك"), seed = 1208L),
                    hint = "الألعاب الأولمبية وشعلتها التاريخية",
                    rewardPoints = 25,
                    explanation = "الأولمبياد بدأ في أثينا القديمة وأعيد إحياؤه عام 1896 لترسيخ الصداقة والتنافس الشريف بين الأمم.",
                    challengeId = "general_knowledge_c3",
                    challengeTitle = "الأوسمة والإنجاز البشري",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏃",
                    visualTheme = "الرياضة الدولية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1209,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "منظمة أممية تابعة للأمم المتحدة تعنى بحماية التراث والتربية والعلوم والثقافة العالمية",
                    correctAnswer = "يونسكو",
                    availableLetters = LetterScrambler.buildScrambledLetters("يونسكو", GameDifficulty.CHALLENGE, listOf("ت", "ر", "ا", "ث", "ع", "ا"), seed = 1209L),
                    hint = "منظمة اليونسكو لحماية الآثار والتراث",
                    rewardPoints = 25,
                    explanation = "اليونسكو تدير قائمة التراث العالمي لحماية الصروح الطبيعية والثقافية الاستثنائية للبشرية جمعاء.",
                    challengeId = "general_knowledge_c3",
                    challengeTitle = "الأوسمة والإنجاز البشري",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌐",
                    visualTheme = "التراث العالمي",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 4: الفلسفة الكلاسيكية وتاريخ الأفكار (THINKING)
        Challenge(
            id = "general_knowledge_c4",
            categoryId = "general_knowledge",
            title = "الفلسفة الكلاسيكية وتاريخ الأفكار",
            themeDescription = "سقراط وأفلاطون والفضائل الأخلاقية في التفكير الإنساني",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1210,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "فيلسوف يوناني حكيم لم يكتب كتباً واشتهر بمنهج التوليد والحوار والمساءلة وأعدم بتجرع السم",
                    correctAnswer = "سقراط",
                    availableLetters = LetterScrambler.buildScrambledLetters("سقراط", GameDifficulty.THINKING, listOf("أ", "ر", "س", "ط", "و"), seed = 1210L),
                    hint = "صاحب المقولة الشهيرة: اعرف نفسك بنفسك والحياة غير المفحوصة لا تستحق العيش",
                    rewardPoints = 20,
                    explanation = "سقراط نزل بالفلسفة من السماء والكون إلى الأرض وسلوك الإنسان وأخلاقه وعدالته في أثينا.",
                    challengeId = "general_knowledge_c4",
                    challengeTitle = "الفلسفة الكلاسيكية وتاريخ الأفكار",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏛️",
                    visualTheme = "حكماء اليونان",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1211,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "فيلسوف يوناني أسس الأكاديمية وكتب محاورات الجمهورية وطرح نظرية المثل العليا في كهفه الشهير",
                    correctAnswer = "أفلاطون",
                    availableLetters = LetterScrambler.buildScrambledLetters("أفلاطون", GameDifficulty.THINKING, listOf("ط", "ا", "ل", "ي", "س"), seed = 1211L),
                    hint = "تلميذ سقراط ومعلم أرسطو ومؤسس الفلسفة المثالية",
                    rewardPoints = 20,
                    explanation = "أفلاطون رأى أن العالم الحسي مجرد ظلال مشوهة لعالم المثل والحقائق الثابتة في الوجود.",
                    challengeId = "general_knowledge_c4",
                    challengeTitle = "الفلسفة الكلاسيكية وتاريخ الأفكار",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📜",
                    visualTheme = "عالم المثل",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1212,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "فيلسوف يوناني عظيم لقب بالمعلم الأول وصنف العلوم ووضع أسس المنطق الصوري والأخلاق والبيولوجيا",
                    correctAnswer = "أرسطو",
                    availableLetters = LetterScrambler.buildScrambledLetters("أرسطو", GameDifficulty.THINKING, listOf("ف", "ي", "ث", "ا", "غ"), seed = 1212L),
                    hint = "مؤسس المدرسة المشائية ومعلم الإسكندر الأكبر",
                    rewardPoints = 20,
                    explanation = "أرسطو كان موسوعة بشرية جمعت معارف عصره وظلت كتبه المرجع الأكبر لعلماء الشرق والغرب لقرون.",
                    challengeId = "general_knowledge_c4",
                    challengeTitle = "الفلسفة الكلاسيكية وتاريخ الأفكار",
                    questionIndexInChallenge = 3,
                    visualEmoji = "📚",
                    visualTheme = "المعلم الأول",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 5: المقامات الموسيقية والآلات الشرقية (THINKING)
        Challenge(
            id = "general_knowledge_c5",
            categoryId = "general_knowledge",
            title = "المقامات الموسيقية والآلات الشرقية",
            themeDescription = "السلم الموسيقي والمقامات العربية والآلات الوترية",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1213,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "آلة وترية غربية كلاسيكية ذات صندوق خشبي عريض وأربعة أوتار تعزف بالقوس بين ركبتي العازف",
                    correctAnswer = "تشيللو",
                    availableLetters = LetterScrambler.buildScrambledLetters("تشيللو", GameDifficulty.THINKING, listOf("ك", "م", "ا", "ن", "ق"), seed = 1213L),
                    hint = "آلة الفيولونسيل ذات الصوت الدافئ الرخيم الأعمق من الكمان",
                    rewardPoints = 20,
                    explanation = "التشيللو ركيزة أساسية في أوركسترا الموسيقى الكلاسيكية والرباعي الوتري بصوته الشجي القريب من الصوت البشري.",
                    challengeId = "general_knowledge_c5",
                    challengeTitle = "المقامات الموسيقية والآلات الشرقية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🎵",
                    visualTheme = "الآلات الوترية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1214,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "آلة وترية مسطحة على شكل شبه منحرف تضم أكثر من سبعين وتراً تعزف بالريشتين وتغطي كل المقامات",
                    correctAnswer = "قانون",
                    availableLetters = LetterScrambler.buildScrambledLetters("قانون", GameDifficulty.THINKING, listOf("س", "ن", "ط", "و"), seed = 1214L),
                    hint = "يسمى دستور الموسيقى الشرقية لقدرته على إظهار أرباع التون",
                    rewardPoints = 20,
                    explanation = "القانون يمتاز بوجود العربات المعدنية الصغيرة التي تتيح للعازف تحويل النغمات بدقة فائقة أثناء العزف.",
                    challengeId = "general_knowledge_c5",
                    challengeTitle = "المقامات الموسيقية والآلات الشرقية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🎶",
                    visualTheme = "دستور الأوتار",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1215,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "مقام موسيقي شرقي أساسي يمتاز بالبهجة والوضوح ويبدأ من درجة دو ويعادل السلم الكبير في الغرب",
                    correctAnswer = "عجم",
                    availableLetters = LetterScrambler.buildScrambledLetters("عجم", GameDifficulty.THINKING, listOf("ن", "ه", "ا", "و"), seed = 1215L),
                    hint = "أحد فروع مقولة (صنع بسحر) للمقامات ولا يحتوي على أرباع تون",
                    rewardPoints = 20,
                    explanation = "مقام العجم يعبر عن الفرح والشموخ وتلحن به معظم الأناشيد الوطنية والمارشات الحماسية في العالم العربي.",
                    challengeId = "general_knowledge_c5",
                    challengeTitle = "المقامات الموسيقية والآلات الشرقية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🎼",
                    visualTheme = "المقامات الموسيقية",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 6: الرياضات العالمية والتقاليد الأولمبية (THINKING)
        Challenge(
            id = "general_knowledge_c6",
            categoryId = "general_knowledge",
            title = "الرياضات العالمية والتقاليد الأولمبية",
            themeDescription = "تاريخ الماراثون والشعلة الأولمبية والألعاب الدولية الكبرى",
            difficulty = GameDifficulty.THINKING,
            questions = listOf(
                Puzzle(
                    id = 1216,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "سباق ركض طويل وشاق تبلغ مسافته المحددة رسمياً 42 كيلومتراً و 195 متراً مستوحى من أسطورة يونانية",
                    correctAnswer = "ماراثون",
                    availableLetters = LetterScrambler.buildScrambledLetters("ماراثون", GameDifficulty.THINKING, listOf("س", "ب", "ا", "ق"), seed = 1216L),
                    hint = "تيمناً بالجندي فيديبيدس الذي ركض من سهل ماراثون إلى أثينا لإعلان النصر",
                    rewardPoints = 20,
                    explanation = "سباق الماراثون يمثل الاختبار الأقسى لتحمل الرياضيين وتختتم به منافسات دورات الألعاب الأولمبية الصيفية.",
                    challengeId = "general_knowledge_c6",
                    challengeTitle = "الرياضات العالمية والتقاليد الأولمبية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🏃",
                    visualTheme = "سباقات التحمل",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1217,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "رمز أولمبي يضاء في أولمبيا باليونان بأشعة الشمس عبر مرآة مقعرة ويطوف العالم قبل افتتاح الألعاب",
                    correctAnswer = "شعلة",
                    availableLetters = LetterScrambler.buildScrambledLetters("شعلة", GameDifficulty.THINKING, listOf("ن", "ا", "ر", "و"), seed = 1217L),
                    hint = "الـ ... الأولمبية المقدسة التي تبقى مشتعلة طوال الدورة",
                    rewardPoints = 20,
                    explanation = "الشعلة الأولمبية ترمز إلى السلام والروح الرياضية واستمرارية التقاليد الأولمبية القديمة في العصر الحديث.",
                    challengeId = "general_knowledge_c6",
                    challengeTitle = "الرياضات العالمية والتقاليد الأولمبية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🔥",
                    visualTheme = "الرموز الأولمبية",
                    difficulty = GameDifficulty.THINKING
                ),
                Puzzle(
                    id = 1218,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "لعبة استراتيجية عريقة تلعب على رقعة مربعة مقسمة إلى 64 مربعاً بين جيشين أبيض وأسود",
                    correctAnswer = "شطرنج",
                    availableLetters = LetterScrambler.buildScrambledLetters("شطرنج", GameDifficulty.THINKING, listOf("ط", "ا", "و", "ل"), seed = 1218L),
                    hint = "هدفها إسقاط ملك الخصم بعبارة (كش ملك)",
                    rewardPoints = 20,
                    explanation = "الشطرنج يلقب بلعبة الملوك ويطور التفكير الاستراتيجي والتحليل التكتيكي والتخطيط المسبق.",
                    challengeId = "general_knowledge_c6",
                    challengeTitle = "الرياضات العالمية والتقاليد الأولمبية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "♟️",
                    visualTheme = "ألعاب الذكاء",
                    difficulty = GameDifficulty.THINKING
                )
            )
        ),

        // Challenge 7: مدارس الفن التشكيلي وأشهر اللوحات (CHALLENGE)
        Challenge(
            id = "general_knowledge_c7",
            categoryId = "general_knowledge",
            title = "مدارس الفن التشكيلي وأشهر اللوحات",
            themeDescription = "الانطباعية والتكعيبية والموناليزا وليلة النجوم",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 1219,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "أشهر لوحة فنية بورتريه في العالم رسمها ليوناردو دافنشي في القرن السادس عشر وابتسامتها حيرت النقاد",
                    correctAnswer = "موناليزا",
                    availableLetters = LetterScrambler.buildScrambledLetters("موناليزا", GameDifficulty.CHALLENGE, listOf("ج", "و", "ك", "و", "ن", "د"), seed = 1219L),
                    hint = "تعرض في متحف اللوفر بباريس وتعرف بالجينوكندا",
                    rewardPoints = 25,
                    explanation = "الموناليزا تتميز بتقنية التدرج اللوني الشفاف (السفوماتو) والنظرة البصرية التي تلاحق المشاهد من كل زاوية.",
                    challengeId = "general_knowledge_c7",
                    challengeTitle = "مدارس الفن التشكيلي وأشهر اللوحات",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🎨",
                    visualTheme = "روائع الرسم",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1220,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "مدرسة فنية ثورية أسسها بيكاسو وبراك في باريس تفكك الأشياء إلى أشكال هندسية متعددة الزوايا في وقت واحد",
                    correctAnswer = "تكعيبية",
                    availableLetters = LetterScrambler.buildScrambledLetters("تكعيبية", GameDifficulty.CHALLENGE, listOf("ت", "ج", "ر", "ي", "د", "ي"), seed = 1220L),
                    hint = "رفضت المنظور الكلاسيكي ذي النقطة الواحدة",
                    rewardPoints = 25,
                    explanation = "المدرسة التكعيبية أعادت تعريف الفن الحديث برسم الأجسام من زوايا مختلفة في مستوى واحد مسطح.",
                    challengeId = "general_knowledge_c7",
                    challengeTitle = "مدارس الفن التشكيلي وأشهر اللوحات",
                    questionIndexInChallenge = 2,
                    visualEmoji = "📐",
                    visualTheme = "الفن الحديث",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1221,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "لوحة ليلية مضطربة شهيرة رسمها فنسنت فان غوخ بدوامات سماء صفراء وزرقاء فوق قرية بسانت ريمي",
                    correctAnswer = "نجوم",
                    availableLetters = LetterScrambler.buildScrambledLetters("نجوم", GameDifficulty.CHALLENGE, listOf("ل", "ي", "ل", "ة", "ق", "م"), seed = 1221L),
                    hint = "لوحة ليلة الـ ... (The Starry Night) المعروضة بمتحف موما بنيويورك",
                    rewardPoints = 25,
                    explanation = "فان غوخ رسم ليلة النجوم من نافذة مشفاه وتعبر دوامات ألوانها عن اضطراب النفس وتدفق تيارات الهواء الفيزيائية.",
                    challengeId = "general_knowledge_c7",
                    challengeTitle = "مدارس الفن التشكيلي وأشهر اللوحات",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🌌",
                    visualTheme = "الفن ما بعد الانطباعي",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 8: الأسواق المالية والنظم الاقتصادية (CHALLENGE)
        Challenge(
            id = "general_knowledge_c8",
            categoryId = "general_knowledge",
            title = "الأسواق المالية والنظم الاقتصادية",
            themeDescription = "التضخم والفائدة وأسواق الأسهم والعملات الموحدة",
            difficulty = GameDifficulty.CHALLENGE,
            questions = listOf(
                Puzzle(
                    id = 1222,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "الارتفاع المستمر والشامل في المستوى العام لأسعار السلع والخدمات وتراجع القوة الشرائية للنقود",
                    correctAnswer = "تضخم",
                    availableLetters = LetterScrambler.buildScrambledLetters("تضخم", GameDifficulty.CHALLENGE, listOf("ر", "ك", "ا", "د", "ف", "ق"), seed = 1222L),
                    hint = "ظاهرة اقتصادية يحاربها البنك المركزي برفع أسعار الفائدة",
                    rewardPoints = 25,
                    explanation = "التضخم يحدث عندما يتجاوز حجم الطلب الكلي المعروض السلعي أو عند ارتفاع تكاليف الإنتاج وسلاسل الإمداد.",
                    challengeId = "general_knowledge_c8",
                    challengeTitle = "الأسواق المالية والنظم الاقتصادية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📉",
                    visualTheme = "المفاهيم الاقتصادية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1223,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "سوق مالي منظم يتم فيه تداول وشراء وبيع أسهم الشركات وسندات الدين بين المستثمرين",
                    correctAnswer = "بورصة",
                    availableLetters = LetterScrambler.buildScrambledLetters("بورصة", GameDifficulty.CHALLENGE, listOf("م", "ص", "ر", "ف", "ب", "ن"), seed = 1223L),
                    hint = "تسمى سوق الأوراق المالية ومن أشهرها بورصة نيويورك وول ستريت",
                    rewardPoints = 25,
                    explanation = "البورصة تمثل مرآة النشاط الاقتصادي وتوفر للشركات السيولة اللازمة للتوسع عبر طرح أسهمها للاكتتاب العام.",
                    challengeId = "general_knowledge_c8",
                    challengeTitle = "الأسواق المالية والنظم الاقتصادية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🏛️",
                    visualTheme = "الأسواق المالية",
                    difficulty = GameDifficulty.CHALLENGE
                ),
                Puzzle(
                    id = 1224,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "العملة النقدية الرسمية الموحدة المستخدمة في أغلب دول الاتحاد الأوروبي وبدأ التداول بها عام 2002م",
                    correctAnswer = "يورو",
                    availableLetters = LetterScrambler.buildScrambledLetters("يورو", GameDifficulty.CHALLENGE, listOf("د", "و", "ل", "ا", "ر", "ج"), seed = 1224L),
                    hint = "ثاني أهم عملة احتياطية في العالم بعد الدولار الأمريكي",
                    rewardPoints = 25,
                    explanation = "اليورو وحّد السياسة النقدية لمنطقة اليورو تحت مظلة البنك المركزي الأوروبي في فرانكفورت.",
                    challengeId = "general_knowledge_c8",
                    challengeTitle = "الأسواق المالية والنظم الاقتصادية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "💶",
                    visualTheme = "العملات العالمية",
                    difficulty = GameDifficulty.CHALLENGE
                )
            )
        ),

        // Challenge 9: علم الإنسان وتطور الثقافات البشرية (EXPERT)
        Challenge(
            id = "general_knowledge_c9",
            categoryId = "general_knowledge",
            title = "علم الإنسان وتطور الثقافات البشرية",
            themeDescription = "الأنثروبولوجيا الثقافية والطقوس والعادات الاجتماعية في المجتمعات القديمة",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 1225,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "علم شامل يدرس الإنسان وتطوره البيولوجي والثقافي واللغوي وعاداته الاجتماعية عبر العصور",
                    correctAnswer = "أنثروبولوجيا",
                    availableLetters = LetterScrambler.buildScrambledLetters("أنثروبولوجيا", GameDifficulty.EXPERT, listOf("س", "و", "س", "ي", "و", "ل"), seed = 1225L),
                    hint = "يعرف بالعربية بعلم الإنسان أو علم الأناسة",
                    rewardPoints = 30,
                    explanation = "الأنثروبولوجيا تنقسم إلى فرع حيوي فيزيائي وفرع ثقافي اجتماعي يدرس بنية الأساطير والقرابة والطقوس.",
                    challengeId = "general_knowledge_c9",
                    challengeTitle = "علم الإنسان وتطور الثقافات البشرية",
                    questionIndexInChallenge = 1,
                    visualEmoji = "🗿",
                    visualTheme = "علم الإنسان",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1226,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "رمز مقدس يتخذه مجتمع قبلي بدائي كشعار يمثل رابطة الدم والروح وعادة ما يكون حيواناً أو نباتاً",
                    correctAnswer = "طوطم",
                    availableLetters = LetterScrambler.buildScrambledLetters("طوطم", GameDifficulty.EXPERT, listOf("ص", "ن", "م", "و", "ث", "ن"), seed = 1226L),
                    hint = "أعمدة الـ ... المنحوتة لدى قبائل الهنود الحمر في أمريكا الشمالية",
                    rewardPoints = 30,
                    explanation = "الطوطمية ترتبط بمحرمات التابو التي تنظم الزواج والصيد وتعزز التضامن الاجتماعي داخل العشيرة الواحدة.",
                    challengeId = "general_knowledge_c9",
                    challengeTitle = "علم الإنسان وتطور الثقافات البشرية",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🪵",
                    visualTheme = "الرموز القبلية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1227,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "طقس احتفالي تقليدي لتبادل الهدايا وإتلاف الثروات بسخاء للتنافس على المكانة الاجتماعية بين قبائل الساحل",
                    correctAnswer = "بوتلاش",
                    availableLetters = LetterScrambler.buildScrambledLetters("بوتلاش", GameDifficulty.EXPERT, listOf("ك", "و", "ل", "ا", "م", "ا", "ن"), seed = 1227L),
                    hint = "طقس الـ ... الشهير في دراسات فرانز بواس الأنثروبولوجية",
                    rewardPoints = 30,
                    explanation = "البوتلاش يمثل نظاماً اقتصادياً رمزياً يعيد توزيع الثروات بين أفراد المجتمع ويحدد التراتبية القيادية.",
                    challengeId = "general_knowledge_c9",
                    challengeTitle = "علم الإنسان وتطور الثقافات البشرية",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🎁",
                    visualTheme = "الطقوس التراثية",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        ),

        // Challenge 10: صون التراث الإنساني ومخطوطات الذاكرة (EXPERT)
        Challenge(
            id = "general_knowledge_c10",
            categoryId = "general_knowledge",
            title = "صون التراث الإنساني ومخطوطات الذاكرة",
            themeDescription = "سجل ذاكرة العالم واتفاقيات حماية التراث الثقافي غير المادي",
            difficulty = GameDifficulty.EXPERT,
            questions = listOf(
                Puzzle(
                    id = 1228,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "برنامج دولي تابع لمنظمة اليونسكو أنشئ عام 1992 لحماية الوثائق والمخطوطات التاريخية من التلف والنسيان",
                    correctAnswer = "ذاكرة",
                    availableLetters = LetterScrambler.buildScrambledLetters("ذاكرة", GameDifficulty.EXPERT, listOf("س", "ج", "ل", "ع", "ا", "ل", "م"), seed = 1228L),
                    hint = "برنامج ... العالم (Memory of the World)",
                    rewardPoints = 35,
                    explanation = "سجل ذاكرة العالم يوثق نوادر المخطوطات والخرائط والتسجيلات الصوتية المعرضة لخطر الاندثار في المكتبات.",
                    challengeId = "general_knowledge_c10",
                    challengeTitle = "صون التراث الإنساني ومخطوطات الذاكرة",
                    questionIndexInChallenge = 1,
                    visualEmoji = "📜",
                    visualTheme = "ذاكرة البشرية",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1229,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "اتفاقية دولية وقعت في لاهاي عام 1954م لحماية الممتلكات والمتاحف والآثار الثقافية أثناء النزاعات المسلحة",
                    correctAnswer = "لاهاي",
                    availableLetters = LetterScrambler.buildScrambledLetters("لاهاي", GameDifficulty.EXPERT, listOf("ج", "ن", "ي", "ف", "ر", "و", "م"), seed = 1229L),
                    hint = "تضع شعار الدرع الأزرق على المباني التاريخية المحمية من القصف",
                    rewardPoints = 35,
                    explanation = "اتفاقية لاهاي تجرم الاعتداء المتعمد على المواقع التراثية وتعتبر تخريبها جريمة حرب بموجب القانون الجنائي الدولي.",
                    challengeId = "general_knowledge_c10",
                    challengeTitle = "صون التراث الإنساني ومخطوطات الذاكرة",
                    questionIndexInChallenge = 2,
                    visualEmoji = "🛡️",
                    visualTheme = "حماية التراث",
                    difficulty = GameDifficulty.EXPERT
                ),
                Puzzle(
                    id = 1230,
                    categoryId = "general_knowledge",
                    category = "بيت الثقافة والمعرفة العامة",
                    question = "العناصر التعبيرية والممارسات والمهارات الحية كالرقصات والأمثال والحرف التي تتوارثها الأجيال شفهياً",
                    correctAnswer = "لامادي",
                    availableLetters = LetterScrambler.buildScrambledLetters("لامادي", GameDifficulty.EXPERT, listOf("م", "ل", "م", "و", "س", "ح", "ي"), seed = 1230L),
                    hint = "التراث الثقافي غير المادي (أو الـ ...)",
                    rewardPoints = 35,
                    explanation = "اتفاقية صون التراث الثقافي غير المادي لعام 2003 تضمن استمرار الحرف الشعبية وفنون الرواية والموسيقى التقليدية.",
                    challengeId = "general_knowledge_c10",
                    challengeTitle = "صون التراث الإنساني ومخطوطات الذاكرة",
                    questionIndexInChallenge = 3,
                    visualEmoji = "🎭",
                    visualTheme = "التراث الشفهي",
                    difficulty = GameDifficulty.EXPERT
                )
            )
        )
    )
}
