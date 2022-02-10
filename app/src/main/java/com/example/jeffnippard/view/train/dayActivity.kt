package com.example.jeffnippard.view.train

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.controller.WeekInfo
import com.example.jeffnippard.model.Exercise
import com.example.jeffnippard.view.CalculatorActivity
import com.example.jeffnippard.view.ProgramViewActivity
import com.example.jeffnippard.view.viewDayActivity
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.thread


class dayActivity : AppCompatActivity() {
    var inActivity = false
    var freshlyOpened = true
    lateinit var dateString: String
    var ex = Exercise()
    val date = SimpleDateFormat("dd.MM.yy")
    lateinit var upr1: EditText
    lateinit var upr2: EditText
    lateinit var upr3: EditText
    lateinit var upr4: EditText
    lateinit var upr5: EditText
    lateinit var upr6: EditText
    lateinit var upr7: EditText
    lateinit var upr8: EditText
    lateinit var upr9: EditText
    lateinit var reps1: EditText
    lateinit var reps2: EditText
    lateinit var reps3: EditText
    lateinit var reps4: EditText
    lateinit var reps5: EditText
    lateinit var reps6: EditText
    lateinit var reps7: EditText
    lateinit var reps8: EditText
    lateinit var reps9: EditText
    lateinit var kg1: EditText
    lateinit var kg2: EditText
    lateinit var kg3: EditText
    lateinit var kg4: EditText
    lateinit var kg5: EditText
    lateinit var kg6: EditText
    lateinit var kg7: EditText
    lateinit var kg8: EditText
    lateinit var kg9: EditText

    fun setFBday1() {
        upr1.setText("1.Back Squat")
        upr2.setText("2.Back Squat")
        upr3.setText("3.Overhead Press")
        upr4.setText("4.Glute Ham Raise")
        upr5.setText("5.Helms Row")
        upr6.setText("6.Hammer Curl")
    }

