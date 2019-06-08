package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;

import com.llab.ligablo.models.produits.Contenant;

import java.util.List;

@Dao
public interface ContenantDao {

    LiveData<List<Contenant>> getContenants();

    int insertContentant(Contenant contenant);

    int updateContenant(Contenant contenant);

    int deleteContenant(int contenantId);
}
