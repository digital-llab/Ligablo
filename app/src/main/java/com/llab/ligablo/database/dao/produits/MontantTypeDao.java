package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;

import com.llab.ligablo.models.produits.MontantType;

import java.util.List;

@Dao
public interface MontantTypeDao {

    LiveData<List<MontantType>> getMontantType();

    int insertMontantType(MontantType montantType);

    int updateMontantType(MontantType montantType);

    int deleteMontantType(int montantTypeId);
}
