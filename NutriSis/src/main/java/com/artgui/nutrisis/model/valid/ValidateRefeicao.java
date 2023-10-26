package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.IngredienteException;
import com.artgui.nutrisis.exceptions.RefeicaoException;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Ingrediente;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import com.artgui.nutrisis.model.Refeicao;
import java.util.List;

public class ValidateRefeicao {
    
    public Refeicao validaCamposEntrada(
            String nome,
            String horario,
            float calorias,
            List<Receita> receitas, 
            Dieta dieta,
            Nutricionista nutricionista
    ){
  
        if (nome == null || nome.isEmpty()) {
            throw new RefeicaoException("Nome do ingrediente não pode estar em branco.");
        }

        if (horario != null && !horario.isEmpty()) {
            String []vet = horario.split(":");
            if(Integer.parseInt(vet[0]) >= 0 &&  Integer.parseInt(vet[0]) <= 24)
            {
                if(Integer.parseInt(vet[1]) >= 0 &&  Integer.parseInt(vet[1]) <= 59)
                {
                
                }
                else{
                    throw new RefeicaoException("Hora invalida.");
                
                }
            }
            else
            {
                throw new RefeicaoException("Hora invalida.");
            }    
        }
        else{
            throw new RefeicaoException("Campo Horario não pode estar vazio.");
        }

        if (calorias <= 0) {
            throw new RefeicaoException("Calorias inválida.");
        }

        if (dieta == null) {
            throw new RefeicaoException("Dieta não pode estar em branco.");
        }

        if (nutricionista == null) {
            throw new IngredienteException("Nutricionista não pode estar em branco.");
        }

        // Se todas as validações passarem, crie um novo objeto Ingrediente
        return new Refeicao();
    }
}
