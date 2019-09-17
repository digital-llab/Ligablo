package com.llab.ligablo.models.users;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(indices = {@Index("managerId")}, foreignKeys = @ForeignKey(entity = User.class,parentColumns = "id",childColumns = "managerId"))
public class User {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String nom;
    private String email;
    private String telephone;
    private long managerId;

    public User(long id, String nom, String email, String telephone, long managerId) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.managerId = managerId;
    }

/*    public User(String nom, String email, String telephone, long managerId) {
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.managerId = managerId;
    }*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }
}
