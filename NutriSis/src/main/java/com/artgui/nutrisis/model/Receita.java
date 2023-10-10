package com.artgui.nutrisis.model;

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

public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    private String modoPreparo;
    private String tempoPreparo;
    private int porcoes;
    private String categoria;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Refeicao> refeicoes;
    
    @OneToMany(mappedBy = "receita", cascade = CascadeType.ALL)
    private List<Ingrediente> ingredientes;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_nutricionista")
    private Nutricionista nutricionista;
    
    //construtor sem id e sem refeicao
    public Receita(String nome, String modoPreparo, String tempoPreparo, int porcoes, String categoria, List<Ingrediente> ingredientes, Nutricionista nutricionista){
        this.nome = nome;
        this.modoPreparo = modoPreparo;
        this.tempoPreparo = tempoPreparo;
        this.porcoes = porcoes;
        this.categoria = categoria;
        this.ingredientes = ingredientes;
        this.nutricionista = nutricionista;
        
    }
    
    //add refeicao
    public void addRefeicao(Refeicao refeicao){
        this.refeicoes.add(refeicao);
    }
    
}
