package com.facundowehrli.login.persistence;

import com.facundowehrli.login.logic.User;
import java.util.List;

public class PersistenceController {

    UserJpaController userJpa = new UserJpaController();
    RolJpaController rolJpa = new RolJpaController();   

    public List<User> getUsers() {
        //SELECT * FROM USERS
        return userJpa.findUserEntities();

    }
}
