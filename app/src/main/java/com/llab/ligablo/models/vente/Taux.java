package com.llab.ligablo.models.vente;

public class Taux {

    private int id;
    private Double valeur;

    public Taux() {
    }

    public Taux(int id, Double valeur) {
        this.id = id;
        this.valeur = valeur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }
}
