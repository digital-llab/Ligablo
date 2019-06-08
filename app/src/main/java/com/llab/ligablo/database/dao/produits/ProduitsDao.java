package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;

import com.llab.ligablo.models.produits.Produits;

import java.util.List;

@Dao
public interface ProduitsDao {

    LiveData<List<Produits>> getProduits();

    int insertProduit(Produits produits);

    int updateProduit(Produits produits);

    int deleteproduit(int produitId);
}
