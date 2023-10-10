package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.interfaces.IDao;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.Nutricionista;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class NutricionistaDAO implements IDao{
 
    private EntityManager entityManager;
    
    private Query qry;
    private String jpql;
    
    public NutricionistaDAO(){
    }
    
    @Override
    public void save(Object obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        this.entityManager.getTransaction().begin();       
        this.entityManager.persist(obj);                    
        this.entityManager.getTransaction().commit();        
        
        this.entityManager.close();
    }

    @Override
    public void update(Object obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        this.entityManager.getTransaction().begin();       
        this.entityManager.merge(obj);                    
        this.entityManager.getTransaction().commit();     
        
        this.entityManager.close();
    }

    @Override
    public void delete(Object obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        Nutricionista nutricionista = (Nutricionista) obj;
        
        this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Nutricionista WHERE id=:id ");
        qry.setParameter("id", nutricionista.getId());
        qry.executeUpdate();
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public Object find(Object obj) {
        
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
       
        Nutricionista nutricionista = (Nutricionista) obj;
        
        Nutricionista n = this.entityManager.find(Nutricionista.class, nutricionista.getId());
        
        this.entityManager.close();
        
        return n;

    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT n "
             + " FROM Nutricionista n ";

        qry = this.entityManager.createQuery(jpql);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
    }
}