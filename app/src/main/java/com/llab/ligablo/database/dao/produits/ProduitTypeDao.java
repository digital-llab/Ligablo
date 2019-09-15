package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.produits.ProduitType;

import java.util.List;

@Dao
public interface ProduitTypeDao {

    @Query("SELECT * FROM ProduitType ORDER BY id DESC")
    LiveData<List<ProduitType>> getProduitTypes();

    @Insert
    long insertProduitType(ProduitType produitType);

    @Update
    int updateProduitType(ProduitType produitType);

    @Query("DELETE FROM ProduitType WHERE id=:produitTypeId")
    int deleteProduitType(int produitTypeId);
}
