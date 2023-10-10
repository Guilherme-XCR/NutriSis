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
                                        float calorias,
                                        List<Receita> receitas,
                                        Dieta dieta,
                                        Nutricionista nutricionista
                                        ){
        return new Refeicao(nome, horario, calorias, receitas, dieta, nutricionista);
    }
}
