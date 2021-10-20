package com.nuryadincjr.aplikasipertamakode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val resoultText: TextView = findViewById(R.id.tvNomber)
        val randomInt = Random().nextInt(6) +1

        resoultText.text = randomInt.toString()
    }
}