package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Receita;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class TMViewVizualizarReceita extends AbstractTableModel {

    private List<Receita> lista;
    private final int COL_NOME = 0;
    private final int COL_VIZUALIZAR = 1;
   
    public TMViewVizualizarReceita(List<Receita> lst) {
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
        Receita aux = new Receita();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = (Receita) lista.get(rowIndex);
            switch (columnIndex) {
                case COL_NOME:
                    return aux.getNome();
                case COL_VIZUALIZAR:
                    return new ImageIcon(getClass().getResource("/images/iconVizualizar.png"));
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
            case COL_VIZUALIZAR:
                return "Vizualizar";
            default:
                break;
        }
        return "";
    }
    
    @Override
    public Class getColumnClass(int columnIndex){
        if (columnIndex == COL_VIZUALIZAR) {
            return ImageIcon.class;
        }
        return String.class;
    }
    
    public List getLista(){
        return this.lista;
    }
}