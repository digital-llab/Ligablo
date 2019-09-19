package com.llab.ligablo.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;

import com.llab.ligablo.models.etab.Adresse;
import com.llab.ligablo.models.etab.Etablissement;
import com.llab.ligablo.models.etab.EtsType;
import com.llab.ligablo.models.etab.Extension;
import com.llab.ligablo.models.users.User;
import com.llab.ligablo.repositories.etabs.AdresseDataRepository;
import com.llab.ligablo.repositories.etabs.EtablissementDataRepository;
import com.llab.ligablo.repositories.etabs.EtsTypeDataRepository;
import com.llab.ligablo.repositories.etabs.ExtensionDataRepository;
import com.llab.ligablo.repositories.users.UserDataRepository;

import java.util.List;
import java.util.concurrent.Executor;

public class EtabsViewModel extends ViewModel {

    // --- REPOSITORIES
    private final AdresseDataRepository adresseDataSource;
    private final EtablissementDataRepository etablissementDataSource;
    private final EtsTypeDataRepository etsTypeDataSource;
    private final ExtensionDataRepository extensionDataSource;
    private final UserDataRepository userDataSource;

    private final Executor executor;

    // DATA
    @Nullable
    private LiveData<User> currentUser;

    public EtabsViewModel(AdresseDataRepository adresseDataSource, EtablissementDataRepository etablissementDataSource, EtsTypeDataRepository etsTypeDataSource, ExtensionDataRepository extensionDataSource, UserDataRepository userDataSource, Executor executor) {
        this.adresseDataSource = adresseDataSource;
        this.etablissementDataSource = etablissementDataSource;
        this.etsTypeDataSource = etsTypeDataSource;
        this.extensionDataSource = extensionDataSource;
        this.userDataSource = userDataSource;
        this.executor = executor;
    }

    public void init(long userId) {
        if (this.currentUser != null) {
            return;
        }
        currentUser = userDataSource.getUser(userId);
    }


    // -------------
    // FOR USER
    // -------------

    public LiveData<User> getUser(long userId) { return this.currentUser;  }

    // -------------
    // FOR ADDRESS
    // -------------

    public LiveData<List<Adresse>> getAdresses() {
        return adresseDataSource.getAdresses();
    }

    public void createAdresse(Adresse adresse) {
        executor.execute(() -> adresseDataSource.createAdresse(adresse));
    }

    public void updateAdresse(Adresse adresse) {
        executor.execute(() -> adresseDataSource.updateAdresse(adresse));
    }

    public void deleteAdresse(long adresseId) {
        executor.execute(() -> adresseDataSource.deleteAdresse(adresseId));
    }

    // -------------
    // FOR ETABLISSEMENT
    // -------------

    public LiveData<List<Etablissement>> getEtablissements(long userId) {
        return etablissementDataSource.getEtablissements(userId);
    }

    public LiveData<Etablissement> getEtablisement(long userId, long etabId) {
        return etablissementDataSource.getEtablissement(userId, etabId);
    }

    public void createEtab(Etablissement etablissement) {
        executor.execute(() -> etablissementDataSource.createEtab(etablissement));
    }

    public void updateEtab(Etablissement etablissement) {
        executor.execute(() -> etablissementDataSource.updateEtab(etablissement));
    }

    public void deleteEtab(long etabId) {
        executor.execute(() -> etablissementDataSource.deleteEtab(etabId));
    }

    // -------------
    // FOR ETsTYPE
    // -------------

    public LiveData<List<EtsType>> getEtsTypes() {
        return etsTypeDataSource.getEtsTypes();
    }

    public void createEtsType(EtsType etsType) {
        executor.execute(() -> etsTypeDataSource.createEtsType(etsType));
    }

    public void updateEtsType(EtsType etsType) {
        executor.execute(() -> etsTypeDataSource.updateEtsType(etsType));
    }

    public void deleteEtsType(long etsTypeId) {
        executor.execute(() -> etsTypeDataSource.deleteEtsType(etsTypeId));
    }

    // -------------
    // FOR EXTENSION
    // -------------

    public LiveData<List<Extension>> getExtensions() {
        return extensionDataSource.getExtensions();
    }

    public void createExtension(Extension extension) {
        executor.execute(() -> extensionDataSource.createExtension(extension));
    }

    public void updateExtension(Extension extension) {
        executor.execute(() -> extensionDataSource.updateExtension(extension));
    }

    public void deleteExtension(long extensionId) {
        executor.execute(() -> extensionDataSource.deleteExtension(extensionId));
    }
}
