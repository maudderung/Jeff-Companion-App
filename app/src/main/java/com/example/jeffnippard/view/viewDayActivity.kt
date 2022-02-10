package com.example.jeffnippard.view

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.model.Exercise
import java.io.File


class viewDayActivity : AppCompatActivity() {
    lateinit var dateString: String
    var ex = Exercise()
    lateinit var upr1: TextView
    lateinit var upr2: TextView
    lateinit var upr3: TextView
    lateinit var upr4: TextView
    lateinit var upr5: TextView
    lateinit var upr6: TextView
    lateinit var upr7: TextView
    lateinit var upr8: TextView
    lateinit var upr9: TextView
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
        setContentView(R.layout.activity_view_day)
        val exerciseList = ArrayList<Exercise>()
        val dayTitle: TextView = findViewById(R.id.dayTitle)
        val cycle:String
        val extras = intent.extras
        val day = extras!!.getString("day")
        val dateLabel=findViewById<TextView>(R.id.dateTitle)

        findFields()

            cycle= extras.getString("cycle").toString()
            dayTitle.text=day
            readFile(day, exerciseList, cycle)
            dateLabel.text=dateString
            setAllExercises(exerciseList)

    }
    fun setAllExercises(exerciseList: ArrayList<Exercise>){
        val size=exerciseList.size
        if(size>0)
            setExercise(upr1,reps1,kg1,exerciseList.get(0))
        if(size>1)
            setExercise(upr2,reps2,kg2,exerciseList.get(1))
        if(size>2)
            setExercise(upr3,reps3,kg3,exerciseList.get(2))
        if(size>3)
            setExercise(upr4,reps4,kg4,exerciseList.get(3))
        if(size>4)
            setExercise(upr5,reps5,kg5,exerciseList.get(4))
        if(size>5)
            setExercise(upr6,reps6,kg6,exerciseList.get(5))
        if(size>6)
            setExercise(upr7,reps7,kg7,exerciseList.get(6))
        if(size>7)
            setExercise(upr8,reps8,kg8,exerciseList.get(7))
        if(size>8)
            setExercise(upr9,reps9,kg9,exerciseList.get(8))

    }

    fun setExercise(upr: TextView,reps: EditText,kg: EditText,exercise: Exercise){
        upr.text=exercise.name
        reps.setText(exercise.reps)
        kg.setText(exercise.kg.toString())
    }

    fun readFile(day: String?, exerciseList: ArrayList<Exercise>, cycle:String){
        var line=0
        val inputStream = File(applicationContext.filesDir.toString() + "/${cycle}/", "$day.txt").inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().forEachLine { lineList.add(it) }
        for(s in lineList) {
            if(line==0){
                dateString = s
                line++
            }else{
                ex= Exercise()
                ex=stringToExercise(s)
                exerciseList.add(ex)
            }
        }
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
