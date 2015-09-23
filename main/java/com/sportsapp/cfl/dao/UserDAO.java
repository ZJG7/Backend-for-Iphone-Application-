package com.sportsapp.cfl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sportsapp.cfl.dto.Appuser;

public class UserDAO {

    public UserDAO() {

    }

    public static Appuser getUserByName(String userName) {
        String usersql = "select * from user where username = '" + userName
                + "'";
        Connection conn = null;
        Statement stmt = null;
        Appuser curUser = new Appuser();
        try {
            conn = new DatabaseUtil().Get_Connection();
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(usersql);
            while (result.next()) {
                curUser.setUserName(result.getString("username"));
                curUser.setEmail(result.getString("email"));
                curUser.setPhoneNumber(result.getString("phoneNum"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return curUser;
    }

    public static Appuser verifyUser(String userName, String Password) {
        String usersql = "select * from user where username = '" + userName
                + "' && password = '" + Password + "'";
        Connection conn = null;
        Statement stmt = null;
        Appuser curUser = new Appuser();
        try {
            conn = new DatabaseUtil().Get_Connection();
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(usersql);
            while (result.next()) {
                curUser.setUserName(result.getString("username"));
                curUser.setEmail(result.getString("email"));
                curUser.setPhoneNumber(result.getString("phoneNum"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return curUser;
    }

  }
