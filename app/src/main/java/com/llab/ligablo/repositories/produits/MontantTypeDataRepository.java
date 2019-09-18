package com.llab.ligablo.repositories.produits;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.produits.MontantTypeDao;
import com.llab.ligablo.models.produits.MontantType;

import java.util.List;

public class MontantTypeDataRepository {
    private final MontantTypeDao montantTypeDao;

    public MontantTypeDataRepository(MontantTypeDao montantTypeDao) {
        this.montantTypeDao = montantTypeDao;
    }

    // --- GET ---

    public LiveData<List<MontantType>> getMontantType() {
        return montantTypeDao.getMontantTypes();
    }

    // --- CREATE ---

    public void createMontantType(MontantType montantType) {
        this.montantTypeDao.insertMontantType(montantType);
    }

    // --- UPDATE ---

    public void updateMontantType(MontantType montantType) {
        this.montantTypeDao.updateMontantType(montantType);
    }

    // --- DELETE ---

    public void deleteMontantType(long montantTypeId) {
        this.montantTypeDao.deleteMontantType(montantTypeId);
    }
}
