package com.example.jeffnippard.view.train

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.controller.WeekInfo

class week1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week)
        val bDay1 = findViewById<ImageView>(R.id.day1)
        val bDay2 = findViewById<ImageView>(R.id.day2)
        val bDay3 = findViewById<ImageView>(R.id.day3)
        val bDay4 = findViewById<ImageView>(R.id.day4)
        val title = findViewById<TextView>(R.id.weekTitle)
        val intent = Intent(this, dayActivity::class.java)
        when (WeekInfo.week) {
            "Week 1" ->{
                title.text="Week 1"
            }
            "Week 2"->{
                title.text="Week 2"
            }
            "Week 3"->{
                title.text="Week 3"
            }
            "Week 4"->{
                title.text="Week 4"
            }
            "Week 5"->{
                title.text="Week 5"
            }
            "Week 6"->{
                title.text="Week 6"
            }
            "Week 7"->{
                title.text="Week 7"
            }
            "Week 8"->{
                title.text="Week 8"
            }
            "Week 9"->{
                title.text="Week 9"
            }
            "Week 10"->{
                title.text="Week 10"
            }
        }
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