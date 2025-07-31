package com.facundowehrli.login.logic;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Rol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String rolName;
    private String description;
    @OneToMany(mappedBy = "aRol")
    private List<User> usersList;

    public Rol() {
    }

    public Rol(int id, String rolName, String description, List<User> usersList) {
        this.id = id;
        this.rolName = rolName;
        this.description = description;
        this.usersList = usersList;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public Rol(int id, String rolName, String description) {
        this.id = id;
        this.rolName = rolName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
