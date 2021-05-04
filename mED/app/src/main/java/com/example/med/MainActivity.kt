package com.example.med

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinnerCat = findViewById<Spinner>(R.id.spinnerCat)
        ArrayAdapter.createFromResource(
            this,
            R.array.category,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinnerCat.adapter = adapter
        }


        val spinnerMed = findViewById<Spinner>(R.id.spinnerMed)
        ArrayAdapter.createFromResource(
            this,
            R.array.category,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinnerMed.adapter = adapter
        }

        val btnCalc = findViewById<Button>(R.id.btnCalc)

        btnCalc.setOnClickListener{

            val editResult = findViewById<EditText>(R.id.editResult)
            val editAge = findViewById<EditText>(R.id.editAge)
            val editWeight = findViewById<EditText>(R.id.editWeight)

            if(editAge.text.isEmpty() || editAge.text.toString().toInt() < 1){
                Toast.makeText(this, "Vecumam jābūt lielākam par 0!", Toast.LENGTH_LONG).show()
            }
            else if(editWeight.text.isEmpty() || editWeight.text.toString().toInt() < 1){
                Toast.makeText(this, "Svaram jābūt lielākam par 0!", Toast.LENGTH_LONG).show()
            }
            else{
                var med = spinnerCat.selectedItem.toString().toInt() +
                        spinnerMed.selectedItem.toString().toInt()
                var result = med * editAge.text.toString().toInt() + editWeight.text.toString().toInt()

                editResult.setText(result.toString())
            }




        }


    }
}