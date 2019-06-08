package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;

import com.llab.ligablo.models.produits.Montant;

import java.util.List;

@Dao
public interface MontantDao {

    LiveData<List<Montant>> getMontant();

    int insertMontant(Montant montant);

    int updateMontant(Montant montant);

    int deleteMontant(int montantId);
}
