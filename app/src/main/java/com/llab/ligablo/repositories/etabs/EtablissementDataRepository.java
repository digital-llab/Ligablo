package com.llab.ligablo.repositories.etabs;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.etabs.EtablissementDao;
import com.llab.ligablo.models.etab.Etablissement;

import java.util.List;

public class EtablissementDataRepository {

    private final EtablissementDao etablissementDao;

    public EtablissementDataRepository(EtablissementDao etablissementDao) {
        this.etablissementDao = etablissementDao;
    }

    // --- GET ---

    public LiveData<List<Etablissement>> getEtablissements(long userId) {
        return etablissementDao.getEtablissements(userId);
    }

    public LiveData<Etablissement> getEtablissement(long userId, long etabId) {
        return etablissementDao.getEtablissement(userId, etabId);
    }

    // --- CREATE ---

    public void createEtab(Etablissement etablissement) {
        this.etablissementDao.insertEtablissement(etablissement);
    }

    // --- UPDATE ---

    public void updateEtab(Etablissement etablissement) {
        this.etablissementDao.updateEtablissement(etablissement);
    }

    // --- DELETE ---

    public void deleteEtab(long etabId) {
        this.etablissementDao.deleteEtablissement(etabId);
    }
}
