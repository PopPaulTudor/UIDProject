package com.example.uidproject.create_route;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.uidproject.BaseActivity;
import com.example.uidproject.R;


public class CreateRouteBusActivity extends BaseActivity {

    EditText departureTime, departureLoc, destinationLoc, lineNumber;

    @Override
    public int getLayoutId() {
        return R.layout.activity_create_route_bus;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        departureTime = findViewById(R.id.departureTimeCreateRoute);
        departureLoc = findViewById(R.id.departureLocCreateRoute);
        destinationLoc = findViewById(R.id.destinationLoc);
        lineNumber = findViewById(R.id.lineNumber);

        findViewById(R.id.busMaterialCard).setOnClickListener(view -> {

            if (departureTime.getText().length() > 3 &&
                    departureLoc.getText().length() > 3 &&
                    destinationLoc.getText().length() > 3
            ) {
                Intent intent = new Intent(getApplicationContext(), RouteSharedActivity.class);
                intent.putExtra("category", "by bus");
                intent.putExtra("details", lineNumber.getText().toString() + ", dep. time:" + departureTime.getText().toString());
                intent.putExtra("from", getIntent().getStringExtra("from"));
                intent.putExtra("to", getIntent().getStringExtra("to"));
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Please fill all the fields", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getBottomNavigationMenuItemId() {
        return R.id.action_home;

    }

}
