package com.llab.ligablo.database.dao.etabs;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.etab.EtsType;
import java.util.List;

@Dao
public interface EtsTypeDao {
    LiveData<List<EtsType>> getEtsTypes();
    int insertEtsType(EtsType etsType);
    int updateEtsType(EtsType etsType);
    int deleteEtsType(int etsTypeId);
}
