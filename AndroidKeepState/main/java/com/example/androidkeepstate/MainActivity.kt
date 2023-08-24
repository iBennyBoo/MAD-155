package com.example.androidkeepstate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.textservice.TextInfo
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var textInfo: TextView
    lateinit var one: TextView
    lateinit var two: TextView
    lateinit var three: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)
        textInfo = findViewById<TextView>(R.id.textView)
        one = findViewById<TextView>(R.id.objectOne)
        two = findViewById<TextView>(R.id.objectTwo)
        three = findViewById<TextView>(R.id.objectThree)

        button.setOnClickListener{
            textInfo.setText("I have been clicked")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("saved_text", textInfo.text.toString())
        outState.putString("saved_text2", one.text.toString())
        outState.putString("saved_text3", two.text.toString())
        outState.putString("saved_text4", three.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        textInfo.setText(savedInstanceState.getString("saved_text"))
        one.setText(savedInstanceState.getString("saved_text2"))
        two.setText(savedInstanceState.getString("saved_text3"))
        three.setText(savedInstanceState.getString("saved_text4"))
    }
}