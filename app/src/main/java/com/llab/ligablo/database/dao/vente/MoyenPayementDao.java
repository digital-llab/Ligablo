package com.llab.ligablo.database.dao.vente;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.vente.MoyenPaiement;
import java.util.List;
@Dao
public interface MoyenPayementDao {
    LiveData<List<MoyenPaiement>> getMoyenPaiements();
    int insertMoyenPayement(MoyenPaiement moyenPaiement);
    int updateMoyenPayement(MoyenPaiement moyenPaiement);
    int deleteMoyenPayement(int moyenPaiementId,int moyenId);
}
