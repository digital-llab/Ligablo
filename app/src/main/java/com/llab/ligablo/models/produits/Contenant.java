package com.llab.ligablo.models.produits;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Dimension.class, parentColumns = "id", childColumns = "dimensionId"))
public class Contenant {

    @PrimaryKey(autoGenerate = true)
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
