package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.DietaException;
import com.artgui.nutrisis.model.Dieta;
import java.util.ArrayList;

public class ValidateDieta {

    public Dieta validaCamposEntrada(int idNutricionista, String nome, String descricao, int diasDuracao) {
        // Realize as validações necessárias aqui

        if (idNutricionista <= -1) {
            throw new DietaException("Id de nutricionista inválido.");
        }
        
        if (nome == null || nome.isEmpty()) {
            throw new DietaException("Nome da dieta não pode estar em branco.");
        }

        if (descricao == null || descricao.isEmpty()) {
            throw new DietaException("Descrição da dieta não pode estar em branco.");
        }

        if (diasDuracao <= 0) {
            throw new DietaException("A duração da dieta deve ser maior que zero.");
        }

        // Se todas as validações passarem, crie um novo objeto Dieta
        return new Dieta();
    }
}

