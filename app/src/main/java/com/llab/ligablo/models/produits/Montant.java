package com.llab.ligablo.models.produits;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.vente.Devise;

@Entity(foreignKeys = {@ForeignKey(entity = MontantType.class, parentColumns = "id", childColumns = "typeMontantId"),
                       @ForeignKey(entity = Devise.class, parentColumns = "id", childColumns = "deviseId")})
public class Montant {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private int typeMontantId;
    private int deviseId;
    private Double valeur;

    public Montant() {
    }

    public Montant(int id, int typeMontantId, int deviseId, Double valeur) {
        this.id = id;
        this.typeMontantId = typeMontantId;
        this.deviseId = deviseId;
        this.valeur = valeur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeviseId() {
        return deviseId;
    }

    public void setDeviseId(int deviseId) {
        this.deviseId = deviseId;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }

    public int getTypeMontantId() {
        return typeMontantId;
    }

    public void setTypeMontantId(int typeMontantId) {
        this.typeMontantId = typeMontantId;
    }
}
