package com.llab.ligablo.database.dao.etabs;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.etab.Extension;
import java.util.List;

@Dao
public interface ExtensionDao {
    LiveData<List<Extension>> getExtensions();
    int insertExtension(Extension extension);
    int updateExtension(Extension extension);
    int deleteExtension(int extensionId);
}
