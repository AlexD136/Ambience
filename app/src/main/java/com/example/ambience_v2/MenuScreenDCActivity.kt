package com.example.ambience_v2

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MenuScreenDCActivity : AppCompatActivity() {

    private lateinit var countdownTextView: TextView
    private var countdownTimer: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_screen_dc)

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
        countdownTextView = findViewById(R.id.countdownTextView)
        startCountdownTimer()

        val socialFeedTextView = findViewById<TextView>(R.id.socialFeedTextView)

        socialFeedTextView.setOnClickListener {
            val intent = Intent(this, SocialFeedActivity::class.java)
            startActivity(intent)
        }


        val profileTextView = findViewById<TextView>(R.id.profileTextView)

        profileTextView.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    private fun startCountdownTimer() {
        countdownTimer = object : CountDownTimer(24 * 60 * 60 * 1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val hours = millisUntilFinished / (1000 * 60 * 60)
                val minutes = (millisUntilFinished % (1000 * 60 * 60)) / (1000 * 60)
                val seconds = (millisUntilFinished % (1000 * 60)) / 1000

                val timeLeftFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds)
                runOnUiThread {
                    countdownTextView.text = timeLeftFormatted
                }
            }

            override fun onFinish() {
                startCountdownTimer()
            }
        }
    }
}
