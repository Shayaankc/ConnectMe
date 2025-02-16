package com.shayaankhalid.i220863

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Contacts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contacts)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val back = findViewById<ImageView>(R.id.home)
        back.setOnClickListener {
            finish()
        }
        val search = findViewById<ImageView>(R.id.search)
        search.setOnClickListener {
            startActivity(Intent(this,Search::class.java))
            finish()
        }
        val button1 = findViewById<ImageView>(R.id.prof)
        button1.setOnClickListener {
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)
            finish()
        }
        val button4 = findViewById<ImageView>(R.id.circle)
        button4.setOnClickListener {
            val intent = Intent(this, StoryCam::class.java)
            startActivity(intent)
        }
        val button5  = findViewById<ImageView>(R.id.plus)
        button5.setOnClickListener {
            val intent = Intent(this, StoryCam::class.java)
            startActivity(intent)
        }

    }
}