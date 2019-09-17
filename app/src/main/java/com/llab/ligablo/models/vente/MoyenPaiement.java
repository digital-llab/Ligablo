package com.llab.ligablo.models.vente;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(indices = {@Index("moyenId")}, foreignKeys = @ForeignKey(entity = Moyen.class,parentColumns = "id",childColumns = "moyenId"))
public class MoyenPaiement {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private long moyenId;


    public MoyenPaiement(long moyenId) {
        this.moyenId = moyenId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMoyenId() {
        return moyenId;
    }

    public void setMoyenId(long moyenId) {
        this.moyenId = moyenId;
    }
}
