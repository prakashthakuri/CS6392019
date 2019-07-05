package com.example.newmd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText inputEmail, inputPassword;
    TextView btnSignup, btnReset;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputEmail = findViewById(R.id.email);
        inputPassword = findViewById(R.id.password);
        progressBar = findViewById(R.id.progressBar);
        btnSignup = findViewById(R.id.btn_signup);
        btnReset = findViewById(R.id.btn_reset_password);
    }

    public void login(View view) {
        String email = inputEmail.getText().toString();
        final String password = inputPassword.getText().toString();

        //Verify fields are not empty
        if (TextUtils.isEmpty(email))
            Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
        else if (TextUtils.isEmpty(password))
            Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
        else
            startActivity(new Intent(this, MainActivity.class));

        //Show progressbar while authenticating user with server
        progressBar.setVisibility(View.VISIBLE);

    }

    public void Signup(View view) {
        startActivity(new Intent(this, SignupActivity.class));
    }

    public void reset(View view) {

        startActivity(new Intent(this, ResetPasswordActivity.class));

    }
}
