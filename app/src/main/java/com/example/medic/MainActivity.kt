package com.example.medic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextProfile(view: View){
        val intent = Intent(this, profile::class.java)
        startActivity(intent)
    }

    fun nextProverka(view: View){
        val intent = Intent(this, proverka::class.java)
        startActivity(intent)
    }
}