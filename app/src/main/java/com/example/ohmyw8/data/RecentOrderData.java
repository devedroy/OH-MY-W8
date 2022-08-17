package com.example.ohmyw8.data;

import com.example.ohmyw8.R;
import com.example.ohmyw8.models.RecentOrder;

import java.util.ArrayList;
import java.util.List;

public class RecentOrderData {
    private List<RecentOrder> recentOrderList = new ArrayList<>();

    public List<RecentOrder> loadRestaurantList() {

        recentOrderList.add(new RecentOrder(
                R.drawable.img,
                "Veggies"
        ));

        return recentOrderList;
    }
}
