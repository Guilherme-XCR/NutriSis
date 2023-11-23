package com.artgui.nutrisis.model;

import java.io.Serializable;
import javax.persistence.Entity;
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

public class RegistroDiario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String dataDoDia;
    private int quantidadeDeRefeicoes;
    private String descricaoDasRefeicoes;

    @ManyToOne
    @JoinColumn(name = "acompanhamento_id")
    private Acompanhamento acompanhamento;

    public RegistroDiario(String dataDoDia, int quantidadeDeRefeicoes, String descricaoDasRefeicoes) {
        this.dataDoDia = dataDoDia;
        this.quantidadeDeRefeicoes = quantidadeDeRefeicoes;
        this.descricaoDasRefeicoes = descricaoDasRefeicoes;
    }
    
    public void copy(RegistroDiario outro){
        this.dataDoDia = outro.getDataDoDia();
        this.quantidadeDeRefeicoes = outro.getQuantidadeDeRefeicoes();
        this.descricaoDasRefeicoes = outro.getDescricaoDasRefeicoes();
    }
}
