package com.example.lighthouse00;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class ServiceActivity extends AppCompatActivity {

    public static TextView tvShakeService;
    public static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        button = findViewById(R.id.stopbutton);

        Intent intent = new Intent(this, ShakeService.class);
        //Start Service
        startService(intent);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);
            }
        });


        tvShakeService = findViewById(R.id.tvShakeService);



    }
}