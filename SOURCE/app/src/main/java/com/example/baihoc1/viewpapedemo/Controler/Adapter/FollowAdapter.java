package com.example.baihoc1.viewpapedemo.Controler.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.baihoc1.viewpapedemo.R;

import java.util.ArrayList;

public class FollowAdapter extends RecyclerView.Adapter<FollowAdapter.FollowViewHolder> {

    ArrayList<Object> data;
    Context context;

    public FollowAdapter (ArrayList<Object> data, Context context){
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public FollowViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.intem_layout, viewGroup, false);
        return new  FollowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FollowViewHolder followViewHolder, int i) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class FollowViewHolder extends RecyclerView.ViewHolder {

        TextView tvTenPhuTung, tvSoKm, tvGia;

        public FollowViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTenPhuTung = itemView.findViewById(R.id.tv_ten_phu_tung);
            tvSoKm = itemView.findViewById(R.id.tv_sokm);
            tvGia = itemView.findViewById(R.id.tv_gia);
        }
    }
}