    fun setFBday2() {
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

    fun setFBday3() {
        upr1.setText("1.Back Squat")
        upr2.setText("2.Weighted Dip")
        upr3.setText("3.Hanging Leg Raise")
        upr4.setText("4.Lat Pull-Over")
        upr5.setText("5.Incline Dumbbell Curl")
        upr5.textSize = 13.0F
        upr6.setText("6.Face Pull")
    }

    fun setFBday4() {
        upr1.setText("1.Pause Deadlift")
        upr2.setText("2.Pause Barbell Bench Press")
        upr2.textSize = 11.5F

        upr3.setText("3.Chest-Supported T-Bar Row")
        upr3.textSize = 11.5F

        upr4.setText("4.Nordic Ham Curl")
        upr5.setText("5.Dumbbell Shrug")
    }

    fun setULday1() {
        upr1.setText("1.Deadlift")
        upr2.setText("2.Pause Hi-Bar Squat")
        upr3.setText("3.Leg Curl")
        upr4.setText("4.Standing Calf Raise")
        upr5.setText("5.Hanging Leg Raise")

    }

    fun setULday2() {
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

    fun setULday3() {
        upr1.setText("1.Back Squat")
        upr2.setText("2.Snatch-Grip RDL")
        upr3.setText("3.Leg Extension")
        upr4.setText("4.Standing Calf Raise")
        upr4.textSize = 13.0F
        upr5.setText("5.Hip Abduction")
        upr6.setText("6. V Sit-Up/Crunches")
        upr6.textSize = 13.0F
    }

    fun setULday4() {
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

    fun setWeek1Day1() {
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

    fun setWeek1Day2() {
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

    fun setWeek1Day3() {
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

    fun setWeek1Day4() {
        setFBday4()
        reps1.hint = "4x2"
        reps2.hint = "3x5"
        reps3.hint = "3x10"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 20-25"

        kg1.hint = "75%"
        kg2.hint = "75%"
    }

    fun setWeek2Day1() {
        setULday1()
        reps1.hint = "3x3"
        reps2.hint = "2x8"
        reps3.hint = "3x 6-8"
        reps4.hint = "3x 8-10"
        reps5.hint = "3x 10-12"

        kg1.hint = "80%"

    }

    fun setWeek2Day2() {
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

    fun setWeek2Day3() {
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

    fun setWeek2Day4() {
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

    fun setWeek3Day1() {
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

    fun setWeek3Day2() {
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

    fun setWeek3Day3() {
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

    fun setWeek3Day4() {
        setFBday4()
        reps1.hint = "4x2"
        reps2.hint = "4x5"
        reps3.hint = "3x10"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 20-25"

        kg1.hint = "77.5%"
        kg2.hint = "75%"
    }

    fun setWeek4Day1() {
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

    fun setWeek4Day2() {
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

    fun setWeek4Day3() {
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

    fun setWeek4Day4() {
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

    fun setWeek5Day1() {
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

    fun setWeek5Day2() {
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

    fun setWeek5Day3() {
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

    fun setWeek5Day4() {
        setFBday4()
        reps1.hint = "4x2"
        reps2.hint = "3x6"
        reps3.hint = "3x10"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 20-25"

        kg1.hint = "82.5%"
        kg2.hint = "75%"
    }

    fun setWeek6Day1() {
        setULday1()
        reps1.hint = "3x4"
        reps2.hint = "2x8"
        reps3.hint = "3x 6-8"
        reps4.hint = "3x 8-10"
        reps5.hint = "3x 10-12"

        kg1.hint = "80%"

    }

    fun setWeek6Day2() {
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

    fun setWeek6Day3() {
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

    fun setWeek6Day4() {
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

    fun setWeek7Day1() {
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

    fun setWeek7Day2() {
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

    fun setWeek7Day3() {
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

    fun setWeek7Day4() {
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

    fun setWeek8Day1() {
        setULday1()
        reps1.hint = "3x5"
        reps2.hint = "2x8"
        reps3.hint = "3x 6-8"
        reps4.hint = "3x 8-10"
        reps5.hint = "3x 10-12"

        kg1.hint = "80%"

    }

    fun setWeek8Day2() {
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

    fun setWeek8Day3() {
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

    fun setWeek8Day4() {
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

    fun setWeek9Day1() {
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

    fun setWeek9Day2() {
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

    fun setWeek9Day3() {
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

    fun setWeek9Day4() {
        setFBday4()
        reps1.hint = "4x2"
        reps2.hint = "3x5"
        reps3.hint = "3x10"
        reps4.hint = "3x 6-8"
        reps5.hint = "3x 20-25"

        kg1.hint = "75%"
        kg2.hint = "77.5%"
    }

    fun findFields() {
        upr1 = findViewById(R.id.upr1)
        upr2 = findViewById(R.id.upr2)
        upr3 = findViewById(R.id.upr3)
        upr4 = findViewById(R.id.upr4)
        upr5 = findViewById(R.id.upr5)
        upr6 = findViewById(R.id.upr6)
        upr7 = findViewById(R.id.upr7)
        upr8 = findViewById(R.id.upr8)
        upr9 = findViewById(R.id.upr9)
        reps1 = findViewById(R.id.reps1)
        reps2 = findViewById(R.id.reps2)
        reps3 = findViewById(R.id.reps3)
        reps4 = findViewById(R.id.reps4)
        reps5 = findViewById(R.id.reps5)
        reps6 = findViewById(R.id.reps6)
        reps7 = findViewById(R.id.reps7)
        reps8 = findViewById(R.id.reps8)
        reps9 = findViewById(R.id.reps9)
        kg1 = findViewById(R.id.kg1)
        kg2 = findViewById(R.id.kg2)
        kg3 = findViewById(R.id.kg3)
        kg4 = findViewById(R.id.kg4)
        kg5 = findViewById(R.id.kg5)
        kg6 = findViewById(R.id.kg6)
        kg7 = findViewById(R.id.kg7)
        kg8 = findViewById(R.id.kg8)
        kg9 = findViewById(R.id.kg9)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day)
        freshlyOpened=true
        inActivity = true
        val viewPrevBtn = findViewById<Button>(R.id.viewPrevBtn)
        val viewProgramBtn = findViewById<Button>(R.id.viewProgramBtn)
        val calcBtn = findViewById<Button>(R.id.calcBtn)
        var exerciseList = ArrayList<Exercise>()
        var dayTitle: TextView = findViewById(R.id.dayTitle)
        val day = intent.getStringExtra("day")
        findFields()
        dayTitle.text = "${WeekInfo.week} ${day}"
        when (WeekInfo.week) {
            "Week 1" -> {
                when (day) {
                    "Day 1" -> {
                        setWeek1Day1()
                    }
                    "Day 2" -> {
                        setWeek1Day2()
                    }
                    "Day 3" -> {
                        setWeek1Day3()
                    }
                    "Day 4" -> {
                        setWeek1Day4()
                    }
                }
            }
            "Week 2" -> {
                when (day) {
                    "Day 1" -> {
                        setWeek2Day1()
                    }
                    "Day 2" -> {
                        setWeek2Day2()
                    }
                    "Day 3" -> {
                        setWeek2Day3()
                    }
                    "Day 4" -> {
                        setWeek2Day4()
                    }
                }
            }
            "Week 3" -> {
                when (day) {
                    "Day 1" -> {
                        setWeek3Day1()
                    }
                    "Day 2" -> {
                        setWeek3Day2()
                    }
                    "Day 3" -> {
                        setWeek3Day3()
                    }
                    "Day 4" -> {
                        setWeek3Day4()
                    }
                }
            }
            "Week 4" -> {
                when (day) {
                    "Day 1" -> {
                        setWeek4Day1()
                    }
                    "Day 2" -> {
                        setWeek4Day2()
                    }
                    "Day 3" -> {
                        setWeek4Day3()
                    }
                    "Day 4" -> {
                        setWeek4Day4()
                    }
                }
            }
            "Week 5" -> {
                when (day) {
                    "Day 1" -> {
                        setWeek5Day1()
                    }
                    "Day 2" -> {
                        setWeek5Day2()
                    }
                    "Day 3" -> {
                        setWeek5Day3()
                    }
                    "Day 4" -> {
                        setWeek5Day4()
                    }
                }
            }
            "Week 6" -> {
                when (day) {
                    "Day 1" -> {
                        setWeek6Day1()
                    }
                    "Day 2" -> {
                        setWeek6Day2()
                    }
                    "Day 3" -> {
                        setWeek6Day3()
                    }
                    "Day 4" -> {
                        setWeek6Day4()
                    }
                }
            }
            "Week 7" -> {
                when (day) {
                    "Day 1" -> {
                        setWeek7Day1()
                    }
                    "Day 2" -> {
                        setWeek7Day2()
                    }
                    "Day 3" -> {
                        setWeek7Day3()
                    }
                    "Day 4" -> {
                        setWeek7Day4()
                    }
                }
            }
            "Week 8" -> {
                when (day) {
                    "Day 1" -> {
                        setWeek8Day1()
                    }
                    "Day 2" -> {
                        setWeek8Day2()
                    }
                    "Day 3" -> {
                        setWeek8Day3()
                    }
                    "Day 4" -> {
                        setWeek8Day4()
                    }
                }
            }
            "Week 9" -> {
                when (day) {
                    "Day 1" -> {
                        setWeek9Day1()
                    }
                    "Day 2" -> {
                        setWeek9Day2()
                    }
                    "Day 3" -> {
                        setWeek9Day3()
                    }
                    "Day 4" -> {
                        setWeek9Day4()
                    }
                }
            }
        }
        if(freshlyOpened){ //to populate the current day if out of activity
            if(readFile(day,exerciseList))
            setAllExercises(exerciseList)
            freshlyOpened=false
        }
        thread {
            while (inActivity) {
                    exerciseList.clear()
                    collect(upr1, kg1, reps1, exerciseList)
                    collect(upr2, kg2, reps2, exerciseList)
                    collect(upr3, kg3, reps3, exerciseList)
                    collect(upr4, kg4, reps4, exerciseList)
                    collect(upr5, kg5, reps5, exerciseList)
                    collect(upr6, kg6, reps6, exerciseList)
                    collect(upr7, kg7, reps7, exerciseList)
                    collect(upr8, kg8, reps8, exerciseList)
                    collect(upr9, kg9, reps9, exerciseList)
                    if (!isFileEqualToList(exerciseList, day!!)) {
                        print(isFileEqualToList(exerciseList, day))
                        write(exerciseList, day)
                    }
                Thread.sleep(5000)//make 15s
            }
        }

        viewPrevBtn.setOnClickListener {
            if(File(filesDir.toString()+"/Cycle ${(WeekInfo.cycle-1)}/${WeekInfo.week} ${day}.txt").exists()){
            val intent= Intent(this, viewDayActivity::class.java)
            val extras = Bundle()
            extras.putString("cycle", "Cycle ${(WeekInfo.cycle-1)}")
            extras.putString("day", "${WeekInfo.week} ${day}")
            intent.putExtras(extras)
            startActivity(intent)}
            else{
                Toast.makeText(this,"No such day in previous cycle",Toast.LENGTH_SHORT).show()
            }
        }
        calcBtn.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }
        viewProgramBtn.setOnClickListener {
            val intent = Intent(this, ProgramViewActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        inActivity = false
        super.onBackPressed()
    }

    fun setAllExercises(exerciseList: ArrayList<Exercise>) {
        val size = exerciseList.size
        if (size > 0)
            setExercise(upr1, reps1, kg1, exerciseList.get(0))
        if (size > 1)
            setExercise(upr2, reps2, kg2, exerciseList.get(1))
        if (size > 2)
            setExercise(upr3, reps3, kg3, exerciseList.get(2))
        if (size > 3)
            setExercise(upr4, reps4, kg4, exerciseList.get(3))
        if (size > 4)
            setExercise(upr5, reps5, kg5, exerciseList.get(4))
        if (size > 5)
            setExercise(upr6, reps6, kg6, exerciseList.get(5))
        if (size > 6)
            setExercise(upr7, reps7, kg7, exerciseList.get(6))
        if (size > 7)
            setExercise(upr8, reps8, kg8, exerciseList.get(7))
        if (size > 8)
            setExercise(upr9, reps9, kg9, exerciseList.get(8))

    }

    fun setExercise(upr: TextView, reps: EditText, kg: EditText, exercise: Exercise) {
        upr.text = exercise.name
        if(!exercise.reps.equals("empty"))
            reps.setText(exercise.reps)
        if(exercise.kg!=0.0)
            kg.setText(exercise.kg.toString())
    }

    fun collect(name: EditText, kg: EditText, reps: EditText, exerciseList: ArrayList<Exercise>) {
        if (!name.text.toString().equals(" ")) {
            ex = Exercise()
            ex.name = name.text.toString()
            if (kg.text.isNotEmpty()) {//check for empty fields
                if(!kg.text.toString().equals("."))
                ex.kg = kg.text.toString().toDouble()
            } else {
                ex.kg = 0.0
            }
            if (reps.text.isNotEmpty()) {
                ex.reps = reps.text.toString()
            } else {
                ex.reps = ""
            }
            exerciseList.add(ex)
        }
    }

    fun makeDir(n: Int) {
        val directory = File(applicationContext.filesDir.toString() + "/Cycle ${n}/")
        if (!directory.exists()) {
            directory.mkdir()
        }

    }

    fun write(exerciseList: ArrayList<Exercise>, day: String) {
        makeDir(WeekInfo.cycle)
        File(
            applicationContext.filesDir.toString() + "/Cycle ${WeekInfo.cycle}/",
            "${WeekInfo.week} $day.txt"
        ).printWriter().use { out ->
            out.println(date.format(Date()))
        }
        for (e in exerciseList) {
            File(
                applicationContext.filesDir.toString() + "/Cycle ${WeekInfo.cycle}/",
                "${WeekInfo.week} $day.txt"
            ).appendText(e.name + "; " + e.kg + "; " + e.reps + "\n")
        }

    }

    fun isFileEqualToList(
        exerciseList: ArrayList<Exercise>,
        day: String,
    ): Boolean {//checks if file info is different from the list
        makeDir(WeekInfo.cycle)
        if (File(
                applicationContext.filesDir.toString() + "/Cycle ${WeekInfo.cycle}/",
                "${WeekInfo.week} $day.txt"
            ).exists()
        ) {
            var listText: String = date.format(Date()) + "\n"
            for (ex: Exercise in exerciseList) {
                listText += ex.name + " " + ex.kg + " " + ex.reps + "\n"
            }
            val fileText = File(
                applicationContext.filesDir.toString() + "/Cycle ${WeekInfo.cycle}/",
                "${WeekInfo.week} $day.txt"
            ).bufferedReader().use {
                it.readText()
            }

            if (fileText.equals(listText)) {
                return true //no changes
            } else {
                return false//changes
            }
        } else
            return false
    }

    fun readFile(day: String?, exerciseList: ArrayList<Exercise>): Boolean {
        if(File(applicationContext.filesDir.toString() + "/Cycle ${WeekInfo.cycle}/", "${WeekInfo.week} $day.txt").exists()) {
            exerciseList.clear()
            var line = 0
            val inputStream =
                File(
                    applicationContext.filesDir.toString() + "/Cycle ${WeekInfo.cycle}/",
                    "${WeekInfo.week} $day.txt"
                ).inputStream()
            val lineList = mutableListOf<String>()
            inputStream.bufferedReader().forEachLine { lineList.add(it) }
            for (s in lineList) {
                if (line == 0) {
                    dateString = s
                    line++
                } else if (dateString.equals(date.format(Date()).toString())) {
                    ex = Exercise()
                    ex = stringToExercise(s)
                    exerciseList.add(ex)
                    line++
                }
            }
            return true
        }
        return false
    }

    fun stringToExercise(text: String): Exercise {
        val exercise = Exercise()
        val strings = getSplitStrings(text)
        exercise.name = strings.get(0)
        exercise.kg = strings.get(1).toDouble()
        exercise.reps = strings.get(2)
        if(exercise.reps.equals(""))
            exercise.reps = "empty"
        return exercise
    }

    fun getSplitStrings(source: String): Array<String> {
        return source.split("; ").toTypedArray()
    }
}
