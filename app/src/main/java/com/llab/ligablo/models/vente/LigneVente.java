package com.llab.ligablo.models.vente;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Entity;

import com.llab.ligablo.models.produits.Contenant;
import com.llab.ligablo.models.produits.Produits;

@Entity(tableName = "LigneVente",foreignKeys = {@ForeignKey(entity =Produits.class,parentColumns ="id" ,childColumns ="produitId" ),
                       @ForeignKey(entity =Vente.class ,parentColumns ="id" ,childColumns ="venteId" ),
                       @ForeignKey(entity =Contenant.class,parentColumns ="id" ,childColumns ="contenantId" )})
public class LigneVente {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;
    @ColumnInfo(name="produitId")
    private int produitId;
    @ColumnInfo(name="venteId")
    private int venteId;
    @ColumnInfo(name="contenantId")
    private int contenantId;
    @ColumnInfo(name="quantite")
    private Double quantite;

    public LigneVente() {
    }

    public LigneVente(int id, int produitId, int venteId, int contenantId, Double quantite) {
        this.id = id;
        this.produitId = produitId;
        this.venteId = venteId;
        this.contenantId = contenantId;
        this.quantite = quantite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public int getVenteId() {
        return venteId;
    }

    public void setVenteId(int venteId) {
        this.venteId = venteId;
    }

    public int getContenantId() {
        return contenantId;
    }

    public void setContenantId(int contenantId) {
        this.contenantId = contenantId;
    }

    public Double getQuantite() {
        return quantite;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }
}
