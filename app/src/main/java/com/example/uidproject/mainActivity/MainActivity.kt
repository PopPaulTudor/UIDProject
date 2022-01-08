package com.example.uidproject.mainActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.uidproject.R
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    lateinit var logo: ImageView
    lateinit var button1: Button
    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logo = findViewById(R.id.logo)
        logo.setImageResource(R.drawable.logo)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)

        button1.setOnClickListener {

            //val intent = Intent(this, createRoute::class.java)
            //this.finish()
            //startActivity(intent)
        }

        button2.setOnClickListener {

            //val intent = Intent(this, joinRoute::class.java)
           // this.finish()
           // startActivity(intent)
        }
    }
}