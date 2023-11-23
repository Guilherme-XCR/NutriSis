package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.model.RegistroDiario;
import com.artgui.nutrisis.model.exceptions.RegistroDiarioException;

public class ValidateRegistroDiario {

    public RegistroDiario validaRegistroDiario(
            String dataDoDia,
            String quantidadeDeRefeicoes,
            String descricoesDasRefeicoes
    ) {

        if (dataDoDia == null || dataDoDia.isEmpty()) {
            throw new RegistroDiarioException("Data não pode estar em branco.");
        }
        int qtd = Integer.parseInt(quantidadeDeRefeicoes.replaceAll("\\s", ""));
        if (qtd <= 0) {
            throw new RegistroDiarioException("A Quantidade de Refeições deve ser maior que zero.");
        }
        if (descricoesDasRefeicoes == null || descricoesDasRefeicoes.isEmpty()) {
            throw new RegistroDiarioException("Data de inicio não pode estar em branco.");
        }

        return new RegistroDiario(dataDoDia, qtd, descricoesDasRefeicoes);
    }
}
