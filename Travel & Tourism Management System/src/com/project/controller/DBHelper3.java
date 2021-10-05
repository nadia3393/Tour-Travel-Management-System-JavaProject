/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.controller;

import com.project.util.DBConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DBHelper3 {
   public static Connection con;
   public static Statement st;
   public static PreparedStatement ps;
   static{
        try {
            String sql = "select * from transport where code like ?";
            con = DBConnection.getConnection();
            st = con.createStatement();
            ps = con.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper3.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   public static ResultSet getData(String code) throws SQLException{
       ps.setString(1, "%"+code+"%");
       return ps.executeQuery();
   }
}
