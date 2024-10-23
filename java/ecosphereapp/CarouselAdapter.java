package com.example.ecosphereapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder> {

    private final Context context;
    private final int[] imageList;

    public CarouselAdapter(Context context, int[] imageList) {
        this.context = context;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public CarouselViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_carousel_image, parent, false);
        return new CarouselViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarouselViewHolder holder, int position) {
        holder.carouselImage.setImageResource(imageList[position]);
    }

    @Override
    public int getItemCount() {
        return imageList.length;
    }

    public static class CarouselViewHolder extends RecyclerView.ViewHolder {

        ImageView carouselImage;

        public CarouselViewHolder(@NonNull View itemView) {
            super(itemView);
            carouselImage = itemView.findViewById(R.id.carousel_image);
        }
    }
}
