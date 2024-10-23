package com.example.ecosphereapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DashboardActivity extends AppCompatActivity {

    private RecyclerView imageCarousel;
    private int[] carouselImages = {
            R.drawable.img_carousel1,
            R.drawable.img_carousel2,
            R.drawable.img_carousel3,
            R.drawable.img_carousel4,
            R.drawable.img_carousel5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);  // Ensure the correct layout is set here

        // Initialize the carousel RecyclerView
        imageCarousel = findViewById(R.id.image_carousel);  // Ensure this matches the XML ID

        // Set Layout Manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        imageCarousel.setLayoutManager(layoutManager);

        // Set Adapter
        CarouselAdapter adapter = new CarouselAdapter(this, carouselImages);
        imageCarousel.setAdapter(adapter);
    }
}
