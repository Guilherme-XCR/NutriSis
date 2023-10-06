package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.NutricionistaException;
import com.artgui.nutrisis.model.Nutricionista;
import java.util.Date;
import java.util.regex.Pattern;

public class ValidateNutricionista {
    
    public Nutricionista validaCamposEntrada(String nome, String sobrenome, String email, String telefone, String cpf, Date dataNascimento, float salario, String crn, String especializacao, String descricao) {
        // Realize as validações necessárias aqui

        if (nome == null || nome.isEmpty()) {
            throw new NutricionistaException("Nome não pode estar em branco.");
        }

        if (sobrenome == null || sobrenome.isEmpty()) {
            throw new NutricionistaException("Sobrenome não pode estar em branco.");
        }

        if (email == null || !isValidEmail(email)) {
            throw new NutricionistaException("Email inválido.");
        }

        if (telefone == null || telefone.isEmpty()) {
            throw new NutricionistaException("Telefone não pode estar em branco.");
        }

        if (cpf == null || !isValidCPF(cpf)) {
            throw new NutricionistaException("CPF inválido.");
        
        }
            
        if (dataNascimento == null) {
            throw new NutricionistaException("Data de nascimento não pode ser nula.");
        }
        
        if (salario < 0) {
            throw new NutricionistaException("Salário não pode ser negativo.");
        }

        if (crn == null || crn.isEmpty()) {
            throw new NutricionistaException("CRN não pode estar em branco.");
        }

        if (especializacao == null || especializacao.isEmpty()) {
            throw new NutricionistaException("Especialização não pode estar em branco.");
        }

        if (descricao == null || descricao.isEmpty()) {
            throw new NutricionistaException("Descrição não pode estar em branco.");
        }

        // Se todas as validações passarem, crie um novo objeto Nutricionista
        return new Nutricionista();
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