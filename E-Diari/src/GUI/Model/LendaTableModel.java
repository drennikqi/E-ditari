/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import DAL.Lenda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dreni
 */
public class LendaTableModel extends AbstractTableModel{
    
    List<Lenda> list;
    String [] cols = {"ID.", "Emri" , "Nxenesi", "Mesimdhenesi"};
    
    public LendaTableModel(){}
    
    public LendaTableModel(List<Lenda> list){
        this.list = list;
    }
    
    public void addList(List<Lenda> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Lenda getLenda(int index){
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
        Lenda p = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getEmri();
            case 2:
                return p.getNxenesiID();
            case 3:
                return p.getMesimdhenesiID();
            default:
                return null;
        }
    }
    
}
