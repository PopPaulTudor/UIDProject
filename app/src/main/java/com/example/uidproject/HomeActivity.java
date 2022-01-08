package com.example.uidproject;

public class HomeActivity extends BaseActivity{
    @Override
    int getLayoutId() {
       return R.layout.activity_home;
    }

    @Override
    int getBottomNavigationMenuItemId() {
        return R.id.action_home;

    }
}
