/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DAO;

import com.project.common.IUserDAO;
import com.project.model.User;
import com.project.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class UserDAO implements IUserDAO<User> {
Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        private User user;
    @Override
    public int save(User t) {
        
        
        try {
            String sql = "insert into users (code, name, user_name, password, gender, address, phone, email)values(?, ?, ?, ?, ?, ?, ?, ?)";
            con = DBConnection.getConnection();
            ps =con.prepareStatement(sql);
            
            ps.setString(1, t.getCode());
            ps.setString(2, t.getName());
            ps.setString(3, t.getUser_name());
            ps.setString(4, t.getPassword());
            ps.setString(5, t.getGender());
            ps.setString(6, t.getAddress());
            ps.setString(7, t.getPhone());
            ps.setString(8, t.getEmail());
            
            int status = ps.executeUpdate();
            con.close();
            return status;
            
        } catch (SQLException e) {
            return 0;
        }
        }

    @Override
    public User getByID(String s) {
          User user = new User();
          try {
            String sql = "select * from users where user_ id = ' " + s + " ' ";
          ps = DBConnection.getConnection().prepareStatement(sql);
          rs = ps.executeQuery(sql);
              if (rs.next()) {
                 user.setCode(rs.getString("code"));
                 user.setName(rs.getString("name"));
                 user.setUser_name(rs.getString("user_name"));
                 user.setPassword(rs.getString("password"));
                 user.setGender(rs.getString("gender"));
              } else {
                  JOptionPane.showMessageDialog(null, "data not found by search text");
              }
              ps.close();
              rs.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
          return user;
    }

    @Override
    public int update(User t) {
               try {
            String sql = "update users set code = ?, name= ?, user_name = ?, password = ?, gender = ?";
            con = DBConnection.getConnection();
            ps =con.prepareStatement(sql);
            
            ps.setString(1, t.getCode());
            ps.setString(2, t.getName());
            ps.setString(3, t.getUser_name());
            ps.setString(4, t.getPassword());
            ps.setString(5, t.getGender());
            
            int status = ps.executeUpdate();
                   if (status == 1) {
                       JOptionPane.showMessageDialog(null, "Updatation Successfully.");
                   }
            con.close();
            return status;
            
        } catch (SQLException e) {
            return 0;
        } 
    }

   
  
}
