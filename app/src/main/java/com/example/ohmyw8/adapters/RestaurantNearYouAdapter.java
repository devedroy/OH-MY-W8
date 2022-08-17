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
import com.example.ohmyw8.models.RestaurantNearYou;

import java.util.List;

public class RestaurantNearYouAdapter extends RecyclerView.Adapter<RestaurantNearYouAdapter.RestaurantNearYouHolder> {

    private Context context;
    private List<RestaurantNearYou> restaurantNearYouList;

    public RestaurantNearYouAdapter(Context context, List<RestaurantNearYou> restaurantNearYouList) {
        this.context = context;
        this.restaurantNearYouList = restaurantNearYouList;
    }

    @NonNull
    @Override
    public RestaurantNearYouHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurants_near_you_layout, parent, false);

        return new RestaurantNearYouAdapter.RestaurantNearYouHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantNearYouHolder holder, int position) {
        holder.ivResTimeIcon.setImageResource(R.drawable.timer);

        holder.ivResImg.setImageResource(restaurantNearYouList.get(position).getRestaurantImageResource());
        holder.tvResName.setText(restaurantNearYouList.get(position).getRestaurantName());
        holder.tvResRating.setText((int) restaurantNearYouList.get(position).getRestaurantRating());
        holder.tvResTime.setText(restaurantNearYouList.get(position).getTimeRequired());
        holder.tvResDesc.setText(restaurantNearYouList.get(position).getRestaurantDescription());

    }

    @Override
    public int getItemCount() {
        return restaurantNearYouList.size();
    }

    public class RestaurantNearYouHolder extends RecyclerView.ViewHolder {

        ImageView ivResImg, ivResTimeIcon;
        TextView tvResName, tvResRating, tvResTime, tvResDesc;

        public RestaurantNearYouHolder(@NonNull View itemView) {
            super(itemView);

            ivResImg = itemView.findViewById(R.id.ivResImg);
            ivResTimeIcon = itemView.findViewById(R.id.ivResTimeIcon);
            tvResName = itemView.findViewById(R.id.tvResName);
            tvResRating = itemView.findViewById(R.id.tvResRating);
            tvResTime = itemView.findViewById(R.id.tvResTime);
            tvResDesc = itemView.findViewById(R.id.tvResDesc);
        }
    }
}
