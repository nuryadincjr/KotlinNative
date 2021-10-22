package com.nuryadincjr.aplikasipertamakode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.nuryadincjr.aplikasipertamakode.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)


        binding.user = Users(
            "Nuryadin Abutani", "nurydin.cjr@gmail.com", "081541181633"
        )

        binding.btnDone.setOnClickListener { binding.myName.text = "Helo" }

    }
}