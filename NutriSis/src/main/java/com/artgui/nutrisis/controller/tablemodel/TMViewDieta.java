package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Dieta;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMViewDieta extends AbstractTableModel{
    private List<Object> lista;
    
    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_DESCRICAO = 2;
    private final int COL_DIASDURACAO = 3;
    
    public TMViewDieta(List<Object> lst){
        this.lista = lst;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Dieta aux = new Dieta();
        if (lista.isEmpty()){
            return aux;
        }else{
            
        }
        
        aux = (Dieta) lista.get(rowIndex);

        //verifica qual valor deve ser retornado
        switch (columnIndex) {
            case COL_ID:
                return aux.getId();
            case COL_NOME:
                return aux.getNome();
            case COL_DESCRICAO:
                return aux.getDescricao();
            case COL_DIASDURACAO:
                return aux.getDiasDuracao();
            
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
            case COL_DESCRICAO:
                return "Descricao";
            case COL_DIASDURACAO:
                return "Dias Duracao";
            
            default:
                break;
        }
        return "";
    }
}
