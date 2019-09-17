package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.produits.MontantContenance;

import java.util.List;

@Dao
public interface MontantContenanceDao {

    @Query("SELECT * FROM montantcontenance ORDER BY id DESC")
    LiveData<List<MontantContenance>> getMontantContenances();

    @Query("SELECT * FROM montantcontenance WHERE id=:montantContenanceId")
    LiveData<List<MontantContenance>> getMontantContenances(int montantContenanceId);

    @Insert
    long insertMontantContenance(MontantContenance montantContenance);

    @Update
    int updateMontantContenance(MontantContenance montantContenance);

    @Query("DELETE FROM montantcontenance WHERE id=:montantContenanceId")
    int deleteMontantContenance(long montantContenanceId);
}
