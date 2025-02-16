package com.shayaankhalid.i220863

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val back = findViewById<ImageView>(R.id.home)
        back.setOnClickListener {
            finish()
        }
        val editprof = findViewById<ImageView>(R.id.edit)
        editprof.setOnClickListener {
            startActivity(Intent(this,EditProfile::class.java))
        }

        val followers = findViewById<TextView>(R.id.c5)
        followers.setOnClickListener {
            startActivity(Intent(this,FollowersPage::class.java))
        }
        val followers1 = findViewById<TextView>(R.id.c2)
        followers1.setOnClickListener {
            startActivity(Intent(this,FollowersPage::class.java))
        }
        val following = findViewById<TextView>(R.id.c3)
        following.setOnClickListener {
            startActivity(Intent(this,FollowingPage::class.java))
        }
        val following1 = findViewById<TextView>(R.id.c6)
        following1.setOnClickListener {
            startActivity(Intent(this,FollowingPage::class.java))
        }

        val search = findViewById<ImageView>(R.id.search)
        search.setOnClickListener {
            startActivity(Intent(this,Search::class.java))
            finish()
        }
        val button3 = findViewById<ImageView>(R.id.contact)
        button3.setOnClickListener {
            val intent = Intent(this, Contacts::class.java)
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