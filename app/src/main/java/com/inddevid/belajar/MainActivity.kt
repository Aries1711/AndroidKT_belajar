package com.inddevid.belajar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val imageBg: ImageView = findViewById(R.id.bg_id)
//        Glide.with(this).load(R.drawable.belajar).into(imageBg);
        val rollButton: Button = findViewById(R.id.btn_roll)
        rollButton.setOnClickListener { rollDiced() }
    }

    private fun rollDiced() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val numberMessage: TextView = findViewById(R.id.numberRoller)
        numberMessage.text = diceRoll.toString()
    }

    class Dice (private val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}