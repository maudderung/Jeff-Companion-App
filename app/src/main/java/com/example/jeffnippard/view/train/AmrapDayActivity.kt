package com.example.jeffnippard.view.train

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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

class amrapDayActivity : AppCompatActivity() {
    var inActivity = false
    var freshlyOpened = true
    lateinit var dateString: String
    var ex = Exercise()
    val date = SimpleDateFormat("dd.MM.yy")
    lateinit var upr1: EditText
    lateinit var upr2: EditText
    lateinit var upr3: EditText
    lateinit var upr4: EditText
    lateinit var reps1: EditText
    lateinit var reps2: EditText
    lateinit var reps3: EditText
    lateinit var reps4: EditText
    lateinit var kg1: EditText
    lateinit var kg2: EditText
    lateinit var kg3: EditText
    lateinit var kg4: EditText
    fun findFields() {
        upr1 = findViewById(R.id.upr1)
        upr2 = findViewById(R.id.upr2)
        upr3 = findViewById(R.id.upr3)
        upr4 = findViewById(R.id.upr4)
        reps1 = findViewById(R.id.reps1)
        reps2 = findViewById(R.id.reps2)
        reps3 = findViewById(R.id.reps3)
        reps4 = findViewById(R.id.reps4)
        kg1 = findViewById(R.id.kg1)
        kg2 = findViewById(R.id.kg2)
        kg3 = findViewById(R.id.kg3)
        kg4 = findViewById(R.id.kg4)
    }
    fun setDay1(){
        upr1.setText("1.Back Squat")
        upr2.setText("2.Single-Arm Lat Pulldown")
        upr2.textSize=14.5F
        upr3.setText("3.Incline DB Curl")
        upr4.setText("4.Standing Calf Raise")

        reps1.hint="1x AMRAP"
        reps2.hint="2x12"
        reps3.hint="4x12"
        reps4.hint="3x12"
        kg1.hint="90%"
    }
    fun setDay2(){
        upr1.setText("1.Barbell Bench Press")
        upr2.setText("2.Leg Curl")
        upr3.setText("3.DB Lateral Raise")
        upr4.setText("4.Triceps Pressdown")
        reps1.hint="1x AMRAP"
        reps2.hint="3x 8-10"
        reps3.hint="2x 15-20"
        reps4.hint="3x12"
        kg1.hint="90%"
    }
    fun setDay3(){
        upr1.setText("1.Deadlift")
        upr2.setText("2.Overhead Press")
        upr3.setText("3.Leg Extension")
        upr4.setText("4.Bicycle Crunch")
        reps1.hint="1x AMRAP"
        reps2.hint="3x10"
        reps3.hint="3x12"
        reps4.hint="4x15"
        kg1.hint="90%"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amrap_day)
        var day: String? =intent.getStringExtra(AlarmClock.EXTRA_MESSAGE)
        var dayTitle:TextView=findViewById(R.id.dayTitle)
        freshlyOpened=true
        inActivity = true
        val viewPrevBtn = findViewById<Button>(R.id.viewPrevBtn2)
        val viewProgramBtn = findViewById<Button>(R.id.viewProgramBtn2)
        val calcBtn = findViewById<Button>(R.id.calcBtn2)
        var exerciseList = ArrayList<Exercise>()
        findFields()

        when(day){
            "Day 1"-> {
                dayTitle.text = "AMRAP Squat"
                setDay1()
            }
            "Day 2"->{
                dayTitle.text = "AMRAP Bench"
                setDay2()
            }
            "Day 3"->{
                dayTitle.text = "AMRAP Deadlift"
                setDay3()
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
                Toast.makeText(this,"No such day in previous cycle", Toast.LENGTH_SHORT).show()
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
        if (exercise.kg != 0.0) {
            exercise.reps = strings.get(2)
        } else {
            exercise.reps = "empty"
        }
        return exercise
    }

    fun getSplitStrings(source: String): Array<String> {
        return source.split("; ").toTypedArray()
    }
}