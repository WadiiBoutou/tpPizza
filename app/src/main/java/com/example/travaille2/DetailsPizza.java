package com.example.travaille2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


import com.example.travaille2.beans.Produit;
import com.example.travaille2.service.ProduitService;

public class DetailsPizza extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_produits);
        ProduitService ps= ProduitService.getInstance();
        int produitId = getIntent().getIntExtra("produit_id", -1);
        Produit produit = ps.findById(produitId);


        TextView nom = findViewById(R.id.nom);
        TextView detailsIngred = findViewById(R.id.detailsIngred);
        TextView desc = findViewById(R.id.desc);
        TextView prep = findViewById(R.id.prep);
        ImageView photo = findViewById(R.id.photo);


        nom.setText(produit.getNom());

        detailsIngred.setText(produit.getDetailsIngred());
        desc.setText(produit.getDescription());
        prep.setText(produit.getPreparation());
        photo.setImageResource(produit.getPhoto());
    }
}