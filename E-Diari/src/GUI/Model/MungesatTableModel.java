/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import Entities.Mungesat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dreni
 */
public class MungesatTableModel extends AbstractTableModel{
    
    List<Mungesat> list;
    String [] cols = {"ID.", "Te arsyeshme" , "Te pa arsyeshme", "Nxenesi"};
    
    public MungesatTableModel(){}
    
    public MungesatTableModel(List<Mungesat> list){
        this.list = list;
    }
    
    public void addList(List<Mungesat> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Mungesat getMungesat(int index){
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
        Mungesat p = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getArsyeshme();
            case 2:
                return p.getPaarsyeshme();
            case 3:
                return p.getNxenesiID();
            default:
                return null;
        }
    }
    
}
