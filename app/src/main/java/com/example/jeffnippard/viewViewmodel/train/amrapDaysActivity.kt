package com.example.jeffnippard.viewViewmodel.train

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.model.GeneralInfo

class amrapDaysActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amrap_days)
        val bDay1 = findViewById<ImageView>(R.id.day1)
        val bDay2 = findViewById<ImageView>(R.id.day2)
        val bDay3 = findViewById<ImageView>(R.id.day3)
        val intent = Intent(this, amrapDayActivity::class.java)
        GeneralInfo.week="Week 10"
        bDay1.setOnClickListener {
            intent.putExtra("day"
                , "Day 1")
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

    }
}