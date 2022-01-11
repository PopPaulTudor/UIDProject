package com.example.uidproject.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.uidproject.R
import com.example.uidproject.principal_screen.PrincipalScreenActivity
import com.google.android.material.textfield.TextInputEditText

class LoginPage : AppCompatActivity() {
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val usernameInput = findViewById<TextInputEditText>(R.id.usernameInput)
        val passwordInput = findViewById<TextInputEditText>(R.id.passwordInput)

        button = findViewById(R.id.loginButton)
        button.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if(username.length > 3 && password.length > 3){
            val intent = Intent(this, PrincipalScreenActivity::class.java)
            this.finish()
            startActivity(intent)

            }else {
                Toast.makeText(applicationContext, "Please enter correct credentials", Toast.LENGTH_SHORT).show()
            }

        }
        button.setOnLongClickListener(View.OnLongClickListener {
            val intent = Intent(this, PrincipalScreenActivity::class.java)
            this.finish()
            startActivity(intent)
            true
        })
    }
}