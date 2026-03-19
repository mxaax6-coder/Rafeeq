package com.example.healthcareproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// implemented All by Manal
public class CaregiverHomeActivity extends AppCompatActivity {

    Button btnAppointments, btnAvailability, btnReport, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caregiver_home);

        btnAppointments = findViewById(R.id.btnAppointments);
        btnAvailability = findViewById(R.id.btnAvailability);
        btnReport = findViewById(R.id.btnReport);
        btnProfile = findViewById(R.id.btnProfile);

        btnAppointments.setOnClickListener(v -> {
            Intent intent = new Intent(CaregiverHomeActivity.this, MyAppointmentsActivity.class);
            startActivity(intent);
        });

        btnAvailability.setOnClickListener(v -> {
            Intent intent = new Intent(CaregiverHomeActivity.this, UpdateAvailabilityActivity.class);
            startActivity(intent);
        });

        btnReport.setOnClickListener(v -> {
            Intent intent = new Intent(CaregiverHomeActivity.this, ReportActivity.class);
            startActivity(intent);
        });

        btnProfile.setOnClickListener(v -> {
            Intent intent = new Intent(CaregiverHomeActivity.this, CaregiverProfileActivity.class);
            startActivity(intent);
        });
    }
}