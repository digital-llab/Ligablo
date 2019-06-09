package com.llab.ligablo.models.etab;

import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Entity;

import com.llab.ligablo.models.users.User;

@Entity(foreignKeys = {@ForeignKey(entity = User.class, parentColumns = "id", childColumns = "userId"),
                       @ForeignKey(entity = EtsType.class, parentColumns = "id", childColumns = "EtsTypeId")})
public class Etablissement {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nom;
    private String nationalId;
    private int userId;
    private int EtsTypeId;

    public Etablissement() {
    }

    public Etablissement(int id, String nom, String nationalId, int userId,int etsTypeId) {
        this.id = id;
        this.nom = nom;
        this.nationalId = nationalId;
        this.userId = userId;
        this.EtsTypeId = etsTypeId;
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

    public int getEtsTypeId() {
        return EtsTypeId;
    }

    public void setEtsTypeId(int etsTypeId) {
        EtsTypeId = etsTypeId;
    }
}
