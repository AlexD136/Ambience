package com.example.ambience_v2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MenuScreenDCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_screen_dc)
        // Any additional setup for your menu screen can go here

        val socialFeedTextView = findViewById<TextView>(R.id.socialFeedTextView)

        // Set OnClickListener to the TextView
        socialFeedTextView.setOnClickListener {
            // When the TextView is clicked, start the SocialFeedActivity
            val intent = Intent(this, SocialFeedActivity::class.java)
            startActivity(intent)
        }
    }
}