/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.CrudFormException;
import BLL.MesimdhenesiRepository;
import BLL.NxenesiRepository;
import DAL.Klasa;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        NxenesiRepository nr = new NxenesiRepository();
        MesimdhenesiRepository mr = new MesimdhenesiRepository();
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
        {
            try {
                return nr.findByID(p.getNxenesiID()).getEmri();
            } catch (CrudFormException ex) {
                Logger.getLogger(KlasaTableModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            case 2:
        {
            try {
                return mr.findByID(p.getMesimdhenesiID()).getEmri();
            } catch (CrudFormException ex) {
                Logger.getLogger(KlasaTableModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            default:
                return null;
        }
    }
    
}
