package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewDieta;
import com.artgui.nutrisis.exceptions.DietaException;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import com.artgui.nutrisis.model.Refeicao;
import com.artgui.nutrisis.model.dao.DietaDAO;
import com.artgui.nutrisis.model.valid.ValidateDieta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

public class DietaController {
    
    private DietaDAO repositorio;
    
    public DietaController(){
        repositorio = new DietaDAO();
    }
    
    public void cadastrar(
            String nome, 
            String descricao, 
            int diasDuracao, 
            List<Refeicao> refeicoes, 
            Nutricionista nutricionista
    ){
        ValidateDieta valid = new ValidateDieta();
        Dieta dieta = valid.validaCamposEntrada(
                nome, 
                descricao, 
                diasDuracao, 
                refeicoes, 
                nutricionista
        );
        
        for (Refeicao r : dieta.getRefeicoes()){
            r.setDieta(dieta);
        }
        repositorio.save(dieta);
    }
        
    public void atualizar(
            int id,
            String nome,
            String descricao,
            int diasDuracao,
            List<Refeicao> refeicoes,
            Nutricionista nutricionista
    ){
        ValidateDieta valid = new ValidateDieta();
        Dieta dieta = valid.validaCamposEntrada(
                nome, 
                descricao, 
                diasDuracao, 
                refeicoes,
                nutricionista
        );
        dieta.setId(id);
        for (Refeicao r : dieta.getRefeicoes()){
            r.setDieta(dieta);
        }
        repositorio.update(dieta);
    }
    
    public void excluir(Dieta dieta){
        if (dieta != null) {
            repositorio.delete(dieta);
        } else {
            throw new DietaException("Error - Dieta inexistente.");
        }
    }
    
    public void atualizarTabela(JTable grd){
        TMViewDieta tmDieta = new TMViewDieta(repositorio.findAll());
        grd.setModel(tmDieta);
    }
    
    public void atualizarTabela(JTable grd, List<Dieta> dietas){
        TMViewDieta tmDieta = new TMViewDieta(dietas);
        grd.setModel(tmDieta);
    }
    
}
