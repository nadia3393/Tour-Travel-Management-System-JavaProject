/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.DAO;

import com.project.common.ICommonDAO;
import com.project.model.Admin;
import com.project.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author user2
 */
public class AdminDAO implements ICommonDAO<Admin> {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public int save(Admin t) {
        try {
            String sql = "insert into admin (admin_name, admin_email, admin_password) values (?,?,?)";
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getAdmin_name());
            ps.setString(2, t.getAdmin_email());
            ps.setString(3, t.getAdmin_password());
            
            int status = ps.executeUpdate();
            con.close();
            return status;
            
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Admin getByID(int Nid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Admin t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int Nid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Admin> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int signin(String adminEmail, String password) {
        int flag = -1;
        try {
            String sql = "select * from admin where admin_email = ? and admin_password = ?";
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, adminEmail);
            ps.setString(2, password);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                flag = 1; 
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return flag;
    }

}
