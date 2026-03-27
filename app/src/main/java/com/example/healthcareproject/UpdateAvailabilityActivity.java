package com.example.healthcareproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateAvailabilityActivity extends AppCompatActivity {

    ImageView btnBack;
    RadioGroup radioGroupStatus;
    RadioButton radioAvailable, radioNotAvailable;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_availability);

        btnBack = findViewById(R.id.btnBack);
        radioGroupStatus = findViewById(R.id.radioGroupStatus);
        radioAvailable = findViewById(R.id.radioAvailable);
        radioNotAvailable = findViewById(R.id.radioNotAvailable);
        btnSave = findViewById(R.id.btnSave);

        btnBack.setOnClickListener(v -> finish());

        btnSave.setOnClickListener(v -> {
            if (radioAvailable.isChecked()) {
                Toast.makeText(this, "Status saved: Available", Toast.LENGTH_SHORT).show();
            } else if (radioNotAvailable.isChecked()) {
                Toast.makeText(this, "Status saved: Not Available", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Please select a status", Toast.LENGTH_SHORT).show();
            }
        });
    }
}