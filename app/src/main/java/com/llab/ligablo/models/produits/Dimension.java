package com.llab.ligablo.models.produits;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Dimension {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private Double poid;
    private Double capacite;

    public Dimension() {
    }

    public Dimension(int id, Double poid, Double capacite) {
        this.id = id;
        this.poid = poid;
        this.capacite = capacite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPoid() {
        return poid;
    }

    public void setPoid(Double poid) {
        this.poid = poid;
    }

    public Double getCapacite() {
        return capacite;
    }

    public void setCapacite(Double capacite) {
        this.capacite = capacite;
    }
}
