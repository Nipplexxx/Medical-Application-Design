package com.example.medic.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.medic.MainActivity
import com.example.medic.R

class profile_register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_register)

        findViewById<Button>(R.id.btninactived2).visibility = View.GONE
        findViewById<Button>(R.id.btninactivedNone2).visibility = View.VISIBLE

        findViewById<EditText>(R.id.editName).addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                findViewById<Button>(R.id.btninactived2).visibility = View.VISIBLE
                findViewById<Button>(R.id.btninactivedNone2).visibility = View.GONE
            }

        })
    }

    fun nextActivity(view: View){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}