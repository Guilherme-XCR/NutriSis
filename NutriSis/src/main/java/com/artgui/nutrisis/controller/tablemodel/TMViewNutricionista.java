package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Nutricionista;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMViewNutricionista extends AbstractTableModel {

    private List<Nutricionista> lista;
    private final int COL_NOME = 0;
    private final int COL_ESPECIALIZACAO = 1;

    public TMViewNutricionista(List<Nutricionista> lst){
        this.lista = lst;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Nutricionista aux = new Nutricionista();
        if (lista.isEmpty()){
            return aux;
        }else{
            aux = (Nutricionista) lista.get(rowIndex);
            switch (columnIndex) {
                case COL_NOME:
                    return aux.getNome();
                case COL_ESPECIALIZACAO:
                    return aux.getEspecializacao();
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
                case COL_ESPECIALIZACAO:
                    return "Especialização";
                default:
                    break;
            }
            return "";
    }
}
