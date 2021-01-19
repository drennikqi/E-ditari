/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entities.Lenda;
import java.util.List;

/**
 *
 * @author dreni
 */
public interface LendaInterface {
    void create(Lenda d) throws CrudFormException;
    void edit(Lenda d) throws CrudFormException;
    void delete(Lenda d) throws CrudFormException;
    List<Lenda> findAll() throws CrudFormException;
    Lenda findByID(Integer ID) throws CrudFormException;
}
