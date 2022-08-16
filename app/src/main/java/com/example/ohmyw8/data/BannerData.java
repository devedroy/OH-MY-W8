package com.example.ohmyw8.data;

import com.example.ohmyw8.R;
import com.example.ohmyw8.models.Banner;

import java.util.ArrayList;
import java.util.List;

public class BannerData {
    private List<Banner> bannerList = new ArrayList<>();

    public List<Banner> loadBannerList() {

        bannerList.add(new Banner(R.drawable.img));
        bannerList.add(new Banner(R.drawable.img));
        bannerList.add(new Banner(R.drawable.img));
        bannerList.add(new Banner(R.drawable.img));

        return bannerList;
    }
}
