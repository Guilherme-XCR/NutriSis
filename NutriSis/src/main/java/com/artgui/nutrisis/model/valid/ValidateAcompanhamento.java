package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.ReceitaException;
import com.artgui.nutrisis.model.Acompanhamento;
import com.artgui.nutrisis.model.RegistroDiario;
import java.util.List;

public class ValidateAcompanhamento {
       
    public Acompanhamento validaAcompanhamento(
            String dataInicio,
            String dataFinal,
            List<RegistroDiario> registrosDiarios
                   
    ){

        if (dataInicio == null || dataInicio.isEmpty()) {
            throw new ReceitaException("Data de inicio não pode estar em branco.");
        }
        
        if (dataFinal == null || dataFinal.isEmpty()) {
            throw new ReceitaException("Data de final não pode estar em branco.");
        }
        
    return new Acompanhamento(dataInicio, dataFinal, registrosDiarios);
    }  
}
