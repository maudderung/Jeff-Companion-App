package com.example.jeffnippard.viewViewmodel.mainMenu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.model.GeneralInfo
import com.example.jeffnippard.viewViewmodel.MainActivity
import com.example.jeffnippard.viewViewmodel.train.daysActivity
import com.example.jeffnippard.viewViewmodel.train.trainActivity
import java.io.File
import java.text.SimpleDateFormat
import java.util.*


class days12Activity : AppCompatActivity() {
    @SuppressLint("SimpleDateFormat")
    val date = SimpleDateFormat("dd.MM.yy")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weeks12)
        val bWeek1 = findViewById<ImageView>(R.id.week1)
        val bWeek2 = findViewById<ImageView>(R.id.week2)
        val bWeek3 = findViewById<ImageView>(R.id.week3)
        val bWeek4 = findViewById<ImageView>(R.id.week4)
        val bWeek5 = findViewById<ImageView>(R.id.week5)
        val bWeek6 = findViewById<ImageView>(R.id.week6)
        val bWeek7 = findViewById<ImageView>(R.id.week7)
        val bWeek8 = findViewById<ImageView>(R.id.week8)
        val bWeek9 = findViewById<ImageView>(R.id.week9)
        val bWeek10 = findViewById<ImageView>(R.id.week10)
        val bWeek11 = findViewById<ImageView>(R.id.week11)
        val bWeek12 = findViewById<ImageView>(R.id.week12)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val cycleInput = findViewById<EditText>(R.id.cycleInput2)
        val cont = findViewById<ImageView>(R.id.cont)
        val case = intent.getStringExtra("train")
        if (File(applicationContext.filesDir.toString() + "/cycleInfo.txt").exists()) {
            val cf = returnCycleFromFile()
            cycleInput.setText(cf.toString())
        } else {
            cycleInput.setText("1")
        }
        initSpinner(spinner)
        when (case) {
            "TRAIN" -> {
                bWeek1.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.week = "Week 1"
                    GeneralInfo.weekInt = 1
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek2.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.week = "Week 2"
                    GeneralInfo.weekInt = 2
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek3.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.week = "Week 3"
                    GeneralInfo.weekInt = 3
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek4.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.week = "Week 4"
                    GeneralInfo.weekInt = 4
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek5.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.week = "Week 5"
                    GeneralInfo.weekInt = 5
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek6.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.week = "Week 6"
                    GeneralInfo.weekInt = 6
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek7.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.week = "Week 7"
                    GeneralInfo.weekInt = 7
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek8.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.week = "Week 8"
                    GeneralInfo.weekInt = 8
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek9.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.weekInt = 9
                    GeneralInfo.week = "Week 9"
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek10.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.week = "Week 10"
                    GeneralInfo.weekInt = 10
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek11.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.week = "Week 11"
                    GeneralInfo.weekInt = 11
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek12.setOnClickListener {
                    val intent = Intent(this, daysActivity::class.java)
                    GeneralInfo.week = "Week 12"
                    GeneralInfo.weekInt = 12
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                cont.setOnClickListener {
                    val intent = Intent(this, trainActivity::class.java)
                    val day = continueWorkout()
                    if (GeneralInfo.week == "Week 13") {
                        Toast.makeText(this, "Cycle finished.", Toast.LENGTH_SHORT).show()
                        GeneralInfo.week = "Week 1"
                        GeneralInfo.weekInt = 1
                        GeneralInfo.cycle++
                        updateCycle()
                        intent.setClass(this, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        initCycle(cycleInput)
                        intent.putExtra("day", day)
                        startActivity(intent)
                    }
                }
            }
            "PROGRAM" -> {
                bWeek1.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 1"
                    startActivity(intent)
                }
                bWeek2.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 2"
                    startActivity(intent)
                }
                bWeek3.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 3"
                    startActivity(intent)
                }
                bWeek4.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 4"
                    startActivity(intent)
                }
                bWeek5.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 5"
                    startActivity(intent)
                }
                bWeek6.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 6"
                    startActivity(intent)
                }
                bWeek7.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 7"
                    startActivity(intent)
                }
                bWeek8.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 8"
                    startActivity(intent)
                }
                bWeek9.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 9"
                    startActivity(intent)
                }
                bWeek10.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 10"
                    startActivity(intent)
                }
                bWeek11.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 11"
                    startActivity(intent)
                }
                bWeek12.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Week 12"
                    startActivity(intent)
                }
                cont.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    GeneralInfo.week = "Subs"
                    startActivity(intent)
                }
                val id =
                    resources.getIdentifier("com.example.jeffnippard:drawable/subs", null, null)
                val cont = findViewById<ImageView>(R.id.cont)
                cont.setImageResource(id)
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }

    private fun initCycle(cycleInput: EditText) {
        val cycleFile = File(applicationContext.filesDir, "/cycleInfo.txt")
        if (!cycleFile.exists()) {//ako e pusnata za purvi put
            cycleFile.printWriter().use { out ->
                out.println(1)
            }
        } else {
            returnCycleFromFile()
            GeneralInfo.cycle = cycleInput.text.toString().toInt()
            cycleFile.printWriter().use { out ->
                out.println(GeneralInfo.cycle)
            }
        }
    }

    private fun updateCycle() {
        val cycleFile = File(applicationContext.filesDir, "/cycleInfo.txt")
        cycleFile.printWriter().use { out ->
            out.print(GeneralInfo.cycle)

        }
    }

    private fun returnCycleFromFile(): Int {
        var cycle = 1
        val inputStream =
            File(applicationContext.filesDir.toString() + "/cycleInfo.txt").inputStream()
        inputStream.bufferedReader().forEachLine { cycle = it.toInt() }
        return cycle
    }

    private fun returnLastWorkout(): String {
        val sessions = ArrayList<String>()
        val doubledigitList = ArrayList<String>()
        val s: String
        if (File(filesDir.toString() + "/${GeneralInfo.program}/Cycle ${GeneralInfo.cycle}").listFiles()
                .isNullOrEmpty()
        ) {
            GeneralInfo.week = "Week 1"
            s = "Week 1 Day 1"
        } else {
            File(filesDir.toString() + "/${GeneralInfo.program}/Cycle ${GeneralInfo.cycle}").listFiles()
                .forEach {
                    if (File(it.toString()).name.length == 17) {
                        doubledigitList.add(
                            File(it.toString()).name.substring(
                                0,
                                File(it.toString()).name.length - 4
                            )
                        )
                    } else {
                        sessions.add(
                            File(it.toString()).name.substring(
                                0,
                                File(it.toString()).name.length - 4
                            )
                        )
                    }
                }
            sessions.sort()
            doubledigitList.sort()

            s = if (doubledigitList.isNotEmpty()) {
                doubledigitList[doubledigitList.size - 1]

            } else {
                sessions[sessions.size - 1]
            }
            if (s.length == 13) {
                GeneralInfo.week = s.substring(0, 7)
            } else {
                GeneralInfo.week = s.substring(0, 6)
            }
        }
        return s.substring(GeneralInfo.week.length + 1, s.length)
    }

    private fun continueWorkout(): String {
        val dayToCheck = returnLastWorkout()
        var day: String
        var dateString = ""
        var line = 0
        if (!File(
                applicationContext.filesDir.toString() + "/${GeneralInfo.program}/Cycle ${GeneralInfo.cycle}/",
                "${GeneralInfo.week} $dayToCheck.txt"
            ).exists()
        ) {
            day = "Day 1"
        } else {
            val inputStream = File(
                applicationContext.filesDir.toString() + "/${GeneralInfo.program}/Cycle ${GeneralInfo.cycle}/",
                "${GeneralInfo.week} $dayToCheck.txt"
            ).inputStream()
            val lineList = mutableListOf<String>()
            inputStream.bufferedReader().forEachLine { lineList.add(it) }
            for (s in lineList) {
                if (line == 0) {
                    dateString = s
                    line++
                }
            }
            if (date.format(Date()).equals(dateString)) {//if you're working out today
                day = dayToCheck
            } else {
                val num = dayToCheck[dayToCheck.length - 1]
                day = "Day ${num.digitToInt() + 1}"
                if (day == "Day 5") {
                    day = "Day 1"
                    if (GeneralInfo.week == "Week 12") {
                        GeneralInfo.week = "Week 13"
                        GeneralInfo.weekInt = 13
                    } else {
                        GeneralInfo.weekInt =
                            Integer.parseInt(GeneralInfo.week[GeneralInfo.week.length - 1].toString()) + 1
                        GeneralInfo.week = "Week ${GeneralInfo.weekInt}"
                    }
                }
            }
        }
        return day
    }


    private fun initSpinner(spinner: Spinner) {
        val programs = resources.getStringArray(R.array.programs)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                R.layout.spinner_white_text, R.id.textviewspinner, programs
            )
            spinner.adapter = adapter
            spinner.setSelection(programs.indexOf(GeneralInfo.program))

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    val case = intent.getStringExtra("train")
                    var flag = true
                    GeneralInfo.program = programs[position]
                    write(GeneralInfo.program)
                    var intent = Intent(this@days12Activity, Program::class.java)
                    when (programs[position]) {
                        "Powerbuilding 2.0 4x" -> {
                            intent = Intent(this@days12Activity, days12Activity::class.java)
                            flag = false
                        }
                    }
                    intent.putExtra("train", case)
                    if (flag)
                        startActivity(intent)
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
        }
    }


    private fun makeDir() {
        val directory = File(applicationContext.filesDir.toString() + "/Program/")
        if (!directory.exists()) {
            directory.mkdir()
        }
    }

    private fun write(program: String) {
        makeDir()
        File(
            applicationContext.filesDir.toString() + "/Program/currentProgram.txt"
        ).printWriter().use { out ->
            out.print(program)
        }
    }

}



