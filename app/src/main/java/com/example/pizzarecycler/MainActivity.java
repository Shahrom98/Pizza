package com.example.pizzarecycler;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    PizzaAdapter adapter;
    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        List<Pizza> list = List.of(
                new Pizza("Margarita", R.drawable.margrita, "580руб"),
                new Pizza("Marinara", R.drawable.as, "522руб"),
                new Pizza("Quattro S", R.drawable.ere, "720руб"),
                new Pizza("Carbonara", R.drawable.carbonata, "850руб"),
                new Pizza("Frutti di Mario", R.drawable.fruti,"650руб" ),
                new Pizza("Quattro F", R.drawable.q, "250руб" ),
                new Pizza("Crudo", R.drawable.crudo ,"650руб" ),
                new Pizza("Napoletana", R.drawable.n,"650руб" )
        );
        adapter = new PizzaAdapter(list);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

    }
}


    //class PizzaName {
//        public String[] getPizzaNames() {
//        String[] names = new String[21];
//        names[0] = "Margarita";
//        names[1] = "Marinara";
//        names[2] = "Quattro S";
//        names[3] = "Carbonara";
//        names[4] = "Frutti di Mare";
//        names[5] = "Quattro F";
//        names[6] = "Crudo";
//        names[7] = "Napoletana";
//        names[8] = "Pugliese";
//        names[9] = "Montanara";
//        names[10] = "Emiliana";
//        names[11] = "Romana";
//        names[12] = "Fattoria";
//        names[13] = "Schiacciata";
//        names[14] = "Prosciutto";
//        names[15] = "Americana";
//        names[16] = "Sarda";
//        names[17] = "Tonno";
//        names[18] = "Valentilina";
//        names[19] = "Gorgonzola";
//        names[20] = "Calzone";
//        return names;
//    }

