 package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.model.exceptions.DietaException;
import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.Dieta;
import java.util.List;

 public class DietaDAO extends Dao<Dieta> {
    
    public DietaDAO(){
    }

    @Override
    public boolean delete(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();

        Dieta dieta = this.entityManager.find(Dieta.class, id);
        if (dieta != null) {
            this.entityManager.remove(dieta);
        } else {
            this.entityManager.getTransaction().rollback();
            throw new DietaException("Error - Dieta inexistente.");
        }

        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        return true;
    }
    
    public Dieta find(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Dieta d = this.entityManager.find(Dieta.class, id);
        this.entityManager.close();
        return d;        
    }
    
    public List<Dieta> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = " SELECT d FROM Dieta d ";
        qry = this.entityManager.createQuery(jpql, Dieta.class);
        List lst = qry.getResultList();
        this.entityManager.close();
        return lst;
    }
    
    public List<Dieta> filterByName(String nome) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT d FROM Dieta d WHERE d.nome like :nome";
        qry = super.entityManager.createQuery(jpql, Dieta.class);
        qry.setParameter("nome", nome+"%");
        List<Dieta> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }
}