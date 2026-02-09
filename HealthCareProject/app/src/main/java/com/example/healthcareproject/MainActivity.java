package com.example.healthcareproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.healthcareproject.ChooseUserActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // implemented by Manal
        Button startButton = findViewById(R.id.startButton);

        // implemented by Manal
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // implemented by Manal
                Intent intent = new Intent(MainActivity.this, ChooseUserActivity.class);
                startActivity(intent);
            }
        });
    }
}