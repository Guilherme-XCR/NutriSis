package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.IngredienteException;
import com.artgui.nutrisis.model.Ingrediente;

public class ValidateIngrediente {
    
    public Ingrediente validaCamposEntrada(int idReceita, String nome, String unidadeMedida, float quantidade, String descricao, String origem) {
        // Realize as validações necessárias aqui

        if (idReceita <= 0) {
            throw new IngredienteException("Id de receita inválido.");
        }

        if (nome == null || nome.isEmpty()) {
            throw new IngredienteException("Nome do ingrediente não pode estar em branco.");
        }

        if (unidadeMedida == null || unidadeMedida.isEmpty()) {
            throw new IngredienteException("Unidade de medida não pode estar em branco.");
        }

        if (quantidade <= 0) {
            throw new IngredienteException("Quantidade inválida.");
        }

        if (descricao == null || descricao.isEmpty()) {
            throw new IngredienteException("Descrição não pode estar em branco.");
        }

        if (origem == null || origem.isEmpty()) {
            throw new IngredienteException("Origem não pode estar em branco.");
        }

        // Se todas as validações passarem, crie um novo objeto Ingrediente
        return new Ingrediente();
    }
}
