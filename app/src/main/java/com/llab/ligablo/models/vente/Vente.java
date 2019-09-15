package com.llab.ligablo.models.vente;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ColumnInfo;
import com.llab.ligablo.models.etab.Extension;

@Entity(tableName = "Vente",foreignKeys = @ForeignKey(entity =Extension.class ,parentColumns ="id",childColumns ="extensionId" ))
public class Vente {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "extensionId")
    private int extensionId;
    @ColumnInfo(name = "date")
    private String date;


    public Vente(int id, int extensionId, String date) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
