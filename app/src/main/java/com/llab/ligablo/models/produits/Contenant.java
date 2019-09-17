package com.llab.ligablo.models.produits;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(indices = {@Index("dimensionId")}, foreignKeys = @ForeignKey(entity = Dimension.class, parentColumns = "id", childColumns = "dimensionId"))
public class Contenant {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String nom;
    private long dimensionId;


    public Contenant(String nom, long dimensionId) {
        this.nom = nom;
        this.dimensionId = dimensionId;
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

    public long getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(long dimensionId) {
        this.dimensionId = dimensionId;
    }
}
