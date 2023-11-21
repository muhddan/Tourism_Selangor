package com.example.tourismselangor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sabakbernam_region : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sabakbernam_region)

        val ahmabtn: Button = findViewById (R.id.ahmabtn)

        ahmabtn.setOnClickListener() {
            val intent = Intent(this, ahmahouse::class.java)
            startActivity(intent)
        }

        val sekinchanbtn: Button = findViewById (R.id.sekinchanbtn)

        sekinchanbtn.setOnClickListener() {
            val intent = Intent(this, sekinchanpaddy::class.java)
            startActivity(intent)
        }

        val redangbeachbtn: Button = findViewById (R.id.redangbeachbtn)

        redangbeachbtn.setOnClickListener() {
            val intent = Intent(this, redangbeach::class.java)
            startActivity(intent)
        }
    }
}