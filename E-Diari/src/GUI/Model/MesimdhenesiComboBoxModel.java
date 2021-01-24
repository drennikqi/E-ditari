/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import DAL.Mesimdhenesi;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author dreni
 */
public class MesimdhenesiComboBoxModel extends AbstractListModel<Mesimdhenesi> implements ComboBoxModel<Mesimdhenesi> {

    private List<Mesimdhenesi> data;
    private Mesimdhenesi selectedItem;
    
    public MesimdhenesiComboBoxModel(){}
    
    public MesimdhenesiComboBoxModel(List<Mesimdhenesi> data){
        this.data = data;
    }
    
    public void add(List<Mesimdhenesi> data){
        this.data = data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Mesimdhenesi getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Mesimdhenesi)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
