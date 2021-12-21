package com.example.companionobjectsapp_mariam2

import android.content.Context
import android.view.View
import android.widget.Toast

class Background (private val context: Context){
    companion object {   //call 
        const val nightBackground = R.drawable.night
        const val morningBackground = R.drawable.mornig
    }

    fun set(layout: View, dayNight: String) {
        when (dayNight){
            "morning" -> {
                layout.setBackgroundResource(morningBackground)
            }
            "night" -> {
                layout.setBackgroundResource(nightBackground)
            }
            else -> {
                Toast.makeText(context, "Please enter either mornig or night", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
