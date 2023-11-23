package com.artgui.nutrisis.controller;

import com.artgui.nutrisis.controller.tablemodel.TMViewVizualizarRegistroDiario;
import com.artgui.nutrisis.model.RegistroDiario;
import com.artgui.nutrisis.model.dao.RegistroDiarioDAO;
import com.artgui.nutrisis.model.exceptions.RegistroDiarioException;
import com.artgui.nutrisis.model.valid.ValidateRegistroDiario;
import java.util.List;
import javax.swing.JTable;

public class RegistroDiarioController {
    
 private RegistroDiarioDAO repositorio;

    public RegistroDiarioController() {
        repositorio = new RegistroDiarioDAO();
    }

    public void cadastrar(
            String dataDoDia,
            String quantidadeDeRefeicoes,
            String descricaoDasRefeicoes
    ) {
        ValidateRegistroDiario valid = new ValidateRegistroDiario();
        RegistroDiario registroDiario = valid.validaRegistroDiario(dataDoDia, quantidadeDeRefeicoes, descricaoDasRefeicoes);

        repositorio.save(registroDiario);
    }

    public void atualizar(
            int id,
            String dataDoDia,
            String quantidadeDeRefeicoes,
            String descricaoDasRefeicoes
    ) {
        ValidateRegistroDiario valid = new ValidateRegistroDiario();
        RegistroDiario registroDiario = valid.validaRegistroDiario(dataDoDia, quantidadeDeRefeicoes, descricaoDasRefeicoes);

        registroDiario.setId(id);
        
        repositorio.update(registroDiario);
    }

    

    public void excluir(RegistroDiario registroDiario) {
        if (registroDiario != null) {
            repositorio.delete(registroDiario.getId());
        } else {
            throw new RegistroDiarioException("Error - Registro Diario inexistente.");
        }
    }
    
    public RegistroDiario criar(String dataDoDia, String quantidadeDeRefeicoes, String descricaoDasRefeicoes){
        ValidateRegistroDiario valid = new ValidateRegistroDiario();
        RegistroDiario registroDiario = valid.validaRegistroDiario(dataDoDia, quantidadeDeRefeicoes, descricaoDasRefeicoes);

        return registroDiario;
    }
    
    
    public void atualizarTabelaVizualizar(JTable grd, List<RegistroDiario> RegistrosDiarios) {
        
        TMViewVizualizarRegistroDiario tmReceita = new TMViewVizualizarRegistroDiario(RegistrosDiarios);
        grd.setModel(tmReceita);
    }
}
