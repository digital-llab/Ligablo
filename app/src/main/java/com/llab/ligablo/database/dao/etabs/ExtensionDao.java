package com.llab.ligablo.database.dao.etabs;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.etab.Extension;
import com.llab.ligablo.models.etab.Adresse;
import java.util.List;

@Dao
public interface ExtensionDao {
    @Query("SELECT * FROM Extension")
    LiveData<List<Extension>> getExtensions();

    @Insert
    int insertExtension(int adresseId,int etsId,String telephone);

    @Update
    int updateExtension(Extension extension);

    @Query("DELETE FROM Extension WHERE id =:extensionId")
    int deleteExtension(int extensionId);
}
