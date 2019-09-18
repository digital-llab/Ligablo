package com.llab.ligablo.repositories.produits;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.produits.MontantStockDao;
import com.llab.ligablo.models.produits.MontantStock;

import java.util.List;

public class MontantStockDataRepository {
    private final MontantStockDao montantStockDao;

    public MontantStockDataRepository(MontantStockDao montantStockDao) {
        this.montantStockDao = montantStockDao;
    }

    // --- GET ---

    public LiveData<List<MontantStock>> getMontantStocks() {
        return montantStockDao.getMontantStocks();
    }

    // --- CREATE ---

    public void createMontantStock(MontantStock montantStock) {
        this.montantStockDao.insertMontantStock(montantStock);
    }

    // --- UPDATE ---

    public void updateMontantStock(MontantStock montantStock) {
        this.montantStockDao.updateMontantStock(montantStock);
    }

    // --- DELETE ---

    public void deleteMontantStock(long montantStockId) {
        this.montantStockDao.deleteMontantStock(montantStockId);
    }
}
