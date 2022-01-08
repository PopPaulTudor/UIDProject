package com.example.uidproject.addCar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.uidproject.R
import com.example.uidproject.profilePage.ProfilePage
import com.google.android.material.textfield.TextInputEditText

class AddCar : AppCompatActivity() {
    lateinit var button: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_car)

        val hello = findViewById<TextView>(R.id.hello)
        hello.text = "Add your car"

        val name = findViewById<TextInputEditText>(R.id.car_name)
        val year = findViewById<TextInputEditText>(R.id.year)
        val number = findViewById<TextInputEditText>(R.id.number)
        val color = findViewById<TextInputEditText>(R.id.color)

        button = findViewById(R.id.add)
        button.setOnClickListener {
            val carName = name.text.toString()
            val carYear = year.text.toString()
            val carNumber = number.text.toString()
            val carColor = color.text.toString()

            val intent = Intent(this, ProfilePage::class.java)
            this.finish()
            startActivity(intent)
        }

    }
}