package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.produits.MontantStock;

import java.util.List;

@Dao
public interface MontantStockDao {
    @Query("SELECT * FROM MontantStock ORDER BY id DESC")
    LiveData<List<MontantStock>> getMontantStocks();
    @Insert
    int insertMontantStock(MontantStock montantStock);
    @Update
    int updateMontantStock(MontantStock montantStock);
    @Query("SELECT * FROM MontantStock WHERE id=:montantStockId")
    int deleteMontantStock(int montantStockId);
}
