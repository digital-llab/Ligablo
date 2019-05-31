package com.llab.ligablo.models.produits;

public class MontantContenance {

    private int id;
    private int contenantId;
    private int produitId;
    private int etsId;
    private int montantId;

    public MontantContenance() {
    }

    public MontantContenance(int id, int contenantId, int produitId, int etsId, int montantId) {
        this.id = id;
        this.contenantId = contenantId;
        this.produitId = produitId;
        this.etsId = etsId;
        this.montantId = montantId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContenantId() {
        return contenantId;
    }

    public void setContenantId(int contenantId) {
        this.contenantId = contenantId;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public int getEtsId() {
        return etsId;
    }

    public void setEtsId(int etsId) {
        this.etsId = etsId;
    }

    public int getMontantId() {
        return montantId;
    }

    public void setMontantId(int montantId) {
        this.montantId = montantId;
    }
}
