package com.llab.ligablo.models.vente;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Entity;

@Entity(foreignKeys = @ForeignKey(entity = Moyen.class,parentColumns = "id",childColumns = "MoyenId"))
public class MoyenPaiement {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int MoyenId;

    public MoyenPaiement() {
    }

    public MoyenPaiement(int id, int moyenId) {
        this.id = id;
        MoyenId = moyenId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoyenId() {
        return MoyenId;
    }

    public void setMoyenId(int moyenId) {
        MoyenId = moyenId;
    }
}
