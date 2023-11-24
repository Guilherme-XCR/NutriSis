package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.model.exceptions.RefeicaoException;
import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.Refeicao;
import java.util.List;

public class RefeicaoDAO extends Dao<Refeicao> {

    public RefeicaoDAO() {
    }

    @Override
    public boolean delete(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        Refeicao refeicao = this.entityManager.find(Refeicao.class, id);
        if (refeicao != null) {
            this.entityManager.remove(refeicao);
        } else {
            this.entityManager.getTransaction().rollback();
            throw new RefeicaoException("Error - Refeicao inexistente.");
        }
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        return true;
    }

    public Refeicao find(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Refeicao r = this.entityManager.find(Refeicao.class, id);
        this.entityManager.close();
        return r;
    }

    public List<Refeicao> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = " SELECT r FROM Refeicao r ";
        qry = this.entityManager.createQuery(jpql, Refeicao.class);
        List lst = qry.getResultList();
        this.entityManager.close();
        return lst;
    }

    public List<Refeicao> filterByName(String nome) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT r FROM Refeicao r WHERE r.nome like :nome";
        qry = super.entityManager.createQuery(jpql, Refeicao.class);
        qry.setParameter("nome", nome + "%");
        List<Refeicao> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }
}
