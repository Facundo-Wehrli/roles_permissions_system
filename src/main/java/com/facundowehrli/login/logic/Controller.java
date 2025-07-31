package com.facundowehrli.login.logic;

import com.facundowehrli.login.persistence.PersistenceController;
import java.util.List;

public class Controller {

    //instance of PersistenceController class
    PersistenceController controlPersis = new PersistenceController();

    //method created in gui to validate user input
    public String validateUser(String user, String password) {
        String message = "";
        //create a list to store users objects to iterate them later for data validation
        List<User> usersList = controlPersis.getUsers();
        //iterate through users
        for (User usu : usersList) {
            //username validation if credentials are good show a welcome message if not show error message
            if (usu.getUserName().equals(user)) {
                if (usu.getPassword().equals(password)) {
                    return "User and password valid. Werlcome!";
                } else {
                    return "Error! incorrect password";
                }
            } else {
                message = "Error! user not found";
            }

        }
        return message;
    }
}
