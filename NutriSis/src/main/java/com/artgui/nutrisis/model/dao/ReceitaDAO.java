package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.Receita;
import java.util.List;

 public class ReceitaDAO extends Dao<Receita> {
    
    public ReceitaDAO(){
    }

    public Receita find(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Receita r = this.entityManager.find(Receita.class, id);
        this.entityManager.close();
        return r;        
    }
    
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
        qry.setParameter("nome", nome);
        List<Receita> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }
}