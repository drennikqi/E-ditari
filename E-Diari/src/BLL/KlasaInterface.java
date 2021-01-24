/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Klasa;
import java.util.List;

/**
 *
 * @author dreni
 */
public interface KlasaInterface {
    void create(Klasa d) throws CrudFormException;
    void edit(Klasa d) throws CrudFormException;
    void delete(Klasa d) throws CrudFormException;
    List<Klasa> findAll() throws CrudFormException;
    Klasa findByID(Integer ID) throws CrudFormException;
}
