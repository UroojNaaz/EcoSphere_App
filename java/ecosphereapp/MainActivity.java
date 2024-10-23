package com.example.ecosphereapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCategories;
    private CategoryAdapter categoryAdapter;
    private List<Category> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure you have this layout

        recyclerViewCategories = findViewById(R.id.recycler_view_categories);
        recyclerViewCategories.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        categoryList = new ArrayList<>();
        // Add categories
        categoryList.add(new Category("Kids", R.drawable.img_cat1));
        categoryList.add(new Category("Shoes", R.drawable.img_cat2));
        categoryList.add(new Category("Clothing", R.drawable.img_cat3)); // Default visible
        categoryList.add(new Category("Jewellery", R.drawable.img_cat4));
        categoryList.add(new Category("Beauty", R.drawable.img_cat5));
        categoryList.add(new Category("Skin Care", R.drawable.img_cat6));
        categoryList.add(new Category("Home & Kitchen", R.drawable.img_cat7));

        categoryAdapter = new CategoryAdapter(this, categoryList);
        recyclerViewCategories.setAdapter(categoryAdapter);
    }
}