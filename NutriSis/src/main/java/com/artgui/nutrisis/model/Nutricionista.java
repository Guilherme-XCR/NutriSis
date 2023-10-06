package com.artgui.nutrisis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Nutricionista extends Usuario {
    private String crn;
    private String especializacao;
}
