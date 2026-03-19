package com.example.healthcareproject;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MyAppointmentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_appointments);

        ImageView btnBack = findViewById(R.id.btnBack);
        TextView tvStatus = findViewById(R.id.tvStatus);
        LinearLayout layoutButtons = findViewById(R.id.layoutButtons);

        findViewById(R.id.btnAccept).setOnClickListener(v -> {
            tvStatus.setText("Confirmed");
            tvStatus.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
            tvStatus.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            layoutButtons.setVisibility(View.GONE);
        });

        findViewById(R.id.btnReject).setOnClickListener(v -> {
            tvStatus.setText("Cancelled");
            tvStatus.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            tvStatus.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            layoutButtons.setVisibility(View.GONE);
        });

        btnBack.setOnClickListener(v -> finish());
    }
}