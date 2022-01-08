package com.example.uidproject;


public class ProfileActivity extends BaseActivity{
    @Override
    int getLayoutId() {
        return R.layout.activity_profile;
    }

    @Override
    int getBottomNavigationMenuItemId() {
        return R.id.action_profile;

    }
}
