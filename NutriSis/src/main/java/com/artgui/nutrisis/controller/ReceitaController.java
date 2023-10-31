package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewReceita;
import com.artgui.nutrisis.exceptions.ReceitaException;
import com.artgui.nutrisis.model.Ingrediente;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import com.artgui.nutrisis.model.dao.ReceitaDAO;
import com.artgui.nutrisis.model.valid.ValidateReceita;
import java.util.List;
import javax.swing.JTable;

public class ReceitaController {
    
    private ReceitaDAO repositorio;
    
    public ReceitaController(){
        repositorio = new ReceitaDAO();
    }
    
    public void cadastrar(
            String nome, 
            String modoPreparo, 
            String tempoPreparo, 
            String porcoes, 
            String categoria, 
            List<Ingrediente> ingredientes, 
            Nutricionista nutricionista
    ){
        ValidateReceita valid = new ValidateReceita();
        Receita receita = valid.validaCamposEntrada(
                nome, 
                modoPreparo, 
                tempoPreparo, 
                porcoes, 
                categoria, 
                ingredientes, 
                nutricionista
        );
        for (Ingrediente i : receita.getIngredientes()){
            i.setReceita(receita);
        }
        repositorio.save(receita);
    }
    
    public void atualizar(
            int id, 
            String nome, 
            String modoPreparo, 
            String tempoPreparo, 
            String porcoes, 
            String categoria, 
            List<Ingrediente> ingredientes, 
            Nutricionista nutricionista
    ){
        ValidateReceita valid = new ValidateReceita();
        Receita receita = valid.validaCamposEntrada(
                nome, 
                modoPreparo, 
                tempoPreparo, 
                porcoes, 
                categoria, 
                ingredientes, 
                nutricionista
        );
        receita.setId(id);
        for (Ingrediente i : receita.getIngredientes()){
            i.setReceita(receita);
        }
        repositorio.update(receita);
    }
    
    public void excluir(Receita receita){
        if (receita != null) {
            repositorio.delete(receita);
        } else {
            throw new ReceitaException("Error - Receita inexistente.");
        }
    }
    
    public void atualizarTabela(JTable grd){
        TMViewReceita tmReceita = new TMViewReceita(repositorio.findAll());
        grd.setModel(tmReceita);
    }
    
    public void atualizarTabela(JTable grd, List<Receita> receitas){
        TMViewReceita tmReceita = new TMViewReceita(receitas);
        grd.setModel(tmReceita);
    }
    
    public void atualizarTabela(JTable grd, String nome) {
        List lst = repositorio.filterByName(nome);

        TMViewReceita tableModel = new TMViewReceita(lst);
        grd.setModel(tableModel);
    }
}