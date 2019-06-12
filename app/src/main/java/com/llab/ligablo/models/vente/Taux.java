package com.llab.ligablo.models.vente;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Taux {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private Double valeur;

    public Taux() {
    }

    public Taux(int id, Double valeur) {
        this.id = id;
        this.valeur = valeur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }
}
