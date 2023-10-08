package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.interfaces.IDao;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.Ingrediente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class IngredienteDAO implements IDao{

    private EntityManager entityManager;
    
    private Query qry;
    private String jpql;
    
    public IngredienteDAO(){
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
        
        Ingrediente ingrediente = (Ingrediente) obj;

        this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Ingrediente WHERE id=:id ");
        qry.setParameter("id", ingrediente.getId());
        qry.executeUpdate();
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public Object find(Object obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        Ingrediente ingrediente = (Ingrediente) obj;
        
        Ingrediente i = this.entityManager.find(Ingrediente.class, ingrediente.getId());
        
        this.entityManager.close();
        
        return i;
    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT i "
             + " FROM Ingrediente i ";

        qry = this.entityManager.createQuery(jpql);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
    }
}