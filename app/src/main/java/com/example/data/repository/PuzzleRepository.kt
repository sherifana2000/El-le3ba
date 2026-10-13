package com.example.data.repository

import com.example.data.model.Puzzle
import com.example.data.model.PuzzleCategory

/**
 * Scalable in-memory repository providing educational puzzles organized across multiple educational Houses.
 */
object PuzzleRepository {

    // ------------------------------------------------------------------------
    // 1. CARS & TRANSPORTATION — بيت السيارات والمواصلات
    // ------------------------------------------------------------------------
    private val carsPuzzles = listOf(
        Puzzle(
            id = 1,
            categoryId = "cars",
            category = "بيت السيارات والمواصلات",
            question = "مركبة برية تسير على أربع عجلات مخصصة لنقل الركاب",
            correctAnswer = "سيارة",
            availableLetters = listOf("س", "ي", "ا", "ر", "ة", "ق", "ط", "م"),
            hint = "تبدأ بحرف السين وتنتهي بالتاء المربوطة",
            rewardPoints = 15
        ),
        Puzzle(
            id = 2,
            categoryId = "cars",
            category = "بيت السيارات والمواصلات",
            question = "وسيلة نقل جوية عملاقة تحلق بين المدن والدول عبر الأجواء",
            correctAnswer = "طائرة",
            availableLetters = listOf("ط", "ا", "ئ", "ر", "ة", "س", "ف", "ن"),
            hint = "تطير بجناحين في أعالي السماء",
            rewardPoints = 15
        ),
        Puzzle(
            id = 3,
            categoryId = "cars",
            category = "بيت السيارات والمواصلات",
            question = "مركبة ضخمة تسير على قضبان حديدية تجر عربات متعددة",
            correctAnswer = "قطار",
            availableLetters = listOf("ق", "ط", "ا", "ر", "م", "ح", "ك", "س"),
            hint = "ينطلق على السكة الحديدية مسافراً بين المحطات",
            rewardPoints = 10
        ),
        Puzzle(
            id = 4,
            categoryId = "cars",
            category = "بيت السيارات والمواصلات",
            question = "مركب بحري كبير يجوب البحار والمحيطات لنقل المسافرين والبضائع",
            correctAnswer = "سفينة",
            availableLetters = listOf("س", "ف", "ي", "ن", "ة", "ب", "ح", "ر"),
            hint = "تطفو فوق أمواج اليم وتبحر بالموانئ",
            rewardPoints = 15
        ),
        Puzzle(
            id = 5,
            categoryId = "cars",
            category = "بيت السيارات والمواصلات",
            question = "مركبة ذات عجلتين تعتمد على دفع الساقين بالدواسات",
            correctAnswer = "دراجة",
            availableLetters = listOf("د", "ر", "ا", "ج", "ة", "ع", "ب", "ل"),
            hint = "رياضية خفيفة وصديقة للبيئة",
            rewardPoints = 15
        ),
        Puzzle(
            id = 6,
            categoryId = "cars",
            category = "بيت السيارات والمواصلات",
            question = "قلب السيارة النابض الذي يولد القوة والحركة من الوقود أو الكهرباء",
            correctAnswer = "محرك",
            availableLetters = listOf("م", "ح", "ر", "ك", "ز", "ي", "ت", "د"),
            hint = "مصدر الطاقة والعزم الأساسي للمركبة",
            rewardPoints = 10
        ),
        Puzzle(
            id = 7,
            categoryId = "cars",
            category = "بيت السيارات والمواصلات",
            question = "حافلة كبيرة مخصصة لنقل مجموعات الطلاب أو المسافرين في المدينة",
            correctAnswer = "حافلة",
            availableLetters = listOf("ح", "ا", "ف", "ل", "ة", "ب", "ص", "د"),
            hint = "تتسع لعدد كبير من المقاعد والركاب",
            rewardPoints = 15
        ),
        Puzzle(
            id = 8,
            categoryId = "cars",
            category = "بيت السيارات والمواصلات",
            question = "مسار مسفلت وممهد تسير عليه الحافلات والسيارات بين المدن",
            correctAnswer = "طريق",
            availableLetters = listOf("ط", "ر", "ي", "ق", "ج", "س", "ح", "م"),
            hint = "شريان المواصلات البرية المسفلت",
            rewardPoints = 10
        ),
        Puzzle(
            id = 9,
            categoryId = "cars",
            category = "بيت السيارات والمواصلات",
            question = "مركبة فضائية تنطلق خارج الغلاف الجوي لاستكشاف المدارات والنجوم",
            correctAnswer = "صاروخ",
            availableLetters = listOf("ص", "ا", "ر", "و", "خ", "ف", "ض", "ك"),
            hint = "يندفع بقوة نفث هائلة نحو الفضاء السحيق",
            rewardPoints = 20
        ),
        Puzzle(
            id = 10,
            categoryId = "cars",
            category = "بيت السيارات والمواصلات",
            question = "جزء دائري مطاطي يرتكز عليه هيكل السيارة ويدور على الطريق",
            correctAnswer = "عجلة",
            availableLetters = listOf("ع", "ج", "ل", "ة", "د", "ا", "ئ", "ر"),
            hint = "تدور بانسيابية لتتحرك المركبة إلى الأمام",
            rewardPoints = 15
        )
    )

