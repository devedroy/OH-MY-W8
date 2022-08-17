package com.example.ohmyw8;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.ohmyw8.adapters.BannerAdapter;
import com.example.ohmyw8.adapters.RecentOrderAdapter;
import com.example.ohmyw8.adapters.RestaurantAdapter;
import com.example.ohmyw8.adapters.RestaurantNearYouAdapter;
import com.example.ohmyw8.data.BannerData;
import com.example.ohmyw8.data.RecentOrderData;
import com.example.ohmyw8.data.RestaurantData;
import com.example.ohmyw8.data.RestaurantsNearYouData;

import me.relex.circleindicator.CircleIndicator3;

public class HomePageActivity extends AppCompatActivity {

    ViewPager2 vpBanners;
    CircleIndicator3 tlIndicator;
    RecyclerView rvRestaurant, rvRecentOrder, rvRestaurantNearYou;

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

        RestaurantData restaurantData = new RestaurantData();
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(this, restaurantData.loadRestaurantList());
        rvRestaurant.setAdapter(restaurantAdapter);
        restaurantAdapter.notifyDataSetChanged();

        RecentOrderData recentOrderData = new RecentOrderData();
        RecentOrderAdapter recentOrderAdapter = new RecentOrderAdapter(this, recentOrderData.loadRecentOrderList());
        rvRecentOrder.setAdapter(recentOrderAdapter);
        recentOrderAdapter.notifyDataSetChanged();

        RestaurantsNearYouData restaurantsNearYouData = new RestaurantsNearYouData();
        RestaurantNearYouAdapter restaurantNearYouAdapter = new RestaurantNearYouAdapter(this, restaurantsNearYouData.loadRestaurantNearYouList());
        rvRestaurantNearYou.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        rvRestaurantNearYou.setAdapter(recentOrderAdapter);
        restaurantNearYouAdapter.notifyDataSetChanged();
    }

    private void initViews() {
        vpBanners = findViewById(R.id.vpBanners);
        tlIndicator = findViewById(R.id.tlIndicator);
        rvRestaurant = findViewById(R.id.rvRestaurant);
        rvRecentOrder = findViewById(R.id.rvRecentOrder);
        rvRestaurantNearYou = findViewById(R.id.rvRestaurantNearYou);
    }

    public void locationSelector(View view) {
    }

    public void viewAllRestaurants(View view) {
    }
}