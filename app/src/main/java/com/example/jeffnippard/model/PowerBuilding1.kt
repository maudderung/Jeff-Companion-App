package com.example.jeffnippard.model

import android.widget.EditText

 class PowerBuilding1(
     var upr1: EditText,
     var upr2: EditText,
     var upr3: EditText,
     var upr4: EditText,
     var upr5: EditText,
     var upr6: EditText,
     var upr7: EditText,
     var upr8: EditText,
     var upr9: EditText,
     var reps1: EditText,
     var reps2: EditText,
     var reps3: EditText,
     var reps4: EditText,
     var reps5: EditText,
     var reps6: EditText,
     var reps7: EditText,
     var reps8: EditText,
     var reps9: EditText,
     var kg1: EditText,
     var kg2: EditText,
     var kg3: EditText,
     var kg4: EditText,
     var kg6: EditText,
     var kg7: EditText,
     var kg8: EditText,
     var kg9: EditText
 ) :TrainingProgram {

    
    override  fun setFBday1() {
        upr1.setText("1.Back Squat")
        upr2.setText("2.Back Squat")
        upr3.setText("3.Overhead Press")
        upr4.setText("4.Glute Ham Raise")
        upr5.setText("5.Helms Row")
        upr6.setText("6.Hammer Curl")
    }

    override  fun setFBday2() {
        upr1.setText("1.Deadlift")
        upr2.setText("2.Barbell Bench Press")
        upr2.textSize = 13.5F
        upr3.setText("3.Barbell Bench Press")
        upr3.textSize = 13.5F
        upr4.setText("4.Hip Abduction")
        upr5.setText("5.Weighted Pull-Up")
        upr6.setText("6.Floor Skull Crusher")
        upr7.setText("7.Standing Calf Raise")
        upr7.textSize = 13.5F
    }

    override  fun setFBday3() {
        upr1.setText("1.Back Squat")
        upr2.setText("2.Weighted Dip")
        upr3.setText("3.Hanging Leg Raise")
        upr4.setText("4.Lat Pull-Over")
        upr5.setText("5.Incline Dumbbell Curl")
        upr5.textSize = 13.0F
        upr6.setText("6.Face Pull")
    }

    override fun setFBday4() {
        upr1.setText("1.Pause Deadlift")
        upr2.setText("2.Pause Barbell Bench Press")
        upr2.textSize = 11.5F

        upr3.setText("3.Chest-Supported T-Bar Row")
        upr3.textSize = 11.5F

        upr4.setText("4.Nordic Ham Curl")
        upr5.setText("5.Dumbbell Shrug")
    }

    override  fun setULday1() {
        upr1.setText("1.Deadlift")
        upr2.setText("2.Pause Hi-Bar Squat")
        upr3.setText("3.Leg Curl")
        upr4.setText("4.Standing Calf Raise")
        upr5.setText("5.Hanging Leg Raise")

    }

    override fun setULday2() {
        upr1.setText("1.Barbell Bench Press")
        upr1.textSize = 13.5F
        upr2.setText("2.Barbell Bench Press")
        upr2.textSize = 13.5F
        upr3.setText("3.Chin-Up")
        upr4.setText("4.Overhead Press")
        upr5.setText("5.Chest-Supp. Dumbbell Row")
        upr5.textSize = 11.5F
        upr6.setText("6.A1. Face Pull")
        upr7.setText("7.A2. DB Lateral Raise")
        upr7.textSize = 11F
        upr8.setText("8.B1. Conc. Bicep Curl")
        upr8.textSize = 12F
        upr9.setText("9.B2. Triceps Pressdown")
        upr9.textSize = 12F
    }

    override fun setULday3() {
        upr1.setText("1.Back Squat")
        upr2.setText("2.Snatch-Grip RDL")
        upr3.setText("3.Leg Extension")
        upr4.setText("4.Standing Calf Raise")
        upr4.textSize = 13.0F
        upr5.setText("5.Hip Abduction")
        upr6.setText("6. V Sit-Up/Crunches")
        upr6.textSize = 13.0F
    }

    override fun setULday4() {
        upr1.setText("1.Close-Grip Bench Press")
        upr1.textSize = 13.0F
        upr2.setText("2.Pendlay Row")
        upr3.setText("3.Weighted Dip")
        upr4.setText("4.Eccentric Pull-Up")
        upr5.setText("5.A1. Incline Shrug")
        upr6.setText("6.A2. Upright Row")
        upr7.setText("7.B1. EZ-Bar Curl")
        upr8.setText("8.B2. Skull Crusher")
    }

    override fun setWeek1Day1() {
        setFBday1()
        reps1.hint = "1x5"
        reps2.hint = "2x8"
        reps3.hint = "3x8"
        reps4.hint = "3x 8-10"
        reps5.hint = "3x 12-15"
        reps6.hint = "3x 20-25"

        kg1.hint = "75-80%"
        kg2.hint = "70%"
        kg3.hint = "70%"
        kg6.hint = "  kg"
    }

    override fun setWeek1Day2() {
        setFBday2()
        reps1.hint = "3x4"
        reps2.hint = "1x3"
        reps3.hint = "2x10"
        reps4.hint = "3x 15-20"
        reps5.hint = "3x 5-8"
        reps6.hint = "3x 10-12"
        reps7.hint = "3x 8-10"

        kg1.hint = "80%"
        kg2.hint = "85%"
        kg3.hint = "67.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek1Day3() {
        setFBday3()
        reps1.hint = "3x4"
        reps2.hint = "3x8"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 12-15"
        reps5.hint = "3x 12-15"
        reps6.hint = "4x 15-20"

        kg1.hint = "80%"
        kg6.hint = "  kg"
    }

    override fun setWeek1Day4() {
        setFBday4()
        reps1.hint = "4x2"
        reps2.hint = "3x5"
        reps3.hint = "3x10"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 20-25"

        kg1.hint = "75%"
        kg2.hint = "75%"
    }

    override fun setWeek2Day1() {
        setULday1()
        reps1.hint = "3x3"
        reps2.hint = "2x8"
        reps3.hint = "3x 6-8"
        reps4.hint = "3x 8-10"
        reps5.hint = "3x 10-12"

        kg1.hint = "80%"

    }

    override fun setWeek2Day2() {
        setULday2()
        reps1.hint = "1x2"
        reps2.hint = "3x6"
        reps3.hint = "3x 8-10"
        reps4.hint = "3x4"
        reps5.hint = "3x 12-15"
        reps6.hint = "2x 15-20"
        reps7.hint = "2x 15-20"
        reps8.hint = "3x 12-15"
        reps9.hint = "3x 12-15"

        kg1.hint = "85-90%"
        kg2.hint = "77.5%"
        kg4.hint = "80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
        kg9.hint = "  kg"
    }

    override fun setWeek2Day3() {
        setULday3()
        reps1.hint = "3x6"
        reps2.hint = "3x10"
        reps3.hint = "3x 12-15"
        reps4.hint = "4x 15-20"
        reps5.hint = "3x 15-20"
        reps6.hint = "3x 12-15"

        kg1.hint = "75%"
        kg6.hint = "  kg"
    }

    override fun setWeek2Day4() {
        setULday4()
        reps1.hint = "3x12"
        reps2.hint = "3x10"
        reps3.hint = "3x6"
        reps4.hint = "2x AMRAP"
        reps5.hint = "2x 15-20"
        reps6.hint = "2x 15-20"
        reps7.hint = "2x 12-15"
        reps8.hint = "2x 8-10"

        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
    }

    override fun setWeek3Day1() {
        setFBday1()
        reps1.hint = "1x8"
        reps2.hint = "2x6"
        reps3.hint = "3x8"
        reps4.hint = "2x 8-10"
        reps5.hint = "3x 12-15"
        reps6.hint = "2x 20-25"

        kg1.hint = "75%"
        kg2.hint = "75%"
        kg3.hint = "72.5%"
        kg6.hint = "  kg"
    }

    override fun setWeek3Day2() {
        setFBday2()
        reps1.hint = "4x2"
        reps2.hint = "1x6"
        reps3.hint = "2x8"
        reps4.hint = "2x 15-20"
        reps5.hint = "3x 5-8"
        reps6.hint = "3x 10-12"
        reps7.hint = "3x8"

        kg1.hint = "85%"
        kg2.hint = "75-80%"
        kg3.hint = "72.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek3Day3() {
        setFBday3()
        reps1.hint = "4x4"
        reps2.hint = "3x8"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 12-15"
        reps5.hint = "2x 12-15"
        reps6.hint = "4x 15-20"

        kg1.hint = "80%"
        kg6.hint = "  kg"
    }

    override fun setWeek3Day4() {
        setFBday4()
        reps1.hint = "4x2"
        reps2.hint = "4x5"
        reps3.hint = "3x10"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 20-25"

        kg1.hint = "77.5%"
        kg2.hint = "75%"
    }

    override fun setWeek4Day1() {
        upr1.setText("1.Deadlift")
        upr2.setText("2.Deadlift")
        upr3.setText("3.Pause Hi-Bar Squat")
        upr4.setText("4.Leg Curl")
        upr5.setText("5.Standing Calf Raise")
        upr6.setText("6.Hanging Leg Raise")
        reps1.hint = "1x2"
        reps2.hint = "3x3"
        reps3.hint = "2x8"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 8-10"
        reps6.hint = "3x 10-12"

        kg1.hint = "90%"
        kg2.hint = "80%"
        kg6.hint = "  kg"

    }

    override fun setWeek4Day2() {
        upr1.setText("1.Flat-Back Bench Press")
        upr1.textSize = 13.5F
        upr2.setText("2.Chin-up")
        upr3.setText("3.Overhead Press")
        upr4.setText("4.Chest-Supp. Dumbbell Row")
        upr4.textSize = 11.5F
        upr5.setText("5.A1. Face Pull")
        upr6.setText("6.A2. DB Lateral Raise")
        upr6.textSize = 11F
        upr7.setText("7.B1. Conc. Bicep Curl")
        upr7.textSize = 12F
        upr8.setText("8.B2. Triceps Pressdown")
        upr8.textSize = 12F

        reps1.hint = "3x10"
        reps2.hint = "3x 8-10"
        reps3.hint = "3x 3/3"
        reps4.hint = "3x 12-15"
        reps5.hint = "3x 15-20"
        reps6.hint = "2x 15-20"
        reps7.hint = "3x 12-15"
        reps8.hint = "3x 12-15"


        kg3.hint = "80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"

    }

    override fun setWeek4Day3() {
        setULday3()
        upr2.setText("2.5' Block Pull")
        reps1.hint = "3x6"
        reps2.hint = "2x4"
        reps3.hint = "3x 12-15"
        reps4.hint = "4x 15-20"
        reps5.hint = "3x 15-20"
        reps6.hint = "3x 12-15"

        kg1.hint = "75%"
        kg6.hint = "  kg"
    }

    override fun setWeek4Day4() {
        upr1.setText("1.Weighted Dip")
        upr2.setText("2.Pendlay Row")
        upr3.setText("3.Deficit Push-Up")
        upr4.setText("4.Eccentric Pull-Up")
        upr5.setText("5.A1. Incline Shrug")
        upr6.setText("6.A2. Bent Over RV DB Flye")
        upr6.textSize = 11F
        upr7.setText("7.B1. EZ-Bar Curl")
        upr8.setText("8.B2. Skull Crusher")
        upr8.textSize = 13F

        reps1.hint = "3x6"
        reps2.hint = "3x10"
        reps3.hint = "2x AMRAP"
        reps4.hint = "2x AMRAP"
        reps5.hint = "2x 15-20"
        reps6.hint = "2x 15-20"
        reps7.hint = "2x 12-15"
        reps8.hint = "3x 8-10"

        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
    }

    override fun setWeek5Day1() {
        setFBday1()
        reps1.hint = "1x3"
        reps2.hint = "2x4"
        reps3.hint = "3x8"
        reps4.hint = "2x 8-10"
        reps5.hint = "3x 12-15"
        reps6.hint = "2x 20-25"

        kg1.hint = "85%"
        kg2.hint = "80%"
        kg3.hint = "75%"
        kg6.hint = "  kg"
    }

    override fun setWeek5Day2() {
        setFBday2()
        reps1.hint = "3x3"
        reps2.hint = "1x4"
        reps3.hint = "2x6"
        reps4.hint = "3x 15-20"
        reps5.hint = "3x 5-8"
        reps6.hint = "3x 10-12"
        reps7.hint = "3x8"

        kg1.hint = "85%"
        kg2.hint = "87.5%"
        kg3.hint = "80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek5Day3() {
        setFBday3()
        reps1.hint = "3x6"
        reps2.hint = "3x8"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 12-15"
        reps5.hint = "2x 12-15"
        reps6.hint = "4x 15-20"

        kg1.hint = "77.5%"
        kg6.hint = "  kg"
    }

    override fun setWeek5Day4() {
        setFBday4()
        reps1.hint = "4x2"
        reps2.hint = "3x6"
        reps3.hint = "3x10"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 20-25"

        kg1.hint = "82.5%"
        kg2.hint = "75%"
    }

    override fun setWeek6Day1() {
        setULday1()
        reps1.hint = "3x4"
        reps2.hint = "2x8"
        reps3.hint = "3x 6-8"
        reps4.hint = "3x 8-10"
        reps5.hint = "3x 10-12"

        kg1.hint = "80%"

    }

    override fun setWeek6Day2() {
        upr1.setText("1.Barbell Bench Press")
        upr1.textSize = 13.5F
        upr2.setText("2.Chin-up")
        upr3.setText("3.Overhead Press")
        upr4.setText("4.Chest-Supp. Dumbbell Row")
        upr4.textSize = 11.5F
        upr5.setText("5.A1. Face Pull")
        upr6.setText("6.A2. DB Lateral Raise")
        upr6.textSize = 11F
        upr7.setText("7.B1. Conc. Bicep Curl")
        upr7.textSize = 12F
        upr8.setText("8.B2. Triceps Pressdown")
        upr8.textSize = 12F

        reps1.hint = "2x7"
        reps2.hint = "2x 8-10"
        reps3.hint = "3x 4"
        reps4.hint = "2x 12-15"
        reps5.hint = "3x 15-20"
        reps6.hint = "3x 15-20"
        reps7.hint = "3x 12-15"
        reps8.hint = "3x 12-15"


        kg1.hint = "77.5%"
        kg3.hint = "82.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"

    }

    override fun setWeek6Day3() {
        upr1.setText("1.Back Squat")
        upr2.setText("2.Low-Bar Back Squat")
        upr2.textSize = 12.5F
        upr3.setText("3.Snatch-Grip RDL")
        upr4.setText("4.Leg Extension")
        upr5.setText("5.Standing Calf Raise")
        upr5.textSize = 13.0F
        upr6.setText("6.Hip Abduction")
        upr7.setText("7. V Sit-Up/Crunches")
        upr7.textSize = 13.0F

        reps1.hint = "1x1"
        reps2.hint = "2x7"
        reps3.hint = "2x10"
        reps4.hint = "2x 12-15"
        reps5.hint = "3x 15-20"
        reps6.hint = "3x 15-20"
        reps7.hint = "3x 12-15"

        kg1.hint = "90-95%"
        kg2.hint = "75%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek6Day4() {
        upr1.setText("1.Barbell Floor Press")
        upr2.setText("2.Pendlay Row")
        upr3.setText("3.Weighted Dip")
        upr4.setText("4.Neutral Grip Pull-Up")
        upr5.setText("5.A1. Incline Shrug")
        upr6.setText("6.A2. Upright Row")
        upr6.textSize = 13.5F
        upr7.setText("7.B1. EZ-Bar Curl")
        upr8.setText("8.B2. Skull Crusher")
        upr8.textSize = 13.5F

        reps1.hint = "3x8"
        reps2.hint = "2x10"
        reps3.hint = "3x6"
        reps4.hint = "2x10"
        reps5.hint = "2x 15-20"
        reps6.hint = "2x 15-20"
        reps7.hint = "2x 12-15"
        reps8.hint = "2x 8-10"

        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
    }

    override fun setWeek7Day1() {
        setFBday1()
        reps1.hint = "1x3"
        reps2.hint = "2x2"
        reps3.hint = "4x8"
        reps4.hint = "2x 8-10"
        reps5.hint = "2x 12-15"
        reps6.hint = "2x 20-25"

        kg1.hint = "85-90%"
        kg2.hint = "85%"
        kg3.hint = "70%"
        kg6.hint = "  kg"
    }

    override fun setWeek7Day2() {
        setFBday2()
        upr1.setText("1.Pause Deadlift")

        reps1.hint = "4x2"
        reps2.hint = "1x3"
        reps3.hint = "2x4"
        reps4.hint = "3x 15-20"
        reps5.hint = "3x 3-5"
        reps6.hint = "3x 10-12"
        reps7.hint = "3x8"

        kg1.hint = "75%"
        kg2.hint = "85-90%"
        kg3.hint = "80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek7Day3() {
        setFBday3()
        reps1.hint = "4x6"
        reps2.hint = "3x8"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 12-15"
        reps5.hint = "2x 12-15"
        reps6.hint = "3x 15-20"

        kg1.hint = "77.5%"
        kg6.hint = "  kg"
    }

    override fun setWeek7Day4() {
        setFBday4()
        upr1.setText("1.Deadlift")

        reps1.hint = "1x3"
        reps2.hint = "4x6"
        reps3.hint = "3x10"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 20-25"

        kg1.hint = "85-90%"
        kg2.hint = "75%"
    }

    override fun setWeek8Day1() {
        setULday1()
        reps1.hint = "3x5"
        reps2.hint = "2x8"
        reps3.hint = "3x 6-8"
        reps4.hint = "3x 8-10"
        reps5.hint = "3x 10-12"

        kg1.hint = "80%"

    }

    override fun setWeek8Day2() {
        upr1.setText("1.Flat-Back Bench Press")
        upr1.textSize = 13.5F
        upr2.setText("2.Chin-up")
        upr3.setText("3.Overhead Press")
        upr4.setText("4.Chest-Supp. Dumbbell Row")
        upr4.textSize = 11.5F
        upr5.setText("5.A1. Face Pull")
        upr6.setText("6.A2. DB Lateral Raise")
        upr6.textSize = 11F
        upr7.setText("7.B1. Conc. Bicep Curl")
        upr7.textSize = 12F
        upr8.setText("8.B2. Triceps Pressdown")
        upr8.textSize = 12F


        reps1.hint = "3x10"
        reps2.hint = "3x 8-10"
        reps3.hint = "3x 3/3"
        reps4.hint = "3x 12-15"
        reps5.hint = "3x 15-20"
        reps6.hint = "3x 15-20"
        reps7.hint = "3x 12-15"
        reps8.hint = "3x 12-15"

        kg3.hint = " 82.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"

    }

    override fun setWeek8Day3() {
        setULday3()
        upr1.setText("1.Low-Bar Squat")
        upr2.setText("2. 3' Block Pull")
        reps1.hint = "3x7"
        reps2.hint = "2x4"
        reps3.hint = "3x 12-15"
        reps4.hint = "4x 15-20"
        reps5.hint = "3x 15-20"
        reps6.hint = "3x 12-15"

        kg1.hint = "75%"
        kg6.hint = "  kg"
    }

    override fun setWeek8Day4() {
        upr1.setText("1.DB Incline Press")
        upr2.setText("2.Pendlay Row")
        upr3.setText("3.Weighted Dip")
        upr4.setText("4.Eccentric Pull-Up")
        upr5.setText("5.A1. Incline Shrug")
        upr6.setText("6.A2. Bent Over RV DB Flye")
        upr6.textSize = 11F
        upr7.setText("7.B1. EZ-Bar Curl")
        upr8.setText("8.B2. Skull Crusher")
        upr8.textSize = 13F

        reps1.hint = "3x8"
        reps2.hint = "3x10"
        reps3.hint = "3x6"
        reps4.hint = "2x AMRAP"
        reps5.hint = "2x 15-20"
        reps6.hint = "2x 15-20"
        reps7.hint = "3x 12-15"
        reps8.hint = "3x 8-10"

        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg6.hint = "  kg"
        kg8.hint = "  kg"
    }

    override fun setWeek9Day1() {
        setFBday1()
        upr2.setText("2.Squat Walk-Out")
        reps1.hint = "1x2"
        reps2.hint = "1x10s"
        reps3.hint = "3x6"
        reps4.hint = "2x 8-10"
        reps5.hint = "2x 12-15"
        reps6.hint = "2x 20-25"

        kg1.hint = "90%"
        kg2.hint = "100%"
        kg3.hint = "80%"
        kg6.hint = "  kg"
    }

    override fun setWeek9Day2() {
        setFBday2()
        reps1.hint = "3x4"
        reps2.hint = "1x2"
        reps3.hint = "2x2"
        reps4.hint = "3x 15-20"
        reps5.hint = "3x 3-5"
        reps6.hint = "3x 10-12"
        reps7.hint = "3x 8"

        kg1.hint = "80%"
        kg2.hint = "90%"
        kg3.hint = "87.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek9Day3() {
        setFBday3()
        reps1.hint = "3x4"
        reps2.hint = "3x8"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 12-15"
        reps5.hint = "2x 12-15"
        reps6.hint = "4x 15-20"

        kg1.hint = "82.5%"
        kg6.hint = "  kg"
    }

    override fun setWeek9Day4() {
        setFBday4()
        reps1.hint = "4x2"
        reps2.hint = "3x5"
        reps3.hint = "3x10"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 20-25"

        kg1.hint = "75%"
        kg2.hint = "77.5%"
    }
     override fun setWeek10Day1() {}
     override fun setWeek10Day2() {}
     override fun setWeek10Day3() {}
     override fun setWeek10Day4() {}
     override fun setWeek11Day1() {}
     override fun setWeek11Day2() {}
     override fun setWeek11Day3() {}
     override fun setWeek11Day4() {}
     override fun setWeek12Day1() {}
     override fun setWeek12Day2() {}
     override fun setWeek12Day3() {}
     override fun setWeek12Day4() {}

}