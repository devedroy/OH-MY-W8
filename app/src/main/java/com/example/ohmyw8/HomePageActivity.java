package com.example.ohmyw8;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class HomePageActivity extends AppCompatActivity {

    ViewPager2 vpBanners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        initViews();
    }

    private void initViews() {
        vpBanners = findViewById(R.id.vpBanners);
    }

    public void locationSelector(View view) {
    }
}