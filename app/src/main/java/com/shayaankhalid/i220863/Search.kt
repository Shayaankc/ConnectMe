package com.shayaankhalid.i220863

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.Profile
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<ImageView>(R.id.home)
        button.setOnClickListener {
            finish()
        }
        val button1 = findViewById<ImageView>(R.id.prof)
        button1.setOnClickListener {
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)
            finish()
        }
        val button3 = findViewById<ImageView>(R.id.contact)
        button3.setOnClickListener {
            val intent = Intent(this, Contacts::class.java)
            startActivity(intent)
            finish()
        }
        val button2 = findViewById<TextView>(R.id.proftxt)
        button2.setOnClickListener {
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