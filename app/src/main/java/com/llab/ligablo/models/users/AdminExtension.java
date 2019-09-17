package com.llab.ligablo.models.users;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.etab.Extension;

@Entity(indices = {@Index("extensionId")}, foreignKeys = {@ForeignKey(entity = User.class, parentColumns = "id", childColumns = "userId"),
                       @ForeignKey(entity = Extension.class, parentColumns = "id", childColumns = "extensionId"),})
public class AdminExtension {

    private long extensionId;
    @PrimaryKey
    private long userId;
    private String dateDebut;
    private String dateFin;

    public AdminExtension(long extensionId, long userId, String dateDebut, String dateFin) {
        this.extensionId = extensionId;
        this.userId = userId;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public long getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(long extensionId) {
        this.extensionId = extensionId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }
}
