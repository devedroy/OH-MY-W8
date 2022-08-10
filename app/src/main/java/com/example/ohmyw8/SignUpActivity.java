package com.example.ohmyw8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void backSignUp(View view) {
        onBackPressed();
    }

    public void login(View view) {
        startActivity(new Intent(this, SignInActivity.class));
    }

    public void signUpAccount(View view) {
        startActivity(new Intent(this, MNVActivity.class));
    }
}