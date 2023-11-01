package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.DietaException;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Refeicao;
import java.util.List;

public class ValidateDieta {

    public Dieta validaCamposEntrada ( String nome,String descricao,String diasDuracao,List<Refeicao> refeicoes,Nutricionista nutricionista){
        
        if (nome == null || nome.isEmpty()) {
            throw new DietaException("Nome da dieta não pode estar em branco.");
        }

        if (descricao == null || descricao.isEmpty()) {
            throw new DietaException("Descrição da dieta não pode estar em branco.");
        }
        
        
        if (!diasDuracao.replaceAll("\\s", "").matches("^[0-9]{1,8}$")) {
            throw new DietaException("Dias não pode estar vazia.");
        }
        
        int dD = Integer.parseInt(diasDuracao.replaceAll("\\s", ""));
        if (dD <= 0) {
            throw new DietaException("A Dias deve ser maior que zero.");
        }

        // Se todas as validações passarem, crie um novo objeto Dieta
        return new Dieta(nome, descricao, dD, refeicoes, nutricionista);
    }
}

