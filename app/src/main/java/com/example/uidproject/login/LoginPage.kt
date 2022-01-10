package com.example.uidproject.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.uidproject.R
import com.example.uidproject.mainActivity.MainActivity
import com.google.android.material.textfield.TextInputEditText

class LoginPage : AppCompatActivity() {
    lateinit var button: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val hello = findViewById<TextView>(R.id.hello)
        hello.text = "Welcome!"

        val usernameInput = findViewById<TextInputEditText>(R.id.usernameInput)
        val passwordInput = findViewById<TextInputEditText>(R.id.passwordInput)

        button = findViewById(R.id.loginButton)
        button.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            val intent = Intent(this, MainActivity::class.java)
            this.finish()
            startActivity(intent)
        }
    }
}