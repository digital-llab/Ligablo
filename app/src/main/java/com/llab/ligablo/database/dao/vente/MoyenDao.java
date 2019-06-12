package com.llab.ligablo.database.dao.vente;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.vente.Moyen;
import java.util.List;
@Dao
public interface MoyenDao {
    LiveData<List<Moyen>> getMoyens();
    int insertMoyen(Moyen moyen);
    int updateMoyen(Moyen moyen);
    int deleteMoyen(int moyenId);
}
