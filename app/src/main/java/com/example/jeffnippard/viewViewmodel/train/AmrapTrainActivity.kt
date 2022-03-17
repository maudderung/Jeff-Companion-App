package com.example.jeffnippard.viewViewmodel.train

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.model.Exercise
import com.example.jeffnippard.model.GeneralInfo
import com.example.jeffnippard.viewViewmodel.mainMenu.CalculatorActivity
import com.example.jeffnippard.viewViewmodel.mainMenu.ProgramViewActivity
import com.example.jeffnippard.viewViewmodel.mainMenu.viewDayActivity
import java.io.File
import java.io.FileNotFoundException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.thread

@Suppress("SpellCheckingInspection")
class amrapDayActivity : AppCompatActivity() {
    private var exerciseList = ArrayList<Exercise>()
    private var day : String? = ""
    private var inActivity = false
    private var freshlyOpened = true
    private lateinit var dateString: String
    private var ex = Exercise()
    private val date = SimpleDateFormat("dd.MM.yy")
    private lateinit var upr1: EditText
    private lateinit var upr2: EditText
    private lateinit var upr3: EditText
    private lateinit var upr4: EditText
    private lateinit var reps1: EditText
    private lateinit var reps2: EditText
    private lateinit var reps3: EditText
    private lateinit var reps4: EditText
    private lateinit var kg1: EditText
    private lateinit var kg2: EditText
    private lateinit var kg3: EditText
    private lateinit var kg4: EditText
    private fun findFields() {
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
    private fun setDay1(){
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
    private fun setDay2(){
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
    private fun setDay3(){
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
        setContentView(R.layout.activity_amrap_train)
        day = intent.getStringExtra("day")
        var dayTitle:TextView=findViewById(R.id.dayTitle)
        freshlyOpened=true
        inActivity = true
        val viewPrevBtn = findViewById<Button>(R.id.viewPrevBtn2)
        val viewProgramBtn = findViewById<Button>(R.id.viewProgramBtn2)
        val calcBtn = findViewById<Button>(R.id.calcBtn2)
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
            if(readFile())
                setAllExercises()
            freshlyOpened=false
        }
        thread {
            while (inActivity) {
                threadWrite()
                Thread.sleep(5000)//make 15s
            }
        }

        viewPrevBtn.setOnClickListener {
            if(File(filesDir.toString()+"/Cycle ${(GeneralInfo.cycle-1)}/${GeneralInfo.week} ${day}.txt").exists()){
                val intent= Intent(this, viewDayActivity::class.java)
                val extras = Bundle()
                extras.putString("cycle", "Cycle ${(GeneralInfo.cycle-1)}")
                extras.putString("day", "${GeneralInfo.week} $day")
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
        threadWrite()
        inActivity = false
        super.onBackPressed()
    }
    private fun threadWrite(){
        exerciseList.clear()
        collect(upr1, kg1, reps1)
        collect(upr2, kg2, reps2)
        collect(upr3, kg3, reps3)
        collect(upr4, kg4, reps4)
        if (!isFileEqualToList()) {
            print(isFileEqualToList())
            try{
            write()
            }
            catch(e: FileNotFoundException){
                e.printStackTrace()
                Handler(Looper.getMainLooper()).post {
                    Toast.makeText(this, "Error. First open other workouts.", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

    private fun setAllExercises() {
        val size = exerciseList.size
        if (size > 0)
            setExercise(upr1, reps1, kg1, exerciseList[0])
        if (size > 1)
            setExercise(upr2, reps2, kg2, exerciseList[1])
        if (size > 2)
            setExercise(upr3, reps3, kg3, exerciseList[2])
        if (size > 3)
            setExercise(upr4, reps4, kg4, exerciseList[3])
    }

    private fun setExercise(upr: TextView, reps: EditText, kg: EditText, exercise: Exercise) {
        upr.text = exercise.name
        if(exercise.reps != "empty")
            reps.setText(exercise.reps)
        if(exercise.kg!=0.0)
            kg.setText(exercise.kg.toString())
    }

    private fun collect(name: EditText, kg: EditText, reps: EditText) {
        if (name.text.toString() != " ") {
            ex = Exercise()
            ex.name = name.text.toString()
            if (kg.text.isNotEmpty()) {//check for empty fields
                if(kg.text.toString() != ".")
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

    private fun makeDir(n: Int) {
        val directory = File(applicationContext.filesDir.toString() + "/${GeneralInfo.program}/Cycle ${n}/")
        if (!directory.exists()) {
            directory.mkdir()
        }

    }

    private fun write() {
        makeDir(GeneralInfo.cycle)
        File(
            applicationContext.filesDir.toString() + "/${GeneralInfo.program}/Cycle ${GeneralInfo.cycle}/",
            "${GeneralInfo.week} $day.txt"
        ).printWriter().use { out ->
            out.println(date.format(Date()))
        }
        for (e in exerciseList) {
            File(
                applicationContext.filesDir.toString() + "/${GeneralInfo.program}/Cycle ${GeneralInfo.cycle}/",
                "${GeneralInfo.week} $day.txt"
            ).appendText(e.name + "; " + e.kg + "; " + e.reps + "\n")
        }

    }

    private fun isFileEqualToList(): Boolean {//checks if file info is different from the list
        makeDir(GeneralInfo.cycle)
        if (File(
                applicationContext.filesDir.toString() + "/${GeneralInfo.program}/Cycle ${GeneralInfo.cycle}/",
                "${GeneralInfo.week} $day.txt"
            ).exists()
        ) {
            var listText: String = date.format(Date()) + "\n"
            for (ex: Exercise in exerciseList) {
                listText += ex.name + " " + ex.kg + " " + ex.reps + "\n"
            }
            val fileText = File(
                applicationContext.filesDir.toString() + "/${GeneralInfo.program}/Cycle ${GeneralInfo.cycle}/",
                "${GeneralInfo.week} $day.txt"
            ).bufferedReader().use {
                it.readText()
            }
            return fileText.equals(listText)
        } else
            return false
    }

    private fun readFile(): Boolean {
        if(File(applicationContext.filesDir.toString() + "/${GeneralInfo.program}/Cycle ${GeneralInfo.cycle}/", "${GeneralInfo.week} $day.txt").exists()) {
            exerciseList.clear()
            var line = 0
            val inputStream =
                File(
                    applicationContext.filesDir.toString() + "/${GeneralInfo.program}/Cycle ${GeneralInfo.cycle}/",
                    "${GeneralInfo.week} $day.txt"
                ).inputStream()
            val lineList = mutableListOf<String>()
            inputStream.bufferedReader().forEachLine { lineList.add(it) }
            for (s in lineList) {
                if (line == 0) {
                    dateString = s
                    line++
                } else if (dateString == date.format(Date()).toString()) {
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

    private fun stringToExercise(text: String): Exercise {
        val exercise = Exercise()
        val strings = getSplitStrings(text)
        exercise.name = strings[0]
        exercise.kg = strings[1].toDouble()
        exercise.reps = strings[2]
        if(exercise.reps == "")
            exercise.reps = "empty"
        return exercise
    }

    private fun getSplitStrings(source: String): Array<String> {
        return source.split("; ").toTypedArray()
    }
}