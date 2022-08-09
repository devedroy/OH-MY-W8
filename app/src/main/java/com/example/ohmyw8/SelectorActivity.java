package com.example.ohmyw8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
    }

    public void searchNearby(View view) {
        startActivity(new Intent(this, LocationSelectorActivity.class));
    }

    public void signIn(View view) {
        startActivity(new Intent(this, SignInActivity.class));
    }
}