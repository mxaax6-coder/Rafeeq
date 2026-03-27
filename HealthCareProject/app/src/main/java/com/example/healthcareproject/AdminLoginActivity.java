package com.example.healthcareproject;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
// implemented All by Manal
public class AdminLoginActivity extends AppCompatActivity {
    private EditText edEmail, edPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        edEmail = findViewById(R.id.edAdminEmail);
        edPassword = findViewById(R.id.edAdminPass);
        btnLogin = findViewById(R.id.btnAdminLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edEmail.getText().toString().trim();
                String password = edPassword.getText().toString().trim();
                if (email.equals("admin") && password.equals("123")) {

                    Toast.makeText(AdminLoginActivity.this, "Welcome Admin!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(AdminLoginActivity.this, AdminDashboardActivity.class);
                    startActivity(intent);
                    finish();

                } else {
                    Toast.makeText(AdminLoginActivity.this, "Invalid Email or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}