package com.llab.ligablo.models.produits;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "MontantStock",foreignKeys = {@ForeignKey(entity = Montant.class, parentColumns = "id", childColumns = "montantId"),
                       @ForeignKey(entity = Stock.class, parentColumns = "id", childColumns = "stockId")})
public class MontantStock {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;
    @ColumnInfo(name="montantId")
    private int montantId;
    @ColumnInfo(name="stockId")
    private int stockId;
    @ColumnInfo(name="valeurAchat")
    private Double valeurAchat;
    @ColumnInfo(name="date")
    private Date date;

    public MontantStock() {
    }

    public MontantStock(int id, int montantId, int stockId, Double valeurAchat, Date date) {
        this.id = id;
        this.montantId = montantId;
        this.stockId = stockId;
        this.valeurAchat = valeurAchat;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMontantId() {
        return montantId;
    }

    public void setMontantId(int montantId) {
        this.montantId = montantId;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public Double getValeurAchat() {
        return valeurAchat;
    }

    public void setValeurAchat(Double valeurAchat) {
        this.valeurAchat = valeurAchat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
