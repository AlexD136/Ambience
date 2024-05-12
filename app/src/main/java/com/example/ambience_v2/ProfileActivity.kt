package com.example.ambience_v2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val menuImageView = findViewById<ImageView>(R.id.menuImageView)
        val backArrow = findViewById<ImageView>(R.id.backArrow)

        menuImageView.setOnClickListener {
            // Open sidebar menu
            drawerLayout.openDrawer(GravityCompat.START)
        }

        backArrow.setOnClickListener {
            // Close sidebar menu
            drawerLayout.closeDrawer(GravityCompat.START)
        }

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