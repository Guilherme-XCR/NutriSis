package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewNutricionista;
import com.artgui.nutrisis.controller.tablemodel.TMViewReceita;
import com.artgui.nutrisis.model.exceptions.ClienteException;
import com.artgui.nutrisis.model.Nutricionista;
import com.artgui.nutrisis.model.dao.NutricionistaDAO;
import com.artgui.nutrisis.model.valid.ValidateNutricionista;
import java.util.List;
import javax.swing.JTable;

public class NutricionistaController {

    private NutricionistaDAO repositorio;

    public NutricionistaController() {
        repositorio = new NutricionistaDAO();
    }

    public void cadastrar(
            String nome,
            String email,
            String senha,
            String cpf,
            String telefone,
            String crn,
            String especializacao
    ) {
        ValidateNutricionista valid = new ValidateNutricionista();
        Nutricionista nutricionista = valid.validaCamposEntrada(
                nome,
                email,
                senha,
                cpf,
                telefone,
                crn,
                especializacao
        );
        repositorio.save(nutricionista);
    }

    public Nutricionista buscarPorEmail(String email) {

        return repositorio.findByEmail(email);

    }

    public void atualizar(
            int id,
            String nome,
            String email,
            String senha,
            String cpf,
            String telefone,
            String crn,
            String especializacao
    ) {
        ValidateNutricionista valid = new ValidateNutricionista();
        Nutricionista nutricionista = valid.validaCamposEntrada(
                nome,
                email,
                senha,
                cpf,
                telefone,
                crn,
                especializacao
        );
        nutricionista.setId(id);
        repositorio.update(nutricionista);
    }

    public void excluir(Nutricionista nutricionista) {
        if (nutricionista != null) {
            repositorio.delete(nutricionista.getId());
        } else {
            throw new ClienteException("Error - Nutricionista inexistente.");
        }
    }

    public Nutricionista login(String email, String senha) {

        if (email != null && email.matches("^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+)\\.([A-Za-z]{2,4})$")) {
            Nutricionista nutricionista = this.buscarPorEmail(email);
            if (nutricionista != null && senha.equals(nutricionista.getSenha())) {
                return nutricionista;
            }
        }
        return null;
    }
    
    
    public void atualizarTabela(JTable grd){
        TMViewNutricionista tmNutricionista = new TMViewNutricionista(repositorio.findAll());
        grd.setModel(tmNutricionista);
    }
    
    public void atualizarTabela(JTable grd, String nome) {
        List lst = repositorio.filterByName(nome);

        TMViewNutricionista tableModel = new TMViewNutricionista(lst);
        grd.setModel(tableModel);
    }
    
}
