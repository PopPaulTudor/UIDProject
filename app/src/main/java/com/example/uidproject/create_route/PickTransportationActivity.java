package com.example.uidproject.create_route;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;


import com.example.uidproject.BaseActivity;
import com.example.uidproject.R;

public class PickTransportationActivity extends BaseActivity {

    Button byCar, byBus, byFoot;

    @Override
    public int getLayoutId() {
        return R.layout.activity_pick_transportation;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        findViewById(R.id.byCar).setOnClickListener(view -> {
            Intent intent = new Intent(this, CreateRouteCarActivity.class);
            intent.putExtra("from", getIntent().getStringExtra("from"));
            intent.putExtra("to", getIntent().getStringExtra("to"));
            startActivity(intent);
        });

        findViewById(R.id.byBus).setOnClickListener(view -> {
            Intent intent = new Intent(this, CreateRouteBusActivity.class);
            intent.putExtra("from", getIntent().getStringExtra("from"));
            intent.putExtra("to", getIntent().getStringExtra("to"));
            startActivity(intent);
        });

        findViewById(R.id.byFoot).setOnClickListener(view -> {
            Intent intent = new Intent(this, RouteSharedActivity.class);
            intent.putExtra("category", "by foot");
            intent.putExtra("from", getIntent().getStringExtra("from"));
            intent.putExtra("to", getIntent().getStringExtra("from"));
            startActivity(intent);
        });


    }

    @Override
    public int getBottomNavigationMenuItemId() {
        return R.id.action_home;

    }
}
