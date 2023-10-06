package com.artgui.nutrisis.model;

import java.time.LocalTime;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente extends Usuario {
    private float altura;
    private float peso;
    private String genero;
    private Date dataNascimento;
    
    // Construtor sem Id
    public Cliente(String nome, String email, String senha, String cpf, String telefone, float altura, float peso, String genero, LocalTime dataNascimento){
        super(nome, email, senha, cpf, telefone);
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.dataNascimento = this.dataNascimento;
    }
}
