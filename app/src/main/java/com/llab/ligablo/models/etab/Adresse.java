package com.llab.ligablo.models.etab;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Adresse {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String ville;
    private String quartier;
    private String commune;
    private String numero;

    public Adresse(String ville, String quartier, String commune, String numero) {
        this.ville = ville;
        this.quartier = quartier;
        this.commune = commune;
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
