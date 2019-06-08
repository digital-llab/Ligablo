package com.llab.ligablo.models.produits;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = ProduitType.class,
        parentColumns = "id",
        childColumns = "produitTypeId"))
public class Produits {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nom;
    private int produitTypeId;

    public Produits() {
    }

    public Produits(int id, String nom, int produitTypeId) {
        this.id = id;
        this.nom = nom;
        this.produitTypeId = produitTypeId;
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

    public int getProduitTypeId() {
        return produitTypeId;
    }

    public void setProduitTypeId(int produitTypeId) {
        this.produitTypeId = produitTypeId;
    }
}