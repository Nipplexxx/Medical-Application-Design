package com.example.medic.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.medic.MainActivity
import com.example.medic.R

class profile_register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_register)
    }

    fun nextActivity(view: View){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}