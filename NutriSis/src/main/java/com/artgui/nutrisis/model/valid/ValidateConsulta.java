package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.Consulta;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.exceptions.ClienteException;
import com.artgui.nutrisis.model.exceptions.ConsultaException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateConsulta {

    public Consulta validaCamposEntrada(
            String data,
            String resumo,
            String status,
            Cliente cliente,
            Nutricionista nutricionista
    ) {

        this.isValidData(data);
        
        if (status == null || status.isEmpty()) {
            throw new ConsultaException("Status não pode estar em branco.");
        }
        if (cliente == null) {
            throw new ConsultaException("Cliente Inválido");
        }
        if (nutricionista == null) {
            throw new ConsultaException("Nutricionista Inválido");
        }
        


        // Se todas as validações passarem, crie um novo objeto Dieta
        return new Consulta(data, resumo, status, cliente, nutricionista);
    }

     private void isValidData(String data) {

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        formatoData.setLenient(false);

        try {
            Date d = formatoData.parse(data);

            if (!dataValida(d)) {
                throw new ConsultaException("Data fora do intervalo aceitável.");
            }

        } catch (ParseException e) {
            throw new ConsultaException("Data inválida. Certifique-se de seguir o formato dd/MM/yyyy.");
        }
    }

    private static boolean dataValida(Date data) {
        Date dataMinima = parseData("01/11/2023");
        Date dataMaxima = parseData("31/12/2123");

        return data.after(dataMinima) && data.before(dataMaxima);
    }

    // Método auxiliar para fazer o parse de uma string para Date
    private static Date parseData(String dataString) {
        try {
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            return formatoData.parse(dataString);
        } catch (ParseException e) {
            e.printStackTrace(); // Lidar com a exceção conforme necessário
            return null;
        }
    }
    
}
