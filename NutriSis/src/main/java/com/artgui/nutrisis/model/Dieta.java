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
import javax.persistence.ManyToMany;
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
    
    @OneToMany(mappedBy = "dieta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)//
    private List<Refeicao> refeicoes;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_nutricionista")
    private Nutricionista nutricionista;
    
    @ManyToMany(mappedBy = "dietasRecomendadas")
    private List<Consulta> consultas;

    public Dieta( String nome,String descricao,int diasDuracao,List<Refeicao> refeicoes,Nutricionista nutricionista){
        this.nome = nome;
        this.descricao = descricao;
        this.diasDuracao = diasDuracao;
        this.refeicoes = refeicoes;
        this.nutricionista = nutricionista;
    }
}
