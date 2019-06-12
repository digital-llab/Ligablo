package com.llab.ligablo.database.dao.vente;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.vente.PaiementType;
import java.util.List;
@Dao
public interface PaiementTypeDao {
    LiveData<List<PaiementType>> getPaiementTypes();
    int insertPaiementType(PaiementType paiement);
    int updatePaiementType(PaiementType paiement);
    int deletePaiementType(int PaiementTypeId);
}
