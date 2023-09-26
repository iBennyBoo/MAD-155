package com.example.storingappsettings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var pickClass: EditText
    lateinit var pickNumber: EditText

    val preferenceName = "perfs"
    val preferenceDark = "dark_theme"

    override fun onCreate(savedInstanceState: Bundle?) {

        val preferences = getSharedPreferences(preferenceName, MODE_PRIVATE)
        val useDarkTheme = preferences.getBoolean(preferenceDark, false)
        if(useDarkTheme){
            setTheme(androidx.appcompat.R.style.ThemeOverlay_AppCompat_Dark)
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toggle = findViewById<Switch>(R.id.switch1)
        toggle.isChecked = useDarkTheme
        toggle.setOnCheckedChangeListener{
            view, isChecked -> toggleTheme(isChecked)
        }

        name = findViewById(R.id.edit1)
        pickClass = findViewById(R.id.edit2)
        pickNumber = findViewById(R.id.edit3)


    }

    private fun toggleTheme(darkTheme: Boolean) {
        val editor = getSharedPreferences("preferenceName", MODE_PRIVATE).edit()
        editor.apply{
            putBoolean(preferenceDark, darkTheme)
            apply()
        }
        val intent = intent
        finish()
        startActivity(intent)
    }

    override fun onResume(){
        super.onResume()

        val SP = getSharedPreferences("MySharedPref", MODE_PRIVATE)

        //Looking for the Key Value Pairs
        val key1 = SP.getString("name", "")
        val key2 = SP.getString("pickClass", "")
        val key3 = SP.getInt("pickNumber", 0)

        //Assign them to Widgets
        name!!.setText(key1)
        pickClass!!.setText(key2)
        pickNumber!!.setText(key3.toString())
    }

    override fun onPause(){
        super.onPause()

        //Opened in Private Mode for Writing
        val SP = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val edit = SP.edit()

        //Write to the File
        edit.putString("name", name!!.text.toString())
        edit.putString("pickClass", pickClass!!.text.toString())
        edit.putInt("pickNumber", pickNumber!!.text.toString().toInt())
        edit.apply()
    }

}