    // ------------------------------------------------------------------------
    // 2. SCIENCE — بيت العلوم
    // ------------------------------------------------------------------------
    private val sciencePuzzles = listOf(
        Puzzle(
            id = 11,
            categoryId = "science",
            category = "بيت العلوم",
            question = "الوحدة البنائية والوظيفية الأساسية لجميع الكائنات الحية",
            correctAnswer = "خلية",
            availableLetters = listOf("خ", "ل", "ي", "ة", "ن", "و", "ا", "ت"),
            hint = "تحتوي على غشاء ونواة وسيتوبلازم",
            rewardPoints = 15
        ),
        Puzzle(
            id = 12,
            categoryId = "science",
            category = "بيت العلوم",
            question = "أصغر جزء من العنصر الكيميائي يحتفظ بخصائصه ويتكون من نواة وإلكترونات",
            correctAnswer = "ذرة",
            availableLetters = listOf("ذ", "ر", "ة", "ج", "ز", "ي", "ء", "ن"),
            hint = "تحتوي في نواتها على بروتونات ونيوترونات",
            rewardPoints = 10
        ),
        Puzzle(
            id = 13,
            categoryId = "science",
            category = "بيت العلوم",
            question = "القدرة على بذل شغل وتوجد في أشكال كالحرارية والحركية والكهربائية",
            correctAnswer = "طاقة",
            availableLetters = listOf("ط", "ا", "ق", "ة", "ش", "م", "س", "ح"),
            hint = "المبدأ الفيزيائي: لا تفنى ولا تستحدث من العدم",
            rewardPoints = 15
        ),
        Puzzle(
            id = 14,
            categoryId = "science",
            category = "بيت العلوم",
            question = "القوة الكونية التي تشد الأجسام نحو مركز الأرض أو الكتل الكبرى",
            correctAnswer = "جاذبية",
            availableLetters = listOf("ج", "ا", "ذ", "ب", "ي", "ة", "أ", "ر"),
            hint = "صاغ قوانينها الفيزيائي إسحاق نيوتن",
            rewardPoints = 15
        ),
        Puzzle(
            id = 15,
            categoryId = "science",
            category = "بيت العلوم",
            question = "جهاز علمي بصري يُستخدم لتكبير الكائنات الدقيقة التي لا تُرى بالعين المجردة",
            correctAnswer = "مجهر",
            availableLetters = listOf("م", "ج", "ه", "ر", "ع", "د", "س", "ة"),
            hint = "أداة أساسية في مختبرات علم الأحياء",
            rewardPoints = 10
        ),
        Puzzle(
            id = 16,
            categoryId = "science",
            category = "بيت العلوم",
            question = "إشعاع كهرومغناطيسي يمكن للعين البشرية رؤيته ويسير بسرعة فائقة",
            correctAnswer = "ضوء",
            availableLetters = listOf("ض", "و", "ء", "ش", "ع", "ا", "ع", "ل"),
            hint = "سرعته في الفراغ تقارب 300 ألف كيلومتر في الثانية",
            rewardPoints = 10
        ),
        Puzzle(
            id = 17,
            categoryId = "science",
            category = "بيت العلوم",
            question = "شكل من أشكال الطاقة ينتقل تلقائياً من الجسم الساخن إلى الجسم الأبرد",
            correctAnswer = "حرارة",
            availableLetters = listOf("ح", "ر", "ا", "ر", "ة", "ب", "ر", "د"),
            hint = "تُقاس بالدرجات المئوية أو الفهرنهايت",
            rewardPoints = 15
        ),
        Puzzle(
            id = 18,
            categoryId = "science",
            category = "بيت العلوم",
            question = "علم المادة وتفاعلاتها وتركيبها وبنيتها وتحولاتها المختلفة",
            correctAnswer = "كيمياء",
            availableLetters = listOf("ك", "ي", "م", "ي", "ا", "ء", "ع", "ن"),
            hint = "يدرس العناصر الكيميائية والتفاعلات والروابط",
            rewardPoints = 15
        ),
        Puzzle(
            id = 19,
            categoryId = "science",
            category = "بيت العلوم",
            question = "جسم ينتج حقلاً قادراً على جذب برادة الحديد والمعادن المغناطيسية",
            correctAnswer = "مغناطيس",
            availableLetters = listOf("م", "غ", "ن", "ا", "ط", "ي", "س", "ح"),
            hint = "يمتلك قطبين متميزين: شمالي وجنوبي",
            rewardPoints = 20
        ),
        Puzzle(
            id = 20,
            categoryId = "science",
            category = "بيت العلوم",
            question = "عملية حيوية يحصل بها الكائن الحي على الأكسجين ويطلق ثاني أكسيد الكربون",
            correctAnswer = "تنفس",
            availableLetters = listOf("ت", "ن", "ف", "س", "ه", "و", "ا", "ء"),
            hint = "شهيق وزفير عبر الرئتين في الجهاز التنفسي",
            rewardPoints = 15
        )
    )

