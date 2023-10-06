package com.artgui.nutrisis.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseJPA {
    
    private static DatabaseJPA INSTANCE = null;

    private EntityManagerFactory factory;

    public static DatabaseJPA getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseJPA();
        }
        return INSTANCE;
    }

    private DatabaseJPA() {
        factory = Persistence.createEntityManagerFactory("NutriSis-PU");        
    }
    
    public EntityManager getEntityManager() {        
        return factory.createEntityManager();
    }
    
    public void closeFactory(){
        this.factory.close();
    }
}
