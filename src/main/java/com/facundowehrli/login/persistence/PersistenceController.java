package com.facundowehrli.login.persistence;

import com.facundowehrli.login.logic.User;
import java.util.List;

public class PersistenceController {

    UserJpaController userJpa = new UserJpaController();

    public List<User> getUsers() {
        //SELECT * FROM USERS
        return userJpa.findUserEntities();
        
    }
}
