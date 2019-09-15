package com.llab.ligablo.models.produits;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.etab.Extension;

@Entity(tableName="Stock",foreignKeys = {@ForeignKey(entity = Produits.class, parentColumns = "id", childColumns = "produitId"),
                       @ForeignKey(entity = Extension.class, parentColumns = "id", childColumns = "extensionId"),})
public class Stock {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;
    @ColumnInfo(name="extensionId")
    private int extensionId;
    @ColumnInfo(name="produitId")
    private int produitId;
    @ColumnInfo(name="quantite")
    private int quantite;
    @ColumnInfo(name="nombre")
    private int nombre;
    @ColumnInfo(name="date")
    private String date;

    public Stock(int id, int extensionId, int produitId, int quantite, int nombre, String date) {
        this.id = id;
        this.extensionId = extensionId;
        this.produitId = produitId;
        this.quantite = quantite;
        this.nombre = nombre;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(int extensionId) {
        this.extensionId = extensionId;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
