package com.artgui.nutrisis.model;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

//@Entity

public class RegistroDiario implements Serializable {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String dataDoDia;
    private int quantidadeDeRefeicoe;
    
    private List<String> DescricoesDasRefeicoes;
    
    //@ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "id_acompanhamento")
    private Acompanhamento acompanhamento;
}
