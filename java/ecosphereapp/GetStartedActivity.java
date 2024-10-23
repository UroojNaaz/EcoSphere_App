package com.example.ecosphereapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

public class GetStartedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        // Get the background image view
        ImageView backgroundImage = findViewById(R.id.background_image);

        // Apply blur effect to the background image
        BlurImage.blur(this, backgroundImage);

        // Set the action for the Get Started button
        findViewById(R.id.button_get_started).setOnClickListener(v -> {
            // Navigate to the next activity (e.g., Login or Dashboard)
            startActivity(new Intent(GetStartedActivity.this, LoginActivity.class));
        });
    }
}
