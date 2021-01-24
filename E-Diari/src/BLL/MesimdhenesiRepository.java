/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Mesimdhenesi;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author dreni
 */
public class MesimdhenesiRepository extends EntMngClass implements MesimdhenesiInterface {

    @Override
    public void create(Mesimdhenesi d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Mesimdhenesi d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Mesimdhenesi d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Mesimdhenesi> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Mesimdhenesi.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Mesimdhenesi findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT d FROM Mesimdhenesi d WHERE d.id = :id");
            query.setParameter("id", ID);
            return (Mesimdhenesi) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
    
    public Mesimdhenesi findByEmri(String emri) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT l FROM Mesimdhenesi l WHERE l.emri = :emri");
            query.setParameter("emri", emri);
            return (Mesimdhenesi) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
}
