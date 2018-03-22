package com.example.otto.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button compassButton = findViewById(R.id.compassButton);
        Button aButton = findViewById(R.id.accelerometerButton);

        compassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startCompass();
            }
        });

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAccel();
            }
        });

    }

    public void startCompass(){
        intent = new Intent(getApplicationContext(), Compass.class);
        startActivity(intent);
    }

    public void startAccel(){
        intent = new Intent(getApplicationContext(), Accelerometer.class);
        startActivity(intent);
    }
}
