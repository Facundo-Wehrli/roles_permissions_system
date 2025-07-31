package com.facundowehrli.login.logic;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;

    @ManyToOne
    @JoinColumn(name = "fk_rol")
    private Rol aRol;

    public User() {
    }

    public User(int id, String userName, String password, Rol aRol) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.aRol = aRol;
    }

    public Rol getaRol() {
        return aRol;
    }

    public void setaRol(Rol aRol) {
        this.aRol = aRol;
    }

    public User(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
