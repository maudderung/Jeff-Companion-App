package com.example.jeffnippard.view.train

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.ImageView
import com.example.jeffnippard.R
import com.example.jeffnippard.controller.WeekInfo

class amrapWeekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amrap_week)
        val bDay1 = findViewById<ImageView>(R.id.day1)
        val bDay2 = findViewById<ImageView>(R.id.day2)
        val bDay3 = findViewById<ImageView>(R.id.day3)
        val intent = Intent(this, amrapDayActivity::class.java)
        WeekInfo.week="Week 10"
        bDay1.setOnClickListener {
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Day 1")
            startActivity(intent)
        }
        bDay2.setOnClickListener {
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Day 2")
            startActivity(intent)
        }
        bDay3.setOnClickListener {
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Day 3")
            startActivity(intent)
        }

    }
}