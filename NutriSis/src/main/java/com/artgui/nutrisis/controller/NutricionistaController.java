package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.exceptions.ClienteException;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.dao.NutricionistaDAO;
import com.artgui.nutrisis.model.valid.ValidateNutricionista;

public class NutricionistaController {
    
private NutricionistaDAO repositorio;
    
    public NutricionistaController(){
        repositorio = new NutricionistaDAO();
    }
    
   public void cadastrar(
            String nome, 
            String email, 
            String senha, 
            String cpf, 
            String telefone, 
            String crn,
            String especializacao
    ){
        ValidateNutricionista valid = new ValidateNutricionista();
        Nutricionista nutricionista = valid.validaCamposEntrada(
                nome, 
                email, 
                senha,
                cpf, 
                telefone,
                crn,
                especializacao
        );
        repositorio.save(nutricionista);
    }
    
     public void atualizar(
            int id,
            String nome, 
            String email, 
            String senha, 
            String cpf, 
            String telefone, 
            String crn,
            String especializacao
    ){
        ValidateNutricionista valid = new ValidateNutricionista();
        Nutricionista nutricionista = valid.validaCamposEntrada(
                nome, 
                email, 
                senha,
                cpf, 
                telefone,
                crn,
                especializacao
        );
        nutricionista.setId(id);
        repositorio.update(nutricionista);
    }
    
    public void excluir(Nutricionista nutricionista){
        if (nutricionista != null) {
            repositorio.delete(nutricionista);
        } else {
            throw new ClienteException("Error - Nutricionista inexistente.");
        }
    }
 }