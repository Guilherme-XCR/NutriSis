package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewCliente;
import com.artgui.nutrisis.exceptions.ClienteException;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.dao.ClienteDAO;
import com.artgui.nutrisis.model.valid.ValidateCliente;
import javax.swing.JTable;

public class ClienteController {

    private ClienteDAO repositorio;

    public ClienteController(){
        repositorio = new ClienteDAO();
    }
    
    public void cadastrar(
            String nome, 
            String email, 
            String senha, 
            String cpf, 
            String telefone, 
            int altura, 
            float peso, 
            String genero, 
            String dataNascimento
    ){
        ValidateCliente valid = new ValidateCliente();
        Cliente cliente = valid.validaCamposEntrada(
                nome, 
                email, 
                senha,
                cpf, 
                telefone,
                altura, 
                peso, 
                genero, 
                dataNascimento
        );
        repositorio.save(cliente);
    }

    public Cliente buscarPorEmail(String email){
        
        return repositorio.findByEmail(email);
        
        
    }
    
    public void atualizar(
            int id, 
            String nome, 
            String email,
            String senha,
            String cpf,
            String telefone,
            int altura,
            float peso,
            String genero,
            String dataNascimento
    ){
        ValidateCliente valid = new ValidateCliente();
        Cliente cliente = valid.validaCamposEntrada(
                nome,
                email,
                senha,
                cpf,
                telefone,
                altura, 
                peso,
                genero,
                dataNascimento
        );
        cliente.setId(id);
        repositorio.update(cliente);
    }
    
    public void excluir(Cliente cliente){
        if (cliente != null) {
            repositorio.delete(cliente);
        } else {
            throw new ClienteException("Error - Cliente inexistente.");
        }
    }
    
    public void atualizarTabela(JTable grd){
        TMViewCliente tmCliente = new TMViewCliente(repositorio.findAll());
        grd.setModel(tmCliente);
    }
    
    public Cliente login(String email, String senha){
        Cliente cliente = this.buscarPorEmail(email);

        if (cliente != null && senha.equals(cliente.getSenha())) {
            return cliente;
        }
        return null;
    }
}
