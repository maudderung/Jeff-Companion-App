package com.example.jeffnippard.viewViewmodel.train

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.model.*
import com.example.jeffnippard.viewViewmodel.mainMenu.CalculatorActivity
import com.example.jeffnippard.viewViewmodel.mainMenu.ProgramViewActivity
import com.example.jeffnippard.viewViewmodel.mainMenu.viewDayActivity
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.thread


@Suppress("SpellCheckingInspection")
class trainActivity : AppCompatActivity() {
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
    private lateinit var upr5: EditText
    private lateinit var upr6: EditText
    private lateinit var upr7: EditText
    private lateinit var upr8: EditText
    private lateinit var upr9: EditText
    private lateinit var reps1: EditText
    private lateinit var reps2: EditText
    private lateinit var reps3: EditText
    private lateinit var reps4: EditText
    private lateinit var reps5: EditText
    private lateinit var reps6: EditText
    private lateinit var reps7: EditText
    private lateinit var reps8: EditText
    private lateinit var reps9: EditText
    private lateinit var kg1: EditText
    private lateinit var kg2: EditText
    private lateinit var kg3: EditText
    private lateinit var kg4: EditText
    private lateinit var kg5: EditText
    private lateinit var kg6: EditText
    private lateinit var kg7: EditText
    private lateinit var kg8: EditText
    private lateinit var kg9: EditText

    private fun findFields() {
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
        setContentView(R.layout.activity_train)
        val viewPrevBtn = findViewById<Button>(R.id.viewPrevBtn)
        val viewProgramBtn = findViewById<Button>(R.id.viewProgramBtn)
        val calcBtn = findViewById<Button>(R.id.calcBtn)
        val dayTitle: TextView = findViewById(R.id.dayTitle)
        freshlyOpened=true
        inActivity = true
        day = intent.getStringExtra("day")
        findFields()
        dayTitle.text = "${GeneralInfo.week} $day"
        var pb: TrainingProgram= PowerBuilding1(
            upr1, upr2, upr3, upr4, upr5, upr6, upr7, upr8, upr9,
            reps1, reps2, reps3, reps4, reps5, reps6, reps7, reps8, reps9,
            kg1, kg2, kg3, kg4, kg6, kg7, kg8, kg9
        )
        when(GeneralInfo.program){
            "Powerbuilding 2.0 4x" -> pb=PowerBuilding2(
                upr1,upr2, upr3, upr4, upr5, upr6, upr7, upr8, upr9,
                reps1, reps2, reps3, reps4, reps5, reps6, reps7, reps8, reps9,
                kg1, kg2, kg3, kg4, kg5, kg6, kg7, kg8, kg9
            )
        }
        when (GeneralInfo.week) {
            "Week 1" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek1Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek1Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek1Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek1Day4()
                    }
                }
            }
            "Week 2" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek2Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek2Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek2Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek2Day4()
                    }
                }
            }
            "Week 3" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek3Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek3Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek3Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek3Day4()
                    }
                }
            }
            "Week 4" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek4Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek4Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek4Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek4Day4()
                    }
                }
            }
            "Week 5" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek5Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek5Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek5Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek5Day4()
                    }
                }
            }
            "Week 6" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek6Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek6Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek6Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek6Day4()
                    }
                }
            }
            "Week 7" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek7Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek7Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek7Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek7Day4()
                    }
                }
            }
            "Week 8" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek8Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek8Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek8Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek8Day4()
                    }
                }
            }
            "Week 9" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek9Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek9Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek9Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek9Day4()
                    }
                }
            }
            "Week 10" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek10Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek10Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek10Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek10Day4()
                    }
                }
            }
            "Week 11" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek11Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek11Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek11Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek11Day4()
                    }
                }
            }
            "Week 12" -> {
                when (day) {
                    "Day 1" -> {
                        pb.setWeek12Day1()
                    }
                    "Day 2" -> {
                        pb.setWeek12Day2()
                    }
                    "Day 3" -> {
                        pb.setWeek12Day3()
                    }
                    "Day 4" -> {
                        pb.setWeek12Day4()
                    }
                }
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
                Thread.sleep(5000)
            }
        }

        viewPrevBtn.setOnClickListener {
            if(File(filesDir.toString()+"/${GeneralInfo.program}/Cycle ${(GeneralInfo.cycle)}/Week ${(GeneralInfo.weekInt)-2} ${day}.txt").exists()){
            val intent= Intent(this, viewDayActivity::class.java)
            val extras = Bundle()
                extras.putString("program", "${GeneralInfo.program}")
            extras.putString("cycle", "Cycle ${(GeneralInfo.cycle)}")
            extras.putString("day", "Week ${(GeneralInfo.weekInt)-2} $day")
            intent.putExtras(extras)
            startActivity(intent)}
            else{
               Toast.makeText(this,"No such day.",Toast.LENGTH_SHORT).show()
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

    private fun threadWrite(){ //Collect all fields and write them to the file
        exerciseList.clear()
        collect(upr1, kg1, reps1)
        collect(upr2, kg2, reps2)
        collect(upr3, kg3, reps3)
        collect(upr4, kg4, reps4)
        collect(upr5, kg5, reps5)
        collect(upr6, kg6, reps6)
        collect(upr7, kg7, reps7)
        collect(upr8, kg8, reps8)
        collect(upr9, kg9, reps9)
        if (!isFileEqualToList()) {
            print(isFileEqualToList())
            write()
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
        if (size > 4)
            setExercise(upr5, reps5, kg5, exerciseList[4])
        if (size > 5)
            setExercise(upr6, reps6, kg6, exerciseList[5])
        if (size > 6)
            setExercise(upr7, reps7, kg7, exerciseList[6])
        if (size > 7)
            setExercise(upr8, reps8, kg8, exerciseList[7])
        if (size > 8)
            setExercise(upr9, reps9, kg9, exerciseList[8])

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
    private fun makeProgramsDir() {
        val directory = File(applicationContext.filesDir.toString() + "/${GeneralInfo.program}")
        if (!directory.exists()) {
            directory.mkdir()
        }

    }

    private fun write() {
        makeProgramsDir()
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

            return fileText == listText
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
