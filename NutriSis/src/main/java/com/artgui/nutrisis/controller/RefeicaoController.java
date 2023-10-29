package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewRefeicao;
import com.artgui.nutrisis.exceptions.RefeicaoException;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import com.artgui.nutrisis.model.Refeicao;
import com.artgui.nutrisis.model.dao.RefeicaoDAO;
import com.artgui.nutrisis.model.valid.ValidateRefeicao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

public class RefeicaoController {
    
private RefeicaoDAO repositorio;
    
    public RefeicaoController(){
        repositorio = new RefeicaoDAO();
    }
    
    public void cadastrar(
            String nome,
            String horario,
            float calorias,
            List<Receita> receitas,
            Dieta dieta,
            Nutricionista nutricionista
    ){
        ValidateRefeicao valid = new ValidateRefeicao();
        Refeicao refeicao = valid.validaCamposEntrada(
                nome, 
                horario, 
                calorias, 
                receitas, 
                dieta, 
                nutricionista
        );
        for (Receita r : refeicao.getReceitas()){
            r.addRefeicao(refeicao);
        }
        repositorio.save(refeicao);
    }
        
    public void atualizar(
            int id,
            String nome,
            String horario,
            float calorias,
            List<Receita> receitas,
            Dieta dieta,
            Nutricionista nutricionista
    ){
        ValidateRefeicao valid = new ValidateRefeicao();
        Refeicao refeicao = valid.validaCamposEntrada(
                nome, 
                horario, 
                calorias, 
                receitas, 
                dieta, 
                nutricionista
        );
        for (Receita r : refeicao.getReceitas()){
            r.addRefeicao(refeicao);
        }
        repositorio.update(refeicao);
    }
    
    public void excluir(Refeicao refeicao){
        if (refeicao != null) {
            repositorio.delete(refeicao);
        } else {
            throw new RefeicaoException("Error - Refeicao inexistente.");
        }
    }
    
    //Tabela que mostra todas as refeicoes sem restrição
    public void atualizarTabela(JTable grd){
        TMViewRefeicao tmRefeicao = new TMViewRefeicao(repositorio.findAll());
        grd.setModel(tmRefeicao);
    }
    
    //tabela a ser usada no CRUD Dieta (para mostrar apenas refeicoes que pertencem a dieta escolhida)
    public void atualizarTabela(JTable grd, List<Refeicao> refeicoes){
        TMViewRefeicao tmRefeicao = new TMViewRefeicao(refeicoes);
        grd.setModel(tmRefeicao);
    }
}
