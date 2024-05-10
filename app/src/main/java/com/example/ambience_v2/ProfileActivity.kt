package com.example.ambience_v2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val dailyChallengeTextView = findViewById<TextView>(R.id.dailyChallengeTextView)

        // Set OnClickListener to the TextView
        dailyChallengeTextView.setOnClickListener {
            // When the TextView is clicked, start the SocialFeedActivity
            val intent = Intent(this, MenuScreenDCActivity::class.java)
            startActivity(intent)
        }

        val socialFeedTextView = findViewById<TextView>(R.id.socialFeedTextView)

        // Set OnClickListener to the TextView
        socialFeedTextView.setOnClickListener {
            // When the TextView is clicked, start the SocialFeedActivity
            val intent = Intent(this, SocialFeedActivity::class.java)
            startActivity(intent)
        }
    }
}