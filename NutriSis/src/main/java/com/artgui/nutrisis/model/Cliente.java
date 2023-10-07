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
    private String dataNascimento;
    
    // Construtor sem argumento
    public Cliente(){
    }
    
    // Construtor sem Id
    public Cliente(String nome, String email, String senha, String cpf, String telefone, float altura, float peso, String genero, String dataNascimento){
        super(nome, email, senha, cpf, telefone);
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
    }
}
