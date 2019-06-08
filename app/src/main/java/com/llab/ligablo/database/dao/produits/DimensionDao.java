package com.llab.ligablo.database.dao.produits;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;

import com.llab.ligablo.models.produits.Dimension;

import java.util.List;

@Dao
public interface DimensionDao {

    LiveData<List<Dimension>> getDimensions();

    int insertDimension(Dimension dimension);

    int updateDimension(Dimension dimension);

    int deleteDimension(int dimensionId);
}
