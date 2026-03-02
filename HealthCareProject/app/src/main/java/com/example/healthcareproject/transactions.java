package com.example.healthcareproject;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
// implemented All by Manal
public class transactions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);
        ImageView backArrow = findViewById(R.id.arrow1);
        EditText searchBar = findViewById(R.id.Search_bar);
        Button btnVerify = findViewById(R.id.btn_verify);
        Button btnVerify2= findViewById(R.id.btn_verify2);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonToPaid(btnVerify);
                Toast.makeText(transactions.this, "Payment Verified for Ahmed!", Toast.LENGTH_SHORT).show();
            }
        });
        btnVerify2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonToPaid(btnVerify2);
                Toast.makeText(transactions.this, "Payment Verified for Malik!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateButtonToPaid(Button btn) {
        btn.setText("Paid");
        btn.setTextColor(Color.WHITE);
        btn.setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("#2E7D32")));
        btn.setEnabled(false);
    }
}