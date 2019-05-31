package com.llab.ligablo.models.produits;

import java.util.Date;

public class Stock {

    private int id;
    private int userId;
    private int produitId;
    private int quantite;
    private int nombre;
    private Date date;

    public Stock() {
    }

    public Stock(int id, int userId, int produitId, int quantite, int nombre, Date date) {
        this.id = id;
        this.userId = userId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
