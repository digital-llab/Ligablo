package com.llab.ligablo.models.produits;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Dimension {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private Double poid;
    private Double capacite;

    public Dimension(Double poid, Double capacite) {
        this.poid = poid;
        this.capacite = capacite;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
