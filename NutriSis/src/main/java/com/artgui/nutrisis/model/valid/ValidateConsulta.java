//package com.artgui.nutrisis.model.valid;
//
//import com.artgui.nutrisis.exceptions.ConsultaException;
//import com.artgui.nutrisis.model.Cliente;
//import com.artgui.nutrisis.model.Consulta;
//import com.artgui.nutrisis.model.Nutricionista;
//
//public class ValidateConsulta {
//
//    public Consulta validaCamposEntrada(
//            String data,
//            String resumo,
//            String status,
//            Cliente cliente,
//            Nutricionista nutricionista
//    ) {
//
//        if (data == null || data.isEmpty()) {
//            throw new ConsultaException("Nome da dieta não pode estar em branco.");
//        }
//        if (resumo == null || resumo.isEmpty()) {
//            throw new ConsultaException("Nome da dieta não pode estar em branco.");
//        }
//        if (status == null || status.isEmpty()) {
//            throw new ConsultaException("Nome da dieta não pode estar em branco.");
//        }
//        if (cliente == null) {
//            throw new ConsultaException("Nome da dieta não pode estar em branco.");
//        }
//        if (nutricionista == null) {
//            throw new ConsultaException("Nome da dieta não pode estar em branco.");
//        }
//        
//
//
//        // Se todas as validações passarem, crie um novo objeto Dieta
//        return new Consulta(data, resumo, status, cliente, nutricionista);
//    }
//
//}
