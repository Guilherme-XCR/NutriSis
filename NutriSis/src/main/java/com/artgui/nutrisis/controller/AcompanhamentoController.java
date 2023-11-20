package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.model.exceptions.ReceitaException;
import com.artgui.nutrisis.model.Acompanhamento;
import com.artgui.nutrisis.model.RegistroDiario;
import com.artgui.nutrisis.model.dao.AcompanhamentoDAO;
import com.artgui.nutrisis.model.valid.ValidateAcompanhamento;
import java.util.List;

public class AcompanhamentoController {

    private AcompanhamentoDAO repositorio;

    public AcompanhamentoController() {
        repositorio = new AcompanhamentoDAO();
    }

    public void cadastrar(
            String dataInicio,
            String dataFinal,
            List<RegistroDiario> registrosDiarios
    ) {
        ValidateAcompanhamento valid = new ValidateAcompanhamento();
        Acompanhamento acompanhamento = valid.validaAcompanhamento(dataInicio, dataFinal, registrosDiarios);

        for (RegistroDiario rd : acompanhamento.getRegistrosDiarios()) {
            rd.setAcompanhamento(acompanhamento);
        }
        repositorio.save(acompanhamento);

    }

    public void atualizar(
            int id,
            String dataInicio,
            String dataFinal,
            List<RegistroDiario> registrosDiarios
    ) {
        ValidateAcompanhamento valid = new ValidateAcompanhamento();
        Acompanhamento acompanhamento = valid.validaAcompanhamento(dataInicio, dataFinal, registrosDiarios);

        acompanhamento.setId(id);

        for (RegistroDiario rd : acompanhamento.getRegistrosDiarios()) {
            rd.setAcompanhamento(acompanhamento);
        }
        repositorio.update(acompanhamento);

    }

    public void excluir(Acompanhamento acompanhamento) {
        if (acompanhamento != null) {
            repositorio.delete(acompanhamento.getId());
        } else {
            throw new ReceitaException("Error - Acompanhamento inexistente.");
        }
    }
}
