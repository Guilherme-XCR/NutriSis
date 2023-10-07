package com.artgui.nutrisis.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Refeicao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    private String horario;
    private float calorias;
    
    @ManyToMany
    private List<Receita> receitas;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_dieta")
    private Dieta dieta;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_nutricionista")    
    private Nutricionista nutricionista;
}
