package com.artgui.nutrisis.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente extends Usuario {
    private float altura;
    private float peso;
    private String genero;
    private Date dataNascimento;
    
}
