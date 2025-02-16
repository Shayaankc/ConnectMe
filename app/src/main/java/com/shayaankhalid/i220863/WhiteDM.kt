package com.shayaankhalid.i220863

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WhiteDM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_white_dm)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val back = findViewById<ImageView>(R.id.backbutton)
        back.setOnClickListener {
            val intent = Intent(this, DMs::class.java)
            startActivity(intent)
        }

        val voicecall = findViewById<ImageView>(R.id.callicon)
        voicecall.setOnClickListener {
            val intent = Intent(this, VoiceCall::class.java)
            startActivity(intent)
        }

        val vidcall = findViewById<ImageView>(R.id.videoicon)
        vidcall.setOnClickListener {
            val intent = Intent(this, Videocall::class.java)
            startActivity(intent)
        }

        val send = findViewById<ImageView>(R.id.sendbutton)
        send.setOnClickListener {
            val intent = Intent(this, BlackDM::class.java)
            startActivity(intent)
            finish()
        }
    }
}