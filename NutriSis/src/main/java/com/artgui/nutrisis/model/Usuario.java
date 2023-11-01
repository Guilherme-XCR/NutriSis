package com.artgui.nutrisis.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    
    protected String nome;
    protected String email;
    protected String senha;
    protected String cpf;
    protected String telefone;
        
    // Construtor sem id
    public Usuario(String nome, String email, String senha, String cpf, String telefone){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
    }
}
