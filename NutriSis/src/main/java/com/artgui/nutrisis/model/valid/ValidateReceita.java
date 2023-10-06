package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.ReceitaException;
import com.artgui.nutrisis.model.Receita;

public class ValidateReceita {
    
    public Receita validaCamposEntrada(int idRefeicao, int idNutricionista, String titulo, String modoDePreparo, int tempoPreparoMin, int porcoes, String dificuldade, String categoria) {
        // Realize as validações necessárias aqui

        if (idRefeicao <= 0) {
            throw new ReceitaException("Id de refeição inválido.");
        }
        
        if (idNutricionista <= 0) {
            throw new ReceitaException("Id de nutricionista inválido.");
        }

        if (titulo == null || titulo.isEmpty()) {
            throw new ReceitaException("Título não pode estar em branco.");
        }

        if (modoDePreparo == null || modoDePreparo.isEmpty()) {
            throw new ReceitaException("Modo de preparo não pode estar em branco.");
        }

        if (tempoPreparoMin <= 0) {
            throw new ReceitaException("Tempo de preparo inválido.");
        }
        
        if (porcoes <= 0) {
            throw new ReceitaException("Número de porções inválido.");
        }

        if (dificuldade == null || dificuldade.isEmpty()) {
            throw new ReceitaException("Dificuldade não pode estar em branco.");
        }

        if (categoria == null || categoria.isEmpty()) {
            throw new ReceitaException("Categoria não pode estar em branco.");
        }

        // Se todas as validações passarem, crie um novo objeto Receita
        return new Receita();
    }
}
