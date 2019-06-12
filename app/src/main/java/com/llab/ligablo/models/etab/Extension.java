package com.llab.ligablo.models.etab;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.users.User;

@Entity(foreignKeys = {@ForeignKey(entity = Etablissement.class, parentColumns = "id", childColumns = "etsId"),
                       @ForeignKey(entity = Adresse.class, parentColumns = "id", childColumns = "adresseId"),})
public class Extension {

    @PrimaryKey(autoGenerate = true)
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
