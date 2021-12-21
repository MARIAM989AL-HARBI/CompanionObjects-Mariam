package com.example.companionobjectsapp_mariam2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {       //objects that are created inside of a class and hold variables or functions that can be accessed directly without the need of creating an object of the class.
    lateinit var constraintLayout: ConstraintLayout
    lateinit var labelTextView: TextView
    lateinit var dayNightEditText: EditText
    lateinit var changerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        constraintLayout = findViewById(R.id.main)
        labelTextView = findViewById(R.id.Text)
        dayNightEditText = findViewById(R.id.Edit)
        changerButton = findViewById(R.id.changer_btn)
        changerButton.setOnClickListener {
            val background = Background(this)
            background.set(constraintLayout, dayNightEditText.text.toString())
        }
    }
}