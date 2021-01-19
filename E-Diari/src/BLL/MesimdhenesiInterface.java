/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entities.Mesimdhenesi;
import java.util.List;

/**
 *
 * @author dreni
 */
public interface MesimdhenesiInterface {
    void create(Mesimdhenesi d) throws CrudFormException;
    void edit(Mesimdhenesi d) throws CrudFormException;
    void delete(Mesimdhenesi d) throws CrudFormException;
    List<Mesimdhenesi> findAll() throws CrudFormException;
    Mesimdhenesi findByID(Integer ID) throws CrudFormException;
}
