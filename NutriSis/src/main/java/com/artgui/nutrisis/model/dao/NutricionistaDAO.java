package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.model.exceptions.NutricionistaException;
import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.Nutricionista;
import java.util.List;

public class NutricionistaDAO extends Dao<Nutricionista> {

    public NutricionistaDAO() {
    }

    @Override
    public boolean delete(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        Nutricionista nutricionista = this.entityManager.find(Nutricionista.class, id);
        if (nutricionista != null) {
            this.entityManager.remove(nutricionista);
        } else {
            this.entityManager.getTransaction().rollback();
            throw new NutricionistaException("Error - Nutricionista inexistente.");
        }
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        return true;
    }

    public Nutricionista find(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Nutricionista r = this.entityManager.find(Nutricionista.class, id);
        this.entityManager.close();
        return r;
    }

    public List<Nutricionista> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = " SELECT n FROM Nutricionista n ";
        qry = this.entityManager.createQuery(jpql, Nutricionista.class);
        List lst = qry.getResultList();
        this.entityManager.close();
        return lst;
    }

    public List<Nutricionista> filterByName(String nome) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT n FROM Nutricionista n WHERE n.nome like :nome";
        qry = super.entityManager.createQuery(jpql, Nutricionista.class);
        qry.setParameter("nome", nome + "%");
        List<Nutricionista> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }

    public Nutricionista findByEmail(String email) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT n FROM Nutricionista n WHERE n.email like :email";
        qry = super.entityManager.createQuery(jpql, Nutricionista.class);
        qry.setParameter("email", email);
        List<Nutricionista> lst = qry.getResultList();
        super.entityManager.close();
        if (!lst.isEmpty()) {
            return lst.get(0);
        }
        return null;
    }
}
