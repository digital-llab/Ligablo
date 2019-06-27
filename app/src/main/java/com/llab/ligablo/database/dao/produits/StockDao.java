package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.llab.ligablo.models.produits.Stock;

import java.util.Date;
import java.util.List;

@Dao
public interface StockDao {

    @Query("SELECT * FROM Stock")
    LiveData<List<Stock>> getStocks();

    @Query("SELECT * FROM Stock WHERE extensionId=:extensionId")
    LiveData<List<Stock>> getStocksByExtension(int extensionId);

    @Query("SELECT * FROM Stock WHERE date=:date")
    LiveData<List<Stock>> getStocksByDate(Date date);

    @Query("SELECT * FROM Stock WHERE date=:date1 UNION SELECT * FROM Stock WHERE date=:date2")
    LiveData<List<Stock>> getStocksBetweenTwoDate(Date date1,Date date2);

    int insertStock(Stock stock);

    int updateStock(Stock stock);

    int deleteStock(int stockId);
}
