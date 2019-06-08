package com.llab.ligablo.models.produits;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(foreignKeys = {@ForeignKey(entity = Montant.class, parentColumns = "id", childColumns = "montantId"),
                       @ForeignKey(entity = Stock.class, parentColumns = "id", childColumns = "stockId")})
public class MontantStock {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private int montantId;
    private int stockId;
    private Double valeurAchat;
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
