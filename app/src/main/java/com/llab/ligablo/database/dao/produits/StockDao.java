package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;

import com.llab.ligablo.models.produits.Stock;

import java.util.List;

@Dao
public interface StockDao {

    LiveData<List<Stock>> getStocks();

    int insertStock(Stock stock);

    int updateStock(Stock stock);

    int deleteStock(int stockId);
}
