package com.example.tourismselangor

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tasikcempaka : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasikcempaka)

        val cempakabtn: Button = findViewById (R.id.cempakabtn)

        cempakabtn.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/fomjvBWtMAa5Mi6C7"))
            startActivity(i)
        }

    }
}