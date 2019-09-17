package com.llab.ligablo.models.produits;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.etab.Etablissement;


@Entity(indices = {@Index("produitId"), @Index("montantId"), @Index("contenantId"), @Index("etsId")},
        foreignKeys = {@ForeignKey(entity = Produits.class, parentColumns = "id", childColumns = "produitId"),
                       @ForeignKey(entity = Montant.class, parentColumns = "id", childColumns = "montantId"),
                       @ForeignKey(entity = Contenant.class, parentColumns = "id", childColumns = "contenantId"),
                       @ForeignKey(entity = Etablissement.class, parentColumns = "id", childColumns = "etsId")})
public class MontantContenance {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private long contenantId;
    private long produitId;
    private long etsId;
    private long montantId;


    public MontantContenance(long contenantId, long produitId, long etsId, long montantId) {
        this.contenantId = contenantId;
        this.produitId = produitId;
        this.etsId = etsId;
        this.montantId = montantId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getContenantId() {
        return contenantId;
    }

    public void setContenantId(long contenantId) {
        this.contenantId = contenantId;
    }

    public long getProduitId() {
        return produitId;
    }

    public void setProduitId(long produitId) {
        this.produitId = produitId;
    }

    public long getEtsId() {
        return etsId;
    }

    public void setEtsId(long etsId) {
        this.etsId = etsId;
    }

    public long getMontantId() {
        return montantId;
    }

    public void setMontantId(long montantId) {
        this.montantId = montantId;
    }
}
