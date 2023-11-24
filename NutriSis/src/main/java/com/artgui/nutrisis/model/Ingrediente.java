package com.artgui.nutrisis.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Ingrediente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String unidadeMedida;
    private float quantidade;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_receita")
    private Receita receita;

    public Ingrediente(
            String nome,
            String unidadeMedida,
            float quantidade
    ) {
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.quantidade = quantidade;
    }

    public void copy(Ingrediente outro) {
        this.id = outro.getId();
        this.nome = outro.getNome();
        this.unidadeMedida = outro.getUnidadeMedida();
        this.quantidade = outro.getQuantidade();
        this.receita = outro.getReceita();
    }
}
