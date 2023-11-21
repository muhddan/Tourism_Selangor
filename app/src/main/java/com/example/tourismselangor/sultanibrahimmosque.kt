package com.example.tourismselangor

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sultanibrahimmosque : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sultanibrahimmosque)

        val masjidbtn: Button = findViewById (R.id.masjidbtn)

        masjidbtn.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/UjMkhHfHhE9B8F4U8"))
            startActivity(i)
        }
    }
}