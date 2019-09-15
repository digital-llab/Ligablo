package com.llab.ligablo.models.users;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.etab.Extension;

@Entity(tableName ="AdminExtension" ,foreignKeys = {@ForeignKey(entity = User.class, parentColumns = "id", childColumns = "userId"),
                       @ForeignKey(entity = Extension.class, parentColumns = "id", childColumns = "extensionId"),})
public class AdminExtension {

    @ColumnInfo(name = "extensionId")
    private int extensionId;
    @PrimaryKey
    @ColumnInfo(name = "userId")
    private int userId;
    @ColumnInfo(name = "dateDebut")
    private String dateDebut;
    @ColumnInfo(name = "dateFin")
    private String dateFin;

    public AdminExtension(int extensionId, int userId, String dateDebut) {
        this.extensionId = extensionId;
        this.userId = userId;
        this.dateDebut = dateDebut;
    }

    public int getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(int extensionId) {
        this.extensionId = extensionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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
