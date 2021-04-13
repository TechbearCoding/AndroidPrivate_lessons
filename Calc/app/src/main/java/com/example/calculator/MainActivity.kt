package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnZero = findViewById<Button>(R.id.btnZero)
        setNumberButtonListener(btnZero)

        val btnOne = findViewById<Button>(R.id.btnOne)
        setNumberButtonListener(btnOne)

        val btnTwo = findViewById<Button>(R.id.btnTwo)
        setNumberButtonListener(btnTwo)

        val btnThree = findViewById<Button>(R.id.btnThree)
        setNumberButtonListener(btnThree)

        val btnFour = findViewById<Button>(R.id.btnFour)
        setNumberButtonListener(btnFour)

        val btnFive = findViewById<Button>(R.id.btnFive)
        setNumberButtonListener(btnFive)

        val btnSix = findViewById<Button>(R.id.btnSix)
        setNumberButtonListener(btnSix)

        val btnSeven = findViewById<Button>(R.id.btnSeven)
        setNumberButtonListener(btnSeven)

        val btnEight = findViewById<Button>(R.id.btnEight)
        setNumberButtonListener(btnEight)

        val btnNine = findViewById<Button>(R.id.btnNine)
        setNumberButtonListener(btnNine)
    }


    private fun setNumberButtonListener(btn: Button){
        btn.setOnClickListener(){

        }
    }
}