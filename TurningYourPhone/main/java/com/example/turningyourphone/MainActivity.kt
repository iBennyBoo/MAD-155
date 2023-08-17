package com.example.turningyourphone

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Landscape or Portrait"

        val button1 = findViewById<Button>(R.id.button)
        val text = findViewById<EditText>(R.id.editText)
        val image = findViewById<ImageView>(R.id.imageView)

        button1.setOnClickListener{
            if(button1.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
                Toast.makeText(
                    this@MainActivity,
                    "This is Portrait Mode",
                    Toast.LENGTH_SHORT
                ).show()
            } else{
                Toast.makeText(
                    this@MainActivity,
                    "This is Landscape Mode",
                    Toast.LENGTH_SHORT
                ).show()
            }

            var type = text.toString()

        }
    }
}