/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.common;

import com.project.model.User;
import java.util.List;

/**
 *
 * @author user2 * @param <User>
 */
public interface IUserDAO<T> {
   public int save (T t);
   public T getByID (String s);
   public int update (T t);
}
