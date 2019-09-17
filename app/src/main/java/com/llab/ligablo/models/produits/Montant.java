package com.llab.ligablo.models.produits;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.vente.Devise;

@Entity(indices = {@Index("typeMontantId"), @Index("deviseId")}, foreignKeys = {@ForeignKey(entity = MontantType.class, parentColumns = "id", childColumns = "typeMontantId"),
                       @ForeignKey(entity = Devise.class, parentColumns = "id", childColumns = "deviseId")})
public class Montant {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private long typeMontantId;
    private long deviseId;
    private Double valeur;

    public Montant(long typeMontantId, long deviseId, Double valeur) {
        this.typeMontantId = typeMontantId;
        this.deviseId = deviseId;
        this.valeur = valeur;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDeviseId() {
        return deviseId;
    }

    public void setDeviseId(long deviseId) {
        this.deviseId = deviseId;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }

    public long getTypeMontantId() {
        return typeMontantId;
    }

    public void setTypeMontantId(long typeMontantId) {
        this.typeMontantId = typeMontantId;
    }
}
