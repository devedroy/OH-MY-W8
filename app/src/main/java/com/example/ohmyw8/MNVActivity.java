package com.example.ohmyw8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MNVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnvactivity);
    }

    public void backMNV(View view) {
        onBackPressed();
    }

    public void resendOTPMnv(View view) {
    }

    public void submitMNV(View view) {
        startActivity(new Intent(this, HomePageActivity.class));
    }

    public void editPhoneNumber(View view) {
        startActivity(new Intent(this, SignUpActivity.class));
    }
}