package com.nuryadincjr.aplikasipertamakode

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
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
        val images: ImageView = findViewById(R.id.ivOwen)

        val drawableResorce = when(Random().nextInt(6) +1) {
            1 -> R.drawable.ic_baseline_cloud_24
            2 -> R.drawable.ic_baseline_cloud_done_24
            3 -> R.drawable.ic_baseline_cloud_off_24
            4 -> R.drawable.ic_baseline_cloud_queue_24
            5 -> R.drawable.ic_baseline_cloud_upload_24
            else -> R.drawable.ic_baseline_cloud_empty
        }

        images.setImageResource(drawableResorce)
    }
}