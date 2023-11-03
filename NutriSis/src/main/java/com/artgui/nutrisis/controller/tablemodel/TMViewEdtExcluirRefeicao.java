package com.artgui.nutrisis.controller.tablemodel;

import com.artgui.nutrisis.model.Ingrediente;
import com.artgui.nutrisis.model.Refeicao;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class TMViewEdtExcluirRefeicao extends AbstractTableModel {

    private List<Refeicao> lista;

    private final int COL_NOME = 0;
    private final int COL_EDITAR = 1;
    private final int COL_EXCLUIR = 2;

    public TMViewEdtExcluirRefeicao(List<Refeicao> lst) {
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
        Refeicao aux = new Refeicao();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = (Refeicao) lista.get(rowIndex);
            switch (columnIndex) {
                case COL_NOME:
                    return aux.getNome();
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
        return columnIndex == COL_EXCLUIR || columnIndex == COL_EDITAR;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case COL_NOME:
                return "Nome";
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