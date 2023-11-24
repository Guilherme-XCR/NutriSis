package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Refeicao;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMViewRefeicao extends AbstractTableModel {

    private List<Refeicao> lista;
    private final int COL_NOME = 0;

    public TMViewRefeicao(List<Refeicao> lst) {
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
        Refeicao aux = new Refeicao();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = (Refeicao) lista.get(rowIndex);
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
