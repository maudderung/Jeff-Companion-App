package com.example.jeffnippard.view

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import java.io.File


class ViewSessionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_sessions)
        var selectedCycle=""
        val listView = findViewById<ListView>(R.id.tSessionsList)
        val filesDir = File(applicationContext.filesDir.toString())
        val cycleDirs=returnCycle(filesDir)
        cycleDirs.sort()
        val tSessions = ArrayList<String>()
        val adapter: ArrayAdapter<String> = ArrayAdapter(this, R.layout.listlayout)
        for(s in cycleDirs)
        adapter.add(s)
        listView.adapter = adapter

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, _, position, _ ->
                val selectedItem = parent.getItemAtPosition(position)
                if(selectedItem.toString().startsWith("Week")){
                    val intent= Intent(this, viewDayActivity::class.java)
                    val extras = Bundle()
                    extras.putString("cycle", selectedCycle)
                    extras.putString("day", selectedItem.toString())
                    intent.putExtras(extras)
                    startActivity(intent)
                }else{
                    selectedCycle=selectedItem.toString()
                    openCycle(selectedItem as Any, tSessions)
                    adapter.clear()
                    for (s in tSessions)
                        adapter.add(s)
                }

            }


    }
    private fun returnCycle(filesDir: File): Array<String> {
        return filesDir.list { current, name -> File(current, name).isDirectory }
    }
    private fun openCycle(selection: Any, sessions: ArrayList<String>){
        File("$filesDir/$selection").listFiles().forEach {
            sessions.add(File(it.toString()).name.substring(0,File(it.toString()).name.length-4))
            sessions.sort()
        }
    }
}
