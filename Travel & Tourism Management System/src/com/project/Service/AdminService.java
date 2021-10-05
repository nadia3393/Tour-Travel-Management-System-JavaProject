/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Service;

import com.project.DAO.AdminDAO;
import com.project.common.ICommonDAO;
import com.project.common.ICommonService;
import com.project.model.Admin;
import java.util.List;

/**
 *
 * @author user2
 */
public class AdminService implements ICommonService <Admin>{
ICommonDAO admin_DAO = new AdminDAO();
    @Override
    public int save(Admin t) {
       return admin_DAO.save(t);
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
       return admin_DAO.signin(adminEmail, password);
    }
    
}
