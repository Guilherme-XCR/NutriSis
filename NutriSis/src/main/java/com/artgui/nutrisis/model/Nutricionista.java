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

public class Nutricionista extends Usuario implements Serializable {

    private String crn;
    private String especializacao;

    // Construtor sem Id
    public Nutricionista(
            String nome,
            String email,
            String senha,
            String cpf,
            String telefone,
            String crn,
            String especializacao
    ) {
        super(nome, email, senha, cpf, telefone);
        this.crn = crn;
        this.especializacao = especializacao;
    }
}
