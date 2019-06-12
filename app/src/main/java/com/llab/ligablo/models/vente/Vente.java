package com.llab.ligablo.models.vente;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Entity;
import com.llab.ligablo.models.etab.Extension;
import java.util.Date;

@Entity(foreignKeys = @ForeignKey(entity =Extension.class ,parentColumns ="id",childColumns ="extensionId" ))
public class Vente {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int extensionId;
    private Date date;

    public Vente() {
    }

    public Vente(int id, int extensionId, Date date) {
        this.id = id;
        this.extensionId = extensionId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(int extensionId) {
        this.extensionId = extensionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
