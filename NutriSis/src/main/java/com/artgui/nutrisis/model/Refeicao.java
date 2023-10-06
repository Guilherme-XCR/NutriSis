package com.artgui.nutrisis.model;

import java.time.LocalTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Refeicao {
    private int id;
    private String nome;
    private LocalTime horario;
    private float calorias;
    private List<Receita> receitas;
    private Nutricionista nutricionista;
}
