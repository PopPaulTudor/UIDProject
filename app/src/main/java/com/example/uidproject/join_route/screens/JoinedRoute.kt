package com.example.uidproject.join_route.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uidproject.BaseActivity
import com.example.uidproject.R

class JoinedRoute : BaseActivity() {


    override fun getLayoutId(): Int {
        return R.layout.activity_joined_route
    }

    override fun getBottomNavigationMenuItemId(): Int {
        return R.id.action_home
    }

}