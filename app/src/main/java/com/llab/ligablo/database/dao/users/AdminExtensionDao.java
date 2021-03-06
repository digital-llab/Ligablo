package com.llab.ligablo.database.dao.users;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.users.AdminExtension;
import java.util.List;

@Dao
public interface AdminExtensionDao {

    @Query("SELECT * FROM AdminExtension ORDER BY dateDebut DESC")
    LiveData<List<AdminExtension>> getAdminExtension();

    @Insert
    long insertAdminExtension(AdminExtension adminExtension);

    @Update
    int updateAdminExtension(AdminExtension adminExtension);

    @Query("DELETE FROM AdminExtension WHERE userId=:userId AND extensionId=:extensionId")
    int deleteAdminExtension(long extensionId, long userId);
}
