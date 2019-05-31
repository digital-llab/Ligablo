package com.llab.ligablo.models.vente;

public class LigneVente {

    private int id;
    private int produitId;
    private int venteId;
    private int contenantId;
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
