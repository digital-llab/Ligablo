package com.llab.ligablo.models.vente;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.produits.Contenant;
import com.llab.ligablo.models.produits.Produits;

@Entity(indices = {@Index("produitId"), @Index("venteId"), @Index("contenantId")}, foreignKeys = {@ForeignKey(entity = Produits.class,parentColumns ="id" ,childColumns ="produitId" ),
                       @ForeignKey(entity =Vente.class ,parentColumns ="id" ,childColumns ="venteId" ),
                       @ForeignKey(entity = Contenant.class,parentColumns ="id" ,childColumns ="contenantId" )})
public class LigneVente {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private long produitId;
    private long venteId;
    private long contenantId;
    private Double quantite;

    public LigneVente(long produitId, long venteId, long contenantId, Double quantite) {
        this.produitId = produitId;
        this.venteId = venteId;
        this.contenantId = contenantId;
        this.quantite = quantite;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProduitId() {
        return produitId;
    }

    public void setProduitId(long produitId) {
        this.produitId = produitId;
    }

    public long getVenteId() {
        return venteId;
    }

    public void setVenteId(long venteId) {
        this.venteId = venteId;
    }

    public long getContenantId() {
        return contenantId;
    }

    public void setContenantId(long contenantId) {
        this.contenantId = contenantId;
    }

    public Double getQuantite() {
        return quantite;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }
}
