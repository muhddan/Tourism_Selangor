package com.example.tourismselangor

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class chongkakpark : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chongkakpark)

        val chongkakbtn: Button = findViewById (R.id.chongkakbtn)

        chongkakbtn.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/snFu7kDGG1TgB4Mm6"))
            startActivity(i)
        }
    }
}