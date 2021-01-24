/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Nxenesi;
import java.util.List;

/**
 *
 * @author dreni
 */
public interface NxenesiInterface {
    void create(Nxenesi d) throws CrudFormException;
    void edit(Nxenesi d) throws CrudFormException;
    void delete(Nxenesi d) throws CrudFormException;
    List<Nxenesi> findAll() throws CrudFormException;
    Nxenesi findByID(Integer ID) throws CrudFormException;
}