    // ------------------------------------------------------------------------
    // 3. ASTRONOMY & SPACE — بيت الفلك والفضاء
    // ------------------------------------------------------------------------
    private val astronomyPuzzles = listOf(
        Puzzle(
            id = 21,
            categoryId = "astronomy",
            category = "بيت الفلك والفضاء",
            question = "جرم سماوي معتم يدور في مدار محدد حول نجم مثل كوكب الأرض",
            correctAnswer = "كوكب",
            availableLetters = listOf("ك", "و", "ك", "ب", "ش", "م", "س", "ن"),
            hint = "منها عطارد والزهرة والمريخ والمشتري",
            rewardPoints = 15
        ),
        Puzzle(
            id = 22,
            categoryId = "astronomy",
            category = "بيت الفلك والفضاء",
            question = "تجمع كوني هائل يضم مليارات النجوم والغاز والغبار الكوني",
            correctAnswer = "مجرة",
            availableLetters = listOf("م", "ج", "ر", "ة", "س", "م", "ا", "ء"),
            hint = "مجرتنا الأم هي مجرة درب التبانة",
            rewardPoints = 15
        ),
        Puzzle(
            id = 23,
            categoryId = "astronomy",
            category = "بيت الفلك والفضاء",
            question = "كتلة صخرية أو معدنية تسبح في الفضاء وتصل إلى سطح الأرض",
            correctAnswer = "نيزك",
            availableLetters = listOf("ن", "ي", "ز", "ك", "ش", "ه", "ا", "ب"),
            hint = "يخترق الغلاف الجوي ويترك أثراً عند اصطدامه",
            rewardPoints = 15
        ),
        Puzzle(
            id = 24,
            categoryId = "astronomy",
            category = "بيت الفلك والفضاء",
            question = "جرم جليدي وصخري يدور حول الشمس ويظهر له ذيل غازي مضيء",
            correctAnswer = "مذنب",
            availableLetters = listOf("م", "ذ", "ن", "ب", "ج", "ل", "ي", "د"),
            hint = "أشهرها مذنب هالي الذي يقترب دورياً",
            rewardPoints = 15
        ),
        Puzzle(
            id = 25,
            categoryId = "astronomy",
            category = "بيت الفلك والفضاء",
            question = "تابع طبيعي يدور حول كوكب الأرض ويعكس ضوء الشمس ليلاً",
            correctAnswer = "قمر",
            availableLetters = listOf("ق", "م", "ر", "ه", "ل", "ا", "ل", "ب"),
            hint = "يتدرج في أطوار من الهلال إلى البدر",
            rewardPoints = 10
        ),
        Puzzle(
            id = 26,
            categoryId = "astronomy",
            category = "بيت الفلك والفضاء",
            question = "سحابة فضائية ضخمة من الغازات والغبار الكوني تولد منها النجوم",
            correctAnswer = "سديم",
            availableLetters = listOf("س", "د", "ي", "م", "غ", "ب", "ا", "ر"),
            hint = "مهد ولادة النجوم الجديدة في الكون",
            rewardPoints = 15
        ),
        Puzzle(
            id = 27,
            categoryId = "astronomy",
            category = "بيت الفلك والفضاء",
            question = "النجم المركزي الأقرب إلينا الذي تدور حوله مجموعتنا الكوكبية",
            correctAnswer = "شمس",
            availableLetters = listOf("ش", "م", "س", "ن", "و", "ر", "ض", "ء"),
            hint = "مصدر الضوء والحرارة الأساسي لكوكب الأرض",
            rewardPoints = 10
        ),
        Puzzle(
            id = 28,
            categoryId = "astronomy",
            category = "بيت الفلك والفضاء",
            question = "مرقاب بصري فلكي يُستخدم لرصد النجوم والمجرات والأجرام البعيدة",
            correctAnswer = "تلسكوب",
            availableLetters = listOf("ت", "ل", "س", "ك", "و", "ب", "ع", "د"),
            hint = "مثل مرصد هابل الفضائي وتلسكوب جيمس ويب",
            rewardPoints = 20
        ),
        Puzzle(
            id = 29,
            categoryId = "astronomy",
            category = "بيت الفلك والفضاء",
            question = "المسار المنحني المنتظم الذي يسلكه الجرم السماوي حول مركز جذب كوني",
            correctAnswer = "مدار",
            availableLetters = listOf("م", "د", "ا", "ر", "ف", "ل", "ك", "ي"),
            hint = "المسار الإهليلجي الذي يتبعه الكوكب",
            rewardPoints = 10
        ),
        Puzzle(
            id = 30,
            categoryId = "astronomy",
            category = "بيت الفلك والفضاء",
            question = "خط ضوئي لامع يظهر في سماء الليل عند احتراق حبيبات الغبار بالغلاف الجوي",
            correctAnswer = "شهاب",
            availableLetters = listOf("ش", "ه", "ا", "ب", "س", "م", "ا", "ء"),
            hint = "يطلق عليه في التراث الفلكي النجم الهاوي",
            rewardPoints = 15
        )
    )

