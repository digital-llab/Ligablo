package com.llab.ligablo.models.etab;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(indices = {@Index("etsId"), @Index("adresseId")}, foreignKeys = {@ForeignKey(entity = Etablissement.class, parentColumns = "id", childColumns = "etsId"),
        @ForeignKey(entity = Adresse.class, parentColumns = "id", childColumns = "adresseId"),})
public class Extension {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private long adresseId;
    private long etsId;
    private String telephone;


    public Extension(long adresseId, long etsId, String telephone) {
        this.adresseId = adresseId;
        this.etsId = etsId;
        this.telephone = telephone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAdresseId() {
        return adresseId;
    }

    public void setAdresseId(long adresseId) {
        this.adresseId = adresseId;
    }

    public long getEtsId() {
        return etsId;
    }

    public void setEtsId(long etsId) {
        this.etsId = etsId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
