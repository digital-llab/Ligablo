package com.llab.ligablo.repositories.etabs;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.etabs.EtsTypeDao;
import com.llab.ligablo.models.etab.EtsType;

import java.util.List;

public class EtsTypeDataRepository {

    private final EtsTypeDao etsTypeDao;

    public EtsTypeDataRepository(EtsTypeDao etsTypeDao) {
        this.etsTypeDao = etsTypeDao;
    }

    // --- GET ---

    public LiveData<List<EtsType>> getEtsTypes() {
        return etsTypeDao.getEtsTypes();
    }

    // --- CREATE ---

    public void createEtsType(EtsType etsType) {
        this.etsTypeDao.insertEtsType(etsType);
    }

    // --- UPDATE ---

    public void updateEtsType(EtsType etsType) {
        this.etsTypeDao.updateEtsType(etsType);
    }

    // --- DELETE ---

    public void deleteEtsType(long etsTypeId) {
        this.etsTypeDao.deleteEtsType(etsTypeId);
    }
}


