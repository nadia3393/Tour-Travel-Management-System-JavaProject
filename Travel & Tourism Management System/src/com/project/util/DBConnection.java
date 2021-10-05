/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user2
 */
public class DBConnection {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/travel", "root", "root");
        } catch (Exception e) {
            return null;
        }
    }
}
