package com.example.jeffnippard.view.mainMenu

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.model.GeneralInfo
import java.io.File


class removeWorkoutActivity : AppCompatActivity() {
    lateinit var programChoice:String
    var selectedItem: Any = "Empty"
    var selectedCycle=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remove_workout)
        val listView = findViewById<ListView>(R.id.tSessionsList)
        val removeBtn = findViewById<Button>(R.id.removeWorkoutBtn)
        programChoice= intent.getStringExtra("program").toString()
        GeneralInfo.program=programChoice

        removeBtn.setOnClickListener{
            if(selectedItem.toString().startsWith("Week")){
            val toDelete=selectedItem.toString()+".txt"
            File("$filesDir/$programChoice/$selectedCycle/$toDelete").delete()
                resetList(listView)
            }else
                Toast.makeText(this,"Nothing is selected.", Toast.LENGTH_SHORT).show()

        }
        initList(listView)
    }


    private fun initList(listView: ListView) {
        val filesDir = File(applicationContext.filesDir.toString() + "/$programChoice/")
        val cycleDirs = returnCycle(filesDir)
        cycleDirs.sort()
        val tSessions = ArrayList<String>()
        val adapter: ArrayAdapter<String> = ArrayAdapter(this, R.layout.listlayout)
            for (s in cycleDirs)
                adapter.add(s)

        listView.adapter = adapter

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, _, position, _ ->
                selectedItem = parent.getItemAtPosition(position)
                if (selectedItem.toString().startsWith("Cycle")) {
                    selectedCycle = selectedItem.toString()
                    if(openCycle(selectedItem, tSessions, programChoice)){
                        adapter.clear()
                        for (s in tSessions){
                            adapter.add(s)
                        }
                    }
                }
            }
    }
    private fun resetList(listView: ListView) {
        val tSessions = ArrayList<String>()
        val adapter: ArrayAdapter<String> = ArrayAdapter(this, R.layout.listlayout)
        listView.adapter = adapter
        if (openCycle(selectedItem, tSessions, programChoice)) {
            adapter.clear()
            for (s in tSessions) {
                adapter.add(s)
            }
        }

    }

    private fun returnCycle(filesDir: File): Array<String> {
        var cycles=filesDir.list { current, name -> File(current, name).isDirectory }
        if(cycles==null){
            cycles= arrayOf("No cycles in current program")
        }
        return cycles
    }
    private fun openCycle(selection: Any, sessions: ArrayList<String>,programChoice: String): Boolean{
        val file = File("$filesDir/$programChoice/$selectedCycle")
        var fileName: String
        val singledigits = ArrayList<String>()
        val doubledigits = ArrayList<String>()
        if(selection!="No cycles in current program") {
            if (file.listFiles() != null) {
                file.listFiles().forEach {
                    fileName =
                        File(it.toString()).name.substring(0, File(it.toString()).name.length - 4)
                    if (fileName.length == 12)
                        singledigits.add(fileName)
                    else
                        doubledigits.add(fileName)
                }
                singledigits.sort()
                doubledigits.sort()
                sessions.addAll(singledigits)
                sessions.addAll(doubledigits)
                return true
            }
        }
        return false
    }
}
