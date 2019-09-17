package com.llab.ligablo.repositories.users;

import android.arch.lifecycle.LiveData;

import com.llab.ligablo.database.dao.users.UserDao;
import com.llab.ligablo.models.users.User;

import java.util.List;

public class UserDataRepository {

    private final UserDao userDao;

    public UserDataRepository(UserDao userDao) {
        this.userDao = userDao;
    }

    // --- GET ---
    // Get list of users
    public LiveData<List<User>> getUsers() {
        return this.userDao.getUsers();
    }

    public LiveData<User> getUser(long userId) {
        return this.userDao.getUser(userId);
    }

    // --- CREATE ---

    public void createUser(User user) {
        userDao.inserUser(user);
    }

    // --- UPDATE ---

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    // --- DELETE ---

    public void deleteUser(long userId) {
        userDao.deleteUser(userId);
    }
}
