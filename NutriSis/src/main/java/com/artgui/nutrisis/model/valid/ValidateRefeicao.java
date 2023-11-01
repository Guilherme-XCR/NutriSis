package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.RefeicaoException;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Receita;
import com.artgui.nutrisis.model.Refeicao;
import java.util.List;

public class ValidateRefeicao {

    public Refeicao validaCamposEntrada(
            String nome,
            String horario,
            String calorias,
            List<Receita> receitas,
            Dieta dieta,
            Nutricionista nutricionista
    ) {

        if (nome == null || nome.isEmpty()) {
            throw new RefeicaoException("Nome do ingrediente não pode estar em branco.");
        }

        String[] vet = horario.split(":");
        if(!vet[0].replaceAll("\\s", "").isEmpty() 
                || !vet[1].replaceAll("\\s", "").isEmpty())
        {
            int hora = Integer.parseInt(vet[0]);
            int minuto = Integer.parseInt(vet[0]);
            
            if(hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60){
                throw new RefeicaoException("Hora inválida.");
            }
        }else{
            throw new RefeicaoException("Hora não pode estar vazia.");
        }

        if (!calorias.replaceAll("\\s", "").matches("^[0-9]{1,8}$")) {
            throw new RefeicaoException("Insira um valor no Calorias.");
        }

        int c = Integer.parseInt(calorias.replaceAll("\\s", ""));
        if (c <= 0) {
            throw new RefeicaoException("Calorias inválida.");
        }

        if (nutricionista == null) {
            throw new RefeicaoException("Nutricionista não pode estar em branco.");
        }

        // Se todas as validações passarem, crie um novo objeto Ingrediente
        return new Refeicao(
                nome,
                horario,
                c,
                receitas,
                dieta,
                nutricionista
        );
    }
}
