package com.example.uidproject.create_route;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.uidproject.BaseActivity;
import com.example.uidproject.R;

public class CreateRouteCarActivity extends BaseActivity {

    EditText regNo, color, model, vinModel;

    @Override
    public int getLayoutId() {
        return R.layout.activity_create_route_car;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        regNo = findViewById(R.id.regNr);
        color = findViewById(R.id.color);
        model = findViewById(R.id.carModel);
        vinModel = findViewById(R.id.vmModel);

        findViewById(R.id.regCar).setOnClickListener(view -> {
            if (regNo.getText().length() > 3 &&
                    color.getText().length() > 3 &&
                    model.getText().length() > 3 &&
                    vinModel.getText().length() > 3
            ) {
                Intent intent = new Intent(getApplicationContext(), RouteSharedActivity.class);
                intent.putExtra("category", "by car");
                intent.putExtra("details",
                        model.getText().toString() + "," + vinModel.getText().toString()
                                + " " + color.getText().toString() + " " +regNo.getText().toString());
                intent.putExtra("from", getIntent().getStringExtra("from"));
                intent.putExtra("to", getIntent().getStringExtra("to"));
                startActivity(intent);
            }else {
                Toast.makeText(getApplicationContext(), "Please fill all the fields", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getBottomNavigationMenuItemId() {
        return R.id.action_home;

    }

}
