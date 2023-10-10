package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewDieta;
import com.artgui.nutrisis.controller.tablemodel.TMViewReceita;
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
    
    public void cadastrar(String nome, String modoPreparo, String tempoPreparo, int porcoes, String categoria, List<Refeicao> refeicoes, Nutricionista nutricionista){
        
        ValidateDieta valid = new ValidateDieta();
        Dieta dieta = valid.validaCamposEntrada(nome, categoria, porcoes, refeicoes, nutricionista);
        
        for (Refeicao r : dieta.getRefeicoes()){
            r.setDieta(dieta);
        }
        
        repositorio.save(dieta);
    }
    
    public Receita buscar(int id){
        return (Receita) this.repositorio.findById(id);
    }
    
    public void atualizar(int id, String nome, String modoPreparo, String tempoPreparo, int porcoes, String categoria, List<Refeicao> refeicoes, Nutricionista nutricionista){
        ValidateDieta valid = new ValidateDieta();
        Dieta dieta = valid.validaCamposEntrada(nome, categoria, porcoes, refeicoes, nutricionista);
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
        List<Object> lst = repositorio.findAll();
        
        TMViewDieta tmDieta = new TMViewDieta(lst);
        grd.setModel(tmDieta);
    }
    
    public void atualizarTabela(JTable grd, List<Dieta> dietas){

        List<Object> lst = new ArrayList<>(dietas);
        
        TMViewDieta tmDieta = new TMViewDieta(lst);
        grd.setModel(tmDieta);
    }
    
}
