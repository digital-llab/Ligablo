package com.llab.ligablo.repositories.produits;

import android.arch.lifecycle.LiveData;


import com.llab.ligablo.database.dao.produits.DimensionDao;

import com.llab.ligablo.models.produits.Dimension;

import java.util.List;

public class DimensionRepository {

    private final DimensionDao dimensionDao;

    public DimensionRepository(DimensionDao dimensionDao) {
        this.dimensionDao = dimensionDao;
    }

    // --- GET ---
    // Get list of Dimensions
    public LiveData<List<Dimension>> getDimensions() {
        return this.dimensionDao.getDimensions();
    }

    public LiveData<List<Dimension>> getDimension_ByPoid(long poid) {
        return this.dimensionDao.getDimension_ByPoid(poid);
    }

    public LiveData<List<Dimension>> getDimension_ByCapacite(long capacite) {
        return this.dimensionDao.getDimension_ByCapacite(capacite);
    }


    // --- CREATE ---

    public void createDimension(Dimension dimension) {
        dimensionDao.insertDimension(dimension);
    }

    // --- UPDATE ---

    public void updateDimension(Dimension dimension) {
        dimensionDao.updateDimension(dimension);
    }

    // --- DELETE ---

    public void deleteDimension(long dimensionId) {
        dimensionDao.deleteDimension(dimensionId);
    }
}
