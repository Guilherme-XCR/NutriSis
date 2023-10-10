package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.model.dao.NutricionistaDAO;

public class NutricionistaController {
    
private NutricionistaDAO repositorio;
    
    public NutricionistaController(){
        repositorio = new NutricionistaDAO();
    }
    
//    public void cadastrar(
//            String nome, 
//            String modoPreparo, 
//            String tempoPreparo, 
//            int porcoes, 
//            String categoria, 
//            List<Ingrediente> ingredientes, 
//            Nutricionista nutricionista
//    ){
//        ValidateReceita valid = new ValidateReceita();
//        Receita receita = valid.validaCamposEntrada(nome, modoPreparo, tempoPreparo, porcoes, categoria, ingredientes, nutricionista);
//        
//        for (Ingrediente i : receita.getIngredientes()){
//            i.setReceita(receita);
//        }
//        
//        repositorio.save(receita);
//    }
//    
//    public Receita buscar(int id){
//        return (Receita) this.repositorio.findById(id);
//    }
//    
//    public void atualizar(int id, String nome, String modoPreparo, String tempoPreparo, int porcoes, String categoria, List<Ingrediente> ingredientes, Nutricionista nutricionista){
//        ValidateReceita valid = new ValidateReceita();
//        Receita receita = valid.validaCamposEntrada(nome, modoPreparo, tempoPreparo, porcoes, categoria, ingredientes, nutricionista);
//        receita.setId(id);
//        for (Ingrediente i : receita.getIngredientes()){
//            i.setReceita(receita);
//        }
//        
//        repositorio.update(receita);
//    }
//    
//    public void excluir(Receita receita){
//        if (receita != null) {
//            repositorio.delete(receita);
//        } else {
//            throw new ReceitaException("Error - Receita inexistente.");
//        }
//    }
//    
//    public void atualizarTabela(JTable grd){
//        List<Object> lst = repositorio.findAll();
//        
//        TMViewReceita tmReceita = new TMViewReceita(lst);
//        grd.setModel(tmReceita);
//    }
//    
//    public void atualizarTabela(JTable grd, List<Receita> receitas){
//
//        List<Object> lst = new ArrayList<>(receitas);
//        
//        TMViewReceita tmReceita = new TMViewReceita(lst);
//        grd.setModel(tmReceita);
//    }
}
