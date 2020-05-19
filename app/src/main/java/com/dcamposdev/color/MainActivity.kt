package com.dcamposdev.color

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeColor()

        changeColorTextView.setOnClickListener{
            changeColor()
        }
    }
    private fun changeColor(){
        val r = Random.nextInt(0, 255)
        val g = Random.nextInt(0, 255)
        val b = Random.nextInt(0, 255)
        changeColorTextView.setBackgroundColor(Color.rgb(r, g, b))
        changeColorTextView.text = "R: $r G: $g B: $b"
    }
}
