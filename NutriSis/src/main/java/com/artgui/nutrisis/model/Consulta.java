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

@NoArgsConstructor
@AllArgsConstructor

@Entity

public class Consulta implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Data;
    private String Resumo;
    private String Status;
    
    @ManyToMany( fetch = FetchType.EAGER) //cascade = CascadeType.ALL,
    @JoinTable(
        name = "consulta_dieta",
        joinColumns = @JoinColumn(name = "consulta_id"),
        inverseJoinColumns = @JoinColumn(name = "dieta_id")
    )
    private List<Dieta> dietasRecomendadas;
    
    @ManyToMany( fetch = FetchType.EAGER) //cascade = CascadeType.ALL,
    @JoinTable(
        name = "consulta_receita",
        joinColumns = @JoinColumn(name = "consulta_id"),
        inverseJoinColumns = @JoinColumn(name = "receita_id")
    )
    private List<Receita> receitasRecomendadas;
    
    @ManyToOne()
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @ManyToOne()
    @JoinColumn(name = "id_nutricionista")
    private Nutricionista nutricionista;

}
