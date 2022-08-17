package com.example.ohmyw8.models;

public class RecentOrder {
    private int recentOrderImageResource;
    private String recentOrderName;

    public RecentOrder(int recentOrderImageResource, String recentOrderName) {
        this.recentOrderImageResource = recentOrderImageResource;
        this.recentOrderName = recentOrderName;
    }

    public int getRecentOrderImageResource() {
        return recentOrderImageResource;
    }

    public void setRecentOrderImageResource(int recentOrderImageResource) {
        this.recentOrderImageResource = recentOrderImageResource;
    }

    public String getRecentOrderName() {
        return recentOrderName;
    }

    public void setRecentOrderName(String recentOrderName) {
        this.recentOrderName = recentOrderName;
    }
}
