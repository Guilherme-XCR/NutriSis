package com.artgui.nutrisis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    
    protected String nome;
    protected String email;
    protected String senha;
    protected String cpf;
    protected String telefone;
    
    // Construtor sem argumento
    public Usuario(){
    }
    
    // Construtor sem id
    public Usuario(String nome, String email, String senha, String cpf, String telefone){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
    }
}
