/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.Service;

import com.project.DAO.UserDAO;
import com.project.common.IUserDAO;
import com.project.common.IUserService;
import com.project.model.User;
import java.util.List;

/**
 *
 * @author USER
 */
public class UserService implements IUserService <User>{
 IUserDAO userDao = new UserDAO();

    @Override
    public int save(User t) {
        return userDao.save(t);
    }

    @Override
    public User getByID(String s) {
        return (User) userDao.getByID(s);
    }

    @Override
    public int update(User t) {
         return userDao.update(t);
    }

    

    

    

    
    

    
}
