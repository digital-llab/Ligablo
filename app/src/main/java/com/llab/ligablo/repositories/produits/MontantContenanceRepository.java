package com.llab.ligablo.repositories.produits;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.produits.DimensionDao;
import com.llab.ligablo.database.dao.produits.MontantContenanceDao;
import com.llab.ligablo.models.produits.Dimension;
import com.llab.ligablo.models.produits.MontantContenance;

import java.util.List;

public class MontantContenanceRepository {

    private final MontantContenanceDao montantContenanceDao;

    public MontantContenanceRepository(MontantContenanceDao montantContenanceDao) {
        this.montantContenanceDao = montantContenanceDao;
    }

    // --- GET ---
    // Get list of MontantContenance
    public LiveData<List<MontantContenance>> getMontantContenances() {
        return this.montantContenanceDao.getMontantContenances();
    }

    public LiveData<List<MontantContenance>> getMontantContenances(int montantContenanceId) {
        return this.montantContenanceDao.getMontantContenances(montantContenanceId);
    }

    // --- CREATE ---

    public void createMontantContenance(MontantContenance montantContenance) {
        montantContenanceDao.insertMontantContenance(montantContenance);
    }

    // --- UPDATE ---

    public void updateMontantContenance(MontantContenance montantContenance) {
        montantContenanceDao.updateMontantContenance(montantContenance);
    }

    // --- DELETE ---

    public void deleteMontantContenance(long montantContenanceId) {
        montantContenanceDao.deleteMontantContenance(montantContenanceId);
    }
}
