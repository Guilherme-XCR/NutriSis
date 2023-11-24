package com.artgui.nutrisis.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Dieta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private int diasDuracao;
    @OneToMany(mappedBy = "dieta", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Refeicao> refeicoes;
    @ManyToOne
    @JoinColumn(name = "id_nutricionista")
    private Nutricionista nutricionista;

    public Dieta(
            String nome,
            String descricao,
            int diasDuracao,
            List<Refeicao> refeicoes,
            Nutricionista nutricionista
    ) {
        this.nome = nome;
        this.descricao = descricao;
        this.diasDuracao = diasDuracao;
        this.refeicoes = refeicoes;
        this.nutricionista = nutricionista;
    }

    public void copy(Dieta outro) {
        this.id = outro.getId();
        this.nome = outro.getNome();
        this.descricao = outro.getDescricao();
        this.diasDuracao = outro.getDiasDuracao();
        this.refeicoes = outro.getRefeicoes();
        this.nutricionista = outro.getNutricionista();
    }
}
