package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.produits.Dimension;

import java.util.List;

@Dao
public interface DimensionDao {
    @Query("SELECT * FROM Dimension ORDER BY id DESC")
    LiveData<List<Dimension>> getDimensions();

    @Query("SELECT * FROM Dimension WHERE poid=:poid ORDER BY id DESC")
    LiveData<List<Dimension>> getDimension_ByPoid(long poid);

    @Query("SELECT * FROM Dimension WHERE capacite=:capacite ORDER BY id DESC")
    LiveData<List<Dimension>> getDimension_ByCapacite(long capacite);
    @Insert
    long insertDimension(Dimension dimension);
    @Update
    int updateDimension(Dimension dimension);
    @Query("DELETE FROM Dimension WHERE id=:dimensionId")
    int deleteDimension(long dimensionId);
}
