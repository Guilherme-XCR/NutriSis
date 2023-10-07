package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.interfaces.IDao;
import com.artgui.nutrisis.model.Receita;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ReceitaDAO implements IDao{

    private EntityManager entityManager;
    
    private Query qry;
    private String jpql;
    
    public ReceitaDAO(){
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
        
        Receita receita = (Receita) obj;
        this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Receita WHERE id=:id ");
        qry.setParameter("id", receita.getId());
        qry.executeUpdate();
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public Object find(Object obj) {
        
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        Receita receita = (Receita) obj;
        
        Receita r = this.entityManager.find(Receita.class, receita.getId());
        
        this.entityManager.close();
        
        return r;

    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT r "
             + " FROM Receita r ";

        qry = this.entityManager.createQuery(jpql);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
    }
    
    public Object findById(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT r "
             + " FROM Receita r "
             + " WHERE r.id like :id ";
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

