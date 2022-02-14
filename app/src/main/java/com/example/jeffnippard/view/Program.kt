package com.example.jeffnippard.view

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.controller.WeekInfo
import com.example.jeffnippard.view.train.amrapWeekActivity
import com.example.jeffnippard.view.train.dayActivity
import com.example.jeffnippard.view.train.week1Activity
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

@Throws(IOException::class)
fun getFileFromAssets(context: Context, fileName: String): File = File(context.cacheDir, fileName)
    .also {
        if (!it.exists()) {
            it.outputStream().use { cache ->
                context.assets.open(fileName).use { inputStream ->
                    inputStream.copyTo(cache)
                }
            }
        }
    }

@Suppress("SpellCheckingInspection")
class Program : AppCompatActivity() {
    @SuppressLint("SimpleDateFormat")
    val date = SimpleDateFormat("dd.MM.yy")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_train2)
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
        val cycleInput = findViewById<EditText>(R.id.cycleInput)
        val cont = findViewById<ImageView>(R.id.cont)
        val case = intent.getStringExtra("train")
        if (File(applicationContext.filesDir.toString() + "/cycleInfo.txt").exists()) {
            val cf = returnCycleFromFile()
            cycleInput.setText(cf.toString())
        }else{
            cycleInput.setText("1")
        }
        when (case) {
            "TRAIN" -> {
                bWeek1.setOnClickListener {
                    val intent = Intent(this, week1Activity::class.java)
                    WeekInfo.week = "Week 1"
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek2.setOnClickListener {
                    val intent = Intent(this, week1Activity::class.java)
                    WeekInfo.week = "Week 2"
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek3.setOnClickListener {
                    val intent = Intent(this, week1Activity::class.java)
                    WeekInfo.week = "Week 3"
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek4.setOnClickListener {
                    val intent = Intent(this, week1Activity::class.java)
                    WeekInfo.week = "Week 4"
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek5.setOnClickListener {
                    val intent = Intent(this, week1Activity::class.java)
                    WeekInfo.week = "Week 5"
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek6.setOnClickListener {
                    val intent = Intent(this, week1Activity::class.java)
                    WeekInfo.week = "Week 6"
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek7.setOnClickListener {
                    val intent = Intent(this, week1Activity::class.java)
                    WeekInfo.week = "Week 7"
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek8.setOnClickListener {
                    val intent = Intent(this, week1Activity::class.java)
                    WeekInfo.week = "Week 8"
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek9.setOnClickListener {
                    val intent = Intent(this, week1Activity::class.java)
                    WeekInfo.week = "Week 9"
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                bWeek10.setOnClickListener {
                    val intent = Intent(this, amrapWeekActivity::class.java)
                    WeekInfo.week = "Week 10"
                    initCycle(cycleInput)
                    startActivity(intent)
                }
                cont.setOnClickListener {
                    val intent = Intent(this, dayActivity::class.java)
                    initCycle(cycleInput)
                    val day = continueWorkout()
                    if(WeekInfo.week == "Week 10"){
                        Toast.makeText(this,"Week 10 not supported",Toast.LENGTH_SHORT).show()
                    }else{
                    intent.putExtra("day", day)
                    startActivity(intent)
                    }
                }
            }
            "PROGRAM" -> {
                bWeek1.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    WeekInfo.week = "Week 1"
                    startActivity(intent)
                }
                bWeek2.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    WeekInfo.week = "Week 2"
                    startActivity(intent)
                }
                bWeek3.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    WeekInfo.week = "Week 3"
                    startActivity(intent)
                }
                bWeek4.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    WeekInfo.week = "Week 4"
                    startActivity(intent)
                }
                bWeek5.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    WeekInfo.week = "Week 5"
                    startActivity(intent)
                }
                bWeek6.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    WeekInfo.week = "Week 6"
                    startActivity(intent)
                }
                bWeek7.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    WeekInfo.week = "Week 7"
                    startActivity(intent)
                }
                bWeek8.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    WeekInfo.week = "Week 8"
                    startActivity(intent)
                }
                bWeek9.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    WeekInfo.week = "Week 9"
                    startActivity(intent)
                }
                bWeek10.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    WeekInfo.week = "Week 10"
                    startActivity(intent)
                }
                cont.setOnClickListener {
                    val intent = Intent(this, ProgramViewActivity::class.java).apply {
                    }
                    WeekInfo.week = "Subs"
                    startActivity(intent)
                }
                val id =
                    resources.getIdentifier("com.example.jeffnippard:drawable/subs", null, null)
                val cont = findViewById<ImageView>(R.id.cont)
                cont.setImageResource(id)
            }
        }
    }

    private fun initCycle(cycleInput: EditText) {
        val cycleFile = File(applicationContext.filesDir, "/cycleInfo.txt")
        if (!cycleFile.exists()) {//ako e pusnata za purvi put
            cycleFile.printWriter().use { out ->
                out.println(1)
            }
        } else {
            returnCycleFromFile()
            WeekInfo.cycle = cycleInput.text.toString().toInt()
            cycleFile.printWriter().use { out ->
                out.println(WeekInfo.cycle)
            }
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
        val s: String
        if(File(filesDir.toString() + "/Cycle ${WeekInfo.cycle}").listFiles().isNullOrEmpty()){
            WeekInfo.week = "Week 1"
            s="Week 1 Day 1"
        }else{
        File(filesDir.toString() + "/Cycle ${WeekInfo.cycle}").listFiles().forEach {
            sessions.add(File(it.toString()).name.substring(0, File(it.toString()).name.length - 4))
            sessions.sort()
        }
        s = sessions[sessions.size - 1]
        if (s.substring(0, 7) == "Week 10") {
            WeekInfo.week = "Week 10"
        } else {
            WeekInfo.week = s.substring(0, 6)
        }}
        return s.substring(WeekInfo.week.length + 1, s.length)
    }

    private fun continueWorkout(): String {
        val dayToCheck = returnLastWorkout()
        var day: String
        var dateString = ""
        var line = 0
        if(!File(applicationContext.filesDir.toString() + "/Cycle ${WeekInfo.cycle}/", "${WeekInfo.week} $dayToCheck.txt").exists()){
            day="Day 1"
        }else {
            val inputStream = File(applicationContext.filesDir.toString() + "/Cycle ${WeekInfo.cycle}/", "${WeekInfo.week} $dayToCheck.txt").inputStream()
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
                if(day == "Day 5"){
                    day="Day 1"
                    val n = WeekInfo.week[WeekInfo.week.length - 1]
                    WeekInfo.week = "Week ${n.digitToInt() + 1}"
                }
            }
        }
        return day
    }


}
