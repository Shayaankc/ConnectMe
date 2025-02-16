package com.shayaankhalid.i220863

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val RecyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val postList = ArrayList<homepageModel>()
        postList.add(homepageModel(R.drawable.dp2, "Emily James", R.drawable.img1, "Emily James", "Had a great hike across this beautiful landscape"))
        postList.add(homepageModel(R.drawable.dp16, "Tony Penberthy", R.drawable.wirepic, "Tony Penberthy", "Cute Picture i drew <3"))
        postList.add(homepageModel(R.drawable.dp9, "Imojean Swigert", R.drawable.img3, "Imojean Swigert", "Might start an art page soon"))
        postList.add(homepageModel(R.drawable.dp3, "Lily Thomas", R.drawable.img5, "Lily Thomas", "BEST PICTURE IVE EVER TAKEN :D"))


        val adapter = PostAdapter(postList, this)
        RecyclerView.layoutManager = LinearLayoutManager(this)
        RecyclerView.adapter = adapter

        val imageView: ImageView = findViewById(R.id.dmbutton)
        imageView.setOnClickListener {
            val intent = Intent(this, DMs::class.java)
            startActivity(intent)
        }


    }
}