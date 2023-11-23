package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.model.exceptions.AcompanhamentoException;
import com.artgui.nutrisis.model.Acompanhamento;

public class ValidateAcompanhamento {
       
    public Acompanhamento validaAcompanhamento(
            String dataInicio,
            String dataFinal
    ){

        if (dataInicio == null || dataInicio.isEmpty()) {
            throw new AcompanhamentoException("Data de inicio não pode estar em branco.");
        }
        
        if (dataFinal == null || dataFinal.isEmpty()) {
            throw new AcompanhamentoException("Data de final não pode estar em branco.");
        }
        
    return new Acompanhamento(dataInicio, dataFinal);
    }  
}
