package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.model.exceptions.IngredienteException;
import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.Ingrediente;
import java.util.List;

 public class IngredienteDAO extends Dao<Ingrediente> {
    
    public IngredienteDAO(){
    }
    
    @Override
    public boolean delete(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        Ingrediente ingrediente = this.entityManager.find(Ingrediente.class, id);
        if (ingrediente != null) {
            this.entityManager.remove(ingrediente);
        } else {
            this.entityManager.getTransaction().rollback();
            throw new IngredienteException("Error - Ingrediente inexistente.");
        }
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        return true;
    }

    public Ingrediente find(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Ingrediente i = this.entityManager.find(Ingrediente.class, id);
        this.entityManager.close();
        return i;        
    }
    
    public List<Ingrediente> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = " SELECT i FROM Ingrediente i ";
        qry = this.entityManager.createQuery(jpql, Ingrediente.class);
        List lst = qry.getResultList();
        this.entityManager.close();
        return lst;
    }
    
    public List<Ingrediente> filterByName(String nome) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT i FROM Ingrediente i WHERE i.nome like :nome";
        qry = super.entityManager.createQuery(jpql, Ingrediente.class);
        qry.setParameter("nome", nome+"%");
        List<Ingrediente> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }
}