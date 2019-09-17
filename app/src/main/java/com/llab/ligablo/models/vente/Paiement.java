package com.llab.ligablo.models.vente;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(indices = {@Index("typePaiementId"), @Index("deviseId")}, foreignKeys = {@ForeignKey(entity =PaiementType.class ,parentColumns = "id",childColumns = "typePaiementId"),
                       @ForeignKey(entity =Devise.class ,parentColumns = "id",childColumns = "deviseId")})
public class Paiement {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private long typePaiementId;
    private long deviseId;
    private Double montantPercu;
    private String date;

    public Paiement(long typePaiementId, long deviseId, Double montantPercu, String date) {
        this.typePaiementId = typePaiementId;
        this.deviseId = deviseId;
        this.montantPercu = montantPercu;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTypePaiementId() {
        return typePaiementId;
    }

    public void setTypePaiementId(long typePaiementId) {
        this.typePaiementId = typePaiementId;
    }

    public long getDeviseId() {
        return deviseId;
    }

    public void setDeviseId(long deviseId) {
        this.deviseId = deviseId;
    }

    public Double getMontantPercu() {
        return montantPercu;
    }

    public void setMontantPercu(Double montantPercu) {
        this.montantPercu = montantPercu;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
