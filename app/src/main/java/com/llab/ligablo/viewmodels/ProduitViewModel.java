package com.llab.ligablo.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;

import com.llab.ligablo.models.etab.Etablissement;
import com.llab.ligablo.models.etab.EtsType;
import com.llab.ligablo.models.etab.Extension;
import com.llab.ligablo.models.produits.Contenant;
import com.llab.ligablo.models.produits.Dimension;
import com.llab.ligablo.models.produits.Montant;
import com.llab.ligablo.models.produits.MontantContenance;
import com.llab.ligablo.models.users.User;
import com.llab.ligablo.repositories.produits.ContenantDataRepository;
import com.llab.ligablo.repositories.produits.DimensionDataRepository;
import com.llab.ligablo.repositories.produits.MontantContenanceDataRepository;
import com.llab.ligablo.repositories.produits.MontantRepository;
import com.llab.ligablo.repositories.produits.MontantStockDataRepository;
import com.llab.ligablo.repositories.produits.MontantTypeDataRepository;
import com.llab.ligablo.repositories.produits.ProduitTypeDataRepository;
import com.llab.ligablo.repositories.produits.ProduitsDataRepository;
import com.llab.ligablo.repositories.produits.StockDataRepository;
import com.llab.ligablo.repositories.users.UserDataRepository;

import java.util.List;
import java.util.concurrent.Executor;

public class ProduitViewModel extends ViewModel {

    // --- REPOSITORIES
    private final ContenantDataRepository contenantDataSource;
    private final DimensionDataRepository dimensionDataSource;
    private final MontantContenanceDataRepository montantContenanceDataSource;
    private final MontantRepository montantSource;
    private final MontantStockDataRepository montantStockDataSource;
    private final MontantTypeDataRepository montantTypeDataSource;
    private final ProduitsDataRepository produitsDataSource;
    private final ProduitTypeDataRepository produitTypeDataSource;
    private final StockDataRepository stockDataSource;
    private final UserDataRepository userDataSource;




    private final Executor executor;

    // DATA
    @Nullable
    private LiveData<User> currentUser;

    public ProduitViewModel(ContenantDataRepository contenantDataSource, DimensionDataRepository dimensionDataSource, MontantContenanceDataRepository montantContenanceDataSource,
                            MontantRepository montantSource, MontantStockDataRepository montantStockDataSource,MontantTypeDataRepository montantTypeDataSource,
                            ProduitsDataRepository produitsDataSource, ProduitTypeDataRepository produitTypeDataSource, StockDataRepository stockDataSource,UserDataRepository userDataSource, Executor executor) {
        this.contenantDataSource = contenantDataSource;
        this.dimensionDataSource = dimensionDataSource;
        this.montantContenanceDataSource = montantContenanceDataSource;
        this.montantSource = montantSource;
        this.montantStockDataSource = montantStockDataSource;
        this.montantTypeDataSource = montantTypeDataSource;
        this.produitsDataSource = produitsDataSource;
        this.produitTypeDataSource = produitTypeDataSource;
        this.stockDataSource = stockDataSource;
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
    // FOR CONTENANT
    // -------------

    public LiveData<List<Contenant>> getContenants() {
        return contenantDataSource.getContenants();
    }
    public LiveData<List<Contenant>> getContenant_ByDimension(long dimensionId) {
        return this.contenantDataSource.getContenant_ByDimension(dimensionId);
    }

    public void createContenant(Contenant contenant) {
        executor.execute(() -> contenantDataSource.createContenant(contenant));
    }

    public void updateContenant(Contenant contenant) {
        executor.execute(() -> contenantDataSource.updateContenant(contenant));
    }

    public void deleteContenant(long contenantId) {
        executor.execute(() -> contenantDataSource.deleteContenant(contenantId));
    }

    // -------------
    // FOR DIMENSION
    // -------------

    public LiveData<List<Dimension>> getDimensions() {
        return dimensionDataSource.getDimensions();
    }

    public LiveData<List<Dimension>> getDimension_ByPoid(long poid) {
        return dimensionDataSource.getDimension_ByPoid(poid);
    }
    public LiveData<List<Dimension>> getDimension_ByCapacite(long capacite) {
        return dimensionDataSource.getDimension_ByCapacite(capacite);
    }
    public void createDimension(Dimension dimension) {
        executor.execute(() -> dimensionDataSource.createDimension(dimension));
    }

    public void updateDimension(Dimension dimension) {
        executor.execute(() -> dimensionDataSource.updateDimension(dimension));
    }

    public void deleteDimension(long dimensionId) {
        executor.execute(() -> dimensionDataSource.deleteDimension(dimensionId));
    }

    // -------------
    // FOR MONTANTCONTENANCE
    // -------------

    public LiveData<List<MontantContenance>> getMontantContenances() {
        return montantContenanceDataSource.getMontantContenances();
    }

    public LiveData<List<MontantContenance>> getMontantContenances(int montantContenanceId) {
        return montantContenanceDataSource.getMontantContenances(montantContenanceId);
    }


    public void createMontantContenance(MontantContenance montantContenance) {
        executor.execute(() -> montantContenanceDataSource.createMontantContenance(montantContenance));
    }

    public void updateMontantContenance(MontantContenance montantContenance) {
        executor.execute(() -> montantContenanceDataSource.updateMontantContenance(montantContenance));
    }

    public void deleteMontantContenance(long montantContenanceId) {
        executor.execute(() -> montantContenanceDataSource.deleteMontantContenance(montantContenanceId));
    }

    // -------------
    // FOR MONTANT
    // -------------

    public LiveData<List<Montant>> getMontants() {
        return montantSource.getMontants();
    }
    public LiveData<List<Montant>> getMontant_ByDevise(int deviseId) {
        return montantSource.getMontant_ByDevise(deviseId);
    }
    public LiveData<List<Montant>> getMontant_ByType(int typemontantId) {
        return montantSource.getMontant_ByType(typemontantId);
    }
    public LiveData<List<Montant>> getMontant_ByTypeAndDevise(int deviseId, int typemontantId) {
        return montantSource.getMontant_ByTypeAndDevise(deviseId, typemontantId);
    }

    public void createMontant(Montant montant) {
        executor.execute(() -> montantSource.createMontant(montant));
    }

    public void updateMontant(Montant montant) {
        executor.execute(() -> montantSource.updateMontant(montant));
    }

    public void deleteMontant(long montantId) {
        executor.execute(() -> montantSource.deleteMontant(montantId));
    }
}
