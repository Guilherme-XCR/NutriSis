package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.Consulta;
import com.artgui.nutrisis.model.Nutricionista;
import java.util.List;

public class ConsultaDAO extends Dao<Consulta> {

    public ConsultaDAO() {
    }

    public Consulta find(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Consulta c = this.entityManager.find(Consulta.class, id);
        this.entityManager.close();
        return c;
    }

    public List<Consulta> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = " SELECT c FROM Consulta c  ";
        qry = this.entityManager.createQuery(jpql, Consulta.class);
        List lst = qry.getResultList();
        this.entityManager.close();
        return lst;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Consulta> filterByClienteAndData(Cliente cliente, String data) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT c FROM Consulta c WHERE c.data like :data AND c.cliente.id like :clienteId";
        qry = super.entityManager.createQuery(jpql, Consulta.class);
        qry.setParameter("data", data + "%");
        qry.setParameter("clienteId", cliente.getId());
        List<Consulta> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }

    public List<Consulta> filterByCliente(Cliente cliente) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT c FROM Consulta c WHERE c.cliente.id like :clienteId";
        qry = super.entityManager.createQuery(jpql, Consulta.class);
        qry.setParameter("clienteId", cliente.getId());
        List<Consulta> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }

    public List<Consulta> filterByNutricionistaAndData(Nutricionista nutricionista, String data) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT c FROM Consulta c WHERE c.data like :data AND c.nutricionista.id like :nutricionistaId";
        qry = super.entityManager.createQuery(jpql, Consulta.class);
        qry.setParameter("data", data + "%");
        qry.setParameter("nutricionistaId", nutricionista.getId());
        List<Consulta> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }

    public List<Consulta> filterByNutricionista(Nutricionista nutricionista) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT c FROM Consulta c WHERE c.nutricionista.id like :nutricionistaId";
        qry = super.entityManager.createQuery(jpql, Consulta.class);
        qry.setParameter("nutricionistaId", nutricionista.getId());
        List<Consulta> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }

}
