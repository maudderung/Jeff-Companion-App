package com.example.jeffnippard.view.mainMenu

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import java.math.BigDecimal
import java.math.RoundingMode

class CalculatorActivity : AppCompatActivity() {
     private lateinit var kgField:EditText
     private lateinit var repsField:EditText
     private lateinit var oneRepMaxField:EditText
     private lateinit var percentageField:EditText
     private lateinit var oneRepMaxLabel:TextView
     private lateinit var workingSetLabel:TextView

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
    private fun calculateOneRepMax(reps: Int, kgs: Double): Double {
        val oneRepMax: Double = when (reps) {
            1 -> kgs
            2 -> kgs * reps * (119.toDouble() / 226)
            3 -> kgs * reps * (122.toDouble() / 339)
            4 -> kgs * reps * (63.toDouble() / 226)
            5 -> kgs * reps * (26.toDouble() / 113)
            6 -> kgs * reps * (133.toDouble() / 678)
            7 -> kgs * reps * (136.toDouble() / 791)
            8 -> kgs * reps * (141.toDouble() / 904)
            9 -> kgs * reps * (49.toDouble() / 339)
            10 -> kgs * reps * (151.toDouble() / 1130)
            else -> 0.00
        }
        return roundOffDecimal(oneRepMax).toDouble()
    }

    private fun calculateWorkingSet(orm: Double, percentage: Double): Double {
        return if(percentage in 1.0..100.0)
            roundOffDecimal(orm*(percentage/100)).toDouble()
        else
            0.0
    }

    private fun roundOffDecimal(number: Double): BigDecimal {
        val bd = BigDecimal(number)
        return bd.setScale(2, RoundingMode.CEILING)
    }
}