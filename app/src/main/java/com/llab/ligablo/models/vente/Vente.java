package com.llab.ligablo.models.vente;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import com.llab.ligablo.models.etab.Extension;

@Entity(indices = {@Index("extensionId")}, foreignKeys = @ForeignKey(entity = Extension.class ,parentColumns ="id",childColumns ="extensionId" ))
public class Vente {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private long extensionId;
    private String date;

    public Vente(long extensionId, String date) {
        this.extensionId = extensionId;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(long extensionId) {
        this.extensionId = extensionId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
