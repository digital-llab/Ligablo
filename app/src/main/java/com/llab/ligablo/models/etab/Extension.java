package com.llab.ligablo.models.etab;

public class Extension {

    private int id;
    private int adresseId;
    private int etsId;
    private String telephone;

    public Extension() {
    }

    public Extension(int id, int adresseId, int etsId, String telephone) {
        this.id = id;
        this.adresseId = adresseId;
        this.etsId = etsId;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdresseId() {
        return adresseId;
    }

    public void setAdresseId(int adresseId) {
        this.adresseId = adresseId;
    }

    public int getEtsId() {
        return etsId;
    }

    public void setEtsId(int etsId) {
        this.etsId = etsId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
