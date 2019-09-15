package com.llab.ligablo.models.vente;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Entity;

import com.llab.ligablo.models.produits.Contenant;

@Entity(tableName = "PaiementType",foreignKeys ={@ForeignKey(entity =LigneVente.class ,parentColumns ="id",childColumns ="ligneVenteId"),
                      @ForeignKey(entity =Paiement.class ,parentColumns ="id",childColumns ="paiementId"),
                      @ForeignKey(entity =Contenant.class,parentColumns ="id",childColumns ="contenantId")})
public class PaiementType {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;
    @ColumnInfo(name="ligneVenteId")
    private int ligneVenteId;
    @ColumnInfo(name="paiementId")
    private int paiementId;
    @ColumnInfo(name="contenantId")
    private int contenantId;


    public PaiementType(int id, int ligneVenteId, int paiementId, int contenantId) {
        this.id = id;
        this.ligneVenteId = ligneVenteId;
        this.paiementId = paiementId;
        this.contenantId = contenantId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLigneVenteId() {
        return ligneVenteId;
    }

    public void setLigneVenteId(int ligneVenteId) {
        this.ligneVenteId = ligneVenteId;
    }

    public int getPaiementId() {
        return paiementId;
    }

    public void setPaiementId(int paiementId) {
        this.paiementId = paiementId;
    }

    public int getContenantId() {
        return contenantId;
    }

    public void setContenantId(int contenantId) {
        this.contenantId = contenantId;
    }
}
