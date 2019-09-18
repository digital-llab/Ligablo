package com.llab.ligablo.repositories.produits;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.produits.DimensionDao;
import com.llab.ligablo.database.dao.produits.MontantDao;
import com.llab.ligablo.models.produits.Dimension;
import com.llab.ligablo.models.produits.Montant;

import java.util.List;

public class MontantRepository {

    private final MontantDao montantDao;

    public MontantRepository(MontantDao montantDao) {
        this.montantDao = montantDao;
    }

    // --- GET ---
    // Get list of Dimensions
    public LiveData<List<Montant>> getMontants() {
        return this.montantDao.getMontants();
    }

    public LiveData<List<Montant>> getMontant_ByDevise(int deviseId) {
        return this.montantDao.getMontant_ByDevise(deviseId);
    }

    public LiveData<List<Montant>> getMontant_ByType(int typemontantId) {
        return this.montantDao.getMontant_ByType(typemontantId);
    }

    public LiveData<List<Montant>> getMontant_ByTypeAndDevise(int deviseId, int typemontantId) {
        return this.montantDao.getMontant_ByTypeAndDevise(deviseId, typemontantId);
    }


    // --- CREATE ---

    public void createMontant(Montant montant) {
        montantDao.insertMontant(montant);
    }

    // --- UPDATE ---

    public void updateMontant(Montant montant) {
        montantDao.updateMontant(montant);
    }

    // --- DELETE ---

    public void deleteMontant(long montantId) {
        montantDao.deleteMontant(montantId);
    }
}
