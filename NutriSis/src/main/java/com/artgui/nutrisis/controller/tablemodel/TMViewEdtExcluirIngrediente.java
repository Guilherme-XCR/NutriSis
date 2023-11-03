package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Ingrediente;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class TMViewEdtExcluirIngrediente extends AbstractTableModel {

    private List<Ingrediente> lista;

    private final int COL_NOME = 0;
    private final int COL_UNIDADE_MEDIDA = 1;
    private final int COL_QUANTIDADE = 2;
    private final int COL_EDITAR = 3;
    private final int COL_EXCLUIR = 4;

    public TMViewEdtExcluirIngrediente(List<Ingrediente> lst) {
        this.lista = lst;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
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
                case COL_EDITAR:
                    return new ImageIcon(getClass().getResource("/images/iconEditar.png"));
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
            case COL_EDITAR:
                return "Editar";
            case COL_EXCLUIR:
                return "Excluir";
            default:
                break;
        }
        return "";
    }
    
    @Override
    public Class getColumnClass(int columnIndex){
       
        if (columnIndex == COL_EXCLUIR || columnIndex == COL_EDITAR) {
            return ImageIcon.class;
        }
        return String.class;
    }
    
    public List getLista(){
        return this.lista;
    }
}