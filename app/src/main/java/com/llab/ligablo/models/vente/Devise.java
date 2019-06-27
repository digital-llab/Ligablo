package com.llab.ligablo.models.vente;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Devise",foreignKeys = @ForeignKey(entity = Taux.class,parentColumns = "id",childColumns = "TauxId"))
public class Devise {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;
    @ColumnInfo(name="nom")
    private String nom;
    @ColumnInfo(name="symbole")
    private String symbole;
    @ColumnInfo(name="TauxId")
    private int TauxId;

    public Devise() {
    }

    public Devise(int id, String nom, String symbole, int tauxId) {
        this.id = id;
        this.nom = nom;
        this.symbole = symbole;
        TauxId = tauxId;
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

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public int getTauxId() {
        return TauxId;
    }

    public void setTauxId(int tauxId) {
        TauxId = tauxId;
    }
}
