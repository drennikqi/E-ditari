/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Perdoruesit;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author dreni
 */
public class PerdoruesiRepository extends EntMngClass implements PerdoruesiInterface {

    @Override
    public void create(Perdoruesit d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Perdoruesit d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Perdoruesit d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Perdoruesit> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Perdoruesit.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Perdoruesit findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT d FROM Perdoruesit d WHERE d.id = :id");
            query.setParameter("id", ID);
            return (Perdoruesit) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
    
    //    @Override
    public Perdoruesit loginByUsernameAndPassword(String u, String p) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT p FROM Perdoruesit p WHERE p.username = :us AND p.password=:psw");
            query.setParameter("us", u);
            query.setParameter("psw", p);
            return (Perdoruesit) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
}
