package com.llab.ligablo.models.etab;

public class Etablissement {

    private int id;
    private String nom;
    private String nationalId;
    private int userId;
    private String EtsTypeId;

    public Etablissement() {
    }

    public Etablissement(int id, String nom, String nationalId, int userId, String etsTypeId) {
        this.id = id;
        this.nom = nom;
        this.nationalId = nationalId;
        this.userId = userId;
        EtsTypeId = etsTypeId;
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

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEtsTypeId() {
        return EtsTypeId;
    }

    public void setEtsTypeId(String etsTypeId) {
        EtsTypeId = etsTypeId;
    }
}
