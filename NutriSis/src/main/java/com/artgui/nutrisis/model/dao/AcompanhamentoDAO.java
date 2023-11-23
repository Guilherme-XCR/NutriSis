package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.model.exceptions.AcompanhamentoException;
import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.Acompanhamento;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.Nutricionista;
import java.util.List;

public class AcompanhamentoDAO extends Dao<Acompanhamento> {
    public AcompanhamentoDAO(){
    }

    @Override
    public boolean delete(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();

        Acompanhamento acompanhamento = this.entityManager.find(Acompanhamento.class, id);
        if (acompanhamento != null) {
            this.entityManager.remove(acompanhamento);
        } else {
            this.entityManager.getTransaction().rollback();
            throw new AcompanhamentoException("Error - Acompanhamento inexistente.");
        }

        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        return true;
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
    
    public List<Acompanhamento> filterByCliente(Cliente cliente) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT a FROM Acompanhamento a WHERE a.cliente.id like :clienteId";
        qry = super.entityManager.createQuery(jpql, Acompanhamento.class);
        qry.setParameter("clienteId", cliente.getId());

        List<Acompanhamento> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }
    
    public List<Acompanhamento> filterByNutricionista(Nutricionista nutricionista) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT a FROM Acompanhamento a WHERE a.nutricionista.id like :nutricionistaId";
        qry = super.entityManager.createQuery(jpql, Acompanhamento.class);
        qry.setParameter("nutricionistaId", nutricionista.getId());

        List<Acompanhamento> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }
}
