package com.example.tourismselangor

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class gentingfarm : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gentingfarm)

        val gentingbtn: Button = findViewById (R.id.gentingbtn)

        gentingbtn.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/d3XUvszs5au7MHo56"))
            startActivity(i)
        }
    }
}