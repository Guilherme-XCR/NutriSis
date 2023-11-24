package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Ingrediente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMViewIngrediente extends AbstractTableModel {

    private List<Ingrediente> lista;
    private final int COL_NOME = 0;
    private final int COL_UNIDADE_MEDIDA = 1;
    private final int COL_QUANTIDADE = 2;

    public TMViewIngrediente(List<Ingrediente> lst) {
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
        Ingrediente aux = new Ingrediente();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = (Ingrediente) lista.get(rowIndex);
            switch (columnIndex) {
                case COL_NOME:
                    return aux.getNome();
                case COL_UNIDADE_MEDIDA:
                    return aux.getUnidadeMedida();
                case COL_QUANTIDADE:
                    return aux.getQuantidade();

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
            case COL_UNIDADE_MEDIDA:
                return "Und. Medida";
            case COL_QUANTIDADE:
                return "Quantidade";
            default:
                break;
        }
        return "";
    }
}