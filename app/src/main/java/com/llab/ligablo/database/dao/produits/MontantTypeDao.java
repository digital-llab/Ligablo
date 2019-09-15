package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.produits.MontantType;

import java.util.List;

@Dao
public interface MontantTypeDao {
    @Query("SELECT * FROM montanttype ORDER BY id")
    LiveData<List<MontantType>> getMontantTypes();
    @Insert
    long insertMontantType(MontantType montantType);
    @Update
    int updateMontantType(MontantType montantType);
    @Query("DELETE FROM MontantType WHERE id=:montantTypeId")
    int deleteMontantType(int montantTypeId);
}
