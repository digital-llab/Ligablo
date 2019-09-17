package com.llab.ligablo.users;

import android.arch.core.executor.testing.InstantTaskExecutorRule;
import android.arch.persistence.room.Room;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.llab.ligablo.LiveDataTestUtil;
import com.llab.ligablo.database.LigabloDatabase;
import com.llab.ligablo.models.produits.ProduitType;
import com.llab.ligablo.models.produits.Produits;
import com.llab.ligablo.models.users.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

@RunWith(AndroidJUnit4.class)
public class UserDaoTest {

    // FOR DATA
    private LigabloDatabase database;

    private static long USER_ID = 1;
    private static User USER_DEMO = new User(USER_ID, "Alain", "alain.mk@example.com", "0812874638", USER_ID);
    private static ProduitType ALIMENTAIRE_TYPE = new ProduitType("Alimentaire");
    private static Produits TELEVISION_PRODUIT = new Produits("Samsung Ecran plat", 0);
    private static Produits DECODEUR_CANAL_PLUS = new Produits("Canal+ France de Foot", 0);
    private static Produits FRIGO_BEKO_TSE = new Produits("Frigo marque Beko Tse 500 littres", 0);

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Before
    public void initDb() throws Exception {
        this.database = Room.inMemoryDatabaseBuilder(InstrumentationRegistry.getContext(),
                LigabloDatabase.class)
                .allowMainThreadQueries()
                .build();
    }

    @After
    public void closeDb() throws Exception {
        database.close();
    }

    @Test
    public void insertAndGetUser() throws InterruptedException {
        // BEFORE : Adding a new user
        this.database.userDao().inserUser(USER_DEMO);
        // TEST
        User user = LiveDataTestUtil.getValue(this.database.userDao().getUser(USER_DEMO.getId()));
        assertTrue(user.getNom().equals(USER_DEMO.getNom()) && user.getId() == USER_DEMO.getId());
    }

    @Test
    public void getProductsWhenNoProductInserted() throws InterruptedException {
        // TEST
        List<Produits> items = LiveDataTestUtil.getValue(this.database.produitsDao().getProduits());
        assertTrue(items.isEmpty());
    }

    @Test
    public void insertAndGetItems() throws InterruptedException {
        // BEFORE : Adding demo user & demo items

        this.database.userDao().inserUser(USER_DEMO);
        this.database.produitTypeDao().insertProduitType(ALIMENTAIRE_TYPE);
        this.database.produitsDao().insertProduit(TELEVISION_PRODUIT);
        this.database.produitsDao().insertProduit(DECODEUR_CANAL_PLUS);
        this.database.produitsDao().insertProduit(FRIGO_BEKO_TSE);

        // TEST
        List<Produits> items = LiveDataTestUtil.getValue(this.database.produitsDao().getProduits());
        assertTrue(items.size() == 3);
    }

    @Test
    public void insertAndUpdateItem() throws InterruptedException {
        // BEFORE : Adding demo user & demo items. Next, update item added & re-save it
        this.database.userDao().inserUser(USER_DEMO);
        this.database.produitTypeDao().insertProduitType(ALIMENTAIRE_TYPE);
        this.database.produitsDao().insertProduit(TELEVISION_PRODUIT);
        Produits produitAdded = LiveDataTestUtil.getValue(this.database.produitsDao().getProduits()).get(0);
        produitAdded.setNom("LG de la marque de lux");
        this.database.produitsDao().updateProduit(produitAdded);


        //TEST
        List<Produits> items = LiveDataTestUtil.getValue(this.database.produitsDao().getProduits());
        assertTrue(items.size() == 1);
    }

    @Test
    public void insertAndDeleteItem() throws InterruptedException {
        // BEFORE : Adding demo user & demo item. Next, get the item added & delete it.
        this.database.userDao().inserUser(USER_DEMO);
        this.database.produitTypeDao().insertProduitType(ALIMENTAIRE_TYPE);
        this.database.produitsDao().insertProduit(TELEVISION_PRODUIT);
        Produits itemAdded = LiveDataTestUtil.getValue(this.database.produitsDao().getProduits()).get(0);
        this.database.produitsDao().deleteproduit(itemAdded.getId());

        //TEST
        List<Produits> items = LiveDataTestUtil.getValue(this.database.produitsDao().getProduits());
        assertTrue(items.isEmpty());
    }

}
