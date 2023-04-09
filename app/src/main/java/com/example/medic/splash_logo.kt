package com.example.medic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.medic.register.onBoard1_2_3

class splash_logo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_logo)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, onBoard1_2_3::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}