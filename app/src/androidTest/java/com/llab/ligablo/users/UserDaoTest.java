package com.llab.ligablo.users;

import android.arch.core.executor.testing.InstantTaskExecutorRule;
import android.arch.persistence.room.Room;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.llab.ligablo.LiveDataTestUtil;
import com.llab.ligablo.database.LigabloDatabase;
import com.llab.ligablo.models.users.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertTrue;

@RunWith(AndroidJUnit4.class)
public class UserDaoTest {

    // FOR DATA
    private LigabloDatabase database;

    private static int USER_ID = 1;
    private static User USER_DEMO = new User(USER_ID, "Alain", "alain.mk@example.com", "0812874638", USER_ID);

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
}
