package com.llab.ligablo.models.produits;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(indices = {@Index("produitTypeId")}, foreignKeys = @ForeignKey(entity = ProduitType.class,
        parentColumns = "id",
        childColumns = "produitTypeId"))
public class Produits {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String nom;
    private long produitTypeId;


    public Produits(String nom, long produitTypeId) {
        this.nom = nom;
        this.produitTypeId = produitTypeId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getProduitTypeId() {
        return produitTypeId;
    }

    public void setProduitTypeId(long produitTypeId) {
        this.produitTypeId = produitTypeId;
    }
}
