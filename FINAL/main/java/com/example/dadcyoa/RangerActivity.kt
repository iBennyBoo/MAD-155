package com.example.dadcyoa

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

lateinit var textView2: TextView
lateinit var image2: ImageView
lateinit var optionOne2: Button
lateinit var optionTwo2: Button
var counter2: Int = 0

class RangerActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ranger_activity)

        //setting variables
        textView2 = findViewById(R.id.textView2)
        image2 = findViewById(R.id.imageView2)
        optionOne2 = findViewById(R.id.button4)
        optionTwo2 = findViewById(R.id.button2)

        //starting screen
        textView2.setText(getString(R.string.rangerStart1) + " " + getString(R.string.rangerStart2))
        optionOne2.setText(getString(R.string.rangerOption1))
        optionTwo2.setText(getString(R.string.rangerOption2))
        image2.setImageResource(R.drawable.ranger)

        optionOne2.setOnClickListener {
            counter2 += 1
            checkEnding()
        }
        optionTwo2.setOnClickListener {
            counter2 += 4
            checkEnding()
        }
    }

    private fun checkEnding() {
        when (counter2) {
            1 -> boughtGoods()
            4 -> noGoods()
            5 -> continueRiding()
            8 -> camp()
            9 -> investigate()
            12 -> sleep()
            else -> showError()
        }
    }

    private fun boughtGoods() {
        textView2.setText(
            getString(R.string.rangerStart3) + " " + getString(R.string.rangerStart5) + " " + getString(
                R.string.rangerStart7
            )
        )
        optionOne2.isVisible = false
        optionTwo2.isVisible = false
        image2.setImageResource(R.drawable.town)
        println("End")
    }

    private fun noGoods() {
        textView2.setText(getString(R.string.rangerStart4) + " " + getString(R.string.rangerStart5))
        optionOne2.setText(getString(R.string.bardOption5))
        optionTwo2.setText(getString(R.string.bardOption6))
        image2.setImageResource(R.drawable.merchant)
    }

    private fun continueRiding() {
        textView2.setText(getString(R.string.rangerStart7))
        optionOne2.isVisible = false
        optionTwo2.isVisible = false
        image2.setImageResource(R.drawable.town)
        println("End")
    }

    private fun camp() {
        textView2.setText(getString(R.string.rangerStart8) + " " + getString(R.string.bardGoblin1))
        optionOne2.setText(getString(R.string.rangerOption5))
        optionTwo2.setText(getString(R.string.rangerOption6))
        image2.setImageResource(R.drawable.night)
    }

    private fun investigate() {
        textView2.setText(getString(R.string.rangerStart12))
        optionOne2.isVisible = false
        optionTwo2.isVisible = false
        image2.setImageResource(R.drawable.merchant)
        println("End")
    }

    private fun sleep() {
        textView2.setText(getString(R.string.rangerStart11))
        optionOne2.isVisible = false
        optionTwo2.isVisible = false
        image2.setImageResource(R.drawable.morning)
    }

    private fun showError() {
        println("Error, check code")
    }
}