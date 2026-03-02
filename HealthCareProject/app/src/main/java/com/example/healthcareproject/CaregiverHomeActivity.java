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
            Toast.makeText(this, "Opening Appointments", Toast.LENGTH_SHORT).show();
        });

        btnAvailability.setOnClickListener(v -> {
            Toast.makeText(this, "Opening Availability", Toast.LENGTH_SHORT).show();
        });

        btnReport.setOnClickListener(v -> {
            Toast.makeText(this, "Opening Reports", Toast.LENGTH_SHORT).show();
        });

        btnProfile.setOnClickListener(v -> {
            Toast.makeText(this, "Opening Profile", Toast.LENGTH_SHORT).show();
        });
    }
}