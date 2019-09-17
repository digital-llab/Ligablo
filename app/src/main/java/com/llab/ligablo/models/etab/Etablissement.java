package com.llab.ligablo.models.etab;



import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.users.User;


@Entity(indices = {@Index("userId"), @Index("etsTypeId")}, foreignKeys = {@ForeignKey(entity = User.class, parentColumns = "id", childColumns = "userId"),
                       @ForeignKey(entity = EtsType.class, parentColumns = "id", childColumns = "etsTypeId")})
public class Etablissement {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String nom;
    private String nationalId;
    private long userId;
    private long etsTypeId;

    public Etablissement(String nom, String nationalId, long userId, long etsTypeId) {
        this.nom = nom;
        this.nationalId = nationalId;
        this.userId = userId;
        this.etsTypeId = etsTypeId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getEtsTypeId() {
        return etsTypeId;
    }

    public void setEtsTypeId(long etsTypeId) {
        this.etsTypeId = etsTypeId;
    }
}
