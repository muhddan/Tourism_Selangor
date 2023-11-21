package com.example.tourismselangor

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bucket_splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bucket_splash)

        val bucketsplashbtn: Button = findViewById (R.id.bucketsplashbtn)

        bucketsplashbtn.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/rKumNk8TKhekiMRp7"))
            startActivity(i)
        }
    }
}