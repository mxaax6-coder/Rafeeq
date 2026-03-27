package com.example.healthcareproject;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class NotificationsActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_notifications);
    
    
    ImageView btnBack = findViewById(R.id.btnBack);
    CardView cardNotif1 = findViewById(R.id.cardNotification1);
    CardView cardNotif2 = findViewById(R.id.cardNotification2);
    
    
    btnBack.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    });
    
    
    cardNotif1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(NotificationsActivity.this, "Booking Details Clicked", Toast.LENGTH_SHORT).show();
        }
    });
    
    
    cardNotif2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(NotificationsActivity.this, "New Message Clicked", Toast.LENGTH_SHORT).show();
        }
    });
}
}