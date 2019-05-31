package com.llab.ligablo.models.produits;

public class Montant {

    private int id;
    private int typeId;
    private int deviseId;
    private Double valeur;

    public Montant() {
    }

    public Montant(int id, int typeId, int deviseId, Double valeur) {
        this.id = id;
        this.typeId = typeId;
        this.deviseId = deviseId;
        this.valeur = valeur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
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
}
