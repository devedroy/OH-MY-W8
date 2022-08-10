package com.example.ohmyw8;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NewPasswordActivity extends AppCompatActivity {
//new pass
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);
    }

    public void backNewPass(View view) {
        onBackPressed();
    }
}