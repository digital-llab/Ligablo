package com.llab.ligablo.models.vente;

public class Devise {

    private int id;
    private String nom;
    private String symbole;
    private int TauxId;

    public Devise() {
    }

    public Devise(int id, String nom, String symbole, int tauxId) {
        this.id = id;
        this.nom = nom;
        this.symbole = symbole;
        TauxId = tauxId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public int getTauxId() {
        return TauxId;
    }

    public void setTauxId(int tauxId) {
        TauxId = tauxId;
    }
}
