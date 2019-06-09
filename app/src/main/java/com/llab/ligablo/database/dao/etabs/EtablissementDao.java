package com.llab.ligablo.database.dao.etabs;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.etab.Etablissement;
import java.util.List;

@Dao
public interface EtablissementDao {
    LiveData<List<Etablissement>> getEtablissements();
    int insertEtablissement(Etablissement etablissement);
    int updateEtablissement(Etablissement etablissement);
    int deleteEtablissement(int etablissementId);
}
