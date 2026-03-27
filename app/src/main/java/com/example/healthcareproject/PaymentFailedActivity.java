package com.example.healthcareproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentFailedActivity extends AppCompatActivity {

    private Button btnRetryPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_failed);

        btnRetryPayment = findViewById(R.id.btnRetryPayment);

        btnRetryPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaymentFailedActivity.this, PaymentActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}