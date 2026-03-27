package com.example.healthcareproject;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
// implemented All by Manal
public class AdminDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        LinearLayout btnPending = findViewById(R.id.btnpayment);
        LinearLayout btnBookings = findViewById(R.id.btnbooking);
        LinearLayout btnClients = findViewById(R.id.btnclient);
        LinearLayout btnCaregivers = findViewById(R.id.btncaregiver);

        btnPending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminDashboardActivity.this, transactions.class);
                startActivity(intent);            }
        });

        btnBookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminDashboardActivity.this, transactions.class);
                startActivity(intent);
            }
        });

        btnClients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminDashboardActivity.this, manage_users.class);
                startActivity(intent);            }
        });

        btnCaregivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminDashboardActivity.this, manage_users.class);
                startActivity(intent);              }
        });
    }
}