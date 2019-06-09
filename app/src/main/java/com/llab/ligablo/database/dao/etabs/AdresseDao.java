package com.llab.ligablo.database.dao.etabs;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.etab.Adresse;
import java.util.List;

@Dao
public interface AdresseDao {
    LiveData<List<Adresse>> getAdresses();
    int insertAdresse(Adresse adresse);
    int updateAdresse(Adresse adresse);
    int deleteAdresse(int adresseId);
}
