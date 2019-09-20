package com.llab.ligablo.injection;

import android.content.Context;

import com.llab.ligablo.database.LigabloDatabase;
import com.llab.ligablo.repositories.etabs.AdresseDataRepository;
import com.llab.ligablo.repositories.etabs.EtablissementDataRepository;
import com.llab.ligablo.repositories.etabs.EtsTypeDataRepository;
import com.llab.ligablo.repositories.etabs.ExtensionDataRepository;
import com.llab.ligablo.repositories.users.AdminExtensionDataRepository;
import com.llab.ligablo.repositories.users.UserDataRepository;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Injection {

    public static AdminExtensionDataRepository providerAdminExtensionDataRepository(Context context) {
        LigabloDatabase database = LigabloDatabase.getInstance(context);
        return new AdminExtensionDataRepository(database.adminExtensionDao());
    }

    public static UserDataRepository provideUserDataSource(Context context) {
        LigabloDatabase database = LigabloDatabase.getInstance(context);
        return new UserDataRepository(database.userDao());
    }

    public static AdresseDataRepository providerAdresseDataRepository(Context context) {
        LigabloDatabase database = LigabloDatabase.getInstance(context);
        return new AdresseDataRepository(database.adresseDao());
    }

    public static EtablissementDataRepository providerEtablissementDataRepository(Context context) {
        LigabloDatabase database = LigabloDatabase.getInstance(context);
        return new EtablissementDataRepository(database.etablissementDao());
    }

    public static EtsTypeDataRepository providerEtsTypeDataRepository(Context context) {
        LigabloDatabase database = LigabloDatabase.getInstance(context);
        return new EtsTypeDataRepository(database.etsTypeDao());
    }

    public static ExtensionDataRepository providerExtensionDataRepository(Context context) {
        LigabloDatabase database = LigabloDatabase.getInstance(context);
        return new ExtensionDataRepository(database.extensionDao());
    }

    public static Executor provideExecutor(){ return Executors.newSingleThreadExecutor(); }

    public static ViewModelFactory providerViewModelFactory(Context context) {
        AdminExtensionDataRepository dataSourceAdminExtension = providerAdminExtensionDataRepository(context);
        UserDataRepository dataSourceUser = provideUserDataSource(context);
        AdresseDataRepository dataSourceAdresse = providerAdresseDataRepository(context);
        EtablissementDataRepository dataSourceEtablissement = providerEtablissementDataRepository(context);
        EtsTypeDataRepository dataSourceEtsType = providerEtsTypeDataRepository(context);
        ExtensionDataRepository dataSourceExtension = providerExtensionDataRepository(context);
        Executor executor = provideExecutor();
        return new ViewModelFactory(dataSourceAdminExtension, dataSourceUser, dataSourceAdresse, dataSourceEtablissement, dataSourceEtsType, dataSourceExtension, executor);
    }
}
