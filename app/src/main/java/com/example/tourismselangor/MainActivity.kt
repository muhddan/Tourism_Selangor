package com.example.tourismselangor

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutselangorbtn: Button = findViewById (R.id.aboutselangorbtn)

        aboutselangorbtn.setOnClickListener() {
            val intent = Intent(this, About_selangor::class.java)
            startActivity(intent)
        }

        val explorebtn: Button = findViewById (R.id.explorebtn)

        explorebtn.setOnClickListener() {
            val intent = Intent(this, Explore_selangor::class.java)
            startActivity(intent)
        }

        val tipsbtn: Button = findViewById (R.id.tipsbtn)

        tipsbtn.setOnClickListener() {
            val intent = Intent(this, travelling_tips::class.java)
            startActivity(intent)
        }

        val feedbackbtn: Button = findViewById (R.id.feedbackbtn)

        feedbackbtn.setOnClickListener() {
            val intent = Intent(this, feedpage::class.java)
            startActivity(intent)
        }

        val userguidebtn: Button = findViewById (R.id.userguidebtn)

        userguidebtn.setOnClickListener() {
            val intent = Intent(this, user_guide::class.java)
            startActivity(intent)
        }

        val instagrambtn: Button = findViewById (R.id.instagrambtn)

        instagrambtn.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/discoverselangor/"))
            startActivity(i)
        }
    }
}