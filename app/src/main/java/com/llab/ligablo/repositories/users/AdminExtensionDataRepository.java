package com.llab.ligablo.repositories.users;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.users.AdminExtensionDao;
import com.llab.ligablo.models.users.AdminExtension;

import java.util.List;

public class AdminExtensionDataRepository {

    private final AdminExtensionDao adminExtensionDao;

    public AdminExtensionDataRepository(AdminExtensionDao adminExtensionDao) {
        this.adminExtensionDao = adminExtensionDao;
    }

    // --- GET ---

    public LiveData<List<AdminExtension>> getAdminExtension() {
        return this.adminExtensionDao.getAdminExtension();
    }

    // --- CREATE ---

    public void createAdminExtension(AdminExtension adminExtension) {
        adminExtensionDao.insertAdminExtension(adminExtension);
    }

    // --- UPDATE ---
    public void updateAdminExtension(AdminExtension adminExtension) {
        adminExtensionDao.updateAdminExtension(adminExtension);
    }

    // --- DELETE ---
    public void deleteAdminExtension(long extensionId, long userId) {
        adminExtensionDao.deleteAdminExtension(extensionId, userId);
    }

}
