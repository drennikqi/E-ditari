/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import Entities.Nxenesi;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author dreni
 */
public class NxenesiComboBoxModel extends AbstractListModel<Nxenesi> implements ComboBoxModel<Nxenesi> {

    private List<Nxenesi> data;
    private Nxenesi selectedItem;
    
    public NxenesiComboBoxModel(){}
    
    public NxenesiComboBoxModel(List<Nxenesi> data){
        this.data = data;
    }
    
    public void add(List<Nxenesi> data){
        this.data = data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Nxenesi getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Nxenesi)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
