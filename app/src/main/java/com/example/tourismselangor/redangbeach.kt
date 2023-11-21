package com.example.tourismselangor

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class redangbeach : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redangbeach)

        val redangbtn: Button = findViewById (R.id.redangbtn)

        redangbtn.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/LpSqpLwZBJ2m9R8n8"))
            startActivity(i)
        }
    }
}