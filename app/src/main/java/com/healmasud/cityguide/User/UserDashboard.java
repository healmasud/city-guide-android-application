package com.healmasud.cityguide.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.healmasud.cityguide.HelperClasses.HomeAdapter.CategoriesAdpater;
import com.healmasud.cityguide.HelperClasses.HomeAdapter.CategoriesHelperClass;
import com.healmasud.cityguide.HelperClasses.HomeAdapter.FeaturedAdpater;
import com.healmasud.cityguide.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.healmasud.cityguide.HelperClasses.HomeAdapter.MVAdpater;
import com.healmasud.cityguide.HelperClasses.HomeAdapter.MVHelperClass;
import com.healmasud.cityguide.R;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {

    RecyclerView featuredRecycler;
    RecyclerView.Adapter adapter;

    RecyclerView mv_recycler;

    RecyclerView categories_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.user_dashboard);

        //Hooks
        featuredRecycler = findViewById(R.id.featured_recycler);
        mv_recycler = findViewById(R.id.mv_recycler);
        categories_recycler = findViewById(R.id.categories_recycler);

        featuredRecycler();

        mv_recycler();

        categories_recycler();
    }

    private void categories_recycler() {
        categories_recycler.setHasFixedSize(true);
        categories_recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<CategoriesHelperClass> categoriesLocations = new ArrayList<>();

        categoriesLocations.add(new CategoriesHelperClass(R.drawable.restaurant_image,"Restaurants"));
        categoriesLocations.add(new CategoriesHelperClass(R.drawable.city,"Cities"));

        adapter = new CategoriesAdpater(categoriesLocations);
        categories_recycler.setAdapter(adapter);


    }

    private void mv_recycler() {
        mv_recycler.setHasFixedSize(true);
        mv_recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<MVHelperClass> MVLocations = new ArrayList<>();

        MVLocations.add(new MVHelperClass(R.drawable.pizza_hut,"Pizza Hut", "Pizza, This is just a placeholder description"));
        MVLocations.add(new MVHelperClass(R.drawable.mcdonalds_img,"Mcdonald's", "This is just a placeholder description"));
        MVLocations.add(new MVHelperClass(R.drawable.kfc,"KFC", "KFC, This is just a placeholder description"));

        adapter = new MVAdpater(MVLocations);
        mv_recycler.setAdapter(adapter);
    }


    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass(R.drawable.mcdonalds_img,"Mcdonald's", "This is just a placeholder description"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.kfc,"KFC", "KFC, This is just a placeholder description"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.pizza_hut,"Pizza Hut", "Pizza, This is just a placeholder description"));

        adapter = new FeaturedAdpater(featuredLocations);
        featuredRecycler.setAdapter(adapter);

    }
}