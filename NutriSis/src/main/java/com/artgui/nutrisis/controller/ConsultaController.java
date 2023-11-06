package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.exceptions.ConsultaException;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.Consulta;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import com.artgui.nutrisis.model.dao.ConsultaDAO;
import com.artgui.nutrisis.model.valid.ValidateConsulta;
import java.util.List;

public class ConsultaController {

    private ConsultaDAO repositorio;

    public ConsultaController() {
        repositorio = new ConsultaDAO();
    }

    public void cadastrar(
            String data,
            String resumo,
            String status,
            List<Dieta> dietasRecomendadas,
            List<Receita> receitaRecomendadas,
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

        for (Receita r : consulta.getReceitasRecomendadas()) {
            r.addConsulta(consulta);
        }

        for (Dieta d : consulta.getDietasRecomendadas()) {
            d.addConsulta(consulta);
        }

        repositorio.save(consulta);
    }

    public void atualizar(
            int id,
            String data,
            String resumo,
            String status,
            List<Dieta> dietasRecomendadas,
            List<Receita> receitaRecomendadas,
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
        consulta.setId(id);

        for (Receita r : consulta.getReceitasRecomendadas()) {
            r.addConsulta(consulta);
        }

        for (Dieta d : consulta.getDietasRecomendadas()) {
            d.addConsulta(consulta);
        }

        repositorio.update(consulta);
    }

    public void excluir(Consulta consulta) {
        if (consulta != null) {
            repositorio.delete(consulta);
        } else {
            throw new ConsultaException("Error - Consulta inexistente.");
        }
    }

}
