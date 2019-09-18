package com.llab.ligablo.repositories.produits;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.produits.ContenantDao;
import com.llab.ligablo.models.produits.Contenant;


import java.util.List;

public class ContenantRepository {

    private final ContenantDao contenantDao;

    public ContenantRepository(ContenantDao contenantDao) {
        this.contenantDao = contenantDao;
    }

    // --- GET ---
    // Get list of contenants
    public LiveData<List<Contenant>> getContenants() {
        return this.contenantDao.getContenants();
    }

    public LiveData<List<Contenant>> getContenant_ByDimension(long dimensionId) {
        return this.contenantDao.getContenant_ByDimension(dimensionId);
    }

    // --- CREATE ---

    public void createContenant(Contenant contenant) {
        contenantDao.insertContenant(contenant);
    }

    // --- UPDATE ---

    public void updateContenant(Contenant contenant) {
        contenantDao.updateContenant(contenant);
    }

    // --- DELETE ---

    public void deleteContenant(long contenantId) {
        contenantDao.deleteContenant(contenantId);
    }
}
