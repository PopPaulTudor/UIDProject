package com.example.uidproject.create_route;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.uidproject.BaseActivity;
import com.example.uidproject.R;
import com.example.uidproject.keep_buddy.KeepBuddyActivity;
import com.google.android.material.snackbar.Snackbar;

public class RouteSharedActivity extends BaseActivity {

    boolean isRouteShared = false;

    @Override
    public int getLayoutId() {
        return R.layout.activity_route_created;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String details = getIntent().getStringExtra("details");
        String category = getIntent().getStringExtra("category");
        String from = getIntent().getStringExtra("from");
        String to = getIntent().getStringExtra("to");
        TextView method = findViewById(R.id.method);
        method.setText(category);

        TextView detailsTV = findViewById(R.id.details);
        detailsTV.setText(details);

        TextView startingPoint = findViewById(R.id.startingPoint);
        startingPoint.setText(from);

        TextView endPoint = findViewById(R.id.destination);
        endPoint.setText(to);

        findViewById(R.id.shareRoute).setOnClickListener(view -> {
            if (isRouteShared) {
                Toast.makeText(getApplicationContext(), "Route is already shared", Toast.LENGTH_SHORT).show();
            } else {
                isRouteShared = true;
                Toast.makeText(getApplicationContext(), "Route is now shared", Toast.LENGTH_SHORT).show();


            }
        });

        findViewById(R.id.endRoute).setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), KeepBuddyActivity.class);
            startActivity(intent);
            this.finish();
        });


    }

    @Override
    public int getBottomNavigationMenuItemId() {
        return R.id.action_home;
    }
}
