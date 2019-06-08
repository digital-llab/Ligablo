package com.llab.ligablo.models.produits;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class ProduitType {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nom;

    public ProduitType() {
    }

    public ProduitType(int id, String nom) {
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
