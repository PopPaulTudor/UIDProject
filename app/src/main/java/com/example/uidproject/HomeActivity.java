package com.example.uidproject;

import android.content.Intent;
import android.os.Bundle;

import com.example.uidproject.create_route.CreateRouteActivity;

public class HomeActivity extends BaseActivity{
    @Override
    public int getLayoutId() {
       return R.layout.activity_home;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, CreateRouteActivity.class));
    }

    @Override
    public int getBottomNavigationMenuItemId() {
        return R.id.action_home;

    }
}
