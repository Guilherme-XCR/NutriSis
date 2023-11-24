package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Consulta;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMViewConsultaNutricionista extends AbstractTableModel {

    private List<Consulta> lista;
    private final int COL_STATUS = 0;
    private final int COL_DATA = 1;
    private final int COL_CLIENTE = 2;

    public TMViewConsultaNutricionista(List<Consulta> lst) {
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
        Consulta aux = new Consulta();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = (Consulta) lista.get(rowIndex);
            switch (columnIndex) {
                case COL_STATUS:
                    return aux.getStatus();
                case COL_DATA:
                    return aux.getDataMarcada();
                case COL_CLIENTE:
                    return aux.getCliente().getNome();
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
            case COL_STATUS:
                return "Status";
            case COL_DATA:
                return "Data";
            case COL_CLIENTE:
                return "Cliente";
            default:
                break;
        }
        return "";
    } 
}
