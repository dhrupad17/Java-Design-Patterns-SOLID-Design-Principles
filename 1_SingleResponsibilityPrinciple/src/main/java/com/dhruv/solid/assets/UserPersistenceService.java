package com.dhruv.solid.assets;

import com.dhruv.solid.Store;
import com.dhruv.solid.User;

public class UserPersistenceService {

    private Store store=new Store();

    public void saveUser(User user){
        store.store(user);
    }
}
