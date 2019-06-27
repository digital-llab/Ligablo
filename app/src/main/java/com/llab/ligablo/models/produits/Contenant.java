package com.llab.ligablo.models.produits;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ColumnInfo;

@Entity(tableName = "Contenant",foreignKeys = @ForeignKey(entity = Dimension.class, parentColumns = "id", childColumns = "dimensionId"))
public class Contenant {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "nom")
    private String nom;
    @ColumnInfo(name = "dimensionId")
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
