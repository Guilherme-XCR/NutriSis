package com.artgui.nutrisis.model.valid;

import com.artgui.nutrisis.model.exceptions.ClienteException;
import com.artgui.nutrisis.model.Cliente;
import com.artgui.nutrisis.model.dao.ClienteDAO;
import com.mysql.cj.protocol.a.MysqlTextValueDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class ValidateCliente {

    private ClienteDAO repositorio;

    public ValidateCliente() {
        repositorio = new ClienteDAO();
    }

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
            String numeroCartao
    ) {

        if (nome == null || nome.isEmpty()) {
            throw new ClienteException("Nome não pode estar em branco.");
        }

        if (!nome.matches("^[A-Za-zÀ-ÖØ-öø-ÿ\\s]+$")) {
            throw new ClienteException("Nome inválido.");
        }

        if (email == null || email.isEmpty()) {
            throw new ClienteException("Email não pode estar em branco.");
        }

        if (!isValidEmail(email)) {
            throw new ClienteException("Email inválido.");
        }

        Cliente aux = repositorio.findByEmail(email);
        if (aux != null) {
            throw new ClienteException("Email já esta sendo usado por outro usuário.");
        }

        if (senha == null || senha.isEmpty()) {
            throw new ClienteException("Senha não pode estar em branco.");
        }

        if (!senha.equals(confirmarSenha)) {
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

        if (altura == null || altura.isEmpty() || !altura.matches("^[0-9]{1,3}$")) {
            throw new ClienteException("Altura não pode estar vazia.");
        }

        int a = Integer.parseInt(altura.replaceAll("\\s", ""));
        if (a < 0 || a > 300) {
            throw new ClienteException("Altura inválida.");
        }

        if (peso == null || peso.equals(".")) {
            throw new ClienteException("Peso  não pode estar vazio.");
        }

        float p = Float.parseFloat(peso.replaceAll("\\s", ""));
        if (p <= 0.0 || p > 500.0) {
            throw new ClienteException("Peso inválido.");
        }

        if (genero.equals("Escolha")) {
            throw new ClienteException("Você precisa escolher um gênero.");
        }

        if (dataNascimento == null || dataNascimento.isEmpty()) {
            throw new ClienteException("Data Nascimento não pode estar em branco.");
        }
        
        this.isValidDataNascimento(dataNascimento);

        if (numeroCartao == null || dataNascimento.isEmpty()) {
            throw new ClienteException("Número de cartão não pode estar em branco.");
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
                numeroCartao
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
        String regex = "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+)\\.([A-Za-z]{2,4})$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }

    private void isValidDataNascimento(String dataNascimento) {

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        formatoData.setLenient(false);

        try {
            Date data = formatoData.parse(dataNascimento);

            if (!dataValida(data)) {
                throw new ClienteException("Data fora do intervalo aceitável.");
            }

        } catch (ParseException e) {
            throw new ClienteException("Data inválida. Certifique-se de seguir o formato dd/MM/yyyy.");
        }
    }

    private static boolean dataValida(Date data) {
        Date dataMinima = parseData("01/01/1900");
        Date dataMaxima = parseData("31/12/2023");

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
