package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var numberOne: Int = 0
    var action: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editResult = findViewById<EditText>(R.id.editResult)
        editResult.setText("0")

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

        val btnPlus = findViewById<Button>(R.id.btnPlus)
        setActionListener(btnPlus)

        val btnMinus = findViewById<Button>(R.id.btnMinus)
        setActionListener(btnMinus)

        val btnMulti = findViewById<Button>(R.id.btnMulti)
        setActionListener(btnMulti)

        val btnDiv = findViewById<Button>(R.id.btnDiv)
        setActionListener(btnDiv)

        val btnClear = findViewById<Button>(R.id.btnClear)
        btnClear.setOnClickListener(){
            editResult.setText("0")
        }

        val btnResult = findViewById<Button>(R.id.btnResult)
        btnResult.setOnClickListener(){
            val numberTwo = editResult.text.toString().toInt()
            if(action == "+"){
                editResult.setText((numberOne+numberTwo).toString())
            }else if(action == "-"){
                editResult.setText((numberOne-numberTwo).toString())
            }else if(action == "/"){
                editResult.setText((numberOne/numberTwo).toString())
            }else if(action == "*"){
                editResult.setText((numberOne*numberTwo).toString())
            }
        }
    }

    private fun setActionListener(btn: Button){
        val editResult = findViewById<EditText>(R.id.editResult)

        btn.setOnClickListener(){
            numberOne = editResult.text.toString().toInt()
            action = btn.text.toString()
            editResult.setText("0")
        }
    }

    private fun setNumberButtonListener(btn: Button){
        btn.setOnClickListener(){
            val editResult = findViewById<EditText>(R.id.editResult)
            if(editResult.text.toString() == "0" || editResult.text.contains(' '))
                editResult.setText(btn.text.toString())
            else
                editResult.setText(editResult.text.toString() + btn.text.toString())
        }
    }
}