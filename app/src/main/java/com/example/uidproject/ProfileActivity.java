package com.example.uidproject;


public class ProfileActivity extends BaseActivity{
    @Override
    public int getLayoutId() {
        return R.layout.activity_profile;
    }

    @Override
    public int getBottomNavigationMenuItemId() {
        return R.id.action_profile;

    }
}
