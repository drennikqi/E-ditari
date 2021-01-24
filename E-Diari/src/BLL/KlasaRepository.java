/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Klasa;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author dreni
 */
public class KlasaRepository extends EntMngClass implements KlasaInterface {

    @Override
    public void create(Klasa d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Klasa d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Klasa d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Klasa> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Klasa.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Klasa findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT d FROM Klasa d WHERE d.id = :id");
            query.setParameter("id", ID);
            return (Klasa) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
    
    public List<Klasa> findByMesimdhenesiId(Integer ID) throws CrudFormException{
        try{
            Query query = em.createQuery("SELECT k FROM Klasa k WHERE k.mesimdhenesiID = :id");
            query.setParameter("id", ID);
            return query.getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
}
