package com.example.healthcareproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BookAppointmentActivity extends AppCompatActivity {

    ImageView btnBack;
    Button btnConfirmBooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_appointment);

        btnBack = findViewById(R.id.btnBack);
        btnConfirmBooking = findViewById(R.id.btnConfirmBooking);

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(BookAppointmentActivity.this, CaregiversActivity.class);
            startActivity(intent);
        });

        btnConfirmBooking.setOnClickListener(v -> {
            Intent intent = new Intent(BookAppointmentActivity.this, MyBookingsActivity.class);
            startActivity(intent);
        });
    }
}