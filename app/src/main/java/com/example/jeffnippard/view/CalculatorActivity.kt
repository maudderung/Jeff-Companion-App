package com.example.jeffnippard.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import java.math.BigDecimal
import java.math.RoundingMode

class CalculatorActivity : AppCompatActivity() {
     lateinit var kgField:EditText
     lateinit var repsField:EditText
     lateinit var oneRepMaxField:EditText
     lateinit var percentageField:EditText
     lateinit var oneRepMaxLabel:TextView
     lateinit var workingSetLabel:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        kgField=findViewById(R.id.kilogramsInput)
        repsField=findViewById(R.id.repsInput)
        oneRepMaxLabel=findViewById(R.id.oneRepMaxLabel)
        oneRepMaxField=findViewById(R.id.oneRepMaxInput)
        percentageField=findViewById(R.id.percentage)
        workingSetLabel=findViewById(R.id.WorkingSetLabel)

        val calcRepMax=findViewById<Button>(R.id.calculateOneRepMaxButton)
        val calcPercentage=findViewById<Button>(R.id.calculatePercentageButton)

        calcRepMax.setOnClickListener {

            var reps: Int
            var kgs: Double
            try {
                reps = repsField.text.toString().toInt()
                kgs = kgField.text.toString().toDouble()
            }catch(e:NumberFormatException){
                reps=0
                kgs=0.00
            }
            val repMax=calculateOneRepMax(reps,kgs)
            val orm: String="One Rep Max: "+repMax.toString()+"kg"
            oneRepMaxLabel.text = orm
        }

        calcPercentage.setOnClickListener {
            var orm: Double
            var percentage: Double
            try {
                orm = oneRepMaxField.text.toString().toDouble()
                percentage = percentageField.text.toString().toDouble()
            }catch(e:NumberFormatException){
                orm=0.00
                percentage=0.00
            }
            val workingSet=calculateWorkingSet(orm,percentage)
            val label: String="Working Set: "+workingSet.toString()+"kg"
            workingSetLabel.text=label
        }
    }
    fun calculateOneRepMax(reps: Int,kgs: Double): Double {
        val oneRepMax: Double
        when (reps) {
            1 -> oneRepMax = kgs
            2 -> oneRepMax = kgs * reps * (119.toDouble() / 226)
            3 -> oneRepMax = kgs * reps * (122.toDouble() / 339)
            4 -> oneRepMax = kgs * reps * (63.toDouble() / 226)
            5 -> oneRepMax = kgs * reps * (26.toDouble() / 113)
            6 -> oneRepMax = kgs * reps * (133.toDouble() / 678)
            7 -> oneRepMax = kgs * reps * (136.toDouble() / 791)
            8 -> oneRepMax = kgs * reps * (141.toDouble() / 904)
            9 -> oneRepMax = kgs * reps * (49.toDouble() / 339)
            10 -> oneRepMax = kgs * reps * (151.toDouble() / 1130)
             else -> oneRepMax = 0.00
        }
        return roundOffDecimal(oneRepMax).toDouble()
    }

    fun calculateWorkingSet(orm: Double,percentage: Double): Double {
        if(percentage>=1 && percentage<=100)
            return roundOffDecimal(orm*(percentage/100)).toDouble()
        else
            return 0.0
    }

    fun roundOffDecimal(number: Double): BigDecimal{
        val bd = BigDecimal(number)
        val roundoff = bd.setScale(2, RoundingMode.CEILING)
        return roundoff
    }
}