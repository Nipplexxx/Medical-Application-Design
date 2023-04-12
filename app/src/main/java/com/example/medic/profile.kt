package com.example.medic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.canhub.cropper.CropImageContract
import com.canhub.cropper.CropImageView
import com.canhub.cropper.options

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun nextMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    private val cropImage = registerForActivityResult(CropImageContract()) { result ->
        if (result.isSuccessful) {
            // Use the returned uri.
            val uriContent = result.uriContent
        } else {
            // An error occurred.
            val exception = result.error
        }
    }
    private fun startCrop(APP_ACTIVITY: MainActivity) {
        // Start picker to get image for cropping and then use the image in cropping activity.
        cropImage.launch(
            options {
                setGuidelines(CropImageView.Guidelines.ON)
            }
        )
    }
}