/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.common;

import com.project.model.Admin;
import java.util.List;

/**
 *
 * @author user2

 */
public interface ICommonService <T>{
    public int save(T t);
    public T getByID(int Nid);
    public int update(T t);
    public int delete(int Nid);
    public List<T> getAll();
    public int signin(String adminEmail, String password);
}
