package com.llab.ligablo.models.vente;

public class MoyenPaiement {

    private int id;
    private int MoyenId;

    public MoyenPaiement() {
    }

    public MoyenPaiement(int id, int moyenId) {
        this.id = id;
        MoyenId = moyenId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoyenId() {
        return MoyenId;
    }

    public void setMoyenId(int moyenId) {
        MoyenId = moyenId;
    }
}
