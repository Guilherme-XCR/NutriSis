package com.artgui.nutrisis.model;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity


public class Cliente extends Usuario{
    private float altura;
    private float peso;
    private String genero;
    
    // Devido a grandes problemas, vou deixar a data fora da minha jurisdição
    //private Date dataNascimento;
    
    // Construtor sem argumento
    public Cliente(){
    }
    
    // Construtor sem Id
    public Cliente(String nome, String email, String senha, String cpf, String telefone, float altura, float peso, String genero/*, Date dataNascimento*/){
        super(nome, email, senha, cpf, telefone);
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        //this.dataNascimento = this.dataNascimento;
    }
    
    public void copy(Cliente outro){
        this.nome = outro.getNome();
        this.email = outro.getEmail();
        this.senha = outro.getSenha();
        this.cpf = outro.getCpf();
        this.telefone = outro.getTelefone();
        this.altura = outro.getAltura();
        this.peso = outro.getPeso();
        this.genero = outro.getGenero();
    }
}
