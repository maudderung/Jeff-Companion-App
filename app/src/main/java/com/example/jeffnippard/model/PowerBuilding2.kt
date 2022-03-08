package com.example.jeffnippard.model

import android.widget.EditText

class PowerBuilding2(
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
    var kg5: EditText,
    var kg6: EditText,
    var kg7: EditText,
    var kg8: EditText,
    var kg9: EditText
) :TrainingProgram {


    override fun setFBday1() {
        upr1.setText("1.Back Squat")
        upr2.setText("2.Front/Box Squat")
        upr3.setText("3.Barbell Bench Press")
        upr4.setText("4.Barbell Bench Press")
        upr3.textSize = 13.5F
        upr4.textSize = 13.5F
        upr5.setText("5.Weighted Pull-Up")
        upr6.setText("6.Glute-Ham Raise")
        upr7.setText("7.Seated Face Pull")
    }

     override fun setFBday2() {
        upr1.setText("1.Deadlift")
        upr2.setText("2.Barbell Overhead Press")
        upr2.textSize = 13.5F
        upr3.setText("3.BG Split Squat")
        upr4.setText("4.Meadows Row")
        upr5.setText("5.Barbell/EZ Bar Curl")
         upr5.textSize = 13.5F
         upr6.setText("6.Pec Flye")

    }

     override fun setFBday3() {
         upr1.setText("1.Back Squat")
         upr2.setText("2.Pin Squat")
         upr3.setText("3.Barbell Bench Press")
         upr4.setText("4.Barbell Bench Press")
         upr5.setText("5.Barbell Bench Press")
         upr3.textSize = 13.5F
         upr4.textSize = 13.5F
         upr5.textSize = 13.5F
         upr6.setText("6.Chin-Up")
         upr7.setText("7.Single-Leg Hip Thrust")
         upr7.textSize = 13.5F
         upr8.setText("8.Cable Reverse Flye")
         upr8.textSize = 13.5F
         upr9.setText("9.Standing Calf Raise")
         upr9.textSize = 13.5F
    }

     override fun setFBday4() {
        upr1.setText("1.6' Block Pull")
        upr2.setText("2.Pause DB Incline Press")
        upr2.textSize = 13.0F
        upr3.setText("3.Leg Curl")
        upr4.setText("4.Chest-Supported Row")
        upr5.setText("5.Rope Overhead Triceps Extension")
         upr5.textSize = 12.5F
         upr5.setText("6.Egyptian Lateral Raise")

     }

     override fun setULday1() {
        upr1.setText("1.Back Squat")
        upr2.setText("2.Barbell RDL")
        upr3.setText("3.Unilateral Leg Press")
         upr3.textSize = 13.5F
        upr4.setText("4.Eccentric-Accentuated Leg Extension")
         upr4.textSize = 12.0F
        upr5.setText("5.Leg Curl")
         upr6.setText("6.Standing Calf Raise")
         upr6.textSize = 13.5F
         upr7.setText("7.A1.Weighted Crunch")
         upr8.setText("8.A2.Long-Lever Plank")
         upr8.textSize = 13.5F
    }

     override fun setULday2() {
        upr1.setText("1.Barbell Bench Press")
        upr1.textSize = 13.5F
        upr2.setText("2.Weighted Pull-Up")
        upr3.setText("3.Machine Incline Press")
         upr3.textSize = 13.5F
         upr4.setText("4.Seated Cable Row")
        upr5.setText("5.Egyptian Lateral Raise")
         upr5.textSize = 13.5F
         upr6.setText("6.Constant-Tension Cable Triceps Kickback")
         upr6.textSize = 11.5F
        upr7.setText("7.Hammer Cheat Curl")

    }

     override fun setULday3() {
        upr1.setText("1.Reset Deadlift")
        upr2.setText("2.Hack Squat")
        upr3.setText("3.Single-Leg Hip Thrust")
        upr4.setText("4.A1.Glute-Ham Raise")
        upr4.textSize = 13.0F
        upr5.setText("5.A2.Prisoner Back Ext.")
        upr6.setText("6.Unilateral Standing Calf Raise")
        upr6.textSize = 12.0F
         upr7.setText("7.L-Sit Hold")
    }

     override fun setULday4() {
        upr1.setText("1.Omni-Grip Lat Pulldown")
        upr1.textSize = 13.0F
        upr2.setText("2.Barbell OHP")
        upr3.setText("3.Chest-Supported Row")
        upr4.setText("4.Close-Grip Bench Press")
        upr5.setText("5.Seated Face Pull")
        upr6.setText("6.DB Lateral Raise 21s")
        upr7.setText("7.Incline Dumbbell Curl")
        upr8.setText("8.Neck Flexion/Ext")
    }

    override fun setWeek1Day1() {
        setFBday1()
        reps1.hint = "1x2"
        reps2.hint = "3x8"
        reps3.hint = "1x4"
        reps4.hint = "2x6"
        reps5.hint = "3x 4-6"
        reps6.hint = "3x 6-8"
        reps7.hint = "4x 15-20"

        kg1.hint = "85%"
        kg3.hint = "80-85%"
        kg4.hint = "75-80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek1Day2() {
        setFBday2()
        reps1.hint = "3x4"
        reps2.hint = "4x5"
        reps3.hint = "2x 8-10"
        reps4.hint = "4x 12-15"
        reps5.hint = "3x 8-10"
        reps6.hint = "2x 12-15"

        kg1.hint = "80%"
        kg2.hint = "75%"
        kg6.hint = "  kg"
    }

    override fun setWeek1Day3() {
        setFBday3()
        reps1.hint = "1x6"
        reps2.hint = "2x4"
        reps3.hint = "1x1"
        reps4.hint = "1x5"
        reps5.hint = "1x10"
        reps6.hint = "3x AMRAP"
        reps7.hint = "2x 10-12"
        reps8.hint = "4x 12-15"
        reps9.hint = "3x 8-10"

        kg1.hint = "75-80%"
        kg2.hint = "70%"
        kg3.hint = "890%"
        kg4.hint = "80%"
        kg5.hint = "65%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
        kg9.hint = "  kg"
    }

    override fun setWeek1Day4() {
        setFBday4()
        reps1.hint = "2x6"
        reps2.hint = "4x 6-8"
        reps3.hint = "3x 12-15"
        reps4.hint = "4x 10-12"
        reps5.hint = "4x 12-15"
        reps6.hint = "4x 8-10"

        kg1.hint = "90%"
        kg6.hint = "  kg"
    }

    override fun setWeek2Day1() {
        setULday1()
        reps1.hint = "3x4"
        reps2.hint = "3x10"
        reps3.hint = "2x 12-15"
        reps4.hint = "2x 10-12"
        reps5.hint = "2x 10/15"
        reps6.hint = "3x 12-15"
        reps7.hint = "3x 10-12"
        reps8.hint = "3x 30s"

        kg1.hint = "75-80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
    }

    override fun setWeek2Day2() {
        setULday2()
        reps1.hint = "2x8"
        reps2.hint = "3x 4-6"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 10-12"
        reps5.hint = "3x 8-10(+4+4)"
        reps6.hint = "2x 20-30"
        reps7.hint = "3x 8-10"

        kg1.hint = "72.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"

    }

    override fun setWeek2Day3() {
        setULday3()
        reps1.hint = "3x3"
        reps2.hint = "3x12"
        reps3.hint = "2x 10-12"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 15-20"
        reps6.hint = "3x 8-10"
        reps7.hint= "3x 10-20s"

        kg1.hint = "80-85%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek2Day4() {
        setULday4()
        reps1.hint = "3x 10-12"
        reps2.hint = "2x4"
        reps3.hint = "2x 10-12"
        reps4.hint = "3x10"
        reps5.hint = "2x 15-20"
        reps6.hint = "2x 7/7/7"
        reps7.hint = "2x 20-30"
        reps8.hint = "2x 10/10"

        kg2.hint = " 80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
    }

     override fun setWeek3Day1() {
        setFBday1()
        reps1.hint = "1x4"
        reps2.hint = "3x8"
        reps3.hint = "1x2"
        reps4.hint = "2x4"
        reps5.hint = "3x 4-6"
        reps6.hint = "3x 6-8"
         reps7.hint = "4x 15-20"

        kg1.hint = "80-85%"
        kg3.hint = "90%"
         kg4.hint = "80-85%"
        kg6.hint = "  kg"
         kg7.hint = "  kg"
    }

     override fun setWeek3Day2() {
        setFBday2()
        reps1.hint = "3x5"
        reps2.hint = "4x6"
        reps3.hint = "2x 8-10"
        reps4.hint = "4x 12-15"
        reps5.hint = "3x 8-10"
        reps6.hint = "2x 12-15"

        kg1.hint = "80%"
        kg2.hint = "75%"
        kg6.hint = "  kg"
    }

     override fun setWeek3Day3() {
        setFBday3()
        reps1.hint = "1x8"
        reps2.hint = "2x5"
        reps3.hint = "1x1"
        reps4.hint = "1x5"
        reps5.hint = "1x12"
        reps6.hint = "3x AMRAP"
         reps7.hint = "2x 10-12"
         reps8.hint = "4x 12-15"
         reps9.hint = "3x 8-10"

        kg1.hint = "80%"
        kg6.hint = "  kg"
         kg7.hint = "  kg"
         kg8.hint = "  kg"
         kg9.hint = "  kg"
    }

     override fun setWeek3Day4() {
        setFBday4()
         upr1.setText("1.4' Block Pull")
        reps1.hint = "2x5"
        reps2.hint = "4x 6-8"
        reps3.hint = "3x 12-15"
        reps4.hint = "4x 10-12"
        reps5.hint = "4x 12-15"
         reps6.hint = "4x 8-10"

        kg1.hint = "90%"
         kg6.hint = "  kg"
     }

     override fun setWeek4Day1() {
        setULday1()
        reps1.hint = "4x4"
        reps2.hint = "3x10"
        reps3.hint = "2x 12-15"
        reps4.hint = "2x 10-12"
        reps5.hint = "2x 10/15"
         reps6.hint = "3x 12-15"
         reps7.hint = "3x 10-12"
         reps8.hint = "3x 30s"

        kg1.hint = "75-80%"
         kg6.hint = "  kg"
         kg7.hint = "  kg"
         kg8.hint = "  kg"
    }

     override fun setWeek4Day2() {
        setULday2()
        reps1.hint = "3x8"
        reps2.hint = "3x 4-6"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 10-12"
        reps5.hint = "3x 8-10(+4+4)"
        reps6.hint = "2x 20-30"
        reps7.hint = "3x 8-10"

        kg1.hint = "72.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"

    }

     override fun setWeek4Day3() {
        setULday3()
        reps1.hint = "3x4"
        reps2.hint = "3x12"
        reps3.hint = "2x 10-12"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 15-20"
        reps6.hint = "3x 8-10"
         reps7.hint= "3x 15-25s"

        kg1.hint = "80-85%"
        kg6.hint = "  kg"
         kg7.hint = "  kg"
    }

     override fun setWeek4Day4() {
        setULday4()
        reps1.hint = "3x 10-12"
        reps2.hint = "3x4"
        reps3.hint = "2x 10-12"
        reps4.hint = "3x11"
        reps5.hint = "2x 15-20"
        reps6.hint = "2x 7/7/7"
        reps7.hint = "2x 20-30"
        reps8.hint = "2x 10/10"

         kg2.hint = "80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
    }

     override fun setWeek5Day1() {
        setFBday1()
        reps1.hint = "1x5"
        reps2.hint = "3x8"
        reps3.hint = "1x5"
        reps4.hint = "2x2"
        reps5.hint = "3x 4-6"
        reps6.hint = "3x 6-8"
         reps7.hint = "4x 15-20"

        kg1.hint = "80-85%"
        kg3.hint = "80-85%"
         kg4.hint = "80-85%"
        kg6.hint = "  kg"
         kg7.hint = "  kg"
    }

     override fun setWeek5Day2() {
        setFBday2()
        reps1.hint = "2x5"
        reps2.hint = "4x7"
        reps3.hint = "2x 8-10"
        reps4.hint = "4x 12-15"
        reps5.hint = "3x 8-10"
        reps6.hint = "2x 12-15"

        kg1.hint = "82.5%"
        kg2.hint = "75%"
        kg6.hint = "  kg"
    }

    override fun setWeek5Day3() {
        setFBday3()
        reps1.hint = "1x10"
        reps2.hint = "2x6"
        reps3.hint = "1x1"
        reps4.hint = "1x6"
        reps5.hint = "1x12"
        reps6.hint = "3x AMRAP"
        reps7.hint = "2x 10-12"
        reps8.hint = "4x 12-15"
        reps9.hint = "3x 8-10"

        kg1.hint = "75%"
        kg2.hint = "70%"
        kg3.hint = "95%"
        kg4.hint = "80%"
        kg5.hint = "70%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
        kg9.hint = "  kg"

    }

    override fun setWeek5Day4() {
        setFBday4()
        upr1.setText("1.2' Block Pull")
        reps1.hint = "2x5"
        reps2.hint = "4x 6-8"
        reps3.hint = "3x 12-15"
        reps4.hint = "4x 10-12"
        reps5.hint = "4x 12-15"
        reps6.hint = "4x 8-10"

        kg1.hint = "90%"
        kg6.hint = "  kg"
    }

    override fun setWeek6Day1() {
        setULday1()
        reps1.hint = "5x4"
        reps2.hint = "3x10"
        reps3.hint = "2x 12-15"
        reps4.hint = "2x 10-12"
        reps5.hint = "2x 10/15"
        reps6.hint = "3x 12-15"
        reps7.hint = "3x 10-12"
        reps8.hint = "3x 30s"

        kg1.hint = "75-80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
    }

    override fun setWeek6Day2() {
        setULday2()
        reps1.hint = "4x8"
        reps2.hint = "3x 4-6"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 10-12"
        reps5.hint = "3x 8-10(+4+4)"
        reps6.hint = "2x 20-30"
        reps7.hint = "3x 8-10"

        kg1.hint = "72.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"

    }

    override fun setWeek6Day3() {
        setULday3()
        reps1.hint = "354"
        reps2.hint = "3x12"
        reps3.hint = "2x 10-12"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 15-20"
        reps6.hint = "3x 8-10"
        reps7.hint= "3x 20-30s"

        kg1.hint = "80-85%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek6Day4() {
        setULday4()
        reps1.hint = "3x 10-12"
        reps2.hint = "4x4"
        reps3.hint = "2x 10-12"
        reps4.hint = "3x12"
        reps5.hint = "2x 15-20"
        reps6.hint = "2x 7/7/7"
        reps7.hint = "2x 20-30"
        reps8.hint = "2x 10/10"

        kg2.hint = "77.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
    }

    override fun setWeek7Day1() {
        setFBday1()
        upr2.setText("2.Barbell Bench Press")
        upr3.setText("3.Wide-Grip Lat Pulldown")
        upr4.setText("4.Sliding Leg Curl")
        upr5.setText("5.Wall Slide")
        upr6.setText("")
        upr7.setText("")

        reps1.hint = "1x4"
        reps2.hint = "3x8"
        reps3.hint = "1x2"
        reps4.hint = "2x4"
        reps5.hint = "3x 4-6"

        kg1.hint = "85%"
        kg3.hint = "75%"
    }

    override fun setWeek7Day2() {
        upr1.setText("1.Opposite Stance DL")
        upr2.setText("2.Barbell OHP")
        upr3.setText("3.Leg Press")
        upr4.setText("4.Seated Cable Row")
        upr5.setText("5.Hammer Curl")
        upr6.setText("6.Barbell/DB Isometric Hold")

        reps1.hint = "3x5"
        reps2.hint = "2x8"
        reps3.hint = "2x 10-12"
        reps4.hint = "3x 10-12"
        reps5.hint = "3x 15-20"
        reps6.hint = "2x 20-30s"

        kg1.hint = "75-80%"
        kg6.hint = "  kg"
    }

    override fun setWeek7Day3() {
        upr1.setText("1.Front Squat")
        upr2.setText("2.Pause Bench Press")
        upr3.setText("3.Weighted Neutral-Grip Pull-Up")
        upr3.textSize=12.5F
        upr4.setText("4.Leg Curl")
        upr5.setText("5.Prone Trap Raise")
        upr6.setText("6.Hanging Leg Raise")
        upr7.setText("7.Standing Calf Raise")

        reps1.hint = "3x8"
        reps2.hint = "3x2"
        reps3.hint = "4x 4-6"
        reps4.hint = "3x 12-15"
        reps5.hint = "3x 12-15"
        reps6.hint = "3x 10-12"
        reps7.hint = "3x 8-10"

        kg2.hint = "80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek7Day4() {
        upr1.setText("1.1' Block Pull")
        upr2.setText("2.Dip")
        upr3.setText("3.One-Arm Row")
        upr4.setText("4.Triceps Pressdown 21s")
        upr5.setText("5.DB Lateral Raise")

        reps1.hint = "2x4"
        reps2.hint = "3x 8-10"
        reps3.hint = "3x 10-12"
        reps4.hint = "7/7/7"
        reps5.hint = "3x 15-20"

        kg1.hint = "90%"
    }

    override fun setWeek8Day1() {
        upr1.setText("1.Pin Squat")
        upr2.setText("2.Barbell RDL")
        upr3.setText("3.A1.Sissy Squat")
        upr4.setText("4.A2.Nordic Ham Curl")
        upr5.setText("5.Uni Standing Calf Raise")
        upr5.textSize=13F
        upr6.setText("6.Hip Abduction")
        upr7.setText("7.A1.Cable Crunch")
        upr8.setText("8.A2.Cable Shrug-In")

        reps1.hint = "2x4"
        reps2.hint = "2x8"
        reps3.hint = "2x 10-12"
        reps4.hint = "2x 6-8"
        reps5.hint = "2x 10-12"
        reps6.hint = "3x 12-15"
        reps7.hint = "3x 12-15"
        reps8.hint = "3x 12-15"

        kg1.hint = "72.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
    }

    override fun setWeek8Day2() {
        upr1.setText("1.Larsen Press")
        upr2.setText("2.Machine Chest-Supp. Row")
        upr2.textSize=13F
        upr3.setText("3.Machine Incline Press")
        upr4.setText("4.Single-Arm Pulldown")
        upr5.setText("5.Triceps Pulldown")
        upr6.setText("6.Inverse Zottman Curl")
        upr7.setText("7.Lateral Rasie")

        reps1.hint = "3x10"
        reps2.hint = "3x 10-12"
        reps3.hint = "2x 10-12"
        reps4.hint = "3x 8-10"
        reps5.hint = "3x 12-15"
        reps6.hint = "3x 12-15"
        reps7.hint = "3x 15-20"

        kg6.hint = "  kg"
        kg7.hint = "  kg"

    }

    override fun setWeek8Day3() {
        upr1.setText("1.Deadlift")
        upr2.setText("2.Hack Squat")
        upr3.setText("3.Cable Pull-Through")
        upr4.setText("4.Leg Extension")
        upr5.setText("5.Uni Leg Curl")
        upr6.setText("6.Standing Calf Raise")
        upr7.setText("7.L-Sit Hold")

        reps1.hint = "2x5"
        reps2.hint = "2x12"
        reps3.hint = "2x 12-15"
        reps4.hint = "3x 15/10"
        reps5.hint = "3x 10-12"
        reps6.hint = "3x 10-12"
        reps7.hint= "2x 20-30s"

        kg1.hint = "75%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek8Day4() {
        upr1.setText("1.Weighted Eccentric-Overload Pull-Up")
        upr1.textSize=12.5F
        upr2.setText("2.Eccentric-Accentutated Pull-Up")
        upr2.textSize=13F
        upr3.setText("3.Barbell OHP")
        upr4.setText("4.Pendlay Row")
        upr5.setText("5.Deficit Push-Up")
        upr6.setText("6.Barbell/EZ Curl")
        upr7.setText("7.DB Lateral Raise Iso-Hold")

        reps1.hint = "1x5"
        reps2.hint = "2x 6-8"
        reps3.hint = "4x4"
        reps4.hint = "3x 5/10"
        reps5.hint = "1x AMRAP"
        reps6.hint = "3x 10-12"
        reps7.hint = "2x 45s"

        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek9Day1() {
        setFBday1()
        upr2.setText("2.Barbell Bench Press")
        upr3.setText("3.Wide-Grip Lat Pulldown")
        upr4.setText("4.Sliding Leg Curl")
        upr5.setText("5.Wall Slide")
        upr6.setText("")
        upr7.setText("")

        reps1.hint = "4x2"
        reps2.hint = "3x6"
        reps3.hint = "4x 6-8"
        reps4.hint = "2x 10-12"
        reps5.hint = "3x 15-20"

        kg1.hint = "85-90%"
        kg3.hint = "77.5%"
    }

    override fun setWeek9Day2() {
        upr1.setText("1.Opposite Stance DL")
        upr2.setText("2.Barbell OHP")
        upr3.setText("3.Leg Press")
        upr4.setText("4.Seated Cable Row")
        upr5.setText("5.Hammer Curl")
        upr6.setText("6.Barbell/DB Isometric Hold")

        reps1.hint = "2x2"
        reps2.hint = "2x8"
        reps3.hint = "2x 10-12"
        reps4.hint = "3x 10-12"
        reps5.hint = "3x 15-20"
        reps6.hint = "2x 20-30s"

        kg1.hint = "75%"
        kg6.hint = "  kg"
    }

    override fun setWeek9Day3() {
        upr1.setText("1.Front Squat")
        upr2.setText("2.Pause Bench Press")
        upr3.setText("3.Weighted Neutral-Grip Pull-Up")
        upr3.textSize=12.5F
        upr4.setText("4.Leg Curl")
        upr5.setText("5.Prone Trap Raise")
        upr6.setText("6.Hanging Leg Raise")
        upr7.setText("7.Standing Calf Raise")

        reps1.hint = "2x8"
        reps2.hint = "3x2"
        reps3.hint = "4x 4-6"
        reps4.hint = "3x 12-15"
        reps5.hint = "3x 12-15"
        reps6.hint = "3x 10-12"
        reps7.hint = "3x 8-10"

        kg2.hint = "90%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek9Day4() {
        upr1.setText("1.Deadlift")
        upr2.setText("2.Dip")
        upr3.setText("3.One-Arm Row")
        upr4.setText("4.Triceps Pressdown 21s")
        upr5.setText("5.DB Lateral Raise")

        reps1.hint = "1x AMRAP"
        reps2.hint = "3x 8-10"
        reps3.hint = "3x 10-12"
        reps4.hint = "7/7/7"
        reps5.hint = "3x 15-20"

        kg1.hint = "90%"
    }

     override fun setWeek10Day1() {
        upr1.setText("1.Pin Squat")
        upr2.setText("2.Barbell RDL")
        upr3.setText("3.A1.Sissy Squat")
        upr4.setText("4.A2.Nordic Ham Curl")
        upr5.setText("5.Uni Standing Calf Raise")
        upr5.textSize=13F
        upr6.setText("6.Hip Abduction")
        upr7.setText("7.A1.Cable Crunch")
        upr8.setText("8.A2.Cable Shrug-In")

        reps1.hint = "2x5"
        reps2.hint = "3x10"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 10-12"
        reps6.hint = "3x 12-15"
        reps7.hint = "3x 12-15"
        reps8.hint = "3x 12-15"

        kg1.hint = "72.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
    }

     override fun setWeek10Day2() {
        upr1.setText("1.Larsen Press")
        upr2.setText("2.Machine Chest-Supp. Row")
        upr2.textSize=13F
        upr3.setText("3.Machine Incline Press")
        upr4.setText("4.Single-Arm Pulldown")
        upr5.setText("5.Triceps Pulldown")
        upr6.setText("6.Inverse Zottman Curl")
        upr7.setText("7.Lateral Rasie")

        reps1.hint = "4x10"
        reps2.hint = "3x 10-12"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 8-10"
        reps5.hint = "3x 12-15"
        reps6.hint = "3x 12-15"
        reps7.hint = "3x 15-20"

        kg6.hint = "  kg"
        kg7.hint = "  kg"

    }

     override fun setWeek10Day3() {
        upr1.setText("1.Deadlift")
        upr2.setText("2.Hack Squat")
        upr3.setText("3.Cable Pull-Through")
        upr4.setText("4.Leg Extension")
        upr5.setText("5.Uni Leg Curl")
        upr6.setText("6.Standing Calf Raise")
        upr7.setText("7.L-Sit Hold")

        reps1.hint = "2x6"
        reps2.hint = "3x12"
        reps3.hint = "3x 12-15"
        reps4.hint = "2x 15/10"
        reps5.hint = "3x 10-12"
        reps6.hint = "3x 10-12"
        reps7.hint= "3x 20-30s"

        kg1.hint = "75-80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek10Day4() {
        upr1.setText("1.Weighted Eccentric-Overload Pull-Up")
        upr1.textSize=12.5F
        upr2.setText("2.Eccentric-Accentutated Pull-Up")
        upr2.textSize=13F
        upr3.setText("3.Barbell OHP")
        upr4.setText("4.Pendlay Row")
        upr5.setText("5.Deficit Push-Up")
        upr6.setText("6.Barbell/EZ Curl")
        upr7.setText("7.DB Lateral Raise Iso-Hold")

        reps1.hint = "1x5"
        reps2.hint = "2x 6-8"
        reps3.hint = "4x5"
        reps4.hint = "3x 5/10"
        reps5.hint = "2x AMRAP"
        reps6.hint = "3x 10-12"
        reps7.hint = "2x 45s"

        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }
    override fun setWeek11Day1() {
        setFBday1()
        upr2.setText("2.Barbell Bench Press")
        upr3.setText("3.Wide-Grip Lat Pulldown")
        upr4.setText("4.Sliding Leg Curl")
        upr5.setText("5.Wall Slide")
        upr6.setText("")
        upr7.setText("")

        reps1.hint = "3x1"
        reps2.hint = "3x6"
        reps3.hint = "4x 6-8"
        reps4.hint = "2x 10-12"
        reps5.hint = "3x 15-20"

        kg1.hint = "90-95%"
        kg3.hint = "80%"
    }

    override fun setWeek11Day2() {
        upr1.setText("1.Opposite Stance DL")
        upr2.setText("2.Barbell OHP")
        upr3.setText("3.Leg Press")
        upr4.setText("4.Seated Cable Row")
        upr5.setText("5.Hammer Curl")
        upr6.setText("6.Barbell/DB Isometric Hold")

        reps1.hint = "3x3"
        reps2.hint = "4x8"
        reps3.hint = "2x 10-12"
        reps4.hint = "3x 10-12"
        reps5.hint = "3x 15-20"
        reps6.hint = "2x 20-30s"

        kg1.hint = "80-85%"
        kg6.hint = "  kg"
    }

    override fun setWeek11Day3() {
        upr1.setText("1.Front Squat")
        upr2.setText("2.Pause Bench Press")
        upr3.setText("3.Weighted Neutral-Grip Pull-Up")
        upr3.textSize=12.5F
        upr4.setText("4.Leg Curl")
        upr5.setText("5.Prone Trap Raise")
        upr6.setText("6.Hanging Leg Raise")
        upr7.setText("7.Standing Calf Raise")

        reps1.hint = "2x8"
        reps2.hint = "3x1"
        reps3.hint = "4x 4-6"
        reps4.hint = "3x 12-15"
        reps5.hint = "3x 12-15"
        reps6.hint = "3x 10-12"
        reps7.hint = "3x 8-10"

        kg2.hint = "92.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override fun setWeek11Day4() {
        upr1.setText("1.Deadlift")
        upr2.setText("2.Dip")
        upr3.setText("3.One-Arm Row")
        upr4.setText("4.Triceps Pressdown 21s")
        upr5.setText("5.DB Lateral Raise")

        reps1.hint = "3x3"
        reps2.hint = "3x 8-10"
        reps3.hint = "3x 10-12"
        reps4.hint = "7/7/7"
        reps5.hint = "3x 15-20"

        kg1.hint = "85%"
    }

    override fun setWeek12Day1() {
        upr1.setText("1.Pin Squat")
        upr2.setText("2.Barbell RDL")
        upr3.setText("3.A1.Sissy Squat")
        upr4.setText("4.A2.Nordic Ham Curl")
        upr5.setText("5.Uni Standing Calf Raise")
        upr5.textSize=13F
        upr6.setText("6.Hip Abduction")
        upr7.setText("7.A1.Cable Crunch")
        upr8.setText("8.A2.Cable Shrug-In")

        reps1.hint = "2x6"
        reps2.hint = "3x12"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 10-12"
        reps6.hint = "3x 12-15"
        reps7.hint = "3x 12-15"
        reps8.hint = "3x 12-15"

        kg1.hint = "72.5%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"
    }

    override fun setWeek12Day2() {
        upr1.setText("1.Bench Press (RPE 9.5 AMRAP)")
        upr1.textSize=13F
        upr2.setText("2.Bench Press (Back Off)")
        upr2.textSize=13.5F
        upr3.setText("3.Machine Chest-Supported Row")
        upr3.textSize=13F
        upr4.setText("4.Machine Incline Press")
        upr5.setText("5.Single-Arm Pulldown")
        upr6.setText("6.Triceps Pulldown")
        upr7.setText("7.Inverse Zottman Curl")
        upr8.setText("8.Lateral Raise")

        reps1.hint = "1x AMRAP"
        reps2.hint = "2x10"
        reps3.hint = "3x 10-12"
        reps4.hint = "3x 10-12"
        reps5.hint = "3x 8-10"
        reps6.hint = "3x 12-15"
        reps7.hint = "3x 12-15"
        reps7.hint = "3x 15-20"

        kg1.hint = "85%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
        kg8.hint = "  kg"

    }

    override fun setWeek12Day3() {
        upr1.setText("1.Deadlift")
        upr2.setText("2.Hack Squat")
        upr3.setText("3.Cable Pull-Through")
        upr4.setText("4.Leg Extension")
        upr5.setText("5.Uni Leg Curl")
        upr6.setText("6.Standing Calf Raise")
        upr7.setText("7.L-Sit Hold")

        reps1.hint = "2x6"
        reps2.hint = "3x12"
        reps3.hint = "3x 12-15"
        reps4.hint = "2x 15/10"
        reps5.hint = "3x 10-12"
        reps6.hint = "3x 10-12"
        reps7.hint= "3x 20-30s"

        kg1.hint = "80%"
        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

    override  fun setWeek12Day4() {
        upr1.setText("1.Weighted Eccentric-Overload Pull-Up")
        upr1.textSize=12.5F
        upr2.setText("2.Eccentric-Accentutated Pull-Up")
        upr2.textSize=13F
        upr3.setText("3.Barbell OHP")
        upr4.setText("4.Pendlay Row")
        upr5.setText("5.Deficit Push-Up")
        upr6.setText("6.Barbell/EZ Curl")
        upr7.setText("7.DB Lateral Raise Iso-Hold")

        reps1.hint = "1x5"
        reps2.hint = "2x 6-8"
        reps3.hint = "4x6"
        reps4.hint = "3x 5/10"
        reps5.hint = "2x AMRAP"
        reps6.hint = "3x 10-12"
        reps7.hint = "2x 45s"

        kg6.hint = "  kg"
        kg7.hint = "  kg"
    }

}