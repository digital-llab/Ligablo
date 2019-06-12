package com.llab.ligablo.database.dao.users;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.users.AdminExtension;
import java.util.List;

@Dao
public interface AdminExtensionDao {
    LiveData<List<AdminExtension>> getAdminExtension();
    int insertAdminExtension(AdminExtension adminExtension);
    int updateAdminExtension(AdminExtension adminExtension);
    int deleteAdminExtension(int extensionId,int userId);
}
