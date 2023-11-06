package com.artgui.nutrisis.model.dao;

import com.artgui.nutrisis.factory.DatabaseJPA;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.Consulta;
import java.util.List;

public class ConsultaDAO extends Dao<Consulta> {
    
    public ConsultaDAO(){
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
    
    public List<Consulta> filterByData(String data) {
        super.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = "SELECT c FROM Consulta c WHERE c.data like :data";
        qry = super.entityManager.createQuery(jpql, Consulta.class);
        qry.setParameter("data", data+"%");
        List<Consulta> lst = qry.getResultList();
        super.entityManager.close();
        return lst;
    }
 
}