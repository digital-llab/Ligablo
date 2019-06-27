package com.llab.ligablo.models.etab;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Adresse")
public class Adresse {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;
    @ColumnInfo(name="ville")
    private String ville;
    @ColumnInfo(name="quartier")
    private String quartier;
    @ColumnInfo(name="commune")
    private String commune;
    @ColumnInfo(name="numero")
    private String numero;

    public Adresse() {
    }

    public Adresse(int id, String ville, String quartier, String commune, String numero) {
        this.id = id;
        this.ville = ville;
        this.quartier = quartier;
        this.commune = commune;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
