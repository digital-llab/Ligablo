package com.llab.ligablo.repositories.etabs;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.etabs.ExtensionDao;
import com.llab.ligablo.models.etab.Extension;

import java.util.List;

public class ExtensionDataRepository {

    private final ExtensionDao extensionDao;

    public ExtensionDataRepository(ExtensionDao extensionDao) {
        this.extensionDao = extensionDao;
    }

    // --- GET ---

    public LiveData<List<Extension>> getExtensions() {
        return extensionDao.getExtensions();
    }

    // --- CREATE ---

    public void createExtension(Extension extension) {
        this.extensionDao.insertExtension(extension);
    }

    // --- UPDATE ---

    public void updateExtension(Extension extension) {
        this.extensionDao.updateExtension(extension);
    }

    // --- DELETE ---

    public void deleteExtension(long extensionId) {
        this.extensionDao.deleteExtension(extensionId);
    }
}
