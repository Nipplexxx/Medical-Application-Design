package com.example.medic.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.medic.R

class password_code : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_code)

        findViewById<TextView>(R.id.blue).visibility = View.GONE
        findViewById<TextView>(R.id.blue1).visibility = View.GONE
        findViewById<TextView>(R.id.blue2).visibility = View.GONE
        findViewById<TextView>(R.id.blue3).visibility = View.GONE
        findViewById<TextView>(R.id.blue4).visibility = View.GONE
        findViewById<TextView>(R.id.blue5).visibility = View.GONE
        findViewById<TextView>(R.id.blue6).visibility = View.GONE
        findViewById<TextView>(R.id.blue7).visibility = View.GONE
        findViewById<TextView>(R.id.blue8).visibility = View.GONE
        findViewById<TextView>(R.id.blue9).visibility = View.GONE


        findViewById<TextView>(R.id.codePoint1).visibility = View.GONE
        findViewById<TextView>(R.id.codePoint2).visibility = View.GONE
        findViewById<TextView>(R.id.codePoint3).visibility = View.GONE
        findViewById<TextView>(R.id.codePoint4).visibility = View.GONE
    }

    fun nextActivity(view: View){
        intent = Intent(this, profile_register::class.java)
        startActivity(intent)
    }
}