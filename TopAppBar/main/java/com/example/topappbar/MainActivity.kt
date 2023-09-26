package com.example.topappbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.core.content.ContextCompat

public final class AppBarConfiguration{

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Defining Toolbar in the layout
        setSupportActionBar(findViewById(R.id.my_toolbar))
        val toolbar = findViewById(R.id.my_toolbar) as Toolbar?
        toolbar?.title = "Tool Bar"
        toolbar?.subtitle = "Subtitle"
        toolbar?.navigationIcon = ContextCompat.getDrawable(this,R.drawable.ic_launcher_background)
        toolbar?.setNavigationOnClickListener { Toast.makeText(applicationContext,"Navigation icon was clicked",Toast.LENGTH_SHORT).show() }

        
    }

}