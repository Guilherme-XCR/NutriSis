package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewConsulta;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.Consulta;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.dao.ConsultaDAO;
import com.artgui.nutrisis.model.exceptions.ConsultaException;
import com.artgui.nutrisis.model.valid.ValidateConsulta;
import java.util.List;
import javax.swing.JTable;

public class ConsultaController {

    private ConsultaDAO repositorio;

    public ConsultaController() {
        repositorio = new ConsultaDAO();
    }

    public void cadastrar(
            String data,
            Cliente cliente,
            Nutricionista nutricionista
    ) {
        ValidateConsulta valid = new ValidateConsulta();
        Consulta consulta = valid.validaCamposEntrada(
                data,
                null,
                "Marcada",
                cliente,
                nutricionista
        );
        
        repositorio.save(consulta);
    }

    public void atualizar(
            int id,
            String data,
            String resumo,
            String status,
            List<Dieta> dietasRecomendadas,
            Cliente cliente,
            Nutricionista nutricionista
    ) {
        ValidateConsulta valid = new ValidateConsulta();
        Consulta consulta = valid.validaCamposEntrada(
                data,
                resumo,
                status,
                cliente,
                nutricionista
        );
        consulta.setDietasRecomendadas(dietasRecomendadas);
        consulta.setId(id);
    
        repositorio.update(consulta);
    }

    public void excluir(Consulta consulta) {
        if (consulta != null) {
            repositorio.delete(consulta.getId());
        } else {
            throw new ConsultaException("Error - Consulta inexistente.");
        }
    }
    
    public void atualizarTabela(JTable grd, Cliente cliente, String data){
        
        List lst = repositorio.filterByClienteAndData(cliente, data);
        
        TMViewConsulta tmDieta = new TMViewConsulta(lst);
        grd.setModel(tmDieta);
    }
    
    public void atualizarTabela(JTable grd, Cliente cliente){
        
        List lst = repositorio.filterByCliente(cliente);
        
        TMViewConsulta tmDieta = new TMViewConsulta(lst);
        grd.setModel(tmDieta);
    }
    
    public void atualizarTabela(JTable grd, Nutricionista nutricionista, String data){
        
        List lst = repositorio.filterByNutricionistaAndData(nutricionista, data);
        
        TMViewConsulta tmDieta = new TMViewConsulta(lst);
        grd.setModel(tmDieta);
    }
    
    public void atualizarTabela(JTable grd, Nutricionista nutricionista){
        
        List lst = repositorio.filterByNutricionista(nutricionista);
        
        TMViewConsulta tmDieta = new TMViewConsulta(lst);
        grd.setModel(tmDieta);
    }
    

    public Consulta criar(
            String data,
            Cliente cliente,
            Nutricionista nutricionista
    ){
        ValidateConsulta valid = new ValidateConsulta();
        Consulta consulta = valid.validaCamposEntrada(
                data,
                null,
                "Teste",
                cliente,
                nutricionista
        );
        
        return consulta;
    }
}
