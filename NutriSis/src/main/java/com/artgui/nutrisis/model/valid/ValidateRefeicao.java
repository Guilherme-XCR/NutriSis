package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.RefeicaoException;
import com.artgui.nutrisis.model.Refeicao;

public class ValidateRefeicao {
    
    public Refeicao validaCamposEntrada(int idDieta, String horario, float peso, String detalhes) {
        // Realize as validações necessárias aqui

        if (idDieta <= -1) {
            throw new RefeicaoException("Id de dieta inválido.");
        }
        
        if (horario == null || horario.isEmpty()) {
            throw new RefeicaoException("Horario não pode estar em branco.");
        }

        if (peso < 0) {
            throw new RefeicaoException("Peso não pode ser negativo.");
        }
        
        if (horario == null || horario.isEmpty()) {
            throw new RefeicaoException("Horario não pode estar em branco.");
        }
        
        
        if (detalhes == null || detalhes.isEmpty()) {
            throw new RefeicaoException("Detalhes não pode estar em branco.");
        }
        
        // Se todas as validações passarem, crie um novo objeto Dieta
        return new Refeicao();
    }
}
