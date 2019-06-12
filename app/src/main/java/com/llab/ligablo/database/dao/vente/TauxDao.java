package com.llab.ligablo.database.dao.vente;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.vente.Taux;
import java.util.List;
@Dao
public interface TauxDao {
    LiveData<List<Taux>> getTaux();
    int insertTaux(Taux taux);
    int updateTaux(Taux taux);
    int deleteTaux(int tauxId);
}
