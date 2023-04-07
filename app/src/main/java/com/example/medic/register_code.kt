package com.example.medic

import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Chronometer
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class register_code : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_code)

        findViewById<Chronometer>(R.id.view_timer).isCountDown = true
        findViewById<Chronometer>(R.id.view_timer).base = SystemClock.elapsedRealtime() + 20000
        findViewById<Chronometer>(R.id.view_timer).start()
    }

    fun ClickBack(view: View){
        val intent = Intent(this, register_email::class.java)
        startActivity(intent)
    }
}