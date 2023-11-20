package com.artgui.nutrisis.model;

import java.io.Serializable;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity

public class Cliente extends Usuario implements Serializable{
    
    private int altura;
    private float peso;
    private String genero;
    private String dataNascimento;
    private String numeroCartao;
    private float saldoCartao;
    
    // Construtor sem Id
    public Cliente(
            String nome, 
            String email, 
            String senha,
            String cpf,
            String telefone,
            int altura, 
            float peso,
            String genero, 
            String dataNascimento,
            String numeroCartao
    ){
        super(nome, email, senha, cpf, telefone);
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.numeroCartao = numeroCartao;
        this.saldoCartao = 0.0f;
    }
}