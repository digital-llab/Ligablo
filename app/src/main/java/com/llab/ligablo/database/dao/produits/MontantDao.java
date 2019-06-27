package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.produits.Montant;

import java.util.List;

@Dao
public interface MontantDao {

    @Query("SELECT * FROM Montant ORDER BY id DESC")
    LiveData<List<Montant>> getMontants();

    @Query("SELECT * FROM Montant  WHERE deviseId=:deviseId ORDER BY id DESC")
    LiveData<List<Montant>> getMontant_ByDevise(int deviseId);

    @Query("SELECT * FROM Montant  WHERE typeMontantId=:typemontantId ORDER BY id DESC")
    LiveData<List<Montant>> getMontant_ByType(int typemontantId);

    @Query("SELECT * FROM Montant  WHERE deviseId=:deviseId AND typeMontantId=:typemontantId ORDER BY id DESC")
    LiveData<List<Montant>> getMontant_ByTypeAndDevise(int deviseId,int typemontantId);

    @Insert
    int insertMontant(Montant montant);

    @Update
    int updateMontant(Montant montant);

    @Query("DELETE FROM Montant  WHERE id=:montantId")
    int deleteMontant(int montantId);
}
