/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entities.Notat;
import java.util.List;

/**
 *
 * @author dreni
 */
public interface NotatInterface {
    void create(Notat d) throws CrudFormException;
    void edit(Notat d) throws CrudFormException;
    void delete(Notat d) throws CrudFormException;
    List<Notat> findAll() throws CrudFormException;
    Notat findByID(Integer ID) throws CrudFormException;
}
