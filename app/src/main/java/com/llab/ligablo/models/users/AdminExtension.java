package com.llab.ligablo.models.users;

import java.util.Date;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.etab.Extension;

@Entity(tableName ="AdminExtension" ,foreignKeys = {@ForeignKey(entity = User.class, parentColumns = "id", childColumns = "userId"),
                       @ForeignKey(entity = Extension.class, parentColumns = "id", childColumns = "extensionId"),})
public class AdminExtension {

    @PrimaryKey
    @ColumnInfo(name = "extensionId")
    private int extensionId;
    @PrimaryKey
    @ColumnInfo(name = "userId")
    private int userId;
    @ColumnInfo(name = "dateDebut")
    private Date dateDebut;
    @ColumnInfo(name = "dateFin")
    private Date dateFin;

    public AdminExtension() {
    }

    public AdminExtension(int extensionId, int userId, Date dateDebut) {
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

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
