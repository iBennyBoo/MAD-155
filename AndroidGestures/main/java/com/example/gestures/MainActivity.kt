package com.example.gestures

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat


class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private lateinit var getGestureText: TextView
    var gDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getGestureText = findViewById(R.id.getGestureText)

        this.gDetector = GestureDetectorCompat(this, this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean{
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(p0: MotionEvent): Boolean {
        getGestureText.text = "OnDown"
        return true
    }

    override fun onShowPress(p0: MotionEvent) {
        getGestureText.text = "OnShowPress"
    }


    override fun onSingleTapUp(p0: MotionEvent): Boolean {
        getGestureText.text = "OnSingleTapUp"
        return true
    }

    override fun onScroll(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        getGestureText.text = "OnScroll"
        return true
    }

    override fun onLongPress(p0: MotionEvent) {
        getGestureText.text = "OnLongPress"
    }

    override fun onFling(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        getGestureText.text = "OnFling"
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent): Boolean {
        getGestureText.text = "OnSingleTapConfirmed"
        return true
    }

    override fun onDoubleTap(p0: MotionEvent): Boolean {
        getGestureText.text = "onDoubleTap"
        return true
    }

    override fun onDoubleTapEvent(p0: MotionEvent): Boolean {
        getGestureText.text = "OnDoubleTap"
        return true
    }

}