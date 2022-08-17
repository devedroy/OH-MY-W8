package com.example.ohmyw8.models;

public class RestaurantNearYou {
    private int restaurantImageResource;
    private float restaurantRating;
    private String restaurantName;
    private String timeRequired;
    private String restaurantDescription;

    public RestaurantNearYou(int restaurantImageResource, float restaurantRating, String restaurantName, String timeRequired, String restaurantDescription) {
        this.restaurantImageResource = restaurantImageResource;
        this.restaurantRating = restaurantRating;
        this.restaurantName = restaurantName;
        this.timeRequired = timeRequired;
        this.restaurantDescription = restaurantDescription;
    }

    public int getRestaurantImageResource() {
        return restaurantImageResource;
    }

    public void setRestaurantImageResource(int restaurantImageResource) {
        this.restaurantImageResource = restaurantImageResource;
    }

    public float getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(float restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getTimeRequired() {
        return timeRequired;
    }

    public void setTimeRequired(String timeRequired) {
        this.timeRequired = timeRequired;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription;
    }
}
