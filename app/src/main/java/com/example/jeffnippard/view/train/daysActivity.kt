package com.example.jeffnippard.view.train

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.model.GeneralInfo

class daysActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_days)
        val bDay1 = findViewById<ImageView>(R.id.day1)
        val bDay2 = findViewById<ImageView>(R.id.day2)
        val bDay3 = findViewById<ImageView>(R.id.day3)
        val bDay4 = findViewById<ImageView>(R.id.day4)
        val title = findViewById<TextView>(R.id.weekTitle)
        val intent = Intent(this, trainActivity::class.java)
        title.text=GeneralInfo.week

        bDay1.setOnClickListener {
            intent.putExtra("day", "Day 1")
            startActivity(intent)
        }
        bDay2.setOnClickListener {
            intent.putExtra("day", "Day 2")
            startActivity(intent)
        }
        bDay3.setOnClickListener {
            intent.putExtra("day", "Day 3")
            startActivity(intent)
        }
        bDay4.setOnClickListener {
            intent.putExtra("day", "Day 4")
            startActivity(intent)
        }
    }
}
