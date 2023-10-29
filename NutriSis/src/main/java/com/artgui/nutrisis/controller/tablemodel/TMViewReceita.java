package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Receita;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMViewReceita extends AbstractTableModel {

    private List<Receita> lista;

    private final int COL_NOME = 0;

    public TMViewReceita(List<Receita> lst) {
        this.lista = lst;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Receita aux = new Receita();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = (Receita) lista.get(rowIndex);
            switch (columnIndex) {
                case COL_NOME:
                    return aux.getNome();
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
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case COL_NOME:
                return "Nome";
            default:
                break;
        }
        return "";
    }
}