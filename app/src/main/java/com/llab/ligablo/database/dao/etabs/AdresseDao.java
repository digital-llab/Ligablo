package com.llab.ligablo.database.dao.etabs;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.etab.Adresse;
import java.util.List;

@Dao
public interface AdresseDao {

    @Query("SELECT * FROM Adresse ORDER BY id DESC")
    LiveData<List<Adresse>> getAdresses();

    @Query("SELECT id FROM Adresse ORDER BY id DESC LIMIT 1")
    int getLastAdresse();

    @Insert
    int insertAdresse(Adresse adresse);

    @Update
    int updateAdresse(Adresse adresse);

}
