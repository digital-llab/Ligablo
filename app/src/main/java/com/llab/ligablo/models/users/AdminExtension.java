package com.llab.ligablo.models.users;

import java.util.Date;

public class AdminExtension {

    private int extensionId;
    private int userId;
    private Date dateDebut;
    private Date dateFin;

    public AdminExtension() {
    }

    public AdminExtension(int extensionId, int userId, Date dateDebut, Date dateFin) {
        this.extensionId = extensionId;
        this.userId = userId;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
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
