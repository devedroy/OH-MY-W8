package com.example.ohmyw8.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ohmyw8.R;
import com.example.ohmyw8.models.Restaurant;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantHolder> {

    private Context context;
    private List<Restaurant> restaurantList;

    public RestaurantAdapter(Context context, List<Restaurant> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public RestaurantHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurant_item_layout, parent, false);

        return new RestaurantHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantHolder holder, int position) {
        holder.ivRestaurant.setImageResource(restaurantList.get(position).getImageResId());
        holder.tvRestaurantName.setText(restaurantList.get(position).getRestaurantName());
        holder.tvRestaurantRating.setText(Float.toString(restaurantList.get(position).getRating()));
        holder.tvTimeRequired.setText(restaurantList.get(position).getTimeRequired());
        holder.tvRestaurantAddress.setText(restaurantList.get(position).getAddress());
        holder.tvAmount.setText(restaurantList.get(position).getAmount());
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    public class RestaurantHolder extends RecyclerView.ViewHolder {

        ImageView ivRestaurant;
        TextView tvRestaurantName, tvRestaurantRating, tvTimeRequired, tvRestaurantAddress, tvAmount;

        public RestaurantHolder(@NonNull View itemView) {
            super(itemView);

            ivRestaurant = itemView.findViewById(R.id.ivRestaurant);
            tvRestaurantName = itemView.findViewById(R.id.tvRestaurantName);
            tvRestaurantRating = itemView.findViewById(R.id.tvRestaurantRating);
            tvTimeRequired = itemView.findViewById(R.id.tvTimeRequired);
            tvRestaurantAddress = itemView.findViewById(R.id.tvRestaurantAddress);
            tvAmount = itemView.findViewById(R.id.tvAmount);
        }
    }
}
