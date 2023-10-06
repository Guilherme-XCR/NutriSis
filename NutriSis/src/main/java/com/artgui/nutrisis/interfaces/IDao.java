package com.artgui.nutrisis.interfaces;

import java.util.List;

public interface IDao {
    public void save(Object obj);
    
    public void update(Object obj);
    
    public void delete(Object obj);
            
    public Object find(Object obj);
        
    public List<Object> findAll();
}
