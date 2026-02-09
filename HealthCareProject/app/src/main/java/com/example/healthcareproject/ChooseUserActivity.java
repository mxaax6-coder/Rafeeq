package com.example.healthcareproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
// implemented by Rema
public class ChooseUserActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_user);

        Button btnClient = findViewById(R.id.btnClient);
        Button btnCaregiver = findViewById(R.id.btnCaregiver);

        btnClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseUserActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btnCaregiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseUserActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}