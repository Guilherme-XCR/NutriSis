package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.interfaces.IDao;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public abstract class Dao<T> implements IDao<T> {

    protected EntityManager entityManager;
    protected TypedQuery<T> qry;
    protected String jpql;

    public Dao() {
    }

    @Override
    public void save(T obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(obj);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public void update(T obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(obj);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public boolean delete(T obj) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();

        if (!this.entityManager.contains(obj)) {
            obj = this.entityManager.merge(obj); // Se não estiver gerenciado, faça um merge.
        }

        this.entityManager.remove(obj);

        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        return true;
    }
}
