package com.llab.ligablo.models.produits;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.etab.Etablissement;

@Entity(tableName = "MontantContenance",foreignKeys = {@ForeignKey(entity = Produits.class, parentColumns = "id", childColumns = "produitId"),
                       @ForeignKey(entity = Montant.class, parentColumns = "id", childColumns = "montantId"),
                       @ForeignKey(entity = Contenant.class, parentColumns = "id", childColumns = "contenantId"),
                       @ForeignKey(entity = Etablissement.class, parentColumns = "id", childColumns = "etsId")})
public class MontantContenance {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;
    @ColumnInfo(name="contenantId")
    private int contenantId;
    @ColumnInfo(name="produitId")
    private int produitId;
    @ColumnInfo(name="etsId")
    private int etsId;
    @ColumnInfo(name="montantId")
    private int montantId;

    public MontantContenance() {
    }

    public MontantContenance(int id, int contenantId, int produitId, int etsId, int montantId) {
        this.id = id;
        this.contenantId = contenantId;
        this.produitId = produitId;
        this.etsId = etsId;
        this.montantId = montantId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContenantId() {
        return contenantId;
    }

    public void setContenantId(int contenantId) {
        this.contenantId = contenantId;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public int getEtsId() {
        return etsId;
    }

    public void setEtsId(int etsId) {
        this.etsId = etsId;
    }

    public int getMontantId() {
        return montantId;
    }

    public void setMontantId(int montantId) {
        this.montantId = montantId;
    }
}
