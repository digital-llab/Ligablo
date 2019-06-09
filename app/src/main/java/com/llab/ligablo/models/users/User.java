package com.llab.ligablo.models.users;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = User.class,parentColumns = "id",childColumns = "managerId"))
public class User {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nom;
    private String email;
    private String telephone;
    private int managerId;

    public User() {
    }

    public User(int id, String nom, String email, String telephone, int managerId) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.managerId = managerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }
}