    // ------------------------------------------------------------------------
    // 4. HISTORY & CIVILIZATIONS — بيت التاريخ والحضارات
    // ------------------------------------------------------------------------
    private val historyPuzzles = listOf(
        Puzzle(
            id = 31,
            categoryId = "history",
            category = "بيت التاريخ والحضارات",
            question = "صروح حجرية هندسية عملاقة شيدها الفراعنة في الجيزة بمصر القديمة",
            correctAnswer = "اهرام",
            availableLetters = listOf("ا", "ه", "ر", "ا", "م", "م", "ص", "ر"),
            hint = "من عجائب العالم القديم كأهرامات خوفو وخفرع",
            rewardPoints = 15
        ),
        Puzzle(
            id = 32,
            categoryId = "history",
            category = "بيت التاريخ والحضارات",
            question = "اللقب الذي كان يُطلق على حاكم مصر القديمة في العصور القديمة",
            correctAnswer = "فرعون",
            availableLetters = listOf("ف", "ر", "ع", "و", "ن", "م", "ل", "ك"),
            hint = "حكام السلالات الملكية القديمة في وادي النيل",
            rewardPoints = 15
        ),
        Puzzle(
            id = 33,
            categoryId = "history",
            category = "بيت التاريخ والحضارات",
            question = "حصن عسكري منيع ومبنى دفاعي كان يُبنى لحماية المدن والحدود",
            correctAnswer = "قلعة",
            availableLetters = listOf("ق", "ل", "ع", "ة", "ح", "ص", "ن", "ب"),
            hint = "مثل قلعة صلاح الدين الأيوبي التاريخية",
            rewardPoints = 10
        ),
        Puzzle(
            id = 34,
            categoryId = "history",
            category = "بيت التاريخ والحضارات",
            question = "وثيقة أو كتاب قديم خُطّ باليد على ورق البردي أو الرق قبل عصر الطباعة",
            correctAnswer = "مخطوطة",
            availableLetters = listOf("م", "خ", "ط", "و", "ط", "ة", "ك", "ت"),
            hint = "أصل نفيس لحفظ كنوز التراث العلمي والأدبي",
            rewardPoints = 20
        ),
        Puzzle(
            id = 35,
            categoryId = "history",
            category = "بيت التاريخ والحضارات",
            question = "مبنى مخصص لحفظ وعرض التحف النادرة والآثار التاريخية والمقتنيات التراثية",
            correctAnswer = "متحف",
            availableLetters = listOf("م", "ت", "ح", "ف", "آ", "ث", "ا", "ر"),
            hint = "صرح يزوره الناس لمشاهدة الآثار والشواهد التاريخية",
            rewardPoints = 10
        ),
        Puzzle(
            id = 36,
            categoryId = "history",
            category = "بيت التاريخ والحضارات",
            question = "حضارة قديمة شهيرة في بلاد الرافدين عُرفت بحدائقها المعلقة وقوانين حمورابي",
            correctAnswer = "بابل",
            availableLetters = listOf("ب", "ا", "ب", "ل", "ع", "ر", "ا", "ق"),
            hint = "مدينة تاريخية عريقة على ضفاف نهر الفرات",
            rewardPoints = 15
        ),
        Puzzle(
            id = 37,
            categoryId = "history",
            category = "بيت التاريخ والحضارات",
            question = "المخلفات والشواهد المادية التي تركتها الحضارات والأمم السابقة",
            correctAnswer = "اثار",
            availableLetters = listOf("ا", "ث", "ا", "ر", "ق", "د", "ي", "م"),
            hint = "تشمل المعابد والنقوش والتماثيل والمدن القديمة",
            rewardPoints = 10
        ),
        Puzzle(
            id = 38,
            categoryId = "history",
            category = "بيت التاريخ والحضارات",
            question = "صرح معماري قديم كان مخصصاً للعبادة والطقوس الدينية عند الحضارات السالفة",
            correctAnswer = "معبد",
            availableLetters = listOf("م", "ع", "ب", "د", "ق", "د", "ي", "م"),
            hint = "مثل معابد الكرنك والأقصر في الحضارة المصرية",
            rewardPoints = 10
        ),
        Puzzle(
            id = 39,
            categoryId = "history",
            category = "بيت التاريخ والحضارات",
            question = "العالم أو الباحث المتخصص في تدوين ودراسة وقائع الماضي وأحداث الشعوب",
            correctAnswer = "مؤرخ",
            availableLetters = listOf("م", "ؤ", "ر", "خ", "ع", "ا", "ل", "م"),
            hint = "مثل ابن خلدون والطبري وابن الأثير",
            rewardPoints = 15
        ),
        Puzzle(
            id = 40,
            categoryId = "history",
            category = "بيت التاريخ والحضارات",
            question = "مرحلة متقدمة من التطور البشري تشمل العمران والفنون والعلوم والنظم المدنية",
            correctAnswer = "حضارة",
            availableLetters = listOf("ح", "ض", "ا", "ر", "ة", "ت", "ر", "ا"),
            hint = "إنجاز أمة من الأمم في البناء والفكر والتمدن",
            rewardPoints = 15
        )
    )

