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
import com.llab.ligablo.models.produits.MontantStock;
import com.llab.ligablo.models.produits.MontantType;
import com.llab.ligablo.models.produits.ProduitType;
import com.llab.ligablo.models.produits.Produits;
import com.llab.ligablo.models.produits.Stock;
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

    // -----------------
    // FOR MONTANTSTOCK
    // -----------------

    public LiveData<List<MontantStock>> getMontantStocks() {
        return montantStockDataSource.getMontantStocks();
    }

    public void createMontantStock(MontantStock montantStock) {
        executor.execute(() -> montantStockDataSource.createMontantStock(montantStock));
    }

    public void updateMontantStock(MontantStock montantStock) {
        executor.execute(() -> montantStockDataSource.updateMontantStock(montantStock));
    }

    public void deleteMontantStock(long montantStockId) {
        executor.execute(() -> montantStockDataSource.deleteMontantStock(montantStockId));
    }

    // ----------------
    // FOR MONTANTTYPE
    // ----------------

    public LiveData<List<MontantType>> getMontantType() {
        return montantTypeDataSource.getMontantType();
    }

    public void createMontantType(MontantType montantType) {
        executor.execute(() -> montantTypeDataSource.createMontantType(montantType));
    }

    public void updateMontantType(MontantType montantType) {
        executor.execute(() -> montantTypeDataSource.updateMontantType(montantType));
    }

    public void deleteMontantType(long montantTypeId) {
        executor.execute(() -> montantTypeDataSource.deleteMontantType(montantTypeId));
    }

    // -------------
    // FOR PRODUITS
    // -------------

    public LiveData<List<Produits>> getProduit() {
        return produitsDataSource.getProduits();
    }

    public LiveData<Produits> getProduitById(long produitId) {
        return produitsDataSource.getProduitById(produitId);
    }

    public LiveData<List<Produits>> getProduitByType(long typeId) {
        return produitsDataSource.getProduitByType(typeId);
    }

    public void createProduit(Produits produits) {
        executor.execute(() -> produitsDataSource.createProduit(produits));
    }

    public void updateProduit(Produits produits) {
        executor.execute(() -> produitsDataSource.updateProduit(produits));
    }

    public void deleteProduit(long produitId) {
        executor.execute(() -> produitsDataSource.deleteProduit(produitId));
    }

    // ----------------
    // FOR PRODUITTYPE
    // ----------------

    public LiveData<List<ProduitType>> getProduitType() {
        return produitTypeDataSource.getProduitType();
    }

    public void createProduitType(ProduitType produitType) {
        executor.execute(() -> produitTypeDataSource.createProduitType(produitType));
    }

    public void updateProduitType(ProduitType produitType) {
        executor.execute(() -> produitTypeDataSource.updateProduitType(produitType));
    }

    public void deleteProduitType(long produitTypeId) {
        executor.execute(() -> produitTypeDataSource.deleteProduitType(produitTypeId));
    }

    // ---------
    // FOR STOCK
    // ---------

    public LiveData<List<Stock>> getStocks() {
        return stockDataSource.getStocks();
    }

    public LiveData<List<Stock>> getStockInExtension(long extensionId) {
        return stockDataSource.getStockInExtension(extensionId);
    }

    public LiveData<List<Stock>> getStockInExtensionByProduct(long extensionId, long productId) {
        return stockDataSource.getStockInExtensionByProduct(extensionId, productId);
    }

    public LiveData<List<Stock>> getStockInExtensionByQuantite(long extensionId, long qteStock) {
        return stockDataSource.getStockInExtensionByQuantite(extensionId, qteStock);
    }

    public LiveData<List<Stock>> getStockInExtensionByQuantiteAndProduct(long extensionId,
                                                                         long qteStock,
                                                                         long productId) {
        return stockDataSource.getStockInExtensionByQuantiteAndProduct(extensionId, qteStock, productId);
    }

    public LiveData<List<Stock>> getStockInExtensionByDate(long extensionId, String date) {
        return stockDataSource.getStockInExtensionByDate(extensionId, date);
    }

    public LiveData<List<Stock>> getStockInExtensionBetweenTwoDate(long extensionId,
                                                                   String startDate,
                                                                   String endDate) {
        return stockDataSource.getStockInExtensionBetweenTwoDate(extensionId, startDate, endDate);
    }

    public void createStock(Stock stock) {
        executor.execute(() -> stockDataSource.createStock(stock));
    }

    public void updateStock(Stock stock) {
        executor.execute(() -> stockDataSource.updateStock(stock));
    }

    public void deleteStock(long stockId) {
        executor.execute(() -> stockDataSource.deleteStock(stockId));
    }
}
