package com.example.healthcareproject;

import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

class LoginActivity extends AppCompatActivity {

    EditText etEmailLogin, etPasswordLogin;
    Button btnLogin;

    boolean passwordVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmailLogin = findViewById(R.id.etEmailLogin);
        etPasswordLogin = findViewById(R.id.etPasswordLogin);
        btnLogin = findViewById(R.id.btnLogin);

        // Show / Hide password
        etPasswordLogin.setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_UP) {
                if (event.getRawX() >= (etPasswordLogin.getRight() -
                        etPasswordLogin.getCompoundDrawables()[2].getBounds().width())) {

                    if (passwordVisible) {
                        etPasswordLogin.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    } else {
                        etPasswordLogin.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    }

                    passwordVisible = !passwordVisible;
                    etPasswordLogin.setSelection(etPasswordLogin.getText().length());
                    return true;
                }
            }
            return false;
        });

        btnLogin.setOnClickListener(v -> {

            String email = etEmailLogin.getText().toString();
            String password = etPasswordLogin.getText().toString();

            // لاحقًا نحط كود تسجيل الدخول هنا
        });
    }
}