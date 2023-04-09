package com.example.medic.register

import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Chronometer
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.medic.R

class register_code : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_code)

        findViewById<Chronometer>(R.id.view_timer).isCountDown = true
        findViewById<Chronometer>(R.id.view_timer).base = SystemClock.elapsedRealtime() + 60000
        findViewById<Chronometer>(R.id.view_timer).start()

        findViewById<EditText>(R.id.inputcode4).addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable) {
                ClickNext()
            }
        })
    }

    private fun ClickNext() {
        val intent = Intent(this, password_code::class.java)
        startActivity(intent)
    }

    fun ClickBack(view: View){
        val intent = Intent(this, register_email::class.java)
        startActivity(intent)
    }
}