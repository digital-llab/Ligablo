package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;

import com.llab.ligablo.models.produits.MontantStock;

import java.util.List;

@Dao
public interface MontantStockDao {

    LiveData<List<MontantStock>> getMontantStock();

    int insertMontantStock(MontantStock montantStock);

    int updateMontantStock(MontantStock montantStock);

    int deleteMontantStock(int montantStockId);
}
