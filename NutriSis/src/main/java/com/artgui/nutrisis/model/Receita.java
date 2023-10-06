package com.artgui.nutrisis.model;

import java.time.LocalTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Receita {
    private int id;
    private String nome;
    private String modoPreparo;
    private LocalTime tempoPreparo;
    private int porcoes;
    private String categoria;
    private List<Ingrediente> ingredientes;
    private Nutricionista nutricionista;
}
