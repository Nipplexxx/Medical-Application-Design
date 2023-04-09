package com.example.medic.register

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.medic.R


class register_email : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_email)
        findViewById<Button>(R.id.btninactived).visibility = View.GONE;
        findViewById<Button>(R.id.btninactived).visibility = View.VISIBLE;

         findViewById<EditText>(R.id.editMail).addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable) {
                findViewById<Button>(R.id.btninactived).visibility = View.VISIBLE;
                findViewById<Button>(R.id.btninactivedNone).visibility = View.GONE;
            }
        })
    }
    fun NextCode(view: View){
        val Intent = Intent(this, register_code::class.java)
        startActivity(Intent)
    }
}