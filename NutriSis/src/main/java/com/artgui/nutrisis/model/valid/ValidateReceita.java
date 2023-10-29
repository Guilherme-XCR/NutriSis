package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.model.Ingrediente;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import java.util.List;

public class ValidateReceita {
    
    public Receita validaCamposEntrada(String nome, String modoPreparo, int tempoPreparo, int porcoes, String categoria, List<Ingrediente> ingredientes, Nutricionista nutricionista) {
     
        return new Receita(nome, modoPreparo, tempoPreparo, porcoes, categoria, ingredientes, nutricionista);
    }

}
