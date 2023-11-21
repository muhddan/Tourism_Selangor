package com.example.tourismselangor

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sungailepoh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sungailepoh)

        val lepohbtn: Button = findViewById (R.id.lepohbtn)

        lepohbtn.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/YrxemychpLns1CKd8"))
            startActivity(i)
        }
    }
}