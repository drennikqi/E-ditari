/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Mungesat;
import java.util.List;

/**
 *
 * @author dreni
 */
public interface MungesatInterface {
    void create(Mungesat d) throws CrudFormException;
    void edit(Mungesat d) throws CrudFormException;
    void delete(Mungesat d) throws CrudFormException;
    List<Mungesat> findAll() throws CrudFormException;
    Mungesat findByID(Integer ID) throws CrudFormException;
}
