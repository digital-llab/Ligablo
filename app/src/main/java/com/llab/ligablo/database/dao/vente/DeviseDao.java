package com.llab.ligablo.database.dao.vente;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.vente.Devise;
import java.util.List;

@Dao
public interface DeviseDao {
    LiveData<List<Devise>> getDevises();
    int insertDevise(Devise devise);
    int updateDevise(Devise devise);
    int deleteDevise(int deviseId);
}
