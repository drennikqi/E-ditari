/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import Entities.Klasa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dreni
 */
public class KlasaTableModel extends AbstractTableModel{
    
    List<Klasa> list;
    String [] cols = {"ID.", "Nxenesi" , "Mesimdhenesi"};
    
    public KlasaTableModel(){}
    
    public KlasaTableModel(List<Klasa> list){
        this.list = list;
    }
    
    public void addList(List<Klasa> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Klasa getKlasa(int index){
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
        Klasa p = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getNxenesiID();
            case 2:
                return p.getMesimdhenesiID();
            default:
                return null;
        }
    }
    
}
