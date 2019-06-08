package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;

import com.llab.ligablo.models.produits.ProduitType;

import java.util.List;

@Dao
public interface ProduitTypeDao {

    LiveData<List<ProduitType>> getProduitType();

    int insertProduitType(ProduitType produitType);

    int updateProduitType(ProduitType produitType);

    int deleteProduitType(int produitTypeId);
}
