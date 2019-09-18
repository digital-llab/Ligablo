package com.llab.ligablo.repositories.produits;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.produits.ProduitTypeDao;
import com.llab.ligablo.models.produits.ProduitType;

import java.util.List;

public class ProduitTypeDataRepository {
    private final ProduitTypeDao produitTypeDao;

    public ProduitTypeDataRepository(ProduitTypeDao produitTypeDao) {
        this.produitTypeDao = produitTypeDao;
    }

    // --- GET ---

    LiveData<List<ProduitType>> getProduitType() {
        return produitTypeDao.getProduitTypes();
    }

    // --- CREATE ---

    public void createProduitType(ProduitType produitType) {
        this.produitTypeDao.insertProduitType(produitType);
    }

    // --- UPDATE ---

    public void updateProduitType(ProduitType produitType) {
        this.produitTypeDao.updateProduitType(produitType);
    }

    // --- DELETE ---

    public void deleteProduitType(long produitTypeId) {
        this.produitTypeDao.deleteProduitType(produitTypeId);
    }
}
