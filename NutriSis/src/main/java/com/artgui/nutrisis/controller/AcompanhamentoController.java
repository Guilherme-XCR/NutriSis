package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewAcompanhamentoCliente;
import com.artgui.nutrisis.controller.tablemodel.TMViewAcompanhamentoNutricionista;
import com.artgui.nutrisis.model.Acompanhamento;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.RegistroDiario;
import com.artgui.nutrisis.model.dao.AcompanhamentoDAO;
import com.artgui.nutrisis.model.exceptions.AcompanhamentoException;
import com.artgui.nutrisis.model.valid.ValidateAcompanhamento;
import java.util.List;
import javax.swing.JTable;

public class AcompanhamentoController {

    private AcompanhamentoDAO repositorio;

    public AcompanhamentoController() {
        repositorio = new AcompanhamentoDAO();
    }

    public void cadastrar(
            String dataInicio,
            String dataFinal,
            Cliente cliente,
            Nutricionista nutricionista
    ) {
        ValidateAcompanhamento valid = new ValidateAcompanhamento();
        Acompanhamento acompanhamento = valid.validaAcompanhamento(dataInicio, dataFinal);
        acompanhamento.setCliente(cliente);
        acompanhamento.setNutricionista(nutricionista);
        repositorio.save(acompanhamento);
    }

    public void atualizar(
            int id,
            String dataInicio,
            String dataFinal,
            List<RegistroDiario> registrosDiarios,
            Cliente cliente,
            Nutricionista nutricionista
    ) {
        ValidateAcompanhamento valid = new ValidateAcompanhamento();
        Acompanhamento acompanhamento = valid.validaAcompanhamento(dataInicio, dataFinal);
        acompanhamento.setId(id);
        acompanhamento.setCliente(cliente);
        acompanhamento.setNutricionista(nutricionista);
        acompanhamento.setRegistrosDiarios(registrosDiarios);
        if (acompanhamento.getRegistrosDiarios() != null) {
            for (RegistroDiario rd : acompanhamento.getRegistrosDiarios()) {
                rd.setAcompanhamento(acompanhamento);
            }
            repositorio.update(acompanhamento);
        }
    }
    

    

    public void excluir(Acompanhamento acompanhamento) {
        if (acompanhamento != null) {
            repositorio.delete(acompanhamento.getId());
        } else {
            throw new AcompanhamentoException("Error - Acompanhamento inexistente.");
        }
    }

    public Acompanhamento criar(String dataInicio, String dataFinal, Cliente cliente, Nutricionista nutricionista) {
        ValidateAcompanhamento valid = new ValidateAcompanhamento();
        Acompanhamento acompanhamento = valid.validaAcompanhamento(dataInicio, dataFinal);
        acompanhamento.setCliente(cliente);
        acompanhamento.setNutricionista(nutricionista);
        return acompanhamento;
    }

    public void atualizarTabela(JTable grd, Cliente cliente) {
        List lst = repositorio.filterByCliente(cliente);
        TMViewAcompanhamentoCliente tmDieta = new TMViewAcompanhamentoCliente(lst);
        grd.setModel(tmDieta);
    }
    
    public void atualizarTabela(JTable grd, Nutricionista nutricionista) {
        List lst = repositorio.filterByNutricionista(nutricionista);
        TMViewAcompanhamentoNutricionista tmDieta = new TMViewAcompanhamentoNutricionista(lst);
        grd.setModel(tmDieta);
    }
}
