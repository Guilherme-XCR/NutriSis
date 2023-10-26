package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.interfaces.IDao;
import com.artgui.nutrisis.model.Refeicao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RefeicaoDAO implements IDao {
 
    private EntityManager entityManager;
    
    private Query qry;
    private String jpql;
    
    public RefeicaoDAO(){
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
        
        Refeicao refeicao = (Refeicao) obj;
        
        this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Refeicao WHERE id=:id ");
        qry.setParameter("id", refeicao.getId());
        qry.executeUpdate();
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public Object find(Object obj) {
        
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        Refeicao refeicao = (Refeicao) obj;
        
        Refeicao r = this.entityManager.find(Refeicao.class, refeicao.getId());
        
        this.entityManager.close();
        
        return r;

    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT r "
             + " FROM Refeicao r ";

        qry = this.entityManager.createQuery(jpql);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
    }
    
    public Object findById(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT r "
             + " FROM Refeicao r "
             + " WHERE r.id like :id ";
        qry = this.entityManager.createQuery(jpql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();

        this.entityManager.close();
        
        if (lst.isEmpty()) {
            return null;
        } else {
            return (Refeicao) lst.get(0);
        }                
    }
}
