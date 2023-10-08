package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewIngrediente;
import com.artgui.nutrisis.exceptions.ClienteException;
import com.artgui.nutrisis.model.Ingrediente;
import com.artgui.nutrisis.model.dao.IngredienteDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

public class IngredienteController {
    private IngredienteDAO repositorio;
    
    public IngredienteController(){
        repositorio = new IngredienteDAO();
    }
        
    public Ingrediente buscar(Object obj){
        return (Ingrediente) this.repositorio.find(obj);
    }
    
    public void excluir(Ingrediente ingrediente){
        if (ingrediente != null) {
            repositorio.delete(ingrediente);
        } else {
            throw new ClienteException("Error - Ingrediente inexistente.");
        }
    }
    
    public void atualizarTabela(JTable grd){
        List<Object> lst = repositorio.findAll();
        
        TMViewIngrediente tmIngrediente = new TMViewIngrediente(lst);
        grd.setModel(tmIngrediente);
    }
    
    public void atualizarTabela(JTable grd, List<Ingrediente> ingredientes){

        List<Object> lst = new ArrayList<>(ingredientes);
        
        TMViewIngrediente tmIngrediente = new TMViewIngrediente(lst);
        grd.setModel(tmIngrediente);
    }
}
