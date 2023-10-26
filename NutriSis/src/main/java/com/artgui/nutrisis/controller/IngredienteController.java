package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewIngrediente;
import com.artgui.nutrisis.exceptions.ClienteException;
import com.artgui.nutrisis.model.Ingrediente;
import com.artgui.nutrisis.model.dao.IngredienteDAO;
import com.artgui.nutrisis.model.valid.ValidateIngrediente;
import com.artgui.nutrisis.model.valid.ValidateReceita;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

public class IngredienteController {
    private IngredienteDAO repositorio;
    
    public IngredienteController(){
        repositorio = new IngredienteDAO();
    }
     
    // este metodo não é utilizado, deixo para o propio Hibernate para fazer isso;
    public void cadastrar(
            String nome, 
            String unidadeMedida, 
            float quantidade
    ){
        ValidateIngrediente valid = new ValidateIngrediente();
        Ingrediente ingrediente = valid.validaCamposEntrada(
                nome, 
                unidadeMedida,
                quantidade
        );
        repositorio.save(ingrediente);
    }
    
    public Ingrediente buscar(Object obj){
        return (Ingrediente) this.repositorio.find(obj);
    }
    
    // este metodo não é utilizado, deixo para o propio Hibernate para fazer isso;
    public void atualizar(
            int id,
            String nome, 
            String unidadeMedida, 
            float quantidade
    ){
        ValidateIngrediente valid = new ValidateIngrediente();
        Ingrediente ingrediente = valid.validaCamposEntrada(
                nome, 
                unidadeMedida,
                quantidade
        );
        ingrediente.setId(id);
        repositorio.save(ingrediente);
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
