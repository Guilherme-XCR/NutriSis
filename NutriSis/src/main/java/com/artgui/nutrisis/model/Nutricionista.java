package com.artgui.nutrisis.model;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Entity

public class Nutricionista extends Usuario{
  
    private String crn;
    private String especializacao;
    
    // Construtor sem argumento
    public Nutricionista(){
    }
    
    // Construtor sem Id
    public Nutricionista(String nome, String email, String senha, String cpf, String telefone, String crn, String especializacao){
        super(nome, email, senha, cpf, telefone);
        this.crn = crn;
        this.especializacao = especializacao;
    }    
}
