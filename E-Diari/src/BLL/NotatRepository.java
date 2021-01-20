/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entities.Notat;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author dreni
 */
public class NotatRepository extends EntMngClass implements NotatInterface {

    @Override
    public void create(Notat d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Notat d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Notat d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Notat> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Notat.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Notat findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT d FROM Notat d WHERE d.id = :id");
            query.setParameter("id", ID);
            return (Notat) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
    
    public List<Notat> findNxenesiId(Integer ID) throws CrudFormException {
        try{
            Query query = em.createQuery("SELECT n FROM Notat n WHERE n.nxenesiID = :nxenesiID");
            query.setParameter("nxenesiID", ID);
            return query.getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
}