    // ------------------------------------------------------------------------
    // 5. ARABIC LANGUAGE — بيت اللغة العربية
    // ------------------------------------------------------------------------
    private val arabicLanguagePuzzles = listOf(
        Puzzle(
            id = 41,
            categoryId = "arabic_language",
            category = "بيت اللغة العربية",
            question = "فن القول ومطابقة الكلام الفصيح لمقتضى الحال بجمال وبيان",
            correctAnswer = "بلاغة",
            availableLetters = listOf("ب", "ل", "ا", "غ", "ة", "ف", "ص", "ح"),
            hint = "تضم علوم البيان والمعاني والبديع",
            rewardPoints = 15
        ),
        Puzzle(
            id = 42,
            categoryId = "arabic_language",
            category = "بيت اللغة العربية",
            question = "تغيير يطرأ على أواخر الكلمات بحسب موقعها في الجملة من رفع ونصب وجر",
            correctAnswer = "اعراب",
            availableLetters = listOf("ا", "ع", "ر", "ا", "ب", "ن", "ح", "و"),
            hint = "المفتاح الرئيس في علم النحو العربي",
            rewardPoints = 15
        ),
        Puzzle(
            id = 43,
            categoryId = "arabic_language",
            category = "بيت اللغة العربية",
            question = "نص شعري موزون مقفى يتكون من أبيات تعبر عن وجدان الشاعر وأفكاره",
            correctAnswer = "قصيدة",
            availableLetters = listOf("ق", "ص", "ي", "د", "ة", "ش", "ع", "ر"),
            hint = "تعتمد على بحور الخليل بن أحمد الفراهيدي",
            rewardPoints = 15
        ),
        Puzzle(
            id = 44,
            categoryId = "arabic_language",
            category = "بيت اللغة العربية",
            question = "كتاب ضخم يجمع ألفاظ اللغة ويبين معانيها وأصولها وطرق اشتقاقها",
            correctAnswer = "معجم",
            availableLetters = listOf("م", "ع", "ج", "م", "ق", "ا", "م", "و"),
            hint = "مثل لسان العرب والقاموس المحيط وتاج العروس",
            rewardPoints = 15
        ),
        Puzzle(
            id = 45,
            categoryId = "arabic_language",
            category = "بيت اللغة العربية",
            question = "اسم مرفوع تبدأ به الجملة الاسمية ويحتاج إلى خبر ليكتمل المعنى",
            correctAnswer = "مبتدا",
            availableLetters = listOf("م", "ب", "ت", "د", "ا", "خ", "ب", "ر"),
            hint = "الركن الأول في الجملة الاسمية يتبعه الخبر",
            rewardPoints = 10
        ),
        Puzzle(
            id = 46,
            categoryId = "arabic_language",
            category = "بيت اللغة العربية",
            question = "الحروف الأخيرة من عجز البيت الشعري التي يتكرر نغمها في نهاية كل بيت",
            correctAnswer = "قافية",
            availableLetters = listOf("ق", "ا", "ف", "ي", "ة", "ب", "ح", "ر"),
            hint = "تمنح النص الشعري جرسه الموسيقي الموحد",
            rewardPoints = 15
        ),
        Puzzle(
            id = 47,
            categoryId = "arabic_language",
            category = "بيت اللغة العربية",
            question = "أسلوب بياني يشارك فيه أمر أمراً آخر في صفة بواسطة أداة مثل الكاف",
            correctAnswer = "تشبيه",
            availableLetters = listOf("ت", "ش", "ب", "ي", "ه", "ب", "ي", "ا"),
            hint = "أركانه: المشبه والمشبه به وأداة التشبيه ووجه الشبه",
            rewardPoints = 15
        ),
        Puzzle(
            id = 48,
            categoryId = "arabic_language",
            category = "بيت اللغة العربية",
            question = "دلالة ألفاظ متعددة ومختلفة في المبنى على معنى واحد مشترك",
            correctAnswer = "ترادف",
            availableLetters = listOf("ت", "ر", "ا", "د", "ف", "م", "ع", "ن"),
            hint = "مثل الكلمات: السيف والحسام والمهند",
            rewardPoints = 15
        ),
        Puzzle(
            id = 49,
            categoryId = "arabic_language",
            category = "بيت اللغة العربية",
            question = "وجود تقابل واختلاف كامل في المعنى بين لفظين مثل النور والظلام",
            correctAnswer = "تضاد",
            availableLetters = listOf("ت", "ض", "ا", "د", "ع", "ك", "س", "م"),
            hint = "يسمى في علوم البديع بالطباق",
            rewardPoints = 10
        ),
        Puzzle(
            id = 50,
            categoryId = "arabic_language",
            category = "بيت اللغة العربية",
            question = "خلو الكلام واللسان من العيوب والتعقيد وظهور المعنى بجلاء وسلاسة",
            correctAnswer = "فصاحة",
            availableLetters = listOf("ف", "ص", "ا", "ح", "ة", "ب", "ي", "ا"),
            hint = "سمة اللسان العربي المبين في وضوح بيانه",
            rewardPoints = 15
        )
    )

