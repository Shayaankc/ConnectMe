package com.shayaankhalid.i220863

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.UnderlineSpan
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signupPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup_page)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Underline the "Terms of Service and Privacy Policy"
        val tosLinks: TextView = findViewById(R.id.tos_links)
        val spannableString = SpannableString("Terms of Service and Privacy Policy")
        spannableString.setSpan(UnderlineSpan(), 0, spannableString.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tosLinks.text = spannableString
    }
}