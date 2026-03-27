package com.example.healthcareproject;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.widget.ImageView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.content.res.ColorStateList;
// implemented All by Manal
public class manage_users extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_users);
        ImageView backArrow = findViewById(R.id.arrow1);
        Button btnClients = findViewById(R.id.btn_clients_tab);
        Button btnCaregivers = findViewById(R.id.btn_caregivers_tab);
        LinearLayout layoutClients = findViewById(R.id.container_clients);
        LinearLayout layoutCaregivers = findViewById(R.id.container_caregivers);
        Button btnView = findViewById(R.id.btn_view);
        Button btnDisable = findViewById(R.id.btn_disable);
        btnDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnDisable.getText().toString().equals("Disable")) {
                    btnDisable.setText("Enable");
                    btnDisable.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                } else {
                    btnDisable.setText("Disable");
                    btnDisable.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#B05B5B")));
                }
            }
        });


        btnView.setOnClickListener(v -> {
            Intent i = new Intent(manage_users.this,UserProfile.class);
            startActivity(i);
        });
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manage_users.this, AdminDashboardActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnCaregivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCaregivers.setBackgroundColor(Color.BLUE);
                btnClients.setBackgroundColor(Color.GRAY);

            }
        });
    }
}