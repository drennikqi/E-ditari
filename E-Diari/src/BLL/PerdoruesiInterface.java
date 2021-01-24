/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Perdoruesit;
import java.util.List;

/**
 *
 * @author dreni
 */
public interface PerdoruesiInterface {
    void create(Perdoruesit p) throws CrudFormException;
    void edit(Perdoruesit p) throws CrudFormException;
    void delete(Perdoruesit p) throws CrudFormException;
    List<Perdoruesit> findAll() throws CrudFormException;
    Perdoruesit findByID(Integer ID) throws CrudFormException;
}
