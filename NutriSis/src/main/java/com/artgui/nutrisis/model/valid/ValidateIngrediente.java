package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.model.exceptions.IngredienteException;
import com.artgui.nutrisis.model.exceptions.ReceitaException;
import com.artgui.nutrisis.model.Ingrediente;

public class ValidateIngrediente {

    public Ingrediente validaCamposEntrada(String nome, String unidadeMedida, String quantidade) {

        if (nome == null || nome.isEmpty()) {
            throw new IngredienteException("Nome do ingrediente não pode estar em branco.");
        }

        if (unidadeMedida == null || unidadeMedida.isEmpty()) {
            throw new IngredienteException("Unidade de medida não pode estar em branco.");
        }

        if (!quantidade.replaceAll("\\s", "").matches("^\\d+(\\.\\d+)?$")) {
            throw new ReceitaException("Quantidade escrita de formato invalido.");
        }

        float q = Float.parseFloat(quantidade.replaceAll("\\s", ""));
        if (q <= 0) {
            throw new IngredienteException("Quantidade inválida.");
        }

        return new Ingrediente(
                nome,
                unidadeMedida,
                q
        );
    }
}
