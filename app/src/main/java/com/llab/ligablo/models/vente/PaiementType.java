package com.llab.ligablo.models.vente;

public class PaiementType {

    private int id;
    private int ligneVenteId;
    private int paiementId;
    private int contenantId;

    public PaiementType() {
    }

    public PaiementType(int id, int ligneVenteId, int paiementId, int contenantId) {
        this.id = id;
        this.ligneVenteId = ligneVenteId;
        this.paiementId = paiementId;
        this.contenantId = contenantId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLigneVenteId() {
        return ligneVenteId;
    }

    public void setLigneVenteId(int ligneVenteId) {
        this.ligneVenteId = ligneVenteId;
    }

    public int getPaiementId() {
        return paiementId;
    }

    public void setPaiementId(int paiementId) {
        this.paiementId = paiementId;
    }

    public int getContenantId() {
        return contenantId;
    }

    public void setContenantId(int contenantId) {
        this.contenantId = contenantId;
    }
}
