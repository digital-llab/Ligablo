package com.llab.ligablo.database.dao.vente;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.vente.LigneVente;
import java.util.List;

@Dao
public interface LigneVenteDao {
    LiveData<List<LigneVente>> getLigneVentes();
    int insertLigneVente(LigneVente ligneVente);
    int updateLigneVente(LigneVente ligneVente);
    int deleteLigneVente(int ligneVenteId);
}
