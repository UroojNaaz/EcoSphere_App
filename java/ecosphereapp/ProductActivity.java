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

public class ProductActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        recyclerView = findViewById(R.id.recycler_view);

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList = new ArrayList<>();

        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p11));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p12));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p13));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p14));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p15));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p16));

        productList.add(new Product("Product 1", "$19.99", R.drawable.img_p21));
        productList.add(new Product("Product 2", "$29.99", R.drawable.img_p22));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p23));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p24));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p25));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p26));

        productList.add(new Product("Product 1", "$19.99", R.drawable.img_p31));
        productList.add(new Product("Product 2", "$29.99", R.drawable.img_p32));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p33));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p34));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p35));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p36));

        productList.add(new Product("Product 1", "$19.99", R.drawable.img_p41));
        productList.add(new Product("Product 2", "$29.99", R.drawable.img_p42));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p43));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p44));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p45));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p46));

        productList.add(new Product("Product 1", "$19.99", R.drawable.img_p51));
        productList.add(new Product("Product 2", "$29.99", R.drawable.img_p52));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p53));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p54));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p55));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p56));

        productList.add(new Product("Product 1", "$19.99", R.drawable.img_p61));
        productList.add(new Product("Product 2", "$29.99", R.drawable.img_p62));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p63));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p64));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p65));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p66));

        productList.add(new Product("Product 1", "$19.99", R.drawable.img_p71));
        productList.add(new Product("Product 2", "$29.99", R.drawable.img_p72));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p73));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p74));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p75));
        productList.add(new Product("Product 3", "$39.99", R.drawable.img_p76));


        productAdapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(productAdapter);
    }
}
