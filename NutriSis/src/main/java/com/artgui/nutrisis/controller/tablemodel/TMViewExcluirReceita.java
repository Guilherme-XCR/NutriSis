package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Ingrediente;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class TMViewExcluirReceita extends AbstractTableModel {

    private List<Ingrediente> lista;

    private final int COL_NOME = 0;
    private final int COL_EXCLUIR = 1;

    public TMViewExcluirReceita(List<Ingrediente> lst) {
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
        Ingrediente aux = new Ingrediente();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = (Ingrediente) lista.get(rowIndex);
            switch (columnIndex) {
                case COL_NOME:
                    return aux.getNome();
                case COL_EXCLUIR:
                    return new ImageIcon(getClass().getResource("/images/iconDelete.png"));
                default:
                    break;
            }
            return aux;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == COL_EXCLUIR;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case COL_NOME:
                return "Nome";
            case COL_EXCLUIR:
                return "Excluir";
            default:
                break;
        }
        return "";
    }
    
    @Override
    public Class getColumnClass(int columnIndex){
       
        if (columnIndex == COL_EXCLUIR) {
            return ImageIcon.class;
        }
        return String.class;
    }
    
    public List getLista(){
        return this.lista;
    }
}