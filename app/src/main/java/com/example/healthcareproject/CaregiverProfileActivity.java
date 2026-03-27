package com.example.healthcareproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CaregiverProfileActivity extends AppCompatActivity {

    ImageView btnBack;
    TextView tvFullName;
    EditText etName, etPhone, etAddress;
    Button btnEdit, btnLogout;
    boolean isEditing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caregiver_profile);

        btnBack = findViewById(R.id.btnBack);
        tvFullName = findViewById(R.id.tvFullName);
        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etAddress = findViewById(R.id.etAddress);
        btnEdit = findViewById(R.id.btnEdit);
        btnLogout = findViewById(R.id.btnLogout);

        btnBack.setOnClickListener(v -> finish());

        btnEdit.setOnClickListener(v -> {
            if (!isEditing) {
                isEditing = true;
                etName.setEnabled(true);
                etPhone.setEnabled(true);
                etAddress.setEnabled(true);
                btnEdit.setText("Save");
            } else {
                isEditing = false;
                etName.setEnabled(false);
                etPhone.setEnabled(false);
                etAddress.setEnabled(false);
                btnEdit.setText("Edit");
                tvFullName.setText(etName.getText().toString().trim());
                Toast.makeText(this, "Profile updated", Toast.LENGTH_SHORT).show();
            }
        });

        btnLogout.setOnClickListener(v -> {
            Intent intent = new Intent(CaregiverProfileActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}