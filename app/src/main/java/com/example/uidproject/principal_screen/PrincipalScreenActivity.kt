package com.example.uidproject.principal_screen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.uidproject.BaseActivity
import com.example.uidproject.R
import com.example.uidproject.create_route.CreateRouteActivity

class PrincipalScreenActivity : BaseActivity() {

    lateinit var logo: ImageView
    lateinit var button1: Button
    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        logo = findViewById(R.id.logo)
        logo.setImageResource(R.drawable.logo)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)

        button1.setOnClickListener {

            val intent = Intent(this, CreateRouteActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {

            //val intent = Intent(this, joinRoute::class.java)
           // this.finish()
           // startActivity(intent)
        }
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun getBottomNavigationMenuItemId(): Int {
        return R.id.action_home
    }
}