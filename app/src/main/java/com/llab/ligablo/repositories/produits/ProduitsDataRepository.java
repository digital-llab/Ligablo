package com.llab.ligablo.repositories.produits;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.produits.ProduitsDao;
import com.llab.ligablo.models.produits.Produits;

import java.util.List;

public class ProduitsDataRepository {
    private final ProduitsDao produitsDao;

    public ProduitsDataRepository(ProduitsDao produitsDao) {
        this.produitsDao = produitsDao;
    }

    // --- GET ---

    public LiveData<List<Produits>> getProduits() {
        return produitsDao.getProduits();
    }

    public LiveData<Produits> getProduitById(long produitId) {
        return produitsDao.getProduitById(produitId);
    }

    public LiveData<List<Produits>> getProduitByType(long typeId) {
        return produitsDao.getProduitByType(typeId);
    }

    // --- CREATE ---

    public void createProduit(Produits produit) {
        this.produitsDao.insertProduit(produit);
    }

    // --- UDPATE ---

    public void updateProduit(Produits produit) {
        this.produitsDao.updateProduit(produit);
    }

    // --- DELETE ---

    public void deleteProduit(long produitId) {
        this.produitsDao.deleteproduit(produitId);
    }
}
