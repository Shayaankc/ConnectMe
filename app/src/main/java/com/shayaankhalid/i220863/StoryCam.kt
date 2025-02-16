package com.shayaankhalid.i220863

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StoryCam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_story_cam)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button1 = findViewById<ImageView>(R.id.cross)
        button1.setOnClickListener {
            finish()
        }
        val button2 = findViewById<ImageView>(R.id.gall)
        button2.setOnClickListener {
            val intent = Intent(this, newpost::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<TextView>(R.id.nexttxt)
        button3.setOnClickListener {
            val intent = Intent(this, finishpost::class.java)
            startActivity(intent)

        }


    }
}