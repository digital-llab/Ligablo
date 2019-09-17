package com.llab.ligablo.repositories.etabs;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.etabs.AdresseDao;
import com.llab.ligablo.models.etab.Adresse;

import java.util.List;

public class AdresseDataRepository {

    private final AdresseDao adresseDao;

    public AdresseDataRepository(AdresseDao adresseDao) {
        this.adresseDao = adresseDao;
    }

    // --- GET ---

    public LiveData<List<Adresse>> getAdresses() {
        return adresseDao.getAdresses();
    }

    // --- CREATE ---

    public void createAdresse(Adresse adresse) {
        this.adresseDao.insertAdresse(adresse);
    }

    // --- UPDATE ---

    public void updateAdresse(Adresse adresse) {
        this.adresseDao.updateAdresse(adresse);
    }

    // --- DELETE ---

    public void deleteAdresse(long adresseId) {
        this.adresseDao.deleteAdresse(adresseId);
    }
}
