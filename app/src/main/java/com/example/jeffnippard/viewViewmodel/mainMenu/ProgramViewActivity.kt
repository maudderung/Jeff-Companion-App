package com.example.jeffnippard.viewViewmodel.mainMenu

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.model.GeneralInfo
import com.github.barteksc.pdfviewer.PDFView
import java.io.File
import java.io.IOException
import java.lang.Thread.sleep
import kotlin.concurrent.thread


class ProgramViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program_view)
        lateinit var pages: Array<Int>
        var subsPage=0
        var page=0
        var filePath: String
        lateinit var programPath1:String
        lateinit var programPath2:String
        when(GeneralInfo.program){
            "Powerbuilding 1.0 4x"->{pages=arrayOf(1,4,7,10,13,16,19,22,25,29)
                programPath2="pb1.0ex.pdf"
                programPath1="pb1.0doc.pdf"
                subsPage=104

            }
            "Powerbuilding 2.0 4x"->{pages=arrayOf(1,4,7,10,13,16,19,22,25,28,31,34)
                programPath2="pb2.0ex.pdf"
                programPath1="pb2.0doc.pdf"
                subsPage=73
            }
        }
        when(GeneralInfo.week){
            "Week 1"->{
                page=pages[0]
            }
            "Week 2"->{
                page=pages[1]
            }
            "Week 3"->{
                page=pages[2]
            }
            "Week 4"->{
                page=pages[3]
            }
            "Week 5"->{
                page=pages[4]
            }
            "Week 6"->{
                page=pages[5]
            }
            "Week 7"->{
                page=pages[6]
            }
            "Week 8"->{
                page=pages[7]
            }
            "Week 9"->{
                page=pages[8]
            }
            "Week 10"->{
                page=pages[9]
            }
            "Week 11"->{
                page=pages[10]
            }
            "Week 12"->{
                page=pages[11]
            }
            "Subs"->{
                page=subsPage
            }
        }
        filePath = if(page==subsPage) {
            getFileFromAssets(this, programPath1).absolutePath
        }
        else {
            getFileFromAssets(this, programPath2).absolutePath
        }
        val pdf = File(filePath)
        val pdfView = findViewById<PDFView>(R.id.pdfView)
        pdfView.fromFile(pdf).load()
        thread{
            sleep(500)
            pdfView.jumpTo(page-1)
        }


    }

    @Throws(IOException::class)
    fun getFileFromAssets(context: Context, fileName: String): File = File(context.cacheDir, fileName)
        .also {
            if (!it.exists()) {
                it.outputStream().use { cache ->
                    context.assets.open(fileName).use { inputStream ->
                        inputStream.copyTo(cache)
                    }
                }
            }
        }

}