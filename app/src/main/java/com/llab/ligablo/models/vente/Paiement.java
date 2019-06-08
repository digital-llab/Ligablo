package com.llab.ligablo.models.vente;

import java.util.Date;

public class Paiement {

    private int id;
    private int typePaiementId;
    private int deviseId;
    private Double montantPercu;
    private Date date;

    public Paiement() {
    }

    public Paiement(int id, int typePaiementId, int deviseId, Double montantPercu, Date date) {
        this.id = id;
        this.typePaiementId = typePaiementId;
        this.deviseId = deviseId;
        this.montantPercu = montantPercu;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypePaiementId() {
        return typePaiementId;
    }

    public void setTypePaiementId(int typePaiementId) {
        this.typePaiementId = typePaiementId;
    }

    public int getDeviseId() {
        return deviseId;
    }

    public void setDeviseId(int deviseId) {
        this.deviseId = deviseId;
    }

    public Double getMontantPercu() {
        return montantPercu;
    }

    public void setMontantPercu(Double montantPercu) {
        this.montantPercu = montantPercu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}