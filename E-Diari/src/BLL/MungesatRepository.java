/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.Mungesat;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author dreni
 */
public class MungesatRepository extends EntMngClass implements MungesatInterface {

    @Override
    public void create(Mungesat d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Mungesat d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Mungesat d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Mungesat> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Mungesat.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Mungesat findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT d FROM Mungesat d WHERE d.id = :id");
            query.setParameter("id", ID);
            return (Mungesat) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
    
    public List<Mungesat> findNxenesiId(Integer ID) throws CrudFormException {
        try{
            Query query = em.createQuery("SELECT n FROM Mungesat n WHERE n.nxenesiID = :nxenesiID");
            query.setParameter("nxenesiID", ID);
            return query.getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
}
