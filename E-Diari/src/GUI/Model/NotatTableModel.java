/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.CrudFormException;
import BLL.LendaRepository;
import BLL.MesimdhenesiRepository;
import BLL.NxenesiRepository;
import DAL.Notat;
import DAL.Nxenesi;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dreni
 */
public class NotatTableModel extends AbstractTableModel{
    
    List<Notat> list;
    String [] cols = {"ID.", "Lenda" , "Nota", "Nxenesi", "Mesimdhenesi"};
   
    
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
        NxenesiRepository nr = new NxenesiRepository();
        LendaRepository lr = new LendaRepository();
        MesimdhenesiRepository mr = new MesimdhenesiRepository();
        try {
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return lr.findByID(p.getLendaID()).getEmri();
            case 2:
                return p.getNota();
            case 3:
                return nr.findByID(p.getNxenesiID()).getEmri();
            case 4:
                return mr.findByID(p.getMesimdhenesiID()).getEmri();
            default:
                return null;
        }
        } catch (CrudFormException ex) {
                Logger.getLogger(NotatTableModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    
}
