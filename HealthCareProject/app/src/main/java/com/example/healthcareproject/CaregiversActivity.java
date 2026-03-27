package com.example.healthcareproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class CaregiversActivity extends AppCompatActivity {

    Button btnBook1, btnBook2, btnBook3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caregivers);
        ImageView btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(CaregiversActivity.this, ClientHomeActivity.class);
            startActivity(intent);
        });

        btnBook1 = findViewById(R.id.btnBook1);
        btnBook2 = findViewById(R.id.btnBook2);
        btnBook3 = findViewById(R.id.btnBook3);

        btnBook1.setOnClickListener(v -> {
            Intent intent = new Intent(CaregiversActivity.this, BookAppointmentActivity.class);
            startActivity(intent);
        });

        btnBook2.setOnClickListener(v -> {
            Intent intent = new Intent(CaregiversActivity.this, BookAppointmentActivity.class);
            startActivity(intent);
        });

        btnBook3.setOnClickListener(v -> {
            Intent intent = new Intent(CaregiversActivity.this, BookAppointmentActivity.class);
            startActivity(intent);
        });
    }
}
