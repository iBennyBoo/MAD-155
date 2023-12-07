package com.example.dadcyoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//create button variables
lateinit var bard: Button
lateinit var ranger: Button
lateinit var rogue: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set button variables
        bard = findViewById<Button>(R.id.bardButton)
        ranger = findViewById<Button>(R.id.rangerButton)
        rogue = findViewById<Button>(R.id.rogueButton)

        //send user to correct fragment
        bard.setOnClickListener{
            var intent = Intent(this,BardActivity::class.java)
            startActivity(intent)
        }

        ranger.setOnClickListener{
            var intent2 = Intent(this,RangerActivity::class.java)
            startActivity(intent2)
        }

        rogue.setOnClickListener{
            var intent3 = Intent(this,RogueActivity::class.java)
            startActivity(intent3)
        }

    }
}