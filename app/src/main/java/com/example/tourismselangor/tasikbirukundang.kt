package com.example.tourismselangor

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tasikbirukundang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasikbirukundang)

        val tasikbirubtn: Button = findViewById (R.id.tasikbirubtn)

        tasikbirubtn.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/87v3ATbg1Frnsvaw7"))
            startActivity(i)
        }

    }
}