/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Drejtori;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author dreni
 */
public class DrejtoriRepository extends EntMngClass implements DrejtoriInterface {

    @Override
    public void create(Drejtori d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Drejtori d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Drejtori d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Drejtori> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Drejtori.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Drejtori findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT d FROM Drejtori d WHERE d.id = :id");
            query.setParameter("id", ID);
            return (Drejtori) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
    
}
