package com.llab.ligablo.models.produits;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(indices = {@Index("montantId"), @Index("stockId")}, foreignKeys = {@ForeignKey(entity = Montant.class, parentColumns = "id", childColumns = "montantId"),
                       @ForeignKey(entity = Stock.class, parentColumns = "id", childColumns = "stockId")})
public class MontantStock {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private long montantId;
    private long stockId;
    private Double valeurAchat;
    private String date;


    public MontantStock(long montantId, long stockId, Double valeurAchat, String date) {
        this.montantId = montantId;
        this.stockId = stockId;
        this.valeurAchat = valeurAchat;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMontantId() {
        return montantId;
    }

    public void setMontantId(long montantId) {
        this.montantId = montantId;
    }

    public long getStockId() {
        return stockId;
    }

    public void setStockId(long stockId) {
        this.stockId = stockId;
    }

    public Double getValeurAchat() {
        return valeurAchat;
    }

    public void setValeurAchat(Double valeurAchat) {
        this.valeurAchat = valeurAchat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
