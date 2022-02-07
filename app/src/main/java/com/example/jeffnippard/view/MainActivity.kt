package com.example.jeffnippard.view

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bTrain = findViewById<ImageView>(R.id.bTrain)
        val bCalculator = findViewById<ImageView>(R.id.bCalculator)
        val bViewSessions = findViewById<ImageView>(R.id.bViewSessions)
        val bViewProgram = findViewById<ImageView>(R.id.bViewProgram)

        bTrain.setOnClickListener {
            val intent = Intent(this, Program::class.java)
            intent.putExtra("train", "TRAIN")
            startActivity(intent)
        }
        bCalculator.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }
        bViewProgram.setOnClickListener {
            val intent = Intent(this, Program::class.java)
            intent.putExtra("train", "PROGRAM")
            startActivity(intent)
        }
        bViewSessions.setOnClickListener {
            val intent = Intent(this, ViewSessionsActivity::class.java)
            intent.putExtra("SESSIONS", true)
            startActivity(intent)
        }
    }

}