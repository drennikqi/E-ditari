/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import Entities.Mesimdhenesi;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dreni
 */
public class MesimdhenesiTableModel extends AbstractTableModel{
    
    List<Mesimdhenesi> list;
    String [] cols = {"ID.", "Emri" , "Ditelindja"};
    
    public MesimdhenesiTableModel(){}
    
    public MesimdhenesiTableModel(List<Mesimdhenesi> list){
        this.list = list;
    }
    
    public void addList(List<Mesimdhenesi> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Mesimdhenesi getMesimdhenesi(int index){
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
        Mesimdhenesi p = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getEmri();
            case 2:
                return p.getDitelindja();
            default:
                return null;
        }
    }
    
}
