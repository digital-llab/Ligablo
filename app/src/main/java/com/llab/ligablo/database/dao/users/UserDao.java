package com.llab.ligablo.database.dao.users;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import com.llab.ligablo.models.users.User;
import java.util.List;

@Dao
public interface UserDao {
    LiveData<List<User>> getUsers();
    int inserUser(User user);
    int updateUser(User user);
    int deleteUser(int userId);
}
