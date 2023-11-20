package com.artgui.nutrisis.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

//@Entity

public class Acompanhamento implements Serializable {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String dataInicio;
    private String dataFinal;

    //@OneToMany(mappedBy = "receita", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<RegistroDiario> registrosDiarios;

    public Acompanhamento(
            String dataInicio,
            String dataFinal,
            List<RegistroDiario> registrosDiarios
    ) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.registrosDiarios = registrosDiarios;
    }
}