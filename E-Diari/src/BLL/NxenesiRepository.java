/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entities.Nxenesi;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author dreni
 */
public class NxenesiRepository extends EntMngClass implements NxenesiInterface {

    @Override
    public void create(Nxenesi d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Nxenesi d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Nxenesi d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Nxenesi> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Nxenesi.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Nxenesi findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT d FROM Nxenesi d WHERE d.id = :id");
            query.setParameter("id", ID);
            return (Nxenesi) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
    
}
