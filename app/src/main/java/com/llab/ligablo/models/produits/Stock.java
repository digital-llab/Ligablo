package com.llab.ligablo.models.produits;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.etab.Extension;
import com.llab.ligablo.models.users.User;

@Entity(indices = {@Index("produitId"), @Index("userId"), @Index("extensionId")}, foreignKeys = {@ForeignKey(entity = Produits.class, parentColumns = "id", childColumns = "produitId"),
                       @ForeignKey(entity = User.class, parentColumns = "id", childColumns = "userId"),
                       @ForeignKey(entity = Extension.class, parentColumns = "id", childColumns = "extensionId")})
public class Stock {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private long userId;
    private long produitId;
    private long extensionId;
    private int quantite;
    private int nombre;
    private String date;

    public Stock(long userId, long produitId, long extensionId, int quantite, int nombre, String date) {
        this.userId = userId;
        this.produitId = produitId;
        this.extensionId = extensionId;
        this.quantite = quantite;
        this.nombre = nombre;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getProduitId() {
        return produitId;
    }

    public void setProduitId(long produitId) {
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

    public long getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(long extensionId) {
        this.extensionId = extensionId;
    }
}