    // ------------------------------------------------------------------------
    // CATEGORY DEFINITIONS
    // ------------------------------------------------------------------------
    private val categories = listOf(
        PuzzleCategory(
            id = "cars",
            arabicName = "السيارات والمواصلات",
            shortDescription = "عالم المركبات والمحركات والاستكشاف",
            iconEmoji = "🚗",
            puzzles = carsPuzzles
        ),
        PuzzleCategory(
            id = "science",
            arabicName = "العلوم",
            shortDescription = "عجائب الأحياء والفيزياء والكيمياء والطبيعة",
            iconEmoji = "🔬",
            puzzles = sciencePuzzles
        ),
        PuzzleCategory(
            id = "astronomy",
            arabicName = "الفلك والفضاء",
            shortDescription = "أسرار النجوم والمجرات والكواكب والكون الفسيح",
            iconEmoji = "🌌",
            puzzles = astronomyPuzzles
        ),
        PuzzleCategory(
            id = "history",
            arabicName = "التاريخ والحضارات",
            shortDescription = "شواهد الأمم السابقة والآثار والأحداث الخالدة",
            iconEmoji = "🏛️",
            puzzles = historyPuzzles
        ),
        PuzzleCategory(
            id = "arabic_language",
            arabicName = "اللغة العربية",
            shortDescription = "جماليات الضاد وفنون البلاغة والشعر والنحو",
            iconEmoji = "📜",
            puzzles = arabicLanguagePuzzles
        )
    )

    fun getCategories(): List<PuzzleCategory> = categories

    fun getCategoryById(id: String): PuzzleCategory? = categories.firstOrNull { it.id == id }

    fun getPuzzlesForCategory(categoryId: String): List<Puzzle> {
        return categories.firstOrNull { it.id == categoryId }?.puzzles ?: carsPuzzles
    }

    fun getAllPuzzles(): List<Puzzle> = categories.flatMap { it.puzzles }

    /**
     * Backward-compatible accessor returning the original 10 cars puzzles.
     */
    fun getSamplePuzzles(): List<Puzzle> = carsPuzzles

    fun getTotalPuzzlesCount(): Int = getAllPuzzles().size
}
