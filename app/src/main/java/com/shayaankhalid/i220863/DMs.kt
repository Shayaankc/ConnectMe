package com.shayaankhalid.i220863

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DMs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dms)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Dmbutton = findViewById<RelativeLayout>(R.id.henry)
        Dmbutton.setOnClickListener {
            val intent = Intent(this, WhiteDM::class.java)
            startActivity(intent)
        }

        val back = findViewById<ImageView>(R.id.backbutton)
        back.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }




    }
}