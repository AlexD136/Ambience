package com.example.ambience_v2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        val loginTextView = findViewById<TextView>(R.id.loginTextView)

        // Set an OnClickListener for the loginTextView
        loginTextView.setOnClickListener {
            // Create an Intent to navigate back to activity_main.xml
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}