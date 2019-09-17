package com.llab.ligablo.models.vente;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Moyen {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private String valeur;

    public Moyen(String valeur) {
        this.valeur = valeur;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
}
