package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMViewCliente extends AbstractTableModel {

    private List<Cliente> lista;
    private final int COL_NOME = 0;
    private final int COL_EMAIL = 1;
    private final int COL_TELEFONE = 2;

    public TMViewCliente(List<Cliente> lst){
        this.lista = lst;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente aux = new Cliente();
        if (lista.isEmpty()){
            return aux;
        }else{
            aux = (Cliente) lista.get(rowIndex);
            switch (columnIndex) {
                case COL_NOME:
                    return aux.getNome();
                case COL_EMAIL:
                    return aux.getEmail();
                case COL_TELEFONE:
                    return aux.getTelefone();
                default:
                    break;
            }
            return aux;
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
        
    @Override
    public String getColumnName(int columnIndex){
        switch (columnIndex) {
                case COL_NOME:
                    return "Nome";
                case COL_EMAIL:
                    return "Email";
                case COL_TELEFONE:
                    return "Telefone";
                default:
                    break;
            }
            return "";
    }
}
