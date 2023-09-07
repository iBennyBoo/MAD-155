package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView1 = findViewById<ListView>(R.id.listView1)
        // val names = arrayOf("Shrek", "Shrek 2", "Shrek 3", "Shrek 4")
        var list = ArrayList<Model>()
        list.add(Model("Ben", "Student", R.drawable.ic_launcher_background))

//        val myAdapter: ArrayAdapter<String> = ArrayAdapter(
//            this,android.R.layout.simple_list_item_1, names
//        )

        // listView1.adapter = myAdapter
        listView1.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)

//        listView1.setOnItemClickListener(){ adapterView, view, i, l ->
//            Toast.makeText(this,"item is "+ names[i], Toast.LENGTH_LONG).show()
//        }
    }
}