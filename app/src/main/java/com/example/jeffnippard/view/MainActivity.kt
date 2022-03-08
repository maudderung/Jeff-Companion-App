package com.example.jeffnippard.view

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.model.GeneralInfo
import com.example.jeffnippard.view.mainMenu.CalculatorActivity
import com.example.jeffnippard.view.mainMenu.Program
import com.example.jeffnippard.view.mainMenu.ViewSessionsActivity
import com.example.jeffnippard.view.mainMenu.days12Activity
import java.io.BufferedReader
import java.io.File


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bTrain = findViewById<ImageView>(R.id.bTrain)
        val bCalculator = findViewById<ImageView>(R.id.bCalculator)
        val bViewSessions = findViewById<ImageView>(R.id.bViewSessions)
        val bViewProgram = findViewById<ImageView>(R.id.bViewProgram)
        setLastProgram()

        bTrain.setOnClickListener {
             var intent =  Intent( this, Program::class.java)
            when(GeneralInfo.program){
                "Powerbuilding 1.0 4x"-> intent = Intent(this, Program::class.java)
                "Powerbuilding 2.0 4x"->intent = Intent(this, days12Activity::class.java)
            }
            intent.putExtra("train", "TRAIN")
            startActivity(intent)
        }
        bCalculator.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }
        bViewProgram.setOnClickListener {
            var intent =  Intent( this, Program::class.java)
            when(GeneralInfo.program){
                "Powerbuilding 1.0 4x"-> intent = Intent(this, Program::class.java)
                "Powerbuilding 2.0 4x"->intent = Intent(this, days12Activity::class.java)
            }
            intent.putExtra("train", "PROGRAM")
            startActivity(intent)
        }
        bViewSessions.setOnClickListener {
            val intent = Intent(this, ViewSessionsActivity::class.java)
            intent.putExtra("SESSIONS", true)
            startActivity(intent)
        }
    }
    private fun setLastProgram(){
        val readProgram :String
        if(File(applicationContext.filesDir.toString() + "/Program/currentProgram.txt").exists()) {
            val inputStream =
                File(
                    applicationContext.filesDir.toString() + "/Program/currentProgram.txt"
                ).inputStream()
            readProgram = inputStream.bufferedReader().use(BufferedReader::readText)
            GeneralInfo.program=readProgram
        }else{
            GeneralInfo.program="Powerbuilding 1.0 4x"
        }
    }

}