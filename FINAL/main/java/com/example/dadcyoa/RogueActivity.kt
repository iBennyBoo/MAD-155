package com.example.dadcyoa

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

lateinit var textView3: TextView
lateinit var image3: ImageView
lateinit var optionOne3: Button
lateinit var optionTwo3: Button
lateinit var optionThree3: Button
var counter3: Int = 0
var check: Int = 0

class RogueActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rogue_activity)

        textView3 = findViewById(R.id.textView4)
        image3 = findViewById(R.id.imageView3)
        optionOne3 = findViewById(R.id.button5)
        optionTwo3 = findViewById(R.id.button6)
        optionThree3 = findViewById(R.id.button7)

        textView3.setText(getString(R.string.rogueStart1))
        optionOne3.setText(getString(R.string.rogueOption1))
        optionTwo3.setText(getString(R.string.rogueOption2))
        optionThree3.setText(getString(R.string.rogueOption3))
        image3.setImageResource(R.drawable.rogue)

        optionOne3.setOnClickListener{
            counter3 += 1
            checkEnding()
        }
        optionTwo3.setOnClickListener {
            if (check == 0) {
                hole()
            } else if (check == 1) {
                keepGoing()
            } else{
                fight()
            }
        }
        optionThree3.setOnClickListener{
            counter+= 4
            checkEnding()
        }

    }

    private fun checkEnding(){
        if(counter3 == 1) {
            check = 1
        } else if (counter3 == 4){
            check = 2
        }
        when(counter3){
            1 -> vents()
            2 -> keepGoing()
            4 -> wall()
            5 -> split()
            6 -> clothes()
            8 -> peace()
            9 -> monitors()
            else -> showError()
        }
    }

    private fun vents(){
        textView3.setText(getString(R.string.rangerStart2))
        optionOne3.setText(getString(R.string.rogueOption4))
        optionTwo3.setText(getString(R.string.rogueOption5))
        optionThree3.setText(getString(R.string.rogueOption6))
        image3.setImageResource(R.drawable.prison)
    }

    private fun wall(){
        textView3.setText(getString(R.string.rangerStart8))
        optionOne3.setText(getString(R.string.rogueOption9))
        optionTwo3.isVisible = false
        optionThree3.setText(getString(R.string.rogueOption10))
        image3.setImageResource(R.drawable.courtyard)
    }

    private fun clothes(){
        textView.setText(getString(R.string.rogueStart6))
        optionOne3.isVisible = false
        optionTwo3.isVisible = false
        optionThree3.isVisible = false
        image.setImageResource(R.drawable.prison)
        println("End")
    }

    private fun peace(){
        textView.setText(getString(R.string.rogueStart10))
        optionOne3.isVisible = false
        optionTwo3.isVisible = false
        optionThree3.isVisible = false
        image.setImageResource(R.drawable.peace)
        println("End")
    }

    private fun monitors(){
        textView.setText(getString(R.string.rogueStart7))
        optionOne3.isVisible = false
        optionTwo3.isVisible = false
        optionThree3.isVisible = false
        image.setImageResource(R.drawable.peace)
        println("End")
    }

    private fun split(){
        if (check == 1){
            textView3.setText(getString(R.string.rangerStart5))
            optionOne3.setText(getString(R.string.rogueOption7))
            optionTwo3.isVisible = false
            optionThree3.setText(getString(R.string.rogueOption8))
            image3.setImageResource(R.drawable.cameraroom)
        } else if (check == 2){
            fight()
        }
    }

    private fun hole(){
        textView.setText(getString(R.string.rogueStart3))
        optionOne3.isVisible = false
        optionTwo3.isVisible = false
        optionThree3.isVisible = false
        image.setImageResource(R.drawable.hole)
        println("End")
    }

    private fun keepGoing(){
        textView.setText(getString(R.string.rogueStart4))
        optionOne3.isVisible = false
        optionTwo3.isVisible = false
        optionThree3.isVisible = false
        image.setImageResource(R.drawable.prison)
        println("End")
    }

    private fun fight(){
        textView.setText(getString(R.string.rogueStart9))
        optionOne3.isVisible = false
        optionTwo3.isVisible = false
        optionThree3.isVisible = false
        image.setImageResource(R.drawable.courtyard)
        println("End")
    }

    private fun showError(){
        println("Error, check code")
    }

}