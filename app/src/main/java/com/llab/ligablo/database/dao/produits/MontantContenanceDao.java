package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;

import com.llab.ligablo.models.produits.MontantContenance;

import java.util.List;

@Dao
public interface MontantContenanceDao {

    LiveData<List<MontantContenance>> getMontantContenance();

    int insertMontantContenance(MontantContenance montantContenance);

    int updateMontantContenance(MontantContenance montantContenance);

    int deleteMontantContenance(int montantContenanceId);
}
