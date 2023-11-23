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
    
    @OneToMany(mappedBy = "receita",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Ingrediente> ingredientes;  
    @ManyToOne
    @JoinColumn(name = "id_nutricionista")
    private Nutricionista nutricionista;

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
}