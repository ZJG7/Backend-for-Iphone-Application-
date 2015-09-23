package com.sportsapp.cfl.dto;

import java.io.Serializable;

public class Appuser implements Serializable {
    private String userName;
    private String password;
    private String phoneNumber;
    private String email;

    public Appuser() {

    }

    public Appuser(String userName, String password, String phoneNumber,
            String email) {
        super();
        System.out.println(userName);
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}