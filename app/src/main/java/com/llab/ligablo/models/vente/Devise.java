package com.llab.ligablo.models.vente;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(indices = {@Index("tauxId")}, foreignKeys = @ForeignKey(entity = Taux.class,parentColumns = "id",childColumns = "tauxId"))
public class Devise {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private String nom;
    private String symbole;
    private long tauxId;


    public Devise(String nom, String symbole, long tauxId) {
        this.nom = nom;
        this.symbole = symbole;
        this.tauxId = tauxId;
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

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public long getTauxId() {
        return tauxId;
    }

    public void setTauxId(long tauxId) {
        this.tauxId = tauxId;
    }
}
