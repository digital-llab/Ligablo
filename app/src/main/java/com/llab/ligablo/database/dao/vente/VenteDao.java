package com.llab.ligablo.database.dao.vente;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.vente.Vente;
import java.util.List;
@Dao
public interface VenteDao {
    LiveData<List<Vente>> getVentes();
    int insertVente(Vente vente);
    int updateVente(Vente vente);
    int deleteVente(int venteId);
}
