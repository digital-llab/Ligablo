package com.llab.ligablo.database.dao.etabs;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.etab.Etablissement;
import java.util.List;

@Dao
public interface EtablissementDao {

    @Query("SELECT * FROM Etablissement WHERE userId = :userId")
    LiveData<List<Etablissement>> getEtablissements(int userId);

    @Insert
    int insertEtablissement(Etablissement etablissement);

    @Update
    int updateEtablissement(Etablissement etablissement);

    @Query("DELETE FROM Etablissement WHERE id = :etablissementId")
    int deleteEtablissement(int etablissementId);
}
