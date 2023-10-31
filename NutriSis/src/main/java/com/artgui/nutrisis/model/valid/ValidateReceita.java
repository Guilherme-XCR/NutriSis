package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.ReceitaException;
import com.artgui.nutrisis.model.Ingrediente;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import java.util.List;

public class ValidateReceita {

    public Receita validaCamposEntrada(
            String nome,
            String modoPreparo,
            String tempoPreparo,
            String porcoes,
            String categoria,
            List<Ingrediente> ingredientes,
            Nutricionista nutricionista
    ) {

        if (nome == null || nome.isEmpty()) {
            throw new ReceitaException("Nome não pode estar em branco.");
        }

        if (modoPreparo == null || modoPreparo.isEmpty()) {
            throw new ReceitaException("Modo de preparo não pode estar em branco.");
        }

        if (tempoPreparo == null || nome.isEmpty()) {
            throw new ReceitaException("Nome não pode estar em branco.");
        }

        if (tempoPreparo.replaceAll("\\s", "").matches("^[0-9]{1,8}$")) {
            throw new ReceitaException("Insira um valor no Tempo de Preparo.");
        }

        if (porcoes == null || nome.isEmpty()) {
            throw new ReceitaException("Nome não pode estar em branco.");
        }

        if (porcoes.replaceAll("\\s", "").matches("^[0-9]{1,8}$")) {
            throw new ReceitaException("Nome não pode estar em branco.");
        }

        if (categoria == null || categoria.isEmpty()) {
            throw new ReceitaException("Categoria não pode estar em branco.");
        }
        if (ingredientes == null || nome.isEmpty()) {
            throw new ReceitaException("Adicione pelo menos um ingrediente.");
        }

        return new Receita(
                nome,
                modoPreparo,
                Integer.parseInt(tempoPreparo),
                Integer.parseInt(porcoes),
                categoria,
                ingredientes,
                nutricionista
        );
    }
}
