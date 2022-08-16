package com.example.ohmyw8;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.ohmyw8.adapters.BannerAdapter;
import com.example.ohmyw8.data.BannerData;

import me.relex.circleindicator.CircleIndicator3;

public class HomePageActivity extends AppCompatActivity {

    ViewPager2 vpBanners;
    CircleIndicator3 tlIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        initViews();

        BannerData data = new BannerData();
        BannerAdapter adapter = new BannerAdapter(this, data.loadBannerList());
        vpBanners.setAdapter(adapter);
        vpBanners.setClipToPadding(false);
        vpBanners.setPadding(48, 0, 48, 0);
        vpBanners.setOffscreenPageLimit(1);
        tlIndicator.setViewPager(vpBanners);
    }

    private void initViews() {
        vpBanners = findViewById(R.id.vpBanners);
        tlIndicator = findViewById(R.id.tlIndicator);
    }

    public void locationSelector(View view) {
    }
}