package com.llab.ligablo.models.vente;

public class Moyen {

    private int id;
    private String valeur;

    public Moyen() {
    }

    public Moyen(int id, String valeur) {
        this.id = id;
        this.valeur = valeur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
}
