package com.llab.ligablo.injection;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.llab.ligablo.repositories.etabs.AdresseDataRepository;
import com.llab.ligablo.repositories.etabs.EtablissementDataRepository;
import com.llab.ligablo.repositories.etabs.EtsTypeDataRepository;
import com.llab.ligablo.repositories.etabs.ExtensionDataRepository;
import com.llab.ligablo.repositories.users.AdminExtensionDataRepository;
import com.llab.ligablo.repositories.users.UserDataRepository;
import com.llab.ligablo.viewmodels.EtabsViewModel;
import com.llab.ligablo.viewmodels.UserViewModel;

import java.util.concurrent.Executor;

public class ViewModelFactory implements ViewModelProvider.Factory {

    private final AdminExtensionDataRepository adminExtensionDataSource;
    private final UserDataRepository userDataSource;
    private final AdresseDataRepository adresseDataSource;
    private final EtablissementDataRepository etablissementDataSource;
    private final EtsTypeDataRepository etsTypeDataSource;
    private final ExtensionDataRepository extensionDataSource;
    private final Executor executor;

    public ViewModelFactory(AdminExtensionDataRepository adminExtensionDataSource, UserDataRepository userDataSource, AdresseDataRepository adresseDataSource, EtablissementDataRepository etablissementDataSource, EtsTypeDataRepository etsTypeDataSource, ExtensionDataRepository extensionDataSource, Executor executor) {
        this.adminExtensionDataSource = adminExtensionDataSource;
        this.userDataSource = userDataSource;
        this.adresseDataSource = adresseDataSource;
        this.etablissementDataSource = etablissementDataSource;
        this.etsTypeDataSource = etsTypeDataSource;
        this.extensionDataSource = extensionDataSource;
        this.executor = executor;
    }


    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(UserViewModel.class)) {
            return (T) new UserViewModel(adminExtensionDataSource, userDataSource, executor);
        }
        if (modelClass.isAssignableFrom(EtabsViewModel.class)) {
            return (T) new EtabsViewModel(adresseDataSource, etablissementDataSource, etsTypeDataSource, extensionDataSource, userDataSource, executor);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
