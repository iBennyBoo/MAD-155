package com.example.dadcyoa

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

lateinit var textView: TextView
lateinit var image: ImageView
lateinit var optionOne: Button
lateinit var optionTwo: Button
var counter: Int = 0
var isGoblin: Boolean = true

class BardActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bard_activity)

        //setting variables
        textView = findViewById(R.id.textView3)
        image = findViewById(R.id.imageView)
        optionOne = findViewById(R.id.button)
        optionTwo = findViewById(R.id.button3)

        //starting screen
        textView.setText(getString(R.string.bardStart))
        optionOne.setText(getString(R.string.bardOption1))
        optionTwo.setText(getString(R.string.bardOption2))
        image.setImageResource(R.drawable.bard)

        optionOne.setOnClickListener{
            counter += 1
            checkEnding()
        }
        optionTwo.setOnClickListener{
            counter += 4
            checkEnding()
        }

    }
    private fun checkEnding(){
        when(counter){
            1 -> ogreStart()
            2 -> charmOgre()
            3 -> ogreChat()
            4 -> goblinDen()
            5 -> fireball() //another variable to check goblin or ogre
            6 -> ogreViolence()
            8 -> charmGoblin()
            else -> showError()
        }
    }

    private fun ogreStart(){
        textView.setText(getString(R.string.bardStart2) + " " + getString(R.string.bardOgre1))
        optionOne.setText(getString(R.string.bardOption3))
        optionTwo.setText(getString(R.string.bardOption4))
        image.setImageResource(R.drawable.ogre)
        isGoblin = false
    }

    private fun charmOgre(){
        textView.setText(getString(R.string.bardStart7))
        optionOne.setText(getString(R.string.bardOption5))
        optionTwo.setText(getString(R.string.bardOption6))
        image.setImageResource(R.drawable.charm)
    }

    private fun ogreChat(){
        textView.setText(getString(R.string.bardStart9))
        optionOne.isVisible = false
        optionTwo.isVisible = false
        image.setImageResource(R.drawable.tavern)
        println("End")
    }

    private fun goblinDen(){
        textView.setText(getString(R.string.bardStart2) + " " + getString(R.string.bardGoblin1))
        optionOne.setText(getString(R.string.bardOption3))
        optionTwo.setText(getString(R.string.bardOption4))
        image.setImageResource(R.drawable.goblins)
    }

    private fun fireball(){
        if(isGoblin) {
            textView.setText(getString(R.string.bardStart5))
            optionOne.isVisible = false
            optionTwo.isVisible = false
            image.setImageResource(R.drawable.goblinsfireball)
            println("End")
        } else{
            textView.setText(getString(R.string.bardStart4))
            optionOne.isVisible = false
            optionTwo.isVisible = false
            image.setImageResource(R.drawable.wizard)
            println("End")
        }
    }

    private fun ogreViolence(){
        textView.setText(getString(R.string.bardStart8))
        optionOne.isVisible = false
        optionTwo.isVisible = false
        image.setImageResource(R.drawable.tavern)
    }

    private fun charmGoblin(){
        textView.setText(getString(R.string.bardStart4))
        optionOne.isVisible = false
        optionTwo.isVisible = false
        image.setImageResource(R.drawable.goblins)
        println("End")
    }

    private fun showError(){
        println("Error, check code")
    }
}