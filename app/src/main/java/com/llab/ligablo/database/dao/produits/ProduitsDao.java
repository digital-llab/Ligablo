package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.produits.Produits;

import java.util.List;

@Dao
public interface ProduitsDao {

    @Query("SELECT * FROM Produits ORDER BY id DESC")
    LiveData<List<Produits>> getProduits();

    @Query("SELECT * FROM Produits WHERE id=:produitId")
    LiveData<Produits> getProduitById(int produitId);

    @Query("SELECT * FROM Produits WHERE produitTypeId=:typeId ORDER BY id DESC")
    LiveData<List<Produits>> getProduitByType(int typeId);

    @Insert
    long insertProduit(Produits produits);

    @Update
    int updateProduit(Produits produits);

    @Query("DELETE FROM Produits WHERE id=:produitId")
    int deleteproduit(int produitId);
}
