/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Drejtori;
import java.util.List;

/**
 *
 * @author dreni
 */
public interface DrejtoriInterface {
    void create(Drejtori d) throws CrudFormException;
    void edit(Drejtori d) throws CrudFormException;
    void delete(Drejtori d) throws CrudFormException;
    List<Drejtori> findAll() throws CrudFormException;
    Drejtori findByID(Integer ID) throws CrudFormException;
}
