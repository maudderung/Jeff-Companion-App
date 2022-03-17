package com.example.jeffnippard.viewViewmodel.mainMenu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.jeffnippard.R
import com.example.jeffnippard.model.GeneralInfo
import java.io.File


class ViewSessionsActivity : AppCompatActivity() {
    lateinit var programChoice:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_sessions)
        val spinner = findViewById<Spinner>(R.id.spinnerViewSessions)
        val listView = findViewById<ListView>(R.id.tSessionsList)
        val removeBtn = findViewById<Button>(R.id.removeWorkoutBtn)
        removeBtn.setOnClickListener{
            val intent=Intent(this,removeWorkoutActivity::class.java)
            intent.putExtra("program", programChoice)
            startActivity(intent)
        }
        initSpinner(spinner,listView)
    }

    private fun initSpinner(spinner: Spinner,listView: ListView) {
        val programs = resources.getStringArray(R.array.programs)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                R.layout.spinner_white_text, R.id.textviewspinner, programs
            )
            spinner.adapter = adapter
            spinner.setSelection(programs.indexOf(GeneralInfo.program))

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    programChoice=programs[position]
                    initList(listView)

                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    programChoice= GeneralInfo.program
                    initList(listView)
                }
            }
        }
    }

    private fun initList(listView: ListView) {
        var selectedCycle=""
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
                val selectedItem = parent.getItemAtPosition(position)
                if (selectedItem.toString().startsWith("Week")) {
                    val intent = Intent(this, viewDayActivity::class.java)
                    val extras = Bundle()
                    extras.putString("program", programChoice)
                    extras.putString("cycle", selectedCycle)
                    extras.putString("day", selectedItem.toString())
                    intent.putExtras(extras)
                    startActivity(intent)
                } else {
                    selectedCycle = selectedItem.toString()
                    if(openCycle(selectedItem as Any, tSessions, programChoice)){
                    adapter.clear()
                    for (s in tSessions){
                        adapter.add(s)
                        }
                    }
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
        var fileName: String
        val singledigits = ArrayList<String>()
        val doubledigits = ArrayList<String>()
        if(selection!="No cycles in current program"){
        File("$filesDir/$programChoice/$selection").listFiles().forEach {
            fileName=File(it.toString()).name.substring(0,File(it.toString()).name.length-4)
            if(fileName.length==12)
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
        return false
    }
}
