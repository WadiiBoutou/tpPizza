package com.example.travaille2.beans;


import java.io.Serializable;

public class Produit  {
    private static int comp;
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String detailsIngred;

    private String description;
    private String preparation;

    public Produit() {

    }

    public Produit(String nom, int nbrIngredients, int photo, String duree, String detailsIngred, String description, String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngred = detailsIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDuree() {
        return duree;
    }

    public String getDetailsIngred() {
        return detailsIngred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients='" + nbrIngredients + '\'' +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detailsIngred='" + detailsIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
