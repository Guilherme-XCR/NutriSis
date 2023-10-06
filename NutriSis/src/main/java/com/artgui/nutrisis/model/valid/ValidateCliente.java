package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.ClienteException;
import com.artgui.nutrisis.model.Cliente;
import java.util.Date;
import java.util.regex.Pattern;

public class ValidateCliente {

    public Cliente validaCamposEntrada(String nome, String sobrenome, String email, String telefone, String cpf, Date dataNascimento, float altura, float peso, String genero, String biotipo) {
        // Realize as validações necessárias aqui

        if (altura <= 0 || altura > 3.0) {
            throw new ClienteException("Altura inválida.");
        }

        if (peso <= 0 || peso > 500.0) {
            throw new ClienteException("Peso inválido.");
        }

        if (genero == null || genero.isEmpty()) {
            throw new ClienteException("Gênero não pode estar em branco.");
        }

        if (biotipo == null || biotipo.isEmpty()) {
            throw new ClienteException("Biotipo não pode estar em branco.");
        }

        // Validações para campos herdados da classe Usuario
        if (nome == null || nome.isEmpty()) {
            throw new ClienteException("Nome não pode estar em branco.");
        }

        if (sobrenome == null || sobrenome.isEmpty()) {
            throw new ClienteException("Sobrenome não pode estar em branco.");
        }

        if (email == null || !isValidEmail(email)) {
            throw new ClienteException("Email inválido.");
        }

        if (telefone == null || telefone.isEmpty()) {
            throw new ClienteException("Telefone não pode estar em branco.");
        }

        if (cpf == null || !isValidCPF(cpf)) {
            throw new ClienteException("CPF inválido.");
        }

        // Se todas as validações passarem, crie um novo objeto Cliente
        return new Cliente();
    }

    private boolean isValidCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int primeiroDigitoVerificador = 11 - (soma % 11);
        if (primeiroDigitoVerificador > 9) {
            primeiroDigitoVerificador = 0;
        }

        soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        soma += primeiroDigitoVerificador * 2;
        int segundoDigitoVerificador = 11 - (soma % 11);
        if (segundoDigitoVerificador > 9) {
            segundoDigitoVerificador = 0;
        }

        return (cpf.charAt(9) - '0' == primeiroDigitoVerificador) && (cpf.charAt(10) - '0' == segundoDigitoVerificador);
    }

    private boolean isValidEmail(String email) {
        // Validar o formato do email usando uma expressão regular
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }
}