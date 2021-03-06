package com.llab.ligablo.repositories.produits;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.produits.StockDao;
import com.llab.ligablo.models.produits.Stock;

import java.util.List;

public class StockDataRepository {

    private final StockDao stockDao;

    public StockDataRepository(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    // --- GET ---

    public LiveData<List<Stock>> getStocks() {
        return stockDao.getStocks();
    }

    public LiveData<List<Stock>> getStockInExtension(long extensionId) {
        return stockDao.getStocks_InExtension(extensionId);
    }

    public LiveData<List<Stock>> getStockInExtensionByProduct(long extensionId, long productId) {
        return stockDao.getStocks_InExtension_ByProduct(extensionId, productId);
    }

    public LiveData<List<Stock>> getStockInExtensionByQuantite(long extensionId, long qteStock) {
        return stockDao.getStocks_InExtension_ByQuantite(extensionId, qteStock);
    }

    public LiveData<List<Stock>> getStockInExtensionByQuantiteAndProduct(long extensionId, long qteStock, long productId) {
        return stockDao.getStocks_InExtension_ByQuantiteAndProduct(extensionId,qteStock, productId);
    }

    public LiveData<List<Stock>> getStockInExtensionByDate(long extensionId, String date) {
        return stockDao.getStocks_InExtensionByDate(extensionId, date);
    }

    public LiveData<List<Stock>> getStockInExtensionBetweenTwoDate(long extensionId, String startDate, String endDate) {
        return stockDao.getStocks_InExtensionBetweenTwoDate(extensionId, startDate, endDate);
    }

    // --- CREATE ---

    public void createStock(Stock stock) {
        this.stockDao.insertStock(stock);
    }

    // --- UPDATE ---

    public void updateStock(Stock stock) {
        this.stockDao.updateStock(stock);
    }

    // --- DELETE ---

    public void deleteStock(long stockId) {
        this.stockDao.deleteStock(stockId);
    }
}
