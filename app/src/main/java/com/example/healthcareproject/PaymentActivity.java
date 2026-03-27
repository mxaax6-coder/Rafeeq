package com.example.healthcareproject;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_payment);
    
    
    ImageButton btnBack = findViewById(R.id.btnBackPayment);
    Spinner paymentMethodSpinner = findViewById(R.id.paymentMethodSpinner);
    Button btnPayNow = findViewById(R.id.btnPayNowPayment);
    
    
    btnBack.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    });
    
    
    String[] options = {"Select Payment Method", "Credit Card", "PayPal", "Mada"};
    ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
            android.R.layout.simple_spinner_dropdown_item, options);
    paymentMethodSpinner.setAdapter(adapter);
    
    
    btnPayNow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(PaymentActivity.this, "Payment Processing...", Toast.LENGTH_SHORT).show();
        }
    });
}
}
