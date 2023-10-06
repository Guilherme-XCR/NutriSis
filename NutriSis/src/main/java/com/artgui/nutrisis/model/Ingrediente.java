package com.artgui.nutrisis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ingrediente {
    private int id;
    private String nome;
    private String unidadeMedida;
    private float quantidade;
}
