package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewEdtExcluirIngrediente;
import com.artgui.nutrisis.controller.tablemodel.TMViewIngrediente;
import com.artgui.nutrisis.model.exceptions.ClienteException;
import com.artgui.nutrisis.model.Ingrediente;
import com.artgui.nutrisis.model.dao.IngredienteDAO;
import com.artgui.nutrisis.model.valid.ValidateIngrediente;
import java.util.List;
import javax.swing.JTable;

public class IngredienteController {

    private IngredienteDAO repositorio;

    public IngredienteController() {
        repositorio = new IngredienteDAO();
    }

    public void cadastrar(
            String nome,
            String unidadeMedida,
            String quantidade
    ) {
        ValidateIngrediente valid = new ValidateIngrediente();
        Ingrediente ingrediente = valid.validaCamposEntrada(
                nome,
                unidadeMedida,
                quantidade
        );
        repositorio.save(ingrediente);
    }

    public void atualizar(
            int id,
            String nome,
            String unidadeMedida,
            String quantidade
    ) {
        ValidateIngrediente valid = new ValidateIngrediente();
        Ingrediente ingrediente = valid.validaCamposEntrada(
                nome,
                unidadeMedida,
                quantidade
        );
        ingrediente.setId(id);
        repositorio.update(ingrediente);
    }

    public void excluir(Ingrediente ingrediente) {
        if (ingrediente != null) {
            repositorio.delete(ingrediente.getId());
        } else {
            throw new ClienteException("Error - Ingrediente inexistente.");
        }
    }

    public void atualizarTabela(JTable grd) {
        TMViewIngrediente tmIngrediente = new TMViewIngrediente(repositorio.findAll());
        grd.setModel(tmIngrediente);
    }

    public void atualizarTabela(JTable grd, List<Ingrediente> ingredientes) {
        TMViewIngrediente tmIngrediente = new TMViewIngrediente(ingredientes);
        grd.setModel(tmIngrediente);
    }

    public void atualizarTabelaEdtExcluir(JTable grd, List<Ingrediente> ingredientes) {
        TMViewEdtExcluirIngrediente tmIngrediente = new TMViewEdtExcluirIngrediente(ingredientes);
        grd.setModel(tmIngrediente);
    }

    public Ingrediente criar(
            String nome,
            String unidadeMedida,
            String quantidade
    ) {
        ValidateIngrediente valid = new ValidateIngrediente();
        return valid.validaCamposEntrada(nome, unidadeMedida, quantidade);
    }
}
