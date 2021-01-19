/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import Entities.Drejtori;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dreni
 */
public class DrejtoriTableModel extends AbstractTableModel{
    
    List<Drejtori> list;
    String [] cols = {"ID.", "Emri" , "Ditelindja"};
    
    public DrejtoriTableModel(){}
    
    public DrejtoriTableModel(List<Drejtori> list){
        this.list = list;
    }
    
    public void addList(List<Drejtori> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Drejtori getDrejtori(int index){
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
        Drejtori p = list.get(rowIndex);
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
