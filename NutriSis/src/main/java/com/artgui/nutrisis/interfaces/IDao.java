package com.artgui.nutrisis.interfaces;

import java.util.List;

public interface IDao<T> {
    // C - create
    void save(T obj);
    
    // R - read
    T find(int id);        
    List<T> findAll();
    
    // U - update
    void update(T obj);
    
    // D - delete
    boolean delete(T obj);           
    
    
}
