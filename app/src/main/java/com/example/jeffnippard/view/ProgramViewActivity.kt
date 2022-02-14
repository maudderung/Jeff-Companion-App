package com.example.jeffnippard.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.controller.WeekInfo
import com.github.barteksc.pdfviewer.PDFView
import java.io.File
import java.lang.Thread.sleep
import kotlin.concurrent.thread

class ProgramViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program_view)
        var page=0
        when(WeekInfo.week){
            "Week 1"->{
                page=1
            }
            "Week 2"->{
                page=4
            }
            "Week 3"->{
                page=7
            }
            "Week 4"->{
                page=10
            }
            "Week 5"->{
                page=13
            }
            "Week 6"->{
                page=16
            }
            "Week 7"->{
                page=19
            }
            "Week 8"->{
                page=22
            }
            "Week 9"->{
                page=25
            }
            "Week 10"->{
                page=29
            }
            "Subs"->{
                page=0
            }
        }

        val filePath:String = if(page==104){
            getFileFromAssets(this, "Powerbuilding-System_4X.pdf").absolutePath
        } else{
            getFileFromAssets(this, "compact.pdf").absolutePath
        }
        val pdf = File(filePath)
        val pdfView = findViewById<PDFView>(R.id.pdfView)
        pdfView.fromFile(pdf).load()

        thread{
            sleep(500)
            pdfView.jumpTo(page-1)
        }


    }

}