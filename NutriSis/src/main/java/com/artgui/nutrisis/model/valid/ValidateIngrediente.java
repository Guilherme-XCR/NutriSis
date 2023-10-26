package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.IngredienteException;
import com.artgui.nutrisis.model.Ingrediente;

public class ValidateIngrediente {
    
    public Ingrediente validaCamposEntrada(String nome, String unidadeMedida, float quantidade) {

        if (nome == null || nome.isEmpty()) {
            throw new IngredienteException("Nome do ingrediente não pode estar em branco.");
        }

        if (unidadeMedida == null || unidadeMedida.isEmpty()) {
            throw new IngredienteException("Unidade de medida não pode estar em branco.");
        }

        if (quantidade <= 0) {
            throw new IngredienteException("Quantidade inválida.");
        }

        // Se todas as validações passarem, crie um novo objeto Ingrediente
        return new Ingrediente(nome, unidadeMedida, quantidade);
    }
}
