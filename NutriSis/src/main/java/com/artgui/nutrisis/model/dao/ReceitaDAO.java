package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.model.exceptions.ReceitaException;
import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.Receita;
import java.util.List;

 public class ReceitaDAO extends Dao<Receita> {
    
    public ReceitaDAO(){
    }
    
     @Override
     public boolean delete(int id) {
         this.entityManager = DatabaseJPA.getInstance().getEntityManager();
         this.entityManager.getTransaction().begin();

         Receita receita = this.entityManager.find(Receita.class, id);
         if (receita != null) {
             this.entityManager.remove(receita);
         } else {
             this.entityManager.getTransaction().rollback();
             throw new ReceitaException("Error - Receita inexistente.");
         }

         this.entityManager.getTransaction().commit();
         this.entityManager.close();
         return true;
     }
    
    @Override
    public Receita find(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Receita r = this.entityManager.find(Receita.class, id);
        this.entityManager.close();
        return r;        
    }
    
    @Override
    public List<Receita> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = " SELECT r FROM Receita r ";
        qry = this.entityManager.createQuery(jpql, Receita.class);
        List lst = qry.getResultList();
        this.entityManager.close();
        return lst;
    }
    
    public List<Receita> filterByName(String nome) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT r FROM Receita r WHERE r.nome like :nome";
        qry = super.entityManager.createQuery(jpql, Receita.class);
        qry.setParameter("nome", nome+"%");
        List<Receita> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }
}