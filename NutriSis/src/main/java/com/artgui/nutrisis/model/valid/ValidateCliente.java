package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.exceptions.ClienteException;
import com.artgui.nutrisis.model.Cliente;
import java.util.regex.Pattern;

public class ValidateCliente {

    public Cliente validaCamposEntrada(
            String nome, 
            String email, 
            String senha, 
            String confirmarSenha, 
            String cpf, 
            String telefone, 
            String altura, 
            String peso, 
            String genero, 
            String dataNascimento,
            String numeroCartao,
            String senhaCartao
    ) {

        if (nome == null || nome.isEmpty()) {
            throw new ClienteException("Nome não pode estar em branco.");
        }
        
        if (nome == null || !nome.matches("^[A-Za-zÀ-ÖØ-öø-ÿ\\s]+$")) {
            throw new ClienteException("Nome inválido.");
        }
                
        if (email == null || !isValidEmail(email)) {
            throw new ClienteException("Email inválido.");
        }
                
        // String senha
        if (senha == null || senha.isEmpty()){
            throw new ClienteException("Senha não pode estar em branco.");
        }
        
        if (!senha.equals(confirmarSenha)){
            throw new ClienteException("Confirmação de senha incorreta.");
        }
                
        if (cpf == null || !isValidCPF(cpf)) {
            throw new ClienteException("CPF inválido.");
        }
        
        if (telefone == null || telefone.isEmpty()) {
            throw new ClienteException("Telefone não pode estar em branco.");
        }        
        
        if (!telefone.replaceAll("[^0-9]", "").matches("^\\d+$")) {
            throw new ClienteException("Telefone inválido.");
        }
        
        if (!altura.matches("^\\d{3}$")) {
            throw new ClienteException("Altura não pode estar vazia.");
        }
        
        int a = Integer.parseInt(altura.replaceAll("\\s", ""));
        if (a < 0 || a > 300) {
            throw new ClienteException("Altura inválida.");
        }
        
        if (!peso.matches("^\\d{3}\\.\\d{2}$")) {
            throw new ClienteException("Peso  não pode estar vazia.");
        }
 
        float p = Float.parseFloat(peso.replaceAll("\\s", ""));
        if (p <= 0 || p > 500.0) {
            throw new ClienteException("Peso inválido.");
        }    
                
        if (genero.equals("Escolha")) {
            throw new ClienteException("Você precisa escolher um gênero.");
        }
        
        if (dataNascimento == null || dataNascimento.isEmpty()) {
            throw new ClienteException("Data Nascimento não pode estar em branco.");
        }
        
        if (!dataNascimento.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
            throw new ClienteException("Data de Nascimento inválida.");
        }
        
        if (numeroCartao== null || dataNascimento.isEmpty()){
            throw new ClienteException("Número de cartão inválido.");
        }
        
        if (senhaCartao== null || dataNascimento.isEmpty()){
            throw new ClienteException("Senha de cartão inválida.");
        }

        return new Cliente(
                nome, 
                email, 
                senha, 
                cpf, 
                telefone, 
                a, 
                p, 
                genero, 
                dataNascimento,
                numeroCartao,
                senhaCartao
        );
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