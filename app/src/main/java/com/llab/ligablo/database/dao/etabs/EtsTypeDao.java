package com.llab.ligablo.database.dao.etabs;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.etab.EtsType;
import java.util.List;

@Dao
public interface EtsTypeDao {

    @Query("SELECT * FROM EtsType ORDER BY id DESC")
    LiveData<List<EtsType>> getEtsTypes();

    @Insert
    long insertEtsType(EtsType etsType);

    @Update
    int updateEtsType(EtsType etsType);

    @Query("DELETE FROM EtsType WHERE id=:etsTypeId")
    int deleteEtsType(int etsTypeId);
}
