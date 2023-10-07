package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.interfaces.IDao;
import com.artgui.nutrisis.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ClienteDAO implements IDao {
    
    private EntityManager entityManager;
    
    private Query qry;
    private String jpql;
    
    public ClienteDAO(){
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
        
        Cliente cliente = (Cliente) obj;
         this.entityManager.getTransaction().begin();
        qry = this.entityManager.createQuery("DELETE FROM Cliente WHERE id=:id ");
        qry.setParameter("id", cliente.getId());
        qry.executeUpdate();
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public Object find(Object obj) {
        
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        Cliente cliente = (Cliente) obj;
        
        Cliente c = this.entityManager.find(Cliente.class, cliente.getId());
        
        this.entityManager.close();
        
        return c;

    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT c "
             + " FROM Cliente c ";

        qry = this.entityManager.createQuery(jpql);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
    }
    
    public Object findByCpf(String cpf) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = " SELECT c "
             + " FROM Cliente c "
             + " WHERE c.cpf like :cpf ";
        qry = this.entityManager.createQuery(jpql);
        qry.setParameter("cpf", cpf);
        
        List lst = qry.getResultList();

        this.entityManager.close();
        
        if (lst.isEmpty()) {
            return null;
        } else {
            return (Cliente) lst.get(0);
        }                
    }
}