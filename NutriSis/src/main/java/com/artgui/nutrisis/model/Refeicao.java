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
import javax.persistence.JoinTable;
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
    
    @ManyToMany( fetch = FetchType.EAGER) //cascade = CascadeType.ALL,
    @JoinTable(
        name = "refeicao_receita",
        joinColumns = @JoinColumn(name = "refeicao_id"),
        inverseJoinColumns = @JoinColumn(name = "receita_id")
    )
    private List<Receita> receitas;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_dieta")
    private Dieta dieta;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_nutricionista")    
    private Nutricionista nutricionista;
    
    public Refeicao(
            String nome,
            String horario,
            float calorias,
            List<Receita> receitas,
            Dieta dieta,
            Nutricionista nutricionista
    ){
            this.nome = nome;
            this.horario = horario;
            this.calorias = calorias;
            this.receitas = receitas;
            this.dieta = dieta;
            this.nutricionista = nutricionista;
    }
    
    public void copy(Refeicao outro){
        this.id = outro.getId();
        this.nome = outro.getNome();
        this.horario = outro.getHorario();
        this.calorias = outro.getCalorias();
        this.receitas = outro.getReceitas();
        this.dieta = outro.getDieta();
        this.nutricionista = outro.getNutricionista();
    }
}
