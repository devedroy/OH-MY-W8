package com.example.ohmyw8.models;

public class Restaurant {
    private int imageResId;
    private String restaurantName;
    private float rating;
    private String timeRequired;
    private String address;
    private int amount;

    public Restaurant(int imageResId, String restaurantName, float rating, String timeRequired, String address, int amount) {
        this.imageResId = imageResId;
        this.restaurantName = restaurantName;
        this.rating = rating;
        this.timeRequired = timeRequired;
        this.address = address;
        this.amount = amount;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getTimeRequired() {
        return timeRequired;
    }

    public void setTimeRequired(String timeRequired) {
        this.timeRequired = timeRequired;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
