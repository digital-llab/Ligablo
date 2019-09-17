package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.produits.Stock;

import java.util.List;

@Dao
public interface StockDao {

    @Query("SELECT * FROM Stock ORDER BY id DESC")
    LiveData<List<Stock>> getStocks();

    @Query("SELECT * FROM Stock WHERE extensionId=:extensionId")
    LiveData<List<Stock>> getStocks_InExtension(long extensionId);

    @Query("SELECT * FROM Stock WHERE extensionId=:extensionId AND produitId=:productId")
    LiveData<List<Stock>> getStocks_InExtension_ByProduct(long extensionId, long productId);

    @Query("SELECT * FROM Stock WHERE extensionId=:extensionId AND  quantite=:QteStock")
    LiveData<List<Stock>> getStocks_InExtension_ByQuantite(long extensionId, long QteStock);

    @Query("SELECT * FROM Stock WHERE extensionId=:extensionId AND quantite=:QteStock AND produitId=:productId")
    LiveData<List<Stock>> getStocks_InExtension_ByQuantiteAndProduct(long extensionId, long QteStock, long productId);

    @Query("SELECT * FROM Stock WHERE extensionId=:extensionId AND date=:date")
    LiveData<List<Stock>> getStocks_InExtensionByDate(long extensionId, String date);

    @Query("SELECT * FROM Stock WHERE date=:date1 AND extensionId=:extensionId UNION SELECT * FROM Stock WHERE date=:date2 AND extensionId=:extensionId")
    LiveData<List<Stock>> getStocks_InExtensionBetweenTwoDate(long extensionId, String date1, String date2);

    @Insert
    long insertStock(Stock stock);

    @Update
    int updateStock(Stock stock);

    @Query("DELETE FROM Stock WHERE id =:stockId")
    int deleteStock(long stockId);
}
