package com.example.travaille2.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travaille2.R;
import com.example.travaille2.beans.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> Pizzas;
    private LayoutInflater inflater;

    public PizzaAdapter(Activity activity, List<Produit> Pizzas) {
        this.Pizzas = Pizzas;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return Pizzas.size();
    }

    @Override
    public Object getItem(int position) {
        return Pizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.produit_item, null);
        }

        TextView idf = convertView.findViewById(R.id.idf);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbrIngredients = convertView.findViewById(R.id.nbrIngredients);
        TextView duree = convertView.findViewById(R.id.duree);

        ImageView photo = convertView.findViewById(R.id.photo);

        Produit produit = Pizzas.get(position);

        idf.setText(String.valueOf(produit.getId()));
        duree.setText(produit.getDuree());
        nom.setText(produit.getNom());
        nbrIngredients.setText(String.valueOf(produit.getNbrIngredients()));
        photo.setImageResource(produit.getPhoto());

        return convertView;
    }
}
