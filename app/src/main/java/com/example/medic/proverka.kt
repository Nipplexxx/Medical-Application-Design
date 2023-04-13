package com.example.medic

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class proverka : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proverka)

        val rotate = RotateAnimation(
            0f, 360f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )

        rotate.duration = 900
        rotate.repeatCount = Animation.INFINITE
        findViewById<ImageView>(R.id.imageView13).startAnimation(rotate)

        Handler(Looper.getMainLooper()).postDelayed({
            findViewById<TextView>(R.id.textView17).setText("Экспресс сбор и получение проб")
        }, 2000)

        Handler(Looper.getMainLooper()).postDelayed({
            findViewById<TextView>(R.id.textView17).setText("jyhtgrfedwmhtgrtfrd")
        }, 4000)
    }
}