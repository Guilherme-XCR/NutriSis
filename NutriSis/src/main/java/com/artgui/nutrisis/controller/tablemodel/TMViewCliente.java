package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMViewCliente extends AbstractTableModel {

    private List<Object> lista;
    
    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_SOBRENOME = 2;
    private final int COL_ALTURA = 3;
    private final int COL_PESO = 4;
    private final int COL_GENERO = 5;
    private final int COL_BIOTIPO = 6;
    
    public TMViewCliente(List<Object> lst){
        this.lista = lst;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Cliente aux = new Cliente();
        if (lista.isEmpty()){
            return aux;
        }else{
            
        }
        
        aux = (Cliente) lista.get(rowIndex);

        //verifica qual valor deve ser retornado
        switch (columnIndex) {
            case COL_ID:
                return aux.getId();
            case COL_NOME:
                return aux.getNome();
            case COL_SOBRENOME:
               // return aux.getSobrenome();
            case COL_ALTURA:
                return aux.getAltura();
            case COL_PESO:
                return aux.getPeso();
            case COL_GENERO:
                return aux.getGenero();
            case COL_BIOTIPO:
              //  return aux.getBiotipo();
            default:
                break;

        }
        return aux;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
        
    @Override
    public String getColumnName(int columnIndex){
        switch (columnIndex) {
            case COL_ID:
                return "Id";
            case COL_NOME:
                return "Nome";
            case COL_SOBRENOME:
                return "Sobrenome";
            case COL_ALTURA:
                return "ALtura";
            case COL_PESO:
                return "Peso";
            case COL_GENERO:
                return "Genero";
            case COL_BIOTIPO:
                return "Biotipo";
            default:
                break;
        }
        return "";
    }
    
}
