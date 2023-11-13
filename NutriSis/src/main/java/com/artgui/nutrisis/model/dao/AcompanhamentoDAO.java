package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.Acompanhamento;
import java.util.List;

public class AcompanhamentoDAO extends Dao<Acompanhamento> {
    public AcompanhamentoDAO(){
    }

    @Override
    public Acompanhamento find(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Acompanhamento a = this.entityManager.find(Acompanhamento.class, id);
        this.entityManager.close();
        return a;        
    }
    
    @Override
    public List<Acompanhamento> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = " SELECT a FROM Acompanhamento a ";
        qry = this.entityManager.createQuery(jpql, Acompanhamento.class);
        List lst = qry.getResultList();
        this.entityManager.close();
        return lst;
    }
}
