package com.example.pizzarecycler;

import android.app.Application;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaAdapter.PizzaViewHolder> {
   List<Pizza> listPizzas;
    public PizzaAdapter(List<Pizza> pizzas){
      this.listPizzas = pizzas;
  }


    @Override
    public PizzaViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
   View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pizza, parent, false);
     PizzaViewHolder viewHolder = new PizzaViewHolder(view);
     return viewHolder;
    }

    @Override
    public void onBindViewHolder( PizzaViewHolder holder, int position) {
       holder.textView.setText(listPizzas.get(position).pizzaName);
       holder.image.setImageResource(listPizzas.get(position).imageid);
       holder.texte.setText(listPizzas.get(position).sena);
    }

    @Override
    public int getItemCount() {
        return listPizzas.size();
    }

    class PizzaViewHolder extends RecyclerView.ViewHolder {
        TextView textView, texte;
        ImageView image;
        public PizzaViewHolder(View view){
            super(view);
            texte = view.findViewById(R.id.texte);
            textView = view.findViewById(R.id.pizza_name);
            image = view.findViewById(R.id.img1);
        }

        }
    }


