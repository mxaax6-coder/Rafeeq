package com.example.healthcareproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentSuccessfulActivity extends AppCompatActivity {

    private Button btnViewBooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_successful);

        btnViewBooking = findViewById(R.id.btnViewBooking);

        btnViewBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaymentSuccessfulActivity.this, MyBookingsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}