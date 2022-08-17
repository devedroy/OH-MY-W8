package com.example.ohmyw8.data;

import com.example.ohmyw8.R;
import com.example.ohmyw8.models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantData {
    private List<Restaurant> restaurantList = new ArrayList<>();

    public List<Restaurant> loadRestaurantList() {

        restaurantList.add(new Restaurant(
                R.drawable.img,
                "Biryani Huts",
                4.5F,
                "30 mins",
                "12th Square, 5th Floor, Building",
                250
        ));

        return restaurantList;
    }
}
