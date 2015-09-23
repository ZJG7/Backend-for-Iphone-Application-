package com.sportsapp.cfl.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {

    public Connection Get_Copnnection() throws Exception {
        try {

            String username = "username";
            String password = "password";
       
            String dbUrl = "url";
            return DriverManager.getConnection(dbUrl, username, password);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public DatabaseUtil() {
    }

}
