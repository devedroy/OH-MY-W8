package com.example.ohmyw8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class OTPForgotActivity extends AppCompatActivity {

// otp changes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpforgot);

    }

    public void backForgotPassOTP(View view) {
        onBackPressed();
    }

    public void verifyAndEnter(View view) {
        startActivity(new Intent(this, NewPasswordActivity.class));
    }

    public void resendOTP(View view) {
    }

}