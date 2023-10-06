package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Receita;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMViewReceita extends AbstractTableModel{

    private List<Object> lista;
    
    private final int COL_ID = 0;
    private final int COL_TITULO = 1;
    private final int COL_TEMPO_PREPARO = 2;
    private final int COL_CATEGORIA = 3;
    
    public TMViewReceita(List<Object> lst){
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

        Receita aux = new Receita();
        if (lista.isEmpty()){
            return aux;
        }else{
            
        }
        
        aux = (Receita) lista.get(rowIndex);

        //verifica qual valor deve ser retornado
        switch (columnIndex) {
            case COL_ID:
                return aux.getId();
            case COL_TITULO:
                //return aux.getTitulo();
            case COL_TEMPO_PREPARO:
                //return aux.getTempoPreparoMin();
            case COL_CATEGORIA:
                return aux.getCategoria();
                
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
            case COL_TITULO:
                return "Titulo";
            case COL_TEMPO_PREPARO:
                return "Tempo Preparo(min)";
            case COL_CATEGORIA:
                return "Categoria";
                
            default:
                break;
        }
        return "";
    }
    
}
