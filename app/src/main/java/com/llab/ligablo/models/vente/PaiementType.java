package com.llab.ligablo.models.vente;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.produits.Contenant;


@Entity(indices = {@Index("ligneVenteId"), @Index("paiementId"), @Index("contenantId")}, foreignKeys ={@ForeignKey(entity =LigneVente.class ,parentColumns ="id",childColumns ="ligneVenteId"),
                      @ForeignKey(entity =Paiement.class ,parentColumns ="id",childColumns ="paiementId"),
                      @ForeignKey(entity = Contenant.class,parentColumns ="id",childColumns ="contenantId")})
public class PaiementType {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private long ligneVenteId;
    private long paiementId;
    private long contenantId;

    public PaiementType(long ligneVenteId, long paiementId, long contenantId) {
        this.ligneVenteId = ligneVenteId;
        this.paiementId = paiementId;
        this.contenantId = contenantId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLigneVenteId() {
        return ligneVenteId;
    }

    public void setLigneVenteId(long ligneVenteId) {
        this.ligneVenteId = ligneVenteId;
    }

    public long getPaiementId() {
        return paiementId;
    }

    public void setPaiementId(long paiementId) {
        this.paiementId = paiementId;
    }

    public long getContenantId() {
        return contenantId;
    }

    public void setContenantId(long contenantId) {
        this.contenantId = contenantId;
    }
}
