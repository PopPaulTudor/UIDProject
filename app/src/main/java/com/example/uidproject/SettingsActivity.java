package com.example.uidproject;

public class SettingsActivity  extends BaseActivity{
    @Override
    int getLayoutId() {
        return R.layout.activity_settings;
    }

    @Override
    int getBottomNavigationMenuItemId() {
        return R.id.action_settings;

    }
}
