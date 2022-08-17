package com.example.ohmyw8.data;

import com.example.ohmyw8.R;
import com.example.ohmyw8.models.RestaurantNearYou;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsNearYouData {
    private List<RestaurantNearYou> restaurantNearYouList = new ArrayList<>();

    public List<RestaurantNearYou> loadRestaurantNearYouList() {

        restaurantNearYouList.add(new RestaurantNearYou(
                R.drawable.img,
                4.5F,
                "Leaf Indian",
                "25 mins | 4 km",
                "Restaurant Description"
        ));

        return restaurantNearYouList;
    }
}
