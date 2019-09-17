package com.llab.ligablo.database.dao.users;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.llab.ligablo.models.users.User;
import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT * FROM User")
    LiveData<List<User>> getUsers();

    @Query("SELECT * FROM User WHERE id=:userId")
    LiveData<User> getUser(long userId);

    @Query("SELECT * FROM User WHERE managerId =:managerId ORDER BY id DESC")
    LiveData<List<User>> getUsersByManager(long managerId);

    @Insert
    long inserUser(User user);

    @Update
    int updateUser(User user);

    @Query("DELETE FROM User WHERE id = :userId")
    int deleteUser(long userId);
}
