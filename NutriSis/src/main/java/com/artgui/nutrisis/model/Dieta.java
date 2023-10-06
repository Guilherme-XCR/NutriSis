package com.artgui.nutrisis.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Dieta {
    private int id;
    private String nome;
    private String descricao;
    private int diasDuracao;
    
    private List<Refeicao> refeicoes;
    private Nutricionista nutricionista;
}
