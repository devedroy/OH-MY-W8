package com.example.ohmyw8.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ohmyw8.R;
import com.example.ohmyw8.models.RecentOrder;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecentOrderAdapter extends RecyclerView.Adapter<RecentOrderAdapter.RecentOrderHolder> {

    private Context context;
    private List<RecentOrder> recentOrderList;

    public RecentOrderAdapter(Context context, List<RecentOrder> recentOrderList) {
        this.context = context;
        this.recentOrderList = recentOrderList;
    }

    @NonNull
    @Override
    public RecentOrderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recent_order_layout, parent, false);

        return new RecentOrderHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentOrderHolder holder, int position) {
        holder.ivOrderImg.setImageResource(recentOrderList.get(position).getRecentOrderImageResource());
        holder.tvOrderName.setText(recentOrderList.get(position).getRecentOrderName());
    }

    @Override
    public int getItemCount() {
        return recentOrderList.size();
    }

    public class RecentOrderHolder extends RecyclerView.ViewHolder {

        CircleImageView ivOrderImg;
        TextView tvOrderName;

        public RecentOrderHolder(@NonNull View itemView) {
            super(itemView);

            ivOrderImg = itemView.findViewById(R.id.ivOrderImg);
            tvOrderName = itemView.findViewById(R.id.tvOrderName);
        }
    }
}
