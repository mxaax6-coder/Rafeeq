package com.example.healthcareproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReportActivity extends AppCompatActivity {

    ImageView btnBack;
    Spinner spinnerBooking;
    TextView tvClient, tvDate, tvTime;
    EditText etReportDetails;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        btnBack = findViewById(R.id.btnBack);
        spinnerBooking = findViewById(R.id.spinnerBooking);
        tvClient = findViewById(R.id.tvClient);
        tvDate = findViewById(R.id.tvDate);
        tvTime = findViewById(R.id.tvTime);
        etReportDetails = findViewById(R.id.etReportDetails);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnBack.setOnClickListener(v -> finish());

        btnSubmit.setOnClickListener(v -> {
            String reportText = etReportDetails.getText().toString().trim();

            if (reportText.isEmpty()) {
                Toast.makeText(this, "Please write the report", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Report submitted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
