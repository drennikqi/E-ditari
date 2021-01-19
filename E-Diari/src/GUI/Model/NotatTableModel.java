/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import Entities.Notat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dreni
 */
public class NotatTableModel extends AbstractTableModel{
    
    List<Notat> list;
    String [] cols = {"ID.", "Lenda" , "Nota"};
    
    public NotatTableModel(){}
    
    public NotatTableModel(List<Notat> list){
        this.list = list;
    }
    
    public void addList(List<Notat> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Notat getNotat(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Notat p = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getLendaID();
            case 2:
                return p.getNota();
            case 3:
                return p.getNxenesiID();
            default:
                return null;
        }
    }
    
}
