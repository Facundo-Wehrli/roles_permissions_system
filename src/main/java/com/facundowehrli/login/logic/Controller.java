package com.facundowehrli.login.logic;

import com.facundowehrli.login.persistence.PersistenceController;
import java.util.List;

public class Controller {

    PersistenceController controlPersis = new PersistenceController();

    public String validateUser(String user, String password) {
        String message = "";
        List<User> usersList = controlPersis.getUsers();
        for (User usu : usersList) {
            if (usu.getUserName().equals(user)) {
                if (usu.getPassword().equals(password)) {
                    message = "User and password valid. Werlcome!";
                } else {
                    message = "Error! incorrect password";
                }
            } else {
                message = "Error! user not found";
            }

        }
        return message;
    }
}
