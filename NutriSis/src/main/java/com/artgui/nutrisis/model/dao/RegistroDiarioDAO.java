package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.RegistroDiario;
import com.artgui.nutrisis.model.exceptions.RegistroDiarioException;
import java.util.List;

public class RegistroDiarioDAO extends Dao<RegistroDiario> {
    public RegistroDiarioDAO(){
    }
    
  @Override
    public boolean delete(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();

        RegistroDiario registroDiario = this.entityManager.find(RegistroDiario.class, id);
        if (registroDiario != null) {
            this.entityManager.remove(registroDiario);
        } else {
            this.entityManager.getTransaction().rollback();
            throw new RegistroDiarioException("Error - Registro Diario inexistente.");
        }

        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        return true;
    }

    
    @Override
    public RegistroDiario find(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        RegistroDiario rd = this.entityManager.find(RegistroDiario.class, id);
        this.entityManager.close();
        return rd;        
    }
    
    @Override
    public List<RegistroDiario> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = " SELECT rd FROM RegistroDiario rd ";
        qry = this.entityManager.createQuery(jpql, RegistroDiario.class);
        List lst = qry.getResultList();
        this.entityManager.close();
        return lst;
    }
}