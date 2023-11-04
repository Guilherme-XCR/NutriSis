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

public class Receita implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    private String modoPreparo;
    private int tempoPreparo;
    private int porcoes;
    private String categoria;

    @ManyToMany(mappedBy = "receitas")
    private List<Refeicao> refeicoes;
    
    @OneToMany(mappedBy = "receita", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ingrediente> ingredientes;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_nutricionista")
    private Nutricionista nutricionista;
    
    @ManyToMany(mappedBy = "receitasRecomendadas")
    private List<Consulta> consultas;
    
    //construtor sem id e sem refeicao
    public Receita(
            String nome, 
            String modoPreparo, 
            int tempoPreparo, 
            int porcoes, 
            String categoria,
            List<Ingrediente> ingredientes,
            Nutricionista nutricionista
    ){
        this.nome = nome;
        this.modoPreparo = modoPreparo;
        this.tempoPreparo = tempoPreparo;
        this.porcoes = porcoes;
        this.categoria = categoria;
        this.ingredientes = ingredientes;
        this.nutricionista = nutricionista;
        
    }
    
    public void copy(Receita outro){
        this.id = outro.getId();
        this.nome = outro.getNome();
        this.modoPreparo = outro.getModoPreparo();
        this.tempoPreparo = outro.getTempoPreparo();
        this.porcoes = outro.getPorcoes();
        this.categoria = outro.getCategoria();
        this.ingredientes = outro.getIngredientes();
        this.nutricionista = outro.getNutricionista();
    }
    
    //add refeicao
    public void addRefeicao(Refeicao refeicao){
        this.refeicoes.add(refeicao);
    }
    public void removeRefeicao(Refeicao refeicao){
        this.refeicoes.remove(refeicao);
    }
}