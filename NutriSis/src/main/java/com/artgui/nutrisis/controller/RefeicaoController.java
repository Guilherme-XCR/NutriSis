package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewEdtExcluirRefeicao;
import com.artgui.nutrisis.controller.tablemodel.TMViewRefeicao;
import com.artgui.nutrisis.controller.tablemodel.TMViewVizualizarRefeicao;
import com.artgui.nutrisis.model.exceptions.RefeicaoException;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import com.artgui.nutrisis.model.Refeicao;
import com.artgui.nutrisis.model.dao.RefeicaoDAO;
import com.artgui.nutrisis.model.valid.ValidateRefeicao;
import java.util.List;
import javax.swing.JTable;

public class RefeicaoController {

    private RefeicaoDAO repositorio;

    public RefeicaoController() {
        repositorio = new RefeicaoDAO();
    }

    public void cadastrar(
            String nome,
            String horario,
            String calorias,
            List<Receita> receitas,
            Dieta dieta,
            Nutricionista nutricionista
    ) {
        ValidateRefeicao valid = new ValidateRefeicao();
        Refeicao refeicao = valid.validaCamposEntrada(
                nome,
                horario,
                calorias,
                receitas
        );
        repositorio.save(refeicao);
    }

    public void atualizar(
            int id,
            String nome,
            String horario,
            String calorias,
            List<Receita> receitas,
            Dieta dieta,
            Nutricionista nutricionista
    ) {
        ValidateRefeicao valid = new ValidateRefeicao();
        Refeicao refeicao = valid.validaCamposEntrada(
                nome,
                horario,
                calorias,
                receitas
        );
        repositorio.update(refeicao);
    }

    public void excluir(Refeicao refeicao) {
        if (refeicao != null) {
            repositorio.delete(refeicao.getId());
        } else {
            throw new RefeicaoException("Error - Refeicao inexistente.");
        }
    }

    //Tabela que mostra todas as refeicoes sem restrição
    public void atualizarTabela(JTable grd) {
        TMViewRefeicao tmRefeicao = new TMViewRefeicao(repositorio.findAll());
        grd.setModel(tmRefeicao);
    }

    //tabela a ser usada no CRUD Dieta (para mostrar apenas refeicoes que pertencem a dieta escolhida)
    public void atualizarTabela(JTable grd, List<Refeicao> refeicoes) {
        TMViewRefeicao tmRefeicao = new TMViewRefeicao(refeicoes);
        grd.setModel(tmRefeicao);
    }

    public void atualizarTabelaEdtExcluir(JTable grd, List<Refeicao> refeicoes) {
        TMViewEdtExcluirRefeicao tmRefeicao = new TMViewEdtExcluirRefeicao(refeicoes);
        grd.setModel(tmRefeicao);
    }
    
    public void atualizarTabelaVizualizar(JTable grd, List<Refeicao> refeicoes) {
        TMViewVizualizarRefeicao  tmRefeicao = new TMViewVizualizarRefeicao(refeicoes);
        grd.setModel(tmRefeicao);
    }
    
    public Refeicao criar(
            String nome,
            String horario,
            String calorias,
            List<Receita> receitas
    ) {
        ValidateRefeicao valid = new ValidateRefeicao();
        return valid.validaCamposEntrada(nome, horario, calorias, receitas);
    }
}
