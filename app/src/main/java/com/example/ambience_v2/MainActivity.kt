package com.example.ambience_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ambienceTextView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
            val passwordEditText = findViewById<EditText>(R.id.passwordEditText)

            // Get the input text from EditTexts
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Check if username and password match expected values
            if (username == "Username" && password == "Password") {
                // Navigate to the menu_screen_dc activity
                val intent = Intent(this, MenuScreenDCActivity::class.java)
                startActivity(intent)
            } else {
                // Show error message or handle incorrect credentials
            }
        }
    }
}