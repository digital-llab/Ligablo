package com.llab.ligablo.database.dao.vente;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.vente.Paiement;
import java.util.List;
@Dao
public interface PaiementDao {
    LiveData<List<Paiement>> getPaiements();
    int insertPaiement(Paiement paiement);
    int updatePaiement(Paiement paiement);
    int deletePaiement(int paiementId);
}
