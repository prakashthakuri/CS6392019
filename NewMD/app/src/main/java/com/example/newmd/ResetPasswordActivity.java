package com.example.newmd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ResetPasswordActivity extends AppCompatActivity {
TextView inputEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        inputEmail = findViewById(R.id.email);
    }

    public void PasswordReset(View view) {
        String email = inputEmail.getText().toString();


        if (TextUtils.isEmpty(email))
            Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
else
        Toast.makeText(getApplicationContext(), "Password Reset Successfully", Toast.LENGTH_SHORT).show();

        startActivity(new Intent(this, LoginActivity.class));

    }

    public void backToLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));

    }
}
