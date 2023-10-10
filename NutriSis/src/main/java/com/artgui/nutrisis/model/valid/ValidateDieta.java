package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.DietaException;
import com.artgui.nutrisis.model.Dieta;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.Refeicao;
import java.util.ArrayList;
import java.util.List;

public class ValidateDieta {

    public Dieta validaCamposEntrada ( String nome,String descricao,int diasDuracao,List<Refeicao> refeicoes,Nutricionista nutricionista){
        // Realize as validações necessárias aqui
        
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
        return new Dieta(nome, descricao, diasDuracao, refeicoes, nutricionista);
    }
}

