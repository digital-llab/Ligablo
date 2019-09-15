package com.llab.ligablo.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.llab.ligablo.database.dao.etabs.AdresseDao;
import com.llab.ligablo.database.dao.etabs.EtablissementDao;
import com.llab.ligablo.database.dao.etabs.EtsTypeDao;
import com.llab.ligablo.database.dao.etabs.ExtensionDao;
import com.llab.ligablo.database.dao.produits.ContenantDao;
import com.llab.ligablo.database.dao.produits.DimensionDao;
import com.llab.ligablo.database.dao.produits.MontantContenanceDao;
import com.llab.ligablo.database.dao.produits.MontantDao;
import com.llab.ligablo.database.dao.produits.MontantStockDao;
import com.llab.ligablo.database.dao.produits.MontantTypeDao;
import com.llab.ligablo.database.dao.produits.ProduitTypeDao;
import com.llab.ligablo.database.dao.produits.ProduitsDao;
import com.llab.ligablo.database.dao.produits.StockDao;
import com.llab.ligablo.database.dao.users.AdminExtensionDao;
import com.llab.ligablo.database.dao.users.UserDao;
import com.llab.ligablo.models.etab.Adresse;
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
import com.llab.ligablo.models.users.AdminExtension;
import com.llab.ligablo.models.users.User;
import com.llab.ligablo.models.vente.Devise;
import com.llab.ligablo.models.vente.LigneVente;
import com.llab.ligablo.models.vente.Moyen;
import com.llab.ligablo.models.vente.MoyenPaiement;
import com.llab.ligablo.models.vente.Paiement;
import com.llab.ligablo.models.vente.PaiementType;
import com.llab.ligablo.models.vente.Taux;
import com.llab.ligablo.models.vente.Vente;

@Database(entities = {Adresse.class, Etablissement.class, EtsType.class, Extension.class, Contenant.class, Dimension.class,
                      Montant.class, MontantContenance.class, MontantStock.class, MontantType.class, Produits.class, ProduitType.class,
                      Stock.class, AdminExtension.class, User.class, Devise.class, LigneVente.class, Moyen.class, MoyenPaiement.class,
                      Paiement.class, PaiementType.class, Taux.class, Vente.class}, version = 1, exportSchema = false)
public abstract class LigabloDatabase extends RoomDatabase {

    // --- SINGLETON --- //
    private static volatile LigabloDatabase INSTANCE;

    // --- DAO --- //

    //FROM PRODUCT by Alain
    public abstract ProduitsDao produitsDao();
    public abstract StockDao stockDao();
    public abstract MontantDao montantDao();
    public abstract ContenantDao contenantDao();
    public abstract DimensionDao dimensionDao();
    public abstract MontantStockDao montantStockDao();
    public abstract MontantTypeDao montantTypeDao();
    public abstract ProduitTypeDao produitTypeDao();
    public abstract MontantContenanceDao montantContenanceDao();

    //FROM USERS by Tadiumi
    public abstract UserDao userDao();
    public abstract AdminExtensionDao  adminExtensionDao();

    //FROM ETABS by Tadiumi
    public abstract AdresseDao adresseDao();
    public abstract EtablissementDao etablissementDao();
    public abstract EtsTypeDao etsTypeDao();
    public abstract ExtensionDao extensionDao();

/*    //FROM VENTE by Tadiumi
    public abstract DeviseDao deviseDao();
    public abstract LigneVenteDao ligneVenteDao();
    public abstract MoyenDao moyenDao();
    public abstract MoyenPayementDao moyenPayementDao();
    public abstract PaiementDao paiementDao();
    public abstract PaiementTypeDao paiementTypeDao();
    public abstract TauxDao  tauxDao();
    public abstract VenteDao venteDao();*/

    // --- INSTANCE --- //
    public static LigabloDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (LigabloDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            LigabloDatabase.class, "MyDatabase.db")
                            .build();
                }
            }
        }

        return INSTANCE;
    }
}
