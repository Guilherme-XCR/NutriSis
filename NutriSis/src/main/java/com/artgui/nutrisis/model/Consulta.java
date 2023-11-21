package com.artgui.nutrisis.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity

public class Consulta implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dataMarcada;
    private String resumo;
    private String status;
    
    @ManyToMany( fetch = FetchType.EAGER)
    @JoinTable(
        name = "consulta_dieta",
        joinColumns = @JoinColumn(name = "consulta_id"),
        inverseJoinColumns = @JoinColumn(name = "dieta_id")
    )
    private List<Dieta> dietasRecomendadas;
    
    @ManyToOne()
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @ManyToOne()
    @JoinColumn(name = "id_nutricionista")
    private Nutricionista nutricionista;

    public Consulta(
            String data,
            String resumo,
            String status,
            List<Dieta> dietasRecomendadas,
            Cliente cliente,
            Nutricionista nutricionista
    ){
        this.dataMarcada = data;
        this.resumo = resumo;
        this.status = status;
        this.dietasRecomendadas = dietasRecomendadas;
        this.cliente = cliente;
        this.nutricionista = nutricionista;
    }
    
    public Consulta(
            String data,
            String resumo,
            String status,
            Cliente cliente,
            Nutricionista nutricionista
    ){
        this.dataMarcada = data;
        this.resumo = resumo;
        this.status = status;
        this.cliente = cliente;
        this.nutricionista = nutricionista;
    }
    
    public void addRecomendacaoDieta(Dieta dieta){
    this.dietasRecomendadas.add(dieta);
    }
    public void removeRecomendacaoDieta(Dieta dieta){
    this.dietasRecomendadas.remove(dieta);
    }
    
    public void copy(Consulta outro){
        this.id = outro.getId();
        this.dataMarcada = outro.getDataMarcada();
        this.resumo = outro.getResumo();
        this.status = outro.getStatus();
        this.cliente = outro.getCliente();
        this.nutricionista = outro.getNutricionista();
    }
}
