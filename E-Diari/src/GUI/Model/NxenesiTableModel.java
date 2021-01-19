/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import Entities.Nxenesi;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dreni
 */
public class NxenesiTableModel extends AbstractTableModel{
    
    List<Nxenesi> list;
    String [] cols = {"ID.", "Emri" , "Ditelindja", "Notat", "Mungesat"};
    
    public NxenesiTableModel(){}
    
    public NxenesiTableModel(List<Nxenesi> list){
        this.list = list;
    }
    
    public void addList(List<Nxenesi> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Nxenesi getNxenesi(int index){
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
        Nxenesi p = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getEmri();
            case 2:
                return p.getDitelindja();
            case 3:
                return p.getNotatID();
            case 4:
                return p.getMungesaID();
            default:
                return null;
        }
    }
    
}
