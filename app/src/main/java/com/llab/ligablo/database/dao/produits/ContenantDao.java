package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.produits.Contenant;

import java.util.List;

@Dao
public interface ContenantDao {
    @Query("SELECT * FROM Contenant ORDER BY id DESC")
    LiveData<List<Contenant>> getContenants();

    @Query("SELECT * FROM Contenant WHERE dimensionId=:dimensionId ORDER BY id DESC")
    LiveData<List<Contenant>> getContenant_ByDimension(int dimensionId);

    @Insert
    int insertContentant(Contenant contenant);
    @Update
    int updateContenant(Contenant contenant);
    @Query("DELETE FROM Contenant WHERE id=:contenantId")
    int deleteContenant(int contenantId);
}
