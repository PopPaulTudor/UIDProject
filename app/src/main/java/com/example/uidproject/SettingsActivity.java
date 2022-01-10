package com.example.uidproject;

public class SettingsActivity  extends BaseActivity{
    @Override
    public int getLayoutId() {
        return R.layout.activity_settings;
    }

    @Override
    public int getBottomNavigationMenuItemId() {
        return R.id.action_settings;

    }
}
