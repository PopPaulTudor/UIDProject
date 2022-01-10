package com.example.uidproject.create_route;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uidproject.BaseActivity;
import com.example.uidproject.R;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CreateRouteActivity extends BaseActivity {

    Button addStop, createRoute;
    EditText start, end;

    @Override
    public int getLayoutId() {
        return R.layout.activity_create_route_initial;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addStop = findViewById(R.id.addStopButton);
        createRoute = findViewById(R.id.createRouteButton);
        start = findViewById(R.id.startingPoint);
        end = findViewById(R.id.destinationPoint);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewCreateRoute);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<Stop> list = new ArrayList<>();
        AtomicReference<StopsAdapter> adapter = new AtomicReference<>(new StopsAdapter(getApplicationContext(), list));
        recyclerView.setAdapter(adapter.get());
        addStop.setOnClickListener(view -> {
            if (start.getText().toString().length() > 2 &&
                    end.getText().toString().length() > 2
            ) {
                list.add(new Stop(start.getText().toString(), end.getText().toString()));
                adapter.set(new StopsAdapter(getApplicationContext(), list));
                recyclerView.setAdapter(adapter.get());
            } else {
                Toast.makeText(getApplicationContext(),
                        "Please fill all the fields", Toast.LENGTH_SHORT).show();
            }
        });

        createRoute.setOnClickListener(view -> {
            Intent intent = new Intent(this, PickTransportationActivity.class);
            intent.putExtra("from", start.getText().toString());
            intent.putExtra("to", end.getText().toString());
            startActivity(intent);
        });

    }

    @Override
    public int getBottomNavigationMenuItemId() {
        return R.id.action_home;

    }
}
