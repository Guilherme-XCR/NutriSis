package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Acompanhamento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMViewAcompanhamentoCliente extends AbstractTableModel {

    private List<Acompanhamento> lista;
    private final int COL_DATA_INICIO = 0;
    private final int COL_DATA_FINAL = 1;
    private final int COL_NUTRICIONISTA = 2;

    public TMViewAcompanhamentoCliente(List<Acompanhamento> lst) {
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
        Acompanhamento aux = new Acompanhamento();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = (Acompanhamento) lista.get(rowIndex);
            switch (columnIndex) {
                case COL_DATA_INICIO:
                    return aux.getDataInicio();
                case COL_DATA_FINAL:
                    return aux.getDataFinal();
                case COL_NUTRICIONISTA:
                    return aux.getNutricionista().getNome();
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
            case COL_DATA_INICIO:
                return "Data de Inicio";
            case COL_DATA_FINAL:
                return "Data de Encerramento";
            case COL_NUTRICIONISTA:
                return "Nutricionista";
            default:
                break;
        }
        return "";
    } 
}
