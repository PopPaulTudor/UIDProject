package com.example.uidproject.join_route.screens

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.uidproject.BaseActivity
import com.example.uidproject.R

class JoinedRoute : BaseActivity() {


    override fun getLayoutId(): Int {
        return R.layout.activity_joined_route
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button: Button = findViewById(R.id.goToProfile)
        button.setOnClickListener {
            val intent = Intent(this, OthersProfile::class.java)
            startActivity(intent)
        }
    }

    override fun getBottomNavigationMenuItemId(): Int {
        return R.id.action_home
    }

}