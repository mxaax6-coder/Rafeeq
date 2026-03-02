package com.example.healthcareproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ClientHomeActivity extends AppCompatActivity {

    Button btnFindCaregiver, btnMyBookings, btnNotifications, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_home);

        btnFindCaregiver = findViewById(R.id.btnFindCaregiver);
        btnMyBookings = findViewById(R.id.btnMyBookings);
        btnNotifications = findViewById(R.id.btnNotifications);
        btnProfile = findViewById(R.id.btnProfile);

        btnFindCaregiver.setOnClickListener(view ->
                Toast.makeText(this, "Find Caregivers clicked", Toast.LENGTH_SHORT).show()
        );

        btnMyBookings.setOnClickListener(view ->
                Toast.makeText(this, "My Bookings clicked", Toast.LENGTH_SHORT).show()
        );

        btnNotifications.setOnClickListener(view ->
                Toast.makeText(this, "Notifications clicked", Toast.LENGTH_SHORT).show()
        );

        btnProfile.setOnClickListener(view ->
                Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
        );
    }
}