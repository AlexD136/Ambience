package com.example.ambience_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.ambience_v2.R

class SocialFeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.social_feed)

        val dailyChallengeTextView = findViewById<TextView>(R.id.dailyChallengeTextView)

        // Set OnClickListener to the TextView
        dailyChallengeTextView.setOnClickListener {
            // When the TextView is clicked, start the SocialFeedActivity
            val intent = Intent(this, MenuScreenDCActivity::class.java)
            startActivity(intent)
        }
    }
}