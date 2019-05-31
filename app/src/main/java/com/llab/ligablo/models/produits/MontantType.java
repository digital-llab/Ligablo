package com.llab.ligablo.models.produits;

public class MontantType {

    private int id;
    private String nom;

    public MontantType() {
    }

    public MontantType(int id, String nom) {
        this.id = id;
        this.nom = nom;
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
}
