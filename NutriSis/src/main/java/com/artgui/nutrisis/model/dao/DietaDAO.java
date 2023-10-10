 package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.interfaces.IDao;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Receita;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class DietaDAO implements IDao{

    private EntityManager entityManager;
    
    private Query qry;
    private String jpql;
    
    public DietaDAO(){
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
        
        Dieta d = (Dieta) obj;
        
        this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Dieta WHERE id=:id ");
        qry.setParameter("id", d.getId());
        qry.executeUpdate();
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public Object find(Object obj) {
        
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        Dieta dieta = (Dieta) obj;
        
        Dieta d = this.entityManager.find(Dieta.class, dieta.getId());
        
        this.entityManager.close();
        
        return d;

    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT d "
             + " FROM Dieta d ";

        qry = this.entityManager.createQuery(jpql);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
    }
    
    public Object findById(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT d "
             + " FROM Dieta d "
             + " WHERE d.id like :id ";
        qry = this.entityManager.createQuery(jpql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();

        this.entityManager.close();
        
        if (lst.isEmpty()) {
            return null;
        } else {
            return (Receita) lst.get(0);
        }                
    }
}

