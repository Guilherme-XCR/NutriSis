package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.model.exceptions.ClienteException;
import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.Cliente;
import java.util.List;

public class ClienteDAO extends Dao<Cliente> {
    
    public ClienteDAO(){
    }

    @Override
    public boolean delete(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        Cliente cliente = this.entityManager.find(Cliente.class, id);
        if (cliente != null) {
            this.entityManager.remove(cliente);
        } else {
            this.entityManager.getTransaction().rollback();
            throw new ClienteException("Error - Cliente inexistente.");
        }
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        return true;
    }
    
    @Override
    public Cliente find(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Cliente c = this.entityManager.find(Cliente.class, id);
        this.entityManager.close();
        return c;        
    }
    
    public List<Cliente> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = " SELECT c FROM Cliente c ";
        qry = this.entityManager.createQuery(jpql, Cliente.class);
        List lst = qry.getResultList();
        this.entityManager.close();
        return lst;
    }
    
    public List<Cliente> filterByName(String nome) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT c FROM Cliente c WHERE c.nome like :nome";
        qry = super.entityManager.createQuery(jpql, Cliente.class);
        qry.setParameter("nome", nome+"%");
        List<Cliente> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }
    
    public Cliente findByEmail(String email){
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT c FROM Cliente c WHERE c.email like :email";
        qry = super.entityManager.createQuery(jpql, Cliente.class);
        qry.setParameter("email", email);
        List<Cliente> lst = qry.getResultList();
        super.entityManager.close();
        if(!lst.isEmpty())
            return lst.get(0);
        return null;
    }
}