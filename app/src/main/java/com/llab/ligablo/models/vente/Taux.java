package com.llab.ligablo.models.vente;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Taux {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private Double valeur;

    public Taux(Double valeur) {
        this.valeur = valeur;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }
}
