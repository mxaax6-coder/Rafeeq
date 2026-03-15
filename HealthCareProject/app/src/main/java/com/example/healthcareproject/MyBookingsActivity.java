package com.example.healthcareproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MyBookingsActivity extends AppCompatActivity {

    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_bookings);

        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(MyBookingsActivity.this, ClientHomeActivity.class);
            startActivity(intent);
        });
    }
}