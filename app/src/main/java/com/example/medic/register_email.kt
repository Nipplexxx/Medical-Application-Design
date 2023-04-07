package com.example.medic

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class register_email : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_email)

            findViewById<EditText>(R.id.editMail).addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                if (findViewById<EditText>(R.id.editMail) != null) {
                    findViewById<Button>(R.id.btninactived).setEnabled(true)
                }
            }
            override fun afterTextChanged(editable: Editable) {}
        })
    }

    fun NextCode(view: View){
        val Intent = Intent(this, register_code::class.java)
        startActivity(Intent)
    }
}