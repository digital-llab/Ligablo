package com.llab.ligablo.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;

import com.llab.ligablo.models.users.AdminExtension;
import com.llab.ligablo.models.users.User;
import com.llab.ligablo.repositories.users.AdminExtensionDataRepository;
import com.llab.ligablo.repositories.users.UserDataRepository;

import java.util.List;
import java.util.concurrent.Executor;

public class UserViewModel extends ViewModel {

    // --- REPOSITORIES
    private final AdminExtensionDataRepository adminExtensionDataSource;
    private final UserDataRepository userDataSource;

    private final Executor executor;

    // DATA
    @Nullable
    private LiveData<User> currentUser;

    public UserViewModel(AdminExtensionDataRepository adminExtensionDataSource, UserDataRepository userDataSource, Executor executor) {
        this.adminExtensionDataSource = adminExtensionDataSource;
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

    public void createUser(User user) {
        executor.execute(() -> userDataSource.createUser(user));
    }

    public void updateUser(User user) {
        executor.execute(() -> userDataSource.updateUser(user));
    }

    public void deleteUser(long userId) {
        executor.execute(() -> userDataSource.deleteUser(userId));
    }

    // -------------
    // FOR ADMINEXTENSION
    // -------------

    public LiveData<List<AdminExtension>> getAdminExtension() {
        return this.adminExtensionDataSource.getAdminExtension();
    }

    public void createAdminExtension(AdminExtension adminExtension) {
        executor.execute(() -> adminExtensionDataSource.createAdminExtension(adminExtension));
    }

    public void updateAdminExtension(AdminExtension adminExtension) {
        executor.execute(() -> adminExtensionDataSource.updateAdminExtension(adminExtension));
    }

    public void deleteAdminExtension(long extensionId, long userId) {
        executor.execute(() -> adminExtensionDataSource.deleteAdminExtension(extensionId, userId));
    }
}
