package com.llab.ligablo.models.produits;

public class Contenant {

    private int id;
    private String nom;
    private int dimensionId;

    public Contenant() {
    }

    public Contenant(int id, String nom, int dimensionId) {
        this.id = id;
        this.nom = nom;
        this.dimensionId = dimensionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(int dimensionId) {
        this.dimensionId = dimensionId;
    }
}